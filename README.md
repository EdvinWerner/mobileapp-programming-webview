
# Rapport

**Skriv din rapport här!**
Jag har lagt till en webview i Activity_main.xml, jag har även även lagt till ett id för denna. utöver detta så har jag också
gjort så att webview automatiskt anpassar sin storlek. 
I filen MainActivity.java har deklaretat och skapat instanser av webview, webviewclient och webviewsettngs nedan
är koden för detta
```
private WebView myWebView;
private WebViewClient myWebViewClient;
private WebSettings myWebSetting;
```
Jag har även gjort så att två olika websidor visas när man trycker på deras respektive knappar i dropdownmenyn som finns i övre delen av högerhörnet.
nedan följer koden för dessa metoder
```
   public void showExternalWebPage(){
        myWebView.loadUrl("https://www.svt.se/");
    }

    public void showInternalWebPage(){
        myWebView.loadUrl("https://www.msn.com/sv-se/nyheter/utrikes/ny-analys-sverige-bommar-alla-klimatm%C3%A5l/ar-BB1lv1E4?ocid=msedgntp&pc=U531&cvid=4f17734e6c154f938ec047e1f9f4da63&ei=10");
    }
```
![](Screenshot_20240412_155258.png)
![](Internal.png)

