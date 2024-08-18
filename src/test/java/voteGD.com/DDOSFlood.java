package voteGD.com;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class DDOSFlood extends Simulation {

  {


    int users_flood = Integer.getInteger("users_flood", 0);
    int users_flood_sudir = Integer.getInteger("users_flood_sudir", 0);
    int users_flood_elec = Integer.getInteger("users_flood_elec", 1);
    int users_flood_sudir_business = Integer.getInteger("users_flood_sudir_business", 0);

    
    HttpProtocolBuilder httpProtocol_Flood = http
      .baseUrl("https://elec.mos.ru")
      .inferHtmlResources()
      .acceptHeader("*/*")
      .acceptEncodingHeader("gzip, deflate, br")
      .acceptLanguageHeader("en-US,en;q=0.9,ru;q=0.8")
      .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> hElecMosRu_0 = new HashMap<>();
    hElecMosRu_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    hElecMosRu_0.put("pragma", "no-cache");
    hElecMosRu_0.put("priority", "u=0, i");
    hElecMosRu_0.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
    hElecMosRu_0.put("sec-ch-ua-mobile", "?0");
    hElecMosRu_0.put("sec-ch-ua-platform", "Windows");
    hElecMosRu_0.put("sec-fetch-dest", "document");
    hElecMosRu_0.put("sec-fetch-mode", "navigate");
    hElecMosRu_0.put("sec-fetch-site", "none");
    hElecMosRu_0.put("sec-fetch-user", "?1");
    hElecMosRu_0.put("upgrade-insecure-requests", "1");
    
    Map<CharSequence, String> hElecMosRu_1 = new HashMap<>();
    hElecMosRu_1.put("pragma", "no-cache");
    hElecMosRu_1.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
    hElecMosRu_1.put("sec-ch-ua-mobile", "?0");
    hElecMosRu_1.put("sec-ch-ua-platform", "Windows");
    hElecMosRu_1.put("sec-fetch-dest", "script");
    hElecMosRu_1.put("sec-fetch-mode", "no-cors");
    hElecMosRu_1.put("sec-fetch-site", "same-site");
    
    Map<CharSequence, String> hElecMosRu_3 = new HashMap<>();
    hElecMosRu_3.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    hElecMosRu_3.put("pragma", "no-cache");
    hElecMosRu_3.put("priority", "i");
    hElecMosRu_3.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
    hElecMosRu_3.put("sec-ch-ua-mobile", "?0");
    hElecMosRu_3.put("sec-ch-ua-platform", "Windows");
    hElecMosRu_3.put("sec-fetch-dest", "image");
    hElecMosRu_3.put("sec-fetch-mode", "no-cors");
    hElecMosRu_3.put("sec-fetch-site", "same-site");
    
    String uElecMosRu1 = "https://stats.mos.ru";

    
    ScenarioBuilder DDOSFlood = scenario("DDOSFlood")
    .exec(
      http("request_0")
        .get("/")
        .headers(hElecMosRu_0)
        .basicAuth("deguser","CR&GS9%z#%td%#&FeV3k")
        // .resources(
        //   http("request_1")
        //     .get(uElecMosRu1 + "/handler/handler.js?time=1723129827119")
        //     .headers(hElecMosRu_1),
        //   http("request_2")
        //     .get(uElecMosRu1 + "/ss2.min.js")
        //     .headers(hElecMosRu_1),
        //   http("request_3")
        //     .get(uElecMosRu1 + "/static.gif?st=1723129827559&mid=Cg%252BIA2ajQ8qKiR1CG%252BxWAgA%253D&dlc=https%3A%2F%2Felec.mos.ru%2F&drf=&cfp=b2ffd0c35294e6139e2b98e12d9046d0&cwd=867cb39ec48af8c46d16c1930ce3c039")
        //     .headers(hElecMosRu_3)
        // )
    );


  HttpProtocolBuilder httpProtocol_FloodSudir = http
    .baseUrl("https://mos.ru")
    .inferHtmlResources()
    .acceptHeader("*/*")
    .acceptEncodingHeader("gzip, deflate, br")
    .acceptLanguageHeader("en-US,en;q=0.9,ru;q=0.8")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36");
  
  Map<CharSequence, String> hSuDir_0 = new HashMap<>();
  hSuDir_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
  hSuDir_0.put("pragma", "no-cache");
  hSuDir_0.put("priority", "u=0, i");
  hSuDir_0.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
  hSuDir_0.put("sec-ch-ua-mobile", "?0");
  hSuDir_0.put("sec-ch-ua-platform", "Windows");
  hSuDir_0.put("sec-ch-ua-platform-version", "10.0.0");
  hSuDir_0.put("sec-fetch-dest", "document");
  hSuDir_0.put("sec-fetch-mode", "navigate");
  hSuDir_0.put("sec-fetch-site", "same-site");
  hSuDir_0.put("sec-fetch-user", "?1");
  hSuDir_0.put("upgrade-insecure-requests", "1");
  
  Map<CharSequence, String> hSuDir_1 = new HashMap<>();
  hSuDir_1.put("origin", "https://login.mos.ru");
  hSuDir_1.put("pragma", "no-cache");
  hSuDir_1.put("priority", "u=1");
  hSuDir_1.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
  hSuDir_1.put("sec-ch-ua-mobile", "?0");
  hSuDir_1.put("sec-ch-ua-platform", "Windows");
  hSuDir_1.put("sec-ch-ua-platform-version", "10.0.0");
  hSuDir_1.put("sec-fetch-dest", "font");
  hSuDir_1.put("sec-fetch-mode", "cors");
  hSuDir_1.put("sec-fetch-site", "same-origin");
  
  Map<CharSequence, String> hSuDir_11 = new HashMap<>();
  hSuDir_11.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
  hSuDir_11.put("pragma", "no-cache");
  hSuDir_11.put("priority", "u=2, i");
  hSuDir_11.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
  hSuDir_11.put("sec-ch-ua-mobile", "?0");
  hSuDir_11.put("sec-ch-ua-platform", "Windows");
  hSuDir_11.put("sec-ch-ua-platform-version", "10.0.0");
  hSuDir_11.put("sec-fetch-dest", "image");
  hSuDir_11.put("sec-fetch-mode", "no-cors");
  hSuDir_11.put("sec-fetch-site", "same-origin");
  
  Map<CharSequence, String> hSuDir_13 = new HashMap<>();
  hSuDir_13.put("origin", "https://login.mos.ru");
  hSuDir_13.put("pragma", "no-cache");
  hSuDir_13.put("priority", "u=1");
  hSuDir_13.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
  hSuDir_13.put("sec-ch-ua-mobile", "?0");
  hSuDir_13.put("sec-ch-ua-platform", "Windows");
  hSuDir_13.put("sec-ch-ua-platform-version", "10.0.0");
  hSuDir_13.put("sec-fetch-dest", "script");
  hSuDir_13.put("sec-fetch-mode", "cors");
  hSuDir_13.put("sec-fetch-site", "same-origin");
  
  Map<CharSequence, String> hSuDir_17 = new HashMap<>();
  hSuDir_17.put("pragma", "no-cache");
  hSuDir_17.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
  hSuDir_17.put("sec-ch-ua-mobile", "?0");
  hSuDir_17.put("sec-ch-ua-platform", "Windows");
  hSuDir_17.put("sec-ch-ua-platform-version", "10.0.0");
  hSuDir_17.put("sec-fetch-dest", "script");
  hSuDir_17.put("sec-fetch-mode", "no-cors");
  hSuDir_17.put("sec-fetch-site", "same-origin");
  
  Map<CharSequence, String> hSuDir_40 = new HashMap<>();
  hSuDir_40.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
  hSuDir_40.put("pragma", "no-cache");
  hSuDir_40.put("priority", "i");
  hSuDir_40.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
  hSuDir_40.put("sec-ch-ua-mobile", "?0");
  hSuDir_40.put("sec-ch-ua-platform", "Windows");
  hSuDir_40.put("sec-ch-ua-platform-version", "10.0.0");
  hSuDir_40.put("sec-fetch-dest", "image");
  hSuDir_40.put("sec-fetch-mode", "no-cors");
  hSuDir_40.put("sec-fetch-site", "same-origin");
  
  Map<CharSequence, String> hSuDir_52 = new HashMap<>();
  hSuDir_52.put("pragma", "no-cache");
  hSuDir_52.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
  hSuDir_52.put("sec-ch-ua-mobile", "?0");
  hSuDir_52.put("sec-ch-ua-platform", "Windows");
  hSuDir_52.put("sec-fetch-dest", "script");
  hSuDir_52.put("sec-fetch-mode", "no-cors");
  hSuDir_52.put("sec-fetch-site", "same-site");
  
  Map<CharSequence, String> hSuDir_53 = new HashMap<>();
  hSuDir_53.put("pragma", "no-cache");
  hSuDir_53.put("priority", "u=1, i");
  hSuDir_53.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
  hSuDir_53.put("sec-ch-ua-mobile", "?0");
  hSuDir_53.put("sec-ch-ua-platform", "Windows");
  hSuDir_53.put("sec-ch-ua-platform-version", "10.0.0");
  hSuDir_53.put("sec-fetch-dest", "empty");
  hSuDir_53.put("sec-fetch-mode", "cors");
  hSuDir_53.put("sec-fetch-site", "same-origin");
  
  Map<CharSequence, String> hSuDir_55 = new HashMap<>();
  hSuDir_55.put("accept", "text/css,*/*;q=0.1");
  hSuDir_55.put("pragma", "no-cache");
  hSuDir_55.put("priority", "u=0");
  hSuDir_55.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
  hSuDir_55.put("sec-ch-ua-mobile", "?0");
  hSuDir_55.put("sec-ch-ua-platform", "Windows");
  hSuDir_55.put("sec-ch-ua-platform-version", "10.0.0");
  hSuDir_55.put("sec-fetch-dest", "style");
  hSuDir_55.put("sec-fetch-mode", "no-cors");
  hSuDir_55.put("sec-fetch-site", "same-origin");
  
  Map<CharSequence, String> hSuDir_57 = new HashMap<>();
  hSuDir_57.put("content-type", "text/plain; charset=utf-8");
  hSuDir_57.put("origin", "https://login.mos.ru");
  hSuDir_57.put("pragma", "no-cache");
  hSuDir_57.put("priority", "u=1, i");
  hSuDir_57.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
  hSuDir_57.put("sec-ch-ua-mobile", "?0");
  hSuDir_57.put("sec-ch-ua-platform", "Windows");
  hSuDir_57.put("sec-fetch-dest", "empty");
  hSuDir_57.put("sec-fetch-mode", "cors");
  hSuDir_57.put("sec-fetch-site", "same-site");
  
  Map<CharSequence, String> hSuDir_61 = new HashMap<>();
  hSuDir_61.put("origin", "https://login.mos.ru");
  hSuDir_61.put("pragma", "no-cache");
  hSuDir_61.put("priority", "u=1, i");
  hSuDir_61.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
  hSuDir_61.put("sec-ch-ua-mobile", "?0");
  hSuDir_61.put("sec-ch-ua-platform", "Windows");
  hSuDir_61.put("sec-ch-ua-platform-version", "10.0.0");
  hSuDir_61.put("sec-fetch-dest", "empty");
  hSuDir_61.put("sec-fetch-mode", "cors");
  hSuDir_61.put("sec-fetch-site", "same-origin");
  hSuDir_61.put("x-requested-with", "XMLHttpRequest");
  
  Map<CharSequence, String> hSuDir_64 = new HashMap<>();
  hSuDir_64.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
  hSuDir_64.put("pragma", "no-cache");
  hSuDir_64.put("priority", "i");
  hSuDir_64.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
  hSuDir_64.put("sec-ch-ua-mobile", "?0");
  hSuDir_64.put("sec-ch-ua-platform", "Windows");
  hSuDir_64.put("sec-fetch-dest", "image");
  hSuDir_64.put("sec-fetch-mode", "no-cors");
  hSuDir_64.put("sec-fetch-site", "same-site");
  
  Map<CharSequence, String> hSuDir_65 = new HashMap<>();
  hSuDir_65.put("origin", "https://login.mos.ru");
  hSuDir_65.put("pragma", "no-cache");
  hSuDir_65.put("priority", "u=2");
  hSuDir_65.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
  hSuDir_65.put("sec-ch-ua-mobile", "?0");
  hSuDir_65.put("sec-ch-ua-platform", "Windows");
  hSuDir_65.put("sec-fetch-dest", "manifest");
  hSuDir_65.put("sec-fetch-mode", "cors");
  hSuDir_65.put("sec-fetch-site", "same-site");
  
  Map<CharSequence, String> hSuDir_66 = new HashMap<>();
  hSuDir_66.put("origin", "https://login.mos.ru");
  hSuDir_66.put("pragma", "no-cache");
  hSuDir_66.put("priority", "u=1, i");
  hSuDir_66.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
  hSuDir_66.put("sec-ch-ua-mobile", "?0");
  hSuDir_66.put("sec-ch-ua-platform", "Windows");
  hSuDir_66.put("sec-fetch-dest", "empty");
  hSuDir_66.put("sec-fetch-mode", "cors");
  hSuDir_66.put("sec-fetch-site", "same-site");
  
  Map<CharSequence, String> hSuDir_67 = new HashMap<>();
  hSuDir_67.put("access-control-request-hSuDir", "content-type,x-c,x-g,x-i,x-oxxfgh,x-oxxfgh-domain,x-oxxfgh-lifetime");
  hSuDir_67.put("access-control-request-method", "POST");
  hSuDir_67.put("origin", "https://login.mos.ru");
  hSuDir_67.put("pragma", "no-cache");
  hSuDir_67.put("priority", "u=1, i");
  hSuDir_67.put("sec-fetch-dest", "empty");
  hSuDir_67.put("sec-fetch-mode", "cors");
  hSuDir_67.put("sec-fetch-site", "same-site");
  
  Map<CharSequence, String> hSuDir_68 = new HashMap<>();
  hSuDir_68.put("content-type", "application/json; charset=UTF-8");
  hSuDir_68.put("origin", "https://login.mos.ru");
  hSuDir_68.put("pragma", "no-cache");
  hSuDir_68.put("priority", "u=1, i");
  hSuDir_68.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
  hSuDir_68.put("sec-ch-ua-mobile", "?0");
  hSuDir_68.put("sec-ch-ua-platform", "Windows");
  hSuDir_68.put("sec-fetch-dest", "empty");
  hSuDir_68.put("sec-fetch-mode", "cors");
  hSuDir_68.put("sec-fetch-site", "same-site");
  hSuDir_68.put("x-c", "13");
  hSuDir_68.put("x-g", "6409123a-a575-4dbf-a201-ba177c126703");
  hSuDir_68.put("x-i", "0,0");
  hSuDir_68.put("x-oxxfgh", "6409123a-a575-4dbf-a201-ba177c126703#13#2592000000#30000#600000#81540");
  hSuDir_68.put("x-oxxfgh-domain", "mos.ru");
  hSuDir_68.put("x-oxxfgh-lifetime", "2592000000");
  
  Map<CharSequence, String> hSuDir_70 = new HashMap<>();
  hSuDir_70.put("content-type", "application/json; charset=UTF-8");
  hSuDir_70.put("origin", "https://login.mos.ru");
  hSuDir_70.put("pragma", "no-cache");
  hSuDir_70.put("priority", "u=1, i");
  hSuDir_70.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
  hSuDir_70.put("sec-ch-ua-mobile", "?0");
  hSuDir_70.put("sec-ch-ua-platform", "Windows");
  hSuDir_70.put("sec-fetch-dest", "empty");
  hSuDir_70.put("sec-fetch-mode", "cors");
  hSuDir_70.put("sec-fetch-site", "same-site");
  hSuDir_70.put("x-c", "14");
  hSuDir_70.put("x-g", "6409123a-a575-4dbf-a201-ba177c126703");
  hSuDir_70.put("x-i", "1,1");
  hSuDir_70.put("x-oxxfgh", "6409123a-a575-4dbf-a201-ba177c126703#14#2592000000#30000#600000#81540");
  hSuDir_70.put("x-oxxfgh-domain", "mos.ru");
  hSuDir_70.put("x-oxxfgh-lifetime", "2592000000");
  
  Map<CharSequence, String> hSuDir_72 = new HashMap<>();
  hSuDir_72.put("content-type", "application/json; charset=UTF-8");
  hSuDir_72.put("origin", "https://login.mos.ru");
  hSuDir_72.put("pragma", "no-cache");
  hSuDir_72.put("priority", "u=1, i");
  hSuDir_72.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
  hSuDir_72.put("sec-ch-ua-mobile", "?0");
  hSuDir_72.put("sec-ch-ua-platform", "Windows");
  hSuDir_72.put("sec-fetch-dest", "empty");
  hSuDir_72.put("sec-fetch-mode", "cors");
  hSuDir_72.put("sec-fetch-site", "same-site");
  hSuDir_72.put("x-c", "14");
  hSuDir_72.put("x-g", "6409123a-a575-4dbf-a201-ba177c126703");
  hSuDir_72.put("x-i", "2,2");
  hSuDir_72.put("x-oxxfgh", "6409123a-a575-4dbf-a201-ba177c126703#14#2592000000#30000#600000#81540");
  hSuDir_72.put("x-oxxfgh-domain", "mos.ru");
  hSuDir_72.put("x-oxxfgh-lifetime", "2592000000");
  
 
  String uSuDir2 = "https://login.mos.ru";


  ScenarioBuilder DDOSFloodSudir = scenario("DDOSFloodSudir")
  .exec(
    http("request_0")
      .get(uSuDir2 + "/sps/login/methods/password?bo=%2Fsps%2Foauth%2Fae%3Faccess_type%3Doffline%26client_id%3Dmy.mos.ru%26response_type%3Dcode%26redirect_uSuDir%3Dhttps%3A%2F%2Fmy.mos.ru%2Foauth%26scope%3Dopenid%2Bprofile%2Bblitz_api_user%2Bblitz_api_user_chg%2Bblitz_api_usec%2Bblitz_api_usec_chg%2Bblitz_api_uapps%2Bblitz_api_uapps_chg%2Bblitz_api_uaud")
      .headers(hSuDir_0)
      .basicAuth("deguser","CR&GS9%z#%td%#&FeV3k")
      .resources(
        http("request_1")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/fonts/Golos-UI/golos-text-regular.woff")
          .headers(hSuDir_1),
        http("request_2")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/fonts/Golos-UI/golos-text-medium.woff")
          .headers(hSuDir_1),
        http("request_3")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/fonts/Golos-UI/golos-text-semibold.woff")
          .headers(hSuDir_1),
        http("request_4")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/fonts/Golos-UI/golos-text-bold.woff")
          .headers(hSuDir_1),
        http("request_5")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/fonts/Golos-UI/golos-text-black.woff")
          .headers(hSuDir_1),
        http("request_6")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/fonts/Golos-UI/golos-text-regular.woff2")
          .headers(hSuDir_1),
        http("request_7")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/fonts/Golos-UI/golos-text-medium.woff2")
          .headers(hSuDir_1),
        http("request_8")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/fonts/Golos-UI/golos-text-semibold.woff2")
          .headers(hSuDir_1),
        http("request_9")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/fonts/Golos-UI/golos-text-bold.woff2")
          .headers(hSuDir_1),
        http("request_10")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/fonts/Golos-UI/golos-text-black.woff2")
          .headers(hSuDir_1),
        http("request_11")
          .get("https://login.mos.ru/sps/login/assets//img/meth-sbrf-logo.png")
          .headers(hSuDir_11),
        http("request_12")
          .get("https://login.mos.ru/sps/login/assets//img/meth-esia-logo.png")
          .headers(hSuDir_11),
        http("request_13")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/js/waterfall/dictionaryTemplate.js")
          .headers(hSuDir_13),
        http("request_14")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/js/waterfall/waterfallPixel.js")
          .headers(hSuDir_13),
        http("request_15")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/js/waterfall/waterfallGo.js")
          .headers(hSuDir_13),
        http("request_16")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/js/modules/logic/whatPageModule.js")
          .headers(hSuDir_13),
        http("request_17")
          .get(uSuDir2 + "/sps/login/assets/javascripts/passwordMethod.js")
          .headers(hSuDir_17),
        http("request_18")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/js/waterfall/GeneratorMosID.js")
          .headers(hSuDir_13),
        http("request_19")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/js/waterfall/GeneratorSingleWaterfall.js")
          .headers(hSuDir_13),
        http("request_20")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/js/waterfall/dictionaryCollector.js")
          .headers(hSuDir_13),
        http("request_21")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/js/modules/logic/throwError.js")
          .headers(hSuDir_13),
        http("request_22")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/js/modules/logic/detectPage.js")
          .headers(hSuDir_13),
        http("request_23")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/js/modules/listRunner.js")
          .headers(hSuDir_13),
        http("request_24")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/js/modules/logic/loadingPage.js")
          .headers(hSuDir_13),
        http("request_25")
          .get(uSuDir2 + "/sps/assets/javascripts/page.js")
          .headers(hSuDir_17),
        http("request_26")
          .get(uSuDir2 + "/sps/assets/theme/vendor/jquery/jquery-3.7.1.min.js")
          .headers(hSuDir_17),
        http("request_27")
          .get(uSuDir2 + "/sps/login/assets/javascripts/mus.js")
          .headers(hSuDir_17),
        http("request_28")
          .get(uSuDir2 + "/sps/login/assets/javascripts/fMethods.js")
          .headers(hSuDir_17),
        http("request_29")
          .get(uSuDir2 + "/sps/assets/ilib/domReady/domReady.js")
          .headers(hSuDir_17),
        http("request_30")
          .get(uSuDir2 + "/sps/assets/theme/vendor/jquery/jquery_ui/jquery-ui.min.js")
          .headers(hSuDir_17),
        http("request_31")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/js/modules/logic/helper.js")
          .headers(hSuDir_13),
        http("request_32")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/js/modules/logic/pageStyleHook.js")
          .headers(hSuDir_13),
        http("request_33")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/js/modules/logic/detectPageFallbackES5.js")
          .headers(hSuDir_13),
        http("request_34")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/js/modules/module/state/beforeState.js")
          .headers(hSuDir_13),
        http("request_35")
          .get(uSuDir2 + "/sps/assets/theme/vendor/plugins/select2/select2.min.js")
          .headers(hSuDir_17),
        http("request_36")
          .get(uSuDir2 + "/sps/login/assets/javascripts/methodsSwitcher.js")
          .headers(hSuDir_17),
        http("request_37")
          .get(uSuDir2 + "/sps/assets/ilib/mustache/mustache.js")
          .headers(hSuDir_17),
        http("request_38")
          .get(uSuDir2 + "/sps/assets/theme/assets/js/utility/utility.js")
          .headers(hSuDir_17),
        http("request_39")
          .get(uSuDir2 + "/sps/assets/theme/assets/js/main.js")
          .headers(hSuDir_17),
        http("request_40")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/img/svg/dots.svg")
          .headers(hSuDir_40),
        http("request_41")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/img/svg/small__gos.svg")
          .headers(hSuDir_40),
        http("request_42")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/img/svg/small__sber.svg")
          .headers(hSuDir_40),
        http("request_43")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/img/svg/icon-brand--tinkoff-black.svg")
          .headers(hSuDir_40),
        http("request_44")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/img/svg/alfabank.svg")
          .headers(hSuDir_40),
        http("request_45")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/img/svg/key.svg")
          .headers(hSuDir_40),
        http("request_46")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/img/svg/qrcode.svg")
          .headers(hSuDir_40),
        http("request_47")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/img/svg/yandex.svg")
          .headers(hSuDir_40),
        http("request_48")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/img/svg/vtb.svg")
          .headers(hSuDir_40),
        http("request_49")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/img/svg/vk-id.svg")
          .headers(hSuDir_40),
        http("request_50")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/img/svg/icon-brand--tinkoff.svg")
          .headers(hSuDir_40),
        http("request_51")
          .get(uSuDir2 + "/js/das.obf.js")
          .headers(hSuDir_17),
        http("request_53")
          .get(uSuDir2 + "/scon/flow")
          .headers(hSuDir_53),
        http("request_54")
          .get(uSuDir2 + "/sps/assets/ilib/parsley/parsley.js")
          .headers(hSuDir_17),
        http("request_55")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/js/modules/module/moduleRegEnter.css")
          .headers(hSuDir_55),
        http("request_56")
          .get(uSuDir2 + "/sps/public/assets/themes/default/assets/js/modules/module/moduleRegEnter.js")
          .headers(hSuDir_13),
        http("request_57")
          .get("/sd6ktbV.json?c=login.mos.ru")
          .headers(hSuDir_57),
        http("request_58")
          .get(uSuDir2 + "/sps/assets/ilib/parsley/i18n/ru.js")
          .headers(hSuDir_17),
        http("request_59")
          .get(uSuDir2 + "/sps/assets/ilib/fingerprint2/fingerprint2-1.7.0.min.js")
          .headers(hSuDir_17),
        http("request_61")
          .post(uSuDir2 + "/sps/login/mus")
          .headers(hSuDir_61),
        http("request_62")
          .get(uSuDir2 + "/sps/assets/javascripts/pOfw.js")
          .headers(hSuDir_17),
        http("request_63")
          .get(uSuDir2 + "/sps/assets/javascripts/pOfw_a.js")
          .headers(hSuDir_17)
      )
  ) ; 


  HttpProtocolBuilder httpProtocol_FloodSudirBusiness = http
  .baseUrl("https://mos.ru")
  .inferHtmlResources()
  .acceptHeader("*/*")
  .acceptEncodingHeader("gzip, deflate, br")
  .acceptLanguageHeader("en-US,en;q=0.9")
  .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36");

Map<CharSequence, String> hRestoreReg0 = new HashMap<>();
hRestoreReg0.put("access-control-request-headers", "content-type,x-c,x-g,x-i,x-oxxfgh,x-oxxfgh-domain,x-oxxfgh-lifetime");
hRestoreReg0.put("access-control-request-method", "POST");
hRestoreReg0.put("origin", "https://login.mos.ru");
hRestoreReg0.put("pragma", "no-cache");
hRestoreReg0.put("priority", "u=1, i");
hRestoreReg0.put("sec-fetch-dest", "empty");
hRestoreReg0.put("sec-fetch-mode", "cors");
hRestoreReg0.put("sec-fetch-site", "same-site");

Map<CharSequence, String> hRestoreReg1 = new HashMap<>();
hRestoreReg1.put("content-type", "application/json; charset=UTF-8");
hRestoreReg1.put("origin", "https://login.mos.ru");
hRestoreReg1.put("pragma", "no-cache");
hRestoreReg1.put("priority", "u=1, i");
hRestoreReg1.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg1.put("sec-ch-ua-mobile", "?0");
hRestoreReg1.put("sec-ch-ua-platform", "Windows");
hRestoreReg1.put("sec-fetch-dest", "empty");
hRestoreReg1.put("sec-fetch-mode", "cors");
hRestoreReg1.put("sec-fetch-site", "same-site");
hRestoreReg1.put("x-c", "7");
hRestoreReg1.put("x-g", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c");
hRestoreReg1.put("x-i", "0,0");
hRestoreReg1.put("x-oxxfgh", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c#7#2592000000#30000#600000#81540");
hRestoreReg1.put("x-oxxfgh-domain", "mos.ru");
hRestoreReg1.put("x-oxxfgh-lifetime", "2592000000");

Map<CharSequence, String> hRestoreReg3 = new HashMap<>();
hRestoreReg3.put("content-type", "application/json; charset=UTF-8");
hRestoreReg3.put("origin", "https://login.mos.ru");
hRestoreReg3.put("pragma", "no-cache");
hRestoreReg3.put("priority", "u=1, i");
hRestoreReg3.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg3.put("sec-ch-ua-mobile", "?0");
hRestoreReg3.put("sec-ch-ua-platform", "Windows");
hRestoreReg3.put("sec-fetch-dest", "empty");
hRestoreReg3.put("sec-fetch-mode", "cors");
hRestoreReg3.put("sec-fetch-site", "same-site");
hRestoreReg3.put("x-c", "7");
hRestoreReg3.put("x-g", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c");
hRestoreReg3.put("x-i", "1,1");
hRestoreReg3.put("x-oxxfgh", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c#7#2592000000#30000#600000#81540");
hRestoreReg3.put("x-oxxfgh-domain", "mos.ru");
hRestoreReg3.put("x-oxxfgh-lifetime", "2592000000");

Map<CharSequence, String> hRestoreReg4 = new HashMap<>();
hRestoreReg4.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
hRestoreReg4.put("pragma", "no-cache");
hRestoreReg4.put("priority", "u=0, i");
hRestoreReg4.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg4.put("sec-ch-ua-mobile", "?0");
hRestoreReg4.put("sec-ch-ua-platform", "Windows");
hRestoreReg4.put("sec-ch-ua-platform-version", "10.0.0");
hRestoreReg4.put("sec-fetch-dest", "document");
hRestoreReg4.put("sec-fetch-mode", "navigate");
hRestoreReg4.put("sec-fetch-site", "none");
hRestoreReg4.put("sec-fetch-user", "?1");
hRestoreReg4.put("upgrade-insecure-requests", "1");

Map<CharSequence, String> hRestoreReg5 = new HashMap<>();
hRestoreReg5.put("accept", "text/css,*/*;q=0.1");
hRestoreReg5.put("pragma", "no-cache");
hRestoreReg5.put("priority", "u=0");
hRestoreReg5.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg5.put("sec-ch-ua-mobile", "?0");
hRestoreReg5.put("sec-ch-ua-platform", "Windows");
hRestoreReg5.put("sec-ch-ua-platform-version", "10.0.0");
hRestoreReg5.put("sec-fetch-dest", "style");
hRestoreReg5.put("sec-fetch-mode", "no-cors");
hRestoreReg5.put("sec-fetch-site", "same-origin");

Map<CharSequence, String> hRestoreReg8 = new HashMap<>();
hRestoreReg8.put("origin", "https://login.mos.ru");
hRestoreReg8.put("pragma", "no-cache");
hRestoreReg8.put("priority", "u=1");
hRestoreReg8.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg8.put("sec-ch-ua-mobile", "?0");
hRestoreReg8.put("sec-ch-ua-platform", "Windows");
hRestoreReg8.put("sec-ch-ua-platform-version", "10.0.0");
hRestoreReg8.put("sec-fetch-dest", "font");
hRestoreReg8.put("sec-fetch-mode", "cors");
hRestoreReg8.put("sec-fetch-site", "same-origin");

Map<CharSequence, String> hRestoreReg20 = new HashMap<>();
hRestoreReg20.put("pragma", "no-cache");
hRestoreReg20.put("priority", "u=1");
hRestoreReg20.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg20.put("sec-ch-ua-mobile", "?0");
hRestoreReg20.put("sec-ch-ua-platform", "Windows");
hRestoreReg20.put("sec-ch-ua-platform-version", "10.0.0");
hRestoreReg20.put("sec-fetch-dest", "script");
hRestoreReg20.put("sec-fetch-mode", "no-cors");
hRestoreReg20.put("sec-fetch-site", "same-origin");

Map<CharSequence, String> hRestoreReg25 = new HashMap<>();
hRestoreReg25.put("origin", "https://login.mos.ru");
hRestoreReg25.put("pragma", "no-cache");
hRestoreReg25.put("priority", "u=1");
hRestoreReg25.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg25.put("sec-ch-ua-mobile", "?0");
hRestoreReg25.put("sec-ch-ua-platform", "Windows");
hRestoreReg25.put("sec-ch-ua-platform-version", "10.0.0");
hRestoreReg25.put("sec-fetch-dest", "script");
hRestoreReg25.put("sec-fetch-mode", "cors");
hRestoreReg25.put("sec-fetch-site", "same-origin");

Map<CharSequence, String> hRestoreReg36 = new HashMap<>();
hRestoreReg36.put("pragma", "no-cache");
hRestoreReg36.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg36.put("sec-ch-ua-mobile", "?0");
hRestoreReg36.put("sec-ch-ua-platform", "Windows");
hRestoreReg36.put("sec-ch-ua-platform-version", "10.0.0");
hRestoreReg36.put("sec-fetch-dest", "script");
hRestoreReg36.put("sec-fetch-mode", "no-cors");
hRestoreReg36.put("sec-fetch-site", "same-origin");

Map<CharSequence, String> hRestoreReg56 = new HashMap<>();
hRestoreReg56.put("pragma", "no-cache");
hRestoreReg56.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg56.put("sec-ch-ua-mobile", "?0");
hRestoreReg56.put("sec-ch-ua-platform", "Windows");
hRestoreReg56.put("sec-fetch-dest", "script");
hRestoreReg56.put("sec-fetch-mode", "no-cors");
hRestoreReg56.put("sec-fetch-site", "same-site");

Map<CharSequence, String> hRestoreReg60 = new HashMap<>();
hRestoreReg60.put("content-type", "text/plain; charset=utf-8");
hRestoreReg60.put("origin", "https://login.mos.ru");
hRestoreReg60.put("pragma", "no-cache");
hRestoreReg60.put("priority", "u=1, i");
hRestoreReg60.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg60.put("sec-ch-ua-mobile", "?0");
hRestoreReg60.put("sec-ch-ua-platform", "Windows");
hRestoreReg60.put("sec-fetch-dest", "empty");
hRestoreReg60.put("sec-fetch-mode", "cors");
hRestoreReg60.put("sec-fetch-site", "same-site");

Map<CharSequence, String> hRestoreReg61 = new HashMap<>();
hRestoreReg61.put("pragma", "no-cache");
hRestoreReg61.put("priority", "u=1, i");
hRestoreReg61.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg61.put("sec-ch-ua-mobile", "?0");
hRestoreReg61.put("sec-ch-ua-platform", "Windows");
hRestoreReg61.put("sec-ch-ua-platform-version", "10.0.0");
hRestoreReg61.put("sec-fetch-dest", "empty");
hRestoreReg61.put("sec-fetch-mode", "cors");
hRestoreReg61.put("sec-fetch-site", "same-origin");

Map<CharSequence, String> hRestoreReg62 = new HashMap<>();
hRestoreReg62.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
hRestoreReg62.put("pragma", "no-cache");
hRestoreReg62.put("priority", "u=1, i");
hRestoreReg62.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg62.put("sec-ch-ua-mobile", "?0");
hRestoreReg62.put("sec-ch-ua-platform", "Windows");
hRestoreReg62.put("sec-ch-ua-platform-version", "10.0.0");
hRestoreReg62.put("sec-fetch-dest", "image");
hRestoreReg62.put("sec-fetch-mode", "no-cors");
hRestoreReg62.put("sec-fetch-site", "same-origin");

Map<CharSequence, String> hRestoreReg64 = new HashMap<>();
hRestoreReg64.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
hRestoreReg64.put("pragma", "no-cache");
hRestoreReg64.put("priority", "i");
hRestoreReg64.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg64.put("sec-ch-ua-mobile", "?0");
hRestoreReg64.put("sec-ch-ua-platform", "Windows");
hRestoreReg64.put("sec-fetch-dest", "image");
hRestoreReg64.put("sec-fetch-mode", "no-cors");
hRestoreReg64.put("sec-fetch-site", "same-site");

Map<CharSequence, String> hRestoreReg65 = new HashMap<>();
hRestoreReg65.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
hRestoreReg65.put("pragma", "no-cache");
hRestoreReg65.put("priority", "u=1, i");
hRestoreReg65.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg65.put("sec-ch-ua-mobile", "?0");
hRestoreReg65.put("sec-ch-ua-platform", "Windows");
hRestoreReg65.put("sec-fetch-dest", "image");
hRestoreReg65.put("sec-fetch-mode", "no-cors");
hRestoreReg65.put("sec-fetch-site", "same-site");

Map<CharSequence, String> hRestoreReg66 = new HashMap<>();
hRestoreReg66.put("origin", "https://login.mos.ru");
hRestoreReg66.put("pragma", "no-cache");
hRestoreReg66.put("priority", "u=1, i");
hRestoreReg66.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg66.put("sec-ch-ua-mobile", "?0");
hRestoreReg66.put("sec-ch-ua-platform", "Windows");
hRestoreReg66.put("sec-fetch-dest", "empty");
hRestoreReg66.put("sec-fetch-mode", "cors");
hRestoreReg66.put("sec-fetch-site", "same-site");

Map<CharSequence, String> hRestoreReg68 = new HashMap<>();
hRestoreReg68.put("content-type", "application/json; charset=UTF-8");
hRestoreReg68.put("origin", "https://login.mos.ru");
hRestoreReg68.put("pragma", "no-cache");
hRestoreReg68.put("priority", "u=1, i");
hRestoreReg68.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg68.put("sec-ch-ua-mobile", "?0");
hRestoreReg68.put("sec-ch-ua-platform", "Windows");
hRestoreReg68.put("sec-fetch-dest", "empty");
hRestoreReg68.put("sec-fetch-mode", "cors");
hRestoreReg68.put("sec-fetch-site", "same-site");
hRestoreReg68.put("x-c", "8");
hRestoreReg68.put("x-g", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c");
hRestoreReg68.put("x-i", "0,0");
hRestoreReg68.put("x-oxxfgh", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c#8#2592000000#30000#600000#81540");
hRestoreReg68.put("x-oxxfgh-domain", "mos.ru");
hRestoreReg68.put("x-oxxfgh-lifetime", "2592000000");

Map<CharSequence, String> hRestoreReg70 = new HashMap<>();
hRestoreReg70.put("content-type", "application/json; charset=UTF-8");
hRestoreReg70.put("origin", "https://login.mos.ru");
hRestoreReg70.put("pragma", "no-cache");
hRestoreReg70.put("priority", "u=1, i");
hRestoreReg70.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg70.put("sec-ch-ua-mobile", "?0");
hRestoreReg70.put("sec-ch-ua-platform", "Windows");
hRestoreReg70.put("sec-fetch-dest", "empty");
hRestoreReg70.put("sec-fetch-mode", "cors");
hRestoreReg70.put("sec-fetch-site", "same-site");
hRestoreReg70.put("x-c", "8");
hRestoreReg70.put("x-g", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c");
hRestoreReg70.put("x-i", "1,1");
hRestoreReg70.put("x-oxxfgh", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c#8#2592000000#30000#600000#81540");
hRestoreReg70.put("x-oxxfgh-domain", "mos.ru");
hRestoreReg70.put("x-oxxfgh-lifetime", "2592000000");

Map<CharSequence, String> hRestoreReg72 = new HashMap<>();
hRestoreReg72.put("content-type", "application/json; charset=UTF-8");
hRestoreReg72.put("origin", "https://login.mos.ru");
hRestoreReg72.put("pragma", "no-cache");
hRestoreReg72.put("priority", "u=1, i");
hRestoreReg72.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg72.put("sec-ch-ua-mobile", "?0");
hRestoreReg72.put("sec-ch-ua-platform", "Windows");
hRestoreReg72.put("sec-fetch-dest", "empty");
hRestoreReg72.put("sec-fetch-mode", "cors");
hRestoreReg72.put("sec-fetch-site", "same-site");
hRestoreReg72.put("x-c", "8");
hRestoreReg72.put("x-g", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c");
hRestoreReg72.put("x-i", "2,2");
hRestoreReg72.put("x-oxxfgh", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c#8#2592000000#30000#600000#81540");
hRestoreReg72.put("x-oxxfgh-domain", "mos.ru");
hRestoreReg72.put("x-oxxfgh-lifetime", "2592000000");

Map<CharSequence, String> hRestoreReg74 = new HashMap<>();
hRestoreReg74.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
hRestoreReg74.put("origin", "https://login.mos.ru");
hRestoreReg74.put("pragma", "no-cache");
hRestoreReg74.put("priority", "u=0, i");
hRestoreReg74.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg74.put("sec-ch-ua-mobile", "?0");
hRestoreReg74.put("sec-ch-ua-platform", "Windows");
hRestoreReg74.put("sec-ch-ua-platform-version", "10.0.0");
hRestoreReg74.put("sec-fetch-dest", "document");
hRestoreReg74.put("sec-fetch-mode", "navigate");
hRestoreReg74.put("sec-fetch-site", "same-origin");
hRestoreReg74.put("sec-fetch-user", "?1");
hRestoreReg74.put("upgrade-insecure-requests", "1");

Map<CharSequence, String> hRestoreReg139 = new HashMap<>();
hRestoreReg139.put("content-type", "application/json; charset=UTF-8");
hRestoreReg139.put("origin", "https://login.mos.ru");
hRestoreReg139.put("pragma", "no-cache");
hRestoreReg139.put("priority", "u=1, i");
hRestoreReg139.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg139.put("sec-ch-ua-mobile", "?0");
hRestoreReg139.put("sec-ch-ua-platform", "Windows");
hRestoreReg139.put("sec-fetch-dest", "empty");
hRestoreReg139.put("sec-fetch-mode", "cors");
hRestoreReg139.put("sec-fetch-site", "same-site");
hRestoreReg139.put("x-c", "9");
hRestoreReg139.put("x-g", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c");
hRestoreReg139.put("x-i", "0,0");
hRestoreReg139.put("x-oxxfgh", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c#9#2592000000#30000#600000#81540");
hRestoreReg139.put("x-oxxfgh-domain", "mos.ru");
hRestoreReg139.put("x-oxxfgh-lifetime", "2592000000");

Map<CharSequence, String> hRestoreReg141 = new HashMap<>();
hRestoreReg141.put("content-type", "application/json; charset=UTF-8");
hRestoreReg141.put("origin", "https://login.mos.ru");
hRestoreReg141.put("pragma", "no-cache");
hRestoreReg141.put("priority", "u=1, i");
hRestoreReg141.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg141.put("sec-ch-ua-mobile", "?0");
hRestoreReg141.put("sec-ch-ua-platform", "Windows");
hRestoreReg141.put("sec-fetch-dest", "empty");
hRestoreReg141.put("sec-fetch-mode", "cors");
hRestoreReg141.put("sec-fetch-site", "same-site");
hRestoreReg141.put("x-c", "9");
hRestoreReg141.put("x-g", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c");
hRestoreReg141.put("x-i", "1,1");
hRestoreReg141.put("x-oxxfgh", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c#9#2592000000#30000#600000#81540");
hRestoreReg141.put("x-oxxfgh-domain", "mos.ru");
hRestoreReg141.put("x-oxxfgh-lifetime", "2592000000");

Map<CharSequence, String> hRestoreReg143 = new HashMap<>();
hRestoreReg143.put("content-type", "application/json; charset=UTF-8");
hRestoreReg143.put("origin", "https://login.mos.ru");
hRestoreReg143.put("pragma", "no-cache");
hRestoreReg143.put("priority", "u=1, i");
hRestoreReg143.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg143.put("sec-ch-ua-mobile", "?0");
hRestoreReg143.put("sec-ch-ua-platform", "Windows");
hRestoreReg143.put("sec-fetch-dest", "empty");
hRestoreReg143.put("sec-fetch-mode", "cors");
hRestoreReg143.put("sec-fetch-site", "same-site");
hRestoreReg143.put("x-c", "9");
hRestoreReg143.put("x-g", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c");
hRestoreReg143.put("x-i", "2,2");
hRestoreReg143.put("x-oxxfgh", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c#9#2592000000#30000#600000#81540");
hRestoreReg143.put("x-oxxfgh-domain", "mos.ru");
hRestoreReg143.put("x-oxxfgh-lifetime", "2592000000");

Map<CharSequence, String> hRestoreReg144 = new HashMap<>();
hRestoreReg144.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
hRestoreReg144.put("pragma", "no-cache");
hRestoreReg144.put("priority", "u=0, i");
hRestoreReg144.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg144.put("sec-ch-ua-mobile", "?0");
hRestoreReg144.put("sec-ch-ua-platform", "Windows");
hRestoreReg144.put("sec-ch-ua-platform-version", "10.0.0");
hRestoreReg144.put("sec-fetch-dest", "document");
hRestoreReg144.put("sec-fetch-mode", "navigate");
hRestoreReg144.put("sec-fetch-site", "same-origin");
hRestoreReg144.put("sec-fetch-user", "?1");
hRestoreReg144.put("upgrade-insecure-requests", "1");

Map<CharSequence, String> hRestoreReg173 = new HashMap<>();
hRestoreReg173.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
hRestoreReg173.put("pragma", "no-cache");
hRestoreReg173.put("priority", "u=2, i");
hRestoreReg173.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg173.put("sec-ch-ua-mobile", "?0");
hRestoreReg173.put("sec-ch-ua-platform", "Windows");
hRestoreReg173.put("sec-ch-ua-platform-version", "10.0.0");
hRestoreReg173.put("sec-fetch-dest", "image");
hRestoreReg173.put("sec-fetch-mode", "no-cors");
hRestoreReg173.put("sec-fetch-site", "same-origin");

Map<CharSequence, String> hRestoreReg178 = new HashMap<>();
hRestoreReg178.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
hRestoreReg178.put("pragma", "no-cache");
hRestoreReg178.put("priority", "i");
hRestoreReg178.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg178.put("sec-ch-ua-mobile", "?0");
hRestoreReg178.put("sec-ch-ua-platform", "Windows");
hRestoreReg178.put("sec-ch-ua-platform-version", "10.0.0");
hRestoreReg178.put("sec-fetch-dest", "image");
hRestoreReg178.put("sec-fetch-mode", "no-cors");
hRestoreReg178.put("sec-fetch-site", "same-origin");

Map<CharSequence, String> hRestoreReg218 = new HashMap<>();
hRestoreReg218.put("accept", "application/json, text/javascript, */*; q=0.01");
hRestoreReg218.put("content-type", "text/json");
hRestoreReg218.put("origin", "https://login.mos.ru");
hRestoreReg218.put("pragma", "no-cache");
hRestoreReg218.put("priority", "u=1, i");
hRestoreReg218.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg218.put("sec-ch-ua-mobile", "?0");
hRestoreReg218.put("sec-ch-ua-platform", "Windows");
hRestoreReg218.put("sec-ch-ua-platform-version", "10.0.0");
hRestoreReg218.put("sec-fetch-dest", "empty");
hRestoreReg218.put("sec-fetch-mode", "cors");
hRestoreReg218.put("sec-fetch-site", "same-origin");
hRestoreReg218.put("x-csrftoken", "oSsoBqlzkM1vzcvfH4CxHdFj4mc=");
hRestoreReg218.put("x-requested-with", "XMLHttpRequest");

Map<CharSequence, String> hRestoreReg222 = new HashMap<>();
hRestoreReg222.put("content-type", "application/json; charset=UTF-8");
hRestoreReg222.put("origin", "https://login.mos.ru");
hRestoreReg222.put("pragma", "no-cache");
hRestoreReg222.put("priority", "u=1, i");
hRestoreReg222.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg222.put("sec-ch-ua-mobile", "?0");
hRestoreReg222.put("sec-ch-ua-platform", "Windows");
hRestoreReg222.put("sec-fetch-dest", "empty");
hRestoreReg222.put("sec-fetch-mode", "cors");
hRestoreReg222.put("sec-fetch-site", "same-site");
hRestoreReg222.put("x-c", "10");
hRestoreReg222.put("x-g", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c");
hRestoreReg222.put("x-i", "0,0");
hRestoreReg222.put("x-oxxfgh", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c#10#2592000000#30000#600000#81540");
hRestoreReg222.put("x-oxxfgh-domain", "mos.ru");
hRestoreReg222.put("x-oxxfgh-lifetime", "2592000000");

Map<CharSequence, String> hRestoreReg224 = new HashMap<>();
hRestoreReg224.put("content-type", "application/json; charset=UTF-8");
hRestoreReg224.put("origin", "https://login.mos.ru");
hRestoreReg224.put("pragma", "no-cache");
hRestoreReg224.put("priority", "u=1, i");
hRestoreReg224.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg224.put("sec-ch-ua-mobile", "?0");
hRestoreReg224.put("sec-ch-ua-platform", "Windows");
hRestoreReg224.put("sec-fetch-dest", "empty");
hRestoreReg224.put("sec-fetch-mode", "cors");
hRestoreReg224.put("sec-fetch-site", "same-site");
hRestoreReg224.put("x-c", "10");
hRestoreReg224.put("x-g", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c");
hRestoreReg224.put("x-i", "1,1");
hRestoreReg224.put("x-oxxfgh", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c#10#2592000000#30000#600000#81540");
hRestoreReg224.put("x-oxxfgh-domain", "mos.ru");
hRestoreReg224.put("x-oxxfgh-lifetime", "2592000000");

Map<CharSequence, String> hRestoreReg226 = new HashMap<>();
hRestoreReg226.put("content-type", "application/json; charset=UTF-8");
hRestoreReg226.put("origin", "https://login.mos.ru");
hRestoreReg226.put("pragma", "no-cache");
hRestoreReg226.put("priority", "u=1, i");
hRestoreReg226.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
hRestoreReg226.put("sec-ch-ua-mobile", "?0");
hRestoreReg226.put("sec-ch-ua-platform", "Windows");
hRestoreReg226.put("sec-fetch-dest", "empty");
hRestoreReg226.put("sec-fetch-mode", "cors");
hRestoreReg226.put("sec-fetch-site", "same-site");
hRestoreReg226.put("x-c", "10");
hRestoreReg226.put("x-g", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c");
hRestoreReg226.put("x-i", "2,2");
hRestoreReg226.put("x-oxxfgh", "f07632a4-63ff-4b66-bb09-2bf02cf63b8c#10#2592000000#30000#600000#81540");
hRestoreReg226.put("x-oxxfgh-domain", "mos.ru");
hRestoreReg226.put("x-oxxfgh-lifetime", "2592000000");


Map<CharSequence, String> headers_2 = new HashMap<>();
headers_2.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headers_2.put("cache-control", "no-cache");
headers_2.put("pragma", "no-cache");
headers_2.put("priority", "u=0, i");
headers_2.put("referer", "https://my.mos.ru/");
headers_2.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
headers_2.put("sec-ch-ua-mobile", "?0");
headers_2.put("sec-ch-ua-platform", "Windows");
headers_2.put("sec-fetch-dest", "document");
headers_2.put("sec-fetch-mode", "navigate");
headers_2.put("sec-fetch-site", "same-site");
headers_2.put("upgrade-insecure-requests", "1");

String uri1 = "https://stats.mos.ru";

String uri2 = "https://login.mos.ru";


    ScenarioBuilder DDOSFloodSudirBusiness = scenario("DDOSFloodSudirBusiness")
    .exec(http("request_SPS")
          .get("/sps/oauth/ae?access_type=offline&client_id=my.mos.ru&response_type=code&redirect_uri=https://my.mos.ru/oauth&scope=openid+profile+blitz_api_user+blitz_api_user_chg+blitz_api_usec+blitz_api_usec_chg+blitz_api_uapps+blitz_api_uapps_chg+blitz_api_uaud")
          .headers(headers_2)
        )
        //.exec(getCookieValue(CookieKey("bst").saveAs("bst")))
    .exec(

      http("request_73")
        .get(uri1 + "/eds.gif?o=%7B%22eventDst%22%3A%22stats%22%2C%22eventObject%22%3A%7B%22log%22%3A%7B%22dsgn_type%22%3A2%2C%22user%22%3A%7B%22action%22%3A%22%D0%9A%D0%BB%D0%B8%D0%BA%2B%D0%BD%D0%B0%2B%D0%BA%D0%BD%D0%BE%D0%BF%D0%BA%D1%83%2B%D0%92%D0%BE%D1%81%D1%81%D1%82%D0%B0%D0%BD%D0%BE%D0%B2%D0%B8%D1%82%D1%8C%2B%D0%B4%D0%BE%D1%81%D1%82%D1%83%D0%BF%22%2C%22pageName%22%3A%22visit%20page_recovery%22%2C%22trigger%22%3A%22click%20BUTTON%20id_startBtn%20text_%D0%92%D0%BE%D1%81%D1%81%D1%82%D0%B0%D0%BD%D0%BE%D0%B2%D0%B8%D1%82%D1%8C%20%D0%B4%D0%BE%D1%81%D1%82%D1%83%D0%BF%22%7D%7D%7D%2C%22eventSrc%22%3A%22mos.ru%22%2C%22eventTime%22%3A1723467941%2C%22eventType%22%3A%22sudir%22%2C%22mosId%22%3A%22Cg%2BIA2a5%2FFWstW0jXBwyAgA%3D%22%7D")
        .headers(hRestoreReg66)
        .basicAuth("deguser","CR&GS9%z#%td%#&FeV3k")
        .resources(
          http("request_74")
            .post(uri2 + "/sps/recovery/start")
            .headers(hRestoreReg74)
            .basicAuth("deguser","CR&GS9%z#%td%#&FeV3k")
            .formParam("contactAttr", "")
            .formParam("login", "+79057099455")
            .formParam("answers[]", "edcedcedced")
            .formParam("_csrfToken", "VsST2iHIq914haRkONrnuGmXsOw="),
          http("request_75")
            .get(uri2 + "/sps/assets/stylesheets/idp.fonts.min.css")
            .headers(hRestoreReg5),
          http("request_76")
            .get(uri2 + "/sps/assets/stylesheets/idp.styles.min.css")
            .headers(hRestoreReg5),
          http("request_77")
            .get(uri2 + "/sps/public/assets/themes/default/assets/fonts/Golos-UI/golos-text-regular.woff")
            .headers(hRestoreReg8),
          http("request_78")
            .get(uri2 + "/sps/public/assets/themes/default/assets/fonts/Golos-UI/golos-text-medium.woff")
            .headers(hRestoreReg8),
          http("request_79")
            .get(uri2 + "/sps/assets/theme/assets/skin/default_skin/css/theme.min.css")
            .headers(hRestoreReg5),
          http("request_80")
            .get(uri2 + "/sps/public/assets/themes/default/assets/fonts/Golos-UI/golos-text-semibold.woff")
            .headers(hRestoreReg8),
          http("request_81")
            .get(uri2 + "/sps/public/assets/themes/default/assets/fonts/Golos-UI/golos-text-bold.woff")
            .headers(hRestoreReg8),
          http("request_82")
            .get(uri2 + "/sps/public/assets/themes/default/assets/fonts/Golos-UI/golos-text-black.woff")
            .headers(hRestoreReg8),
          http("request_83")
            .get(uri2 + "/sps/public/assets/themes/default/assets/fonts/Golos-UI/golos-text-regular.woff2")
            .headers(hRestoreReg8),
          http("request_84")
            .get(uri2 + "/sps/public/assets/themes/default/assets/fonts/Golos-UI/golos-text-medium.woff2")
            .headers(hRestoreReg8),
          http("request_85")
            .get(uri2 + "/sps/public/assets/themes/default/assets/fonts/Golos-UI/golos-text-semibold.woff2")
            .headers(hRestoreReg8),
          http("request_86")
            .get(uri2 + "/sps/public/assets/themes/default/assets/fonts/Golos-UI/golos-text-bold.woff2")
            .headers(hRestoreReg8),
          http("request_87")
            .get(uri2 + "/sps/public/assets/themes/default/assets/css/cross-browser.185437.css")
            .headers(hRestoreReg5),
          http("request_88")
            .get(uri2 + "/sps/public/assets/themes/default/assets/fonts/Golos-UI/golos-text-black.woff2")
            .headers(hRestoreReg8),
          http("request_89")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/polyfills.js")
            .headers(hRestoreReg20),
          http("request_90")
            .get(uri2 + "/sps/public/assets/themes/default/assets/css/custom-theme.185437.css")
            .headers(hRestoreReg5),
          http("request_91")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/componentsBefore.js")
            .headers(hRestoreReg20),
          http("request_92")
            .get(uri2 + "/sps/public/assets/themes/default/assets/css/components.css")
            .headers(hRestoreReg5),
          http("request_93")
            .get(uri2 + "/sps/public/assets/themes/default/assets/css/components-pipes.css")
            .headers(hRestoreReg5),
          http("request_94")
            .get(uri2 + "/sps/public/assets/themes/default/assets/css/components-forms.css")
            .headers(hRestoreReg5),
          http("request_95")
            .get(uri2 + "/sps/public/assets/themes/default/assets/css/modules.css")
            .headers(hRestoreReg5),
          http("request_96")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/componentsPipes.js")
            .headers(hRestoreReg20),
          http("request_97")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/components.js")
            .headers(hRestoreReg20),
          http("request_98")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/waterfall/index.js")
            .headers(hRestoreReg25),
          http("request_99")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/componentsForms.js")
            .headers(hRestoreReg20),
          http("request_100")
            .get(uri2 + "/sps/assets/ilib/requirejs/require.min.js")
            .headers(hRestoreReg20),
          http("request_101")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/modules/index.js")
            .headers(hRestoreReg25),
          http("request_102")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/waterfall/dictionaryTemplate.js")
            .headers(hRestoreReg25),
          http("request_103")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/waterfall/waterfallPixel.js")
            .headers(hRestoreReg25),
          http("request_104")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/waterfall/waterfallGo.js")
            .headers(hRestoreReg25),
          http("request_105")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/modules/logic/whatPageModule.js")
            .headers(hRestoreReg25),
          http("request_106")
            .get(uri2 + "/sps/recovery/assets/javascripts/start.js")
            .headers(hRestoreReg36),
          http("request_107")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/waterfall/GeneratorMosID.js")
            .headers(hRestoreReg25),
          http("request_108")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/waterfall/GeneratorSingleWaterfall.js")
            .headers(hRestoreReg25),
          http("request_109")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/waterfall/dictionaryCollector.js")
            .headers(hRestoreReg25),
          http("request_110")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/modules/logic/throwError.js")
            .headers(hRestoreReg25),
          http("request_111")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/modules/logic/detectPage.js")
            .headers(hRestoreReg25),
          http("request_112")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/modules/listRunner.js")
            .headers(hRestoreReg25),
          http("request_113")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/modules/logic/loadingPage.js")
            .headers(hRestoreReg25),
          http("request_114")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/modules/logic/helper.js")
            .headers(hRestoreReg25),
          http("request_115")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/modules/logic/pageStyleHook.js")
            .headers(hRestoreReg25),
          http("request_116")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/modules/logic/detectPageFallbackES5.js")
            .headers(hRestoreReg25),
          http("request_117")
            .get(uri2 + "/sps/public/assets/themes/default/assets/js/modules/module/state/beforeState.js")
            .headers(hRestoreReg25),
          http("request_118")
            .get(uri2 + "/sps/assets/javascripts/page.js")
            .headers(hRestoreReg36),
          http("request_119")
            .get(uri2 + "/sps/assets/theme/vendor/jquery/jquery-3.7.1.min.js")
            .headers(hRestoreReg36),
          http("request_120")
            .get(uri2 + "/sps/assets/ilib/domReady/domReady.js")
            .headers(hRestoreReg36),
          http("request_121")
            .get(uri2 + "/sps/assets/theme/vendor/jquery/jquery_ui/jquery-ui.min.js")
            .headers(hRestoreReg36),
          http("request_122")
            .get(uri2 + "/js/das.obf.js")
            .headers(hRestoreReg36),
          http("request_123")
            .get(uri1 + "/handler/handler.js?time=1723467941365")
            .headers(hRestoreReg56),
          http("request_124")
            .get(uri2 + "/sps/assets/ilib/mustache/mustache.js")
            .headers(hRestoreReg36),
          http("request_125")
            .get(uri2 + "/sps/assets/theme/assets/js/utility/utility.js")
            .headers(hRestoreReg36),
          http("request_126")
            .get(uri2 + "/sps/assets/theme/assets/js/main.js")
            .headers(hRestoreReg36),
          http("request_127")
            .get(uri1 + "/ss2.min.js")
            .headers(hRestoreReg56),
          http("request_128")
            .get(uri2 + "/scon/flow")
            .headers(hRestoreReg61),
          http("request_129")
            .get("/oxwdsq?cid=81540")
            .headers(hRestoreReg60),
          http("request_130")
            .get(uri2 + "/sps/assets/ilib/parsley/parsley.js")
            .headers(hRestoreReg36),
          http("request_131")
            .get(uri2 + "/sps/assets/ilib/parsley/i18n/ru.js")
            .headers(hRestoreReg36),
          http("request_132")
            .get("/sd6ktbV.json?c=login.mos.ru")
            .headers(hRestoreReg60),
          http("request_134")
            .get(uri2 + "/sps/public/assets/themes/default/assets/img/favicon.png")
            .headers(hRestoreReg62)
        )
   
    );

    HttpProtocolBuilder httpProtocol_FloodElec = http
      .baseUrl("https://example.elec.moscow")
      .inferHtmlResources()
      .acceptHeader("*/*")
      .acceptEncodingHeader("gzip, deflate, br")
      .acceptLanguageHeader("en-US,en;q=0.9,ru;q=0.8")
      .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> hElec0 = new HashMap<>();
    hElec0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    hElec0.put("pragma", "no-cache");
    hElec0.put("priority", "u=0, i");
    hElec0.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
    hElec0.put("sec-ch-ua-mobile", "?0");
    hElec0.put("sec-ch-ua-platform", "Windows");
    hElec0.put("sec-fetch-dest", "document");
    hElec0.put("sec-fetch-mode", "navigate");
    hElec0.put("sec-fetch-site", "none");
    hElec0.put("sec-fetch-user", "?1");
    hElec0.put("upgrade-insecure-requests", "1");
    
    Map<CharSequence, String> hElec1 = new HashMap<>();
    hElec1.put("pragma", "no-cache");
    hElec1.put("priority", "u=1");
    hElec1.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
    hElec1.put("sec-ch-ua-mobile", "?0");
    hElec1.put("sec-ch-ua-platform", "Windows");
    hElec1.put("sec-fetch-dest", "script");
    hElec1.put("sec-fetch-mode", "no-cors");
    hElec1.put("sec-fetch-site", "cross-site");
    
    Map<CharSequence, String> hElec2 = new HashMap<>();
    hElec2.put("accept", "text/css,*/*;q=0.1");
    hElec2.put("pragma", "no-cache");
    hElec2.put("priority", "u=0");
    hElec2.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
    hElec2.put("sec-ch-ua-mobile", "?0");
    hElec2.put("sec-ch-ua-platform", "Windows");
    hElec2.put("sec-fetch-dest", "style");
    hElec2.put("sec-fetch-mode", "no-cors");
    hElec2.put("sec-fetch-site", "cross-site");
    
    Map<CharSequence, String> hElec3 = new HashMap<>();
    hElec3.put("pragma", "no-cache");
    hElec3.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
    hElec3.put("sec-ch-ua-mobile", "?0");
    hElec3.put("sec-ch-ua-platform", "Windows");
    hElec3.put("sec-fetch-dest", "script");
    hElec3.put("sec-fetch-mode", "no-cors");
    hElec3.put("sec-fetch-site", "cross-site");
    
    Map<CharSequence, String> hElec6 = new HashMap<>();
    hElec6.put("accept", "application/json, text/plain, */*");
    hElec6.put("content-type", "application/json");
    hElec6.put("origin", "https://example.elec.moscow");
    hElec6.put("pragma", "no-cache");
    hElec6.put("priority", "u=1, i");
    hElec6.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
    hElec6.put("sec-ch-ua-mobile", "?0");
    hElec6.put("sec-ch-ua-platform", "Windows");
    hElec6.put("sec-fetch-dest", "empty");
    hElec6.put("sec-fetch-mode", "cors");
    hElec6.put("sec-fetch-site", "same-origin");
    hElec6.put("x-application-token", "undefined");
    
    Map<CharSequence, String> hElec7 = new HashMap<>();
    hElec7.put("accept", "application/json, text/plain, */*");
    hElec7.put("origin", "https://example.elec.moscow");
    hElec7.put("pragma", "no-cache");
    hElec7.put("priority", "u=1, i");
    hElec7.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
    hElec7.put("sec-ch-ua-mobile", "?0");
    hElec7.put("sec-ch-ua-platform", "Windows");
    hElec7.put("sec-fetch-dest", "empty");
    hElec7.put("sec-fetch-mode", "cors");
    hElec7.put("sec-fetch-site", "cross-site");
    
    Map<CharSequence, String> hElec8 = new HashMap<>();
    hElec8.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    hElec8.put("pragma", "no-cache");
    hElec8.put("priority", "u=1, i");
    hElec8.put("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126");
    hElec8.put("sec-ch-ua-mobile", "?0");
    hElec8.put("sec-ch-ua-platform", "Windows");
    hElec8.put("sec-fetch-dest", "image");
    hElec8.put("sec-fetch-mode", "no-cors");
    hElec8.put("sec-fetch-site", "cross-site");
    String uElec = "https://cdn-deg.mos.ru/static/example";

    ScenarioBuilder DDOSFloodElec = scenario("DDOSFloodElec")
      .exec(
        http("request_0")
          .get("/example/89174a36-a2c2-4a88-8b9e-9c1894bd9a23/2691")
          .headers(hElec0)
          .basicAuth("deguser","CR&GS9%z#%td%#&FeV3k")
          .resources(
            http("request_1")
              .get(uElec + "/config.js")
              .headers(hElec1),
            http("request_2")
              .get(uElec + "/main.0af71a632ed712a50c7c.css")
              .headers(hElec2),
            http("request_3")
              .get(uElec + "/runtime.e8c97cb671910005bc4a.js")
              .headers(hElec3),
            http("request_4")
              .get(uElec + "/vendor.c4c51b8757102503f481.js")
              .headers(hElec3),
            http("request_5")
              .get(uElec + "/main.ccf29304508466bc2176.js")
              .headers(hElec3),
            http("request_6")
              .post("/api/elect-ballot-service/ballot/example")
              .headers(hElec6)
              .body(RawFileBody("elec/0006_request.json"))
              .basicAuth("deguser","CR&GS9%z#%td%#&FeV3k"),
            http("request_7")
              .get(uElec + "/assets/texts.json")
              .headers(hElec7),
            http("request_8")
              .get(uElec + "/favicon.ico")
              .headers(hElec8)
          )
      );
      
      setUp(
        DDOSFlood.injectClosed(
          constantConcurrentUsers(users_flood).during(40000)
        ).protocols(httpProtocol_Flood)
        ,
        DDOSFloodSudir.injectClosed(
          constantConcurrentUsers(users_flood_sudir).during(40000)
        ).protocols(httpProtocol_FloodSudir)
        ,
        DDOSFloodSudirBusiness.injectClosed(
          constantConcurrentUsers(users_flood_sudir_business).during(40000)
        ).protocols(httpProtocol_FloodSudirBusiness)
        ,
        DDOSFloodElec.injectClosed(
          constantConcurrentUsers(users_flood_elec).during(40000)
        ).protocols(httpProtocol_FloodElec)
      );
  }
}
