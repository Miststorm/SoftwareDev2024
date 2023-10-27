if (!([Security.Principal.WindowsPrincipal][Security.Principal.WindowsIdentity]::GetCurrent()).IsInRole([Security.Principal.WindowsBuiltInRole] "Administrator")) {
    $scriptBlock = {
        winget source reset --force
    }
    $elevatedProcess = Start-Process powershell.exe -ArgumentList "-NoProfile -ExecutionPolicy Bypass -Command & { $scriptBlock }" -Verb RunAs -PassThru
    $elevatedProcess.WaitForExit()
    New-ItemProperty -Path "HKCU:\SOFTWARE\Microsoft\Windows\CurrentVersion\Themes\Personalize" -Name AppsUseLightTheme -Value 0 -PropertyType DWord -Force
    Get-Process -Name "chrome" | ForEach-Object { $_.CloseMainWindow() } -ErrorAction SilentlyContinue
    Start-Process "chrome" -ArgumentList "--new-window", "https://stech.instructure.com/login/canvas", "https://discord.com/app", "https://github.com/login"
    Invoke-WebRequest -Uri "https://winget.azureedge.net/cache/source.msix" -OutFile "source.msix"
    Add-AppxPackage -Path ".\source.msix"
    winget install Microsoft.VisualStudioCode --accept-package-agreements --accept-source-agreements --override '/SILENT /mergetasks="!runcode,addcontextmenufiles,addcontextmenufolders,addtopath"'
    Set-Location "C:\Users\student\Documents"
    git clone https://github.com/Miststorm/SoftwareDev2024
    git config --global user.name "Jared Bishop"
    git config --global user.email "bishop.jared.michael@gmail.com"
    Set-Location "C:\Users\student\Documents\SoftwareDev2024"
    start code .
    Start-Sleep 3
    Get-CimInstance win32_process -Filter "Name like 'conhost.exe'" | ? { (Get-Process -id $_.ParentProcessId -ea Ignore) -eq $null } | Select-Object ProcessId | ? { Stop-Process $_.ProcessId -Force }
}
#Modify Path to the picture accordingly to reflect your infrastructure
$imgPath="C:\Users\student\Documents\SoftwareDev2024\wallpaper.jpg"
$code = @' 
using System.Runtime.InteropServices; 
namespace Win32{ 
    
     public class Wallpaper{ 
        [DllImport("user32.dll", CharSet=CharSet.Auto)] 
         static extern int SystemParametersInfo (int uAction , int uParam , string lpvParam , int fuWinIni) ; 
         
         public static void SetWallpaper(string thePath){ 
            SystemParametersInfo(20,0,thePath,3); 
         }
    }
 } 
'@

add-type $code 

#Apply the Change on the system 
[Win32.Wallpaper]::SetWallpaper($imgPath)

exit


