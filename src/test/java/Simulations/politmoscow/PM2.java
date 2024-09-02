package Simulations.politmoscow;

import io.gatling.javaapi.core.FeederBuilder;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;

public class PM2 extends Simulation {
        {

                int users_flood_PM01 = Integer.getInteger("users_flood_PM01", 1);
                int users_flood_PM02 = Integer.getInteger("users_flood_PM02", 1);
                int users_flood_PM03 = Integer.getInteger("users_flood_PM03", 1);
                int users_flood_PM04 = Integer.getInteger("users_flood_PM04", 1);
                int users_flood_PM05 = Integer.getInteger("users_flood_PM05", 1);
                int users_flood_PM06 = Integer.getInteger("users_flood_PM06", 1);
                int users_flood_PM07 = Integer.getInteger("users_flood_PM07", 1);
                int users_flood_PM08 = Integer.getInteger("users_flood_PM08", 1);
                int users_flood_PM09 = Integer.getInteger("users_flood_PM09", 1);
                int users_flood_PM10 = Integer.getInteger("users_flood_PM10", 1);
                int users_flood_PM11 = Integer.getInteger("users_flood_PM11", 1);
                int users_flood_PM12 = Integer.getInteger("users_flood_PM12", 1);
                int users_flood_PM13 = Integer.getInteger("users_flood_PM13", 1);
                int users_flood_PM14 = Integer.getInteger("users_flood_PM14", 1);


// Scenarious
                HttpProtocolBuilder httpProtocol_MainPage = http
                        .baseUrl("https://polit-moscow.ru")
                        .inferHtmlResources()
                        ;

                Map<CharSequence, String> headersPM1_0 = new HashMap<>();
                headersPM1_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
                headersPM1_0.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM1_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM1_0.put("priority", "u=0, i");
                headersPM1_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM1_0.put("sec-ch-ua-mobile", "?0");
                headersPM1_0.put("sec-ch-ua-platform", "Linux");
                headersPM1_0.put("sec-fetch-dest", "document");
                headersPM1_0.put("sec-fetch-mode", "navigate");
                headersPM1_0.put("sec-fetch-site", "none");
                headersPM1_0.put("sec-fetch-user", "?1");
                headersPM1_0.put("upgrade-insecure-requests", "1");
                headersPM1_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headerPM1s_1 = new HashMap<>();
                headerPM1s_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headerPM1s_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headerPM1s_1.put("sec-ch-ua-mobile", "?0");
                headerPM1s_1.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM1_13 = new HashMap<>();
                headersPM1_13.put("Upgrade-Insecure-Requests", "1");
                headersPM1_13.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headersPM1_13.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM1_13.put("sec-ch-ua-mobile", "?0");
                headersPM1_13.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM1_14 = new HashMap<>();
                headersPM1_14.put("accept", "*/*");
                headersPM1_14.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM1_14.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM1_14.put("origin", "https://polit-moscow.ru");
                headersPM1_14.put("priority", "u=1, i");
                headersPM1_14.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM1_14.put("sec-ch-ua-mobile", "?0");
                headersPM1_14.put("sec-ch-ua-platform", "Linux");
                headersPM1_14.put("sec-fetch-dest", "empty");
                headersPM1_14.put("sec-fetch-mode", "cors");
                headersPM1_14.put("sec-fetch-site", "cross-site");
                headersPM1_14.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                String uri1Ya = "https://mc.yandex.ru";

                ScenarioBuilder scnPM01 = scenario("Pile.MainPage")
                        .exec(
                                http("request_0")
                                        .get("/")
                                        .headers(headersPM1_0)
                                        .resources(
                                                http("request_1")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img/upload1.png.webp")
                                                        .headers(headerPM1s_1),
                                                http("request_2")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img/upload2.png.webp")
                                                        .headers(headerPM1s_1),
                                                http("request_3")
                                                        .get("/wp-content/plugins/gallery-videos/public/css/fontawesome-webfont.woff2?v=4.6.3"),
                                                http("request_4")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Medium.woff"),
                                                http("request_5")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Bold.woff"),
                                                http("request_6")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Black.woff"),
                                                http("request_7")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro.woff"),
                                                http("request_8")
                                                        .get(uri1Ya + "/metrika/tag.js")
                                                        .headers(headerPM1s_1),
                                                http("request_9")
                                                        .get("/wp-content/plugins/wp-postratings/images/heart_crystal/rating_1_over.gif")
                                                        .headers(headerPM1s_1),
                                                http("request_10")
                                                        .get("/wp-content/themes/politmoscow/img/header-icon1.png"),
                                                http("request_11")
                                                        .get("/wp-content/themes/politmoscow/img/index-about.jpg"),
                                                http("request_12")
                                                        .get("/wp-content/themes/politmoscow/img/index-map2.jpg"),
                                                http("request_13")
                                                        .get(uri1Ya + "/metrika/metrika_match.html")
                                                        .headers(headersPM1_13),
                                                http("request_14")
                                                        .get(uri1Ya + "/watch/94094106?wmode=7&page-url=https%3A%2F%2Fpolit-moscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.113%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.113%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.113%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A1070504886616%3Ahid%3A552366626%3Az%3A300%3Ai%3A20240830145910%3Aet%3A1725011950%3Ac%3A1%3Arn%3A440285848%3Arqn%3A13%3Au%3A172478250269200753%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C624%2C3%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1725011949701%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1725011950%3At%3A%D0%9F%D0%9E%D0%9B%D0%98%D0%A2%D0%9C%D0%9E%D0%A1%D0%9A%D0%92%D0%90%20%E2%80%94%20%D0%92%D1%81%D0%B5%20%D0%BD%D0%BE%D0%B2%D0%BE%D1%81%D1%82%D0%B8%20%D0%BE%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5%20%D0%BD%D0%B0%20%D0%BE%D0%B4%D0%BD%D0%BE%D0%BC%20%D1%81%D0%B0%D0%B9%D1%82%D0%B5&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
                                                        .headers(headersPM1_14),
                                                http("request_15")
                                                        .get("/favicon.ico")
                                                        .headers(headersPM1_14)
                                        )
                        );

                HttpProtocolBuilder httpProtocol_DistGol = http
                        .baseUrl("https://polit-moscow.ru")
                        .inferHtmlResources()
                        .userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headersPM02_0 = new HashMap<>();
                headersPM02_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
                headersPM02_0.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM02_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM02_0.put("priority", "u=0, i");
                headersPM02_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM02_0.put("sec-ch-ua-mobile", "?0");
                headersPM02_0.put("sec-ch-ua-platform", "Linux");
                headersPM02_0.put("sec-fetch-dest", "document");
                headersPM02_0.put("sec-fetch-mode", "navigate");
                headersPM02_0.put("sec-fetch-site", "same-origin");
                headersPM02_0.put("sec-fetch-user", "?1");
                headersPM02_0.put("upgrade-insecure-requests", "1");

                Map<CharSequence, String> headersPM02_1 = new HashMap<>();
                headersPM02_1.put("Origin", "https://polit-moscow.ru");
                headersPM02_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM02_1.put("sec-ch-ua-mobile", "?0");
                headersPM02_1.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM02_6 = new HashMap<>();
                headersPM02_6.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM02_6.put("sec-ch-ua-mobile", "?0");
                headersPM02_6.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM02_7 = new HashMap<>();
                headersPM02_7.put("accept", "text/css,*/*;q=0.1");
                headersPM02_7.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM02_7.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM02_7.put("priority", "u=0");
                headersPM02_7.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM02_7.put("sec-ch-ua-mobile", "?0");
                headersPM02_7.put("sec-ch-ua-platform", "Linux");
                headersPM02_7.put("sec-fetch-dest", "style");
                headersPM02_7.put("sec-fetch-mode", "no-cors");
                headersPM02_7.put("sec-fetch-site", "cross-site");
                headersPM02_7.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");

                Map<CharSequence, String> headersPM02_9 = new HashMap<>();
                headersPM02_9.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
                headersPM02_9.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM02_9.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM02_9.put("priority", "i");
                headersPM02_9.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM02_9.put("sec-ch-ua-mobile", "?0");
                headersPM02_9.put("sec-ch-ua-platform", "Linux");
                headersPM02_9.put("sec-fetch-dest", "image");
                headersPM02_9.put("sec-fetch-mode", "no-cors");
                headersPM02_9.put("sec-fetch-site", "same-origin");

                Map<CharSequence, String> headersPM02_10 = new HashMap<>();
                headersPM02_10.put("accept", "*/*");
                headersPM02_10.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM02_10.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM02_10.put("origin", "https://polit-moscow.ru");
                headersPM02_10.put("priority", "u=1, i");
                headersPM02_10.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM02_10.put("sec-ch-ua-mobile", "?0");
                headersPM02_10.put("sec-ch-ua-platform", "Linux");
                headersPM02_10.put("sec-fetch-dest", "empty");
                headersPM02_10.put("sec-fetch-mode", "cors");
                headersPM02_10.put("sec-fetch-site", "cross-site");

                Map<CharSequence, String> headersPM02_11 = new HashMap<>();
                headersPM02_11.put("Upgrade-Insecure-Requests", "1");
                headersPM02_11.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM02_11.put("sec-ch-ua-mobile", "?0");
                headersPM02_11.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM02_12 = new HashMap<>();
                headersPM02_12.put("accept", "*/*");
                headersPM02_12.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM02_12.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM02_12.put("origin", "https://polit-moscow.ru");
                headersPM02_12.put("priority", "u=0");
                headersPM02_12.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM02_12.put("sec-ch-ua-mobile", "?0");
                headersPM02_12.put("sec-ch-ua-platform", "Linux");
                headersPM02_12.put("sec-fetch-dest", "font");
                headersPM02_12.put("sec-fetch-mode", "cors");
                headersPM02_12.put("sec-fetch-site", "cross-site");
                headersPM02_12.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");


                String uri3GS = "https://fonts.gstatic.com/s/montserrat/v26";

                String uri4 = "https://fonts.googleapis.com/css2";

                ScenarioBuilder scnPM02 = scenario("Pile.DistGol")
                        .exec(
                                http("request_0")
                                        .get("/distanczionnoe-elektronnoe-golosovanie/")
                                        .headers(headersPM02_0)
                                        .resources(
                                                http("request_1")
                                                        .get("/wp-content/plugins/gallery-videos/public/css/fontawesome-webfont.woff2?v=4.6.3")
                                                        .headers(headersPM02_1),
                                                http("request_2")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Medium.woff")
                                                        .headers(headersPM02_1),
                                                http("request_3")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Bold.woff")
                                                        .headers(headersPM02_1),
                                                http("request_4")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Black.woff")
                                                        .headers(headersPM02_1),
                                                http("request_5")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro.woff")
                                                        .headers(headersPM02_1),
                                                http("request_6")
                                                        .get("/wp-content/themes/politmoscow/img/header-icon1b.png")
                                                        .headers(headersPM02_6),
                                                http("request_7")
                                                        .get(uri4 + "?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap")
                                                        .headers(headersPM02_7),
                                                http("request_8")
                                                        .get(uri1Ya + "/metrika/tag.js")
                                                        .headers(headersPM02_6),
                                                http("request_9")
                                                        .get("/wp-content/themes/politmoscow/img2/lines.png")
                                                        .headers(headersPM02_9),
                                                http("request_10")
                                                        .get(uri1Ya + "/watch/94094106?wmode=7&page-url=https%3A%2F%2Fpolit-moscow.ru%2Fdistanczionnoe-elektronnoe-golosovanie%2F&page-ref=https%3A%2F%2Fpolit-moscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.113%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.113%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.113%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A1070504886616%3Ahid%3A714449824%3Az%3A300%3Ai%3A20240830145939%3Aet%3A1725011979%3Ac%3A1%3Arn%3A157128084%3Arqn%3A15%3Au%3A172478250269200753%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A1113%3Awv%3A2%3Ads%3A0%2C0%2C752%2C2%2C2%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1725011977985%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1725011979%3At%3A%D0%94%D0%B8%D1%81%D1%82%D0%B0%D0%BD%D1%86%D0%B8%D0%BE%D0%BD%D0%BD%D0%BE%D0%B5%20%D0%BE%D0%BD%D0%BB%D0%B0%D0%B9%D0%BD-%D0%B3%D0%BE%D0%BB%D0%BE%D1%81%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5%20(%D0%94%D0%AD%D0%93)%20%D0%BD%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D1%85%20%D0%B4%D0%B5%D0%BF%D1%83%D1%82%D0%B0%D1%82%D0%BE%D0%B2%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%B3%D0%BE%D1%80%D0%B4%D1%83%D0%BC%D1%83%20%D0%B8%20%D0%A2%D0%B8%D0%9D%D0%90%D0%9E%20%E2%80%94%20%D0%9F%D0%9E%D0%9B%D0%98%D0%A2%D0%9C%D0%9E%D0%A1%D0%9A%D0%92%D0%90&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
                                                        .headers(headersPM02_10),
                                                http("request_11")
                                                        .get(uri1Ya + "/metrika/metrika_match.html")
                                                        .headers(headersPM02_11),
                                                http("request_12")
                                                        .get(uri3GS + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2")
                                                        .headers(headersPM02_12),
                                                http("request_13")
                                                        .get(uri3GS + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2")
                                                        .headers(headersPM02_12)
                                        )
                        );

                HttpProtocolBuilder httpProtocol_VyboryDuma = http
                        .baseUrl("https://polit-moscow.ru")
                        .inferHtmlResources()
                        ;

                Map<CharSequence, String> headersPM03_0 = new HashMap<>();
                headersPM03_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
                headersPM03_0.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM03_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM03_0.put("priority", "u=0, i");
                headersPM03_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM03_0.put("sec-ch-ua-mobile", "?0");
                headersPM03_0.put("sec-ch-ua-platform", "Linux");
                headersPM03_0.put("sec-fetch-dest", "document");
                headersPM03_0.put("sec-fetch-mode", "navigate");
                headersPM03_0.put("sec-fetch-site", "same-origin");
                headersPM03_0.put("sec-fetch-user", "?1");
                headersPM03_0.put("upgrade-insecure-requests", "1");
                headersPM03_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headersPM03_1 = new HashMap<>();
                headersPM03_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headersPM03_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM03_1.put("sec-ch-ua-mobile", "?0");
                headersPM03_1.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM03_10 = new HashMap<>();
                headersPM03_10.put("Origin", "https://polit-moscow.ru");
                headersPM03_10.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headersPM03_10.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM03_10.put("sec-ch-ua-mobile", "?0");
                headersPM03_10.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM03_14 = new HashMap<>();
                headersPM03_14.put("accept", "*/*");
                headersPM03_14.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM03_14.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM03_14.put("origin", "https://polit-moscow.ru");
                headersPM03_14.put("priority", "u=1, i");
                headersPM03_14.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM03_14.put("sec-ch-ua-mobile", "?0");
                headersPM03_14.put("sec-ch-ua-platform", "Linux");
                headersPM03_14.put("sec-fetch-dest", "empty");
                headersPM03_14.put("sec-fetch-mode", "cors");
                headersPM03_14.put("sec-fetch-site", "cross-site");
                headersPM03_14.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headersPM03_15 = new HashMap<>();
                headersPM03_15.put("Upgrade-Insecure-Requests", "1");
                headersPM03_15.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headersPM03_15.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM03_15.put("sec-ch-ua-mobile", "?0");
                headersPM03_15.put("sec-ch-ua-platform", "Linux");



                ScenarioBuilder scnPM03 = scenario("Pile.VyboryDuma")
                        .exec(
                                http("request_0")
                                        .get("/vybory-v-moskovskuyu-gorodskuyu-dumu-2024/")
                                        .headers(headersPM03_0)
                                        .resources(
                                                http("request_1")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/tasks1.jpg.webp")
                                                        .headers(headersPM03_1),
                                                http("request_2")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/tasks2.jpg.webp")
                                                        .headers(headersPM03_1),
                                                http("request_3")
                                                        .get("/wp-content/plugins/gallery-videos/public/css/fontawesome-webfont.woff2?v=4.6.3"),
                                                http("request_4")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Medium.woff"),
                                                http("request_5")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Bold.woff"),
                                                http("request_6")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Black.woff"),
                                                http("request_7")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro.woff"),
                                                http("request_8")
                                                        .get(uri4 + "?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap")
                                                        .headers(headersPM03_1),
                                                http("request_9")
                                                        .get(uri1Ya + "/metrika/tag.js")
                                                        .headers(headersPM03_1),
                                                http("request_10")
                                                        .get(uri3GS + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2")
                                                        .headers(headersPM03_10),
                                                http("request_11")
                                                        .get(uri3GS + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2")
                                                        .headers(headersPM03_10),
                                                http("request_12")
                                                        .get("/wp-content/themes/politmoscow/img/header-icon1b.png"),
                                                http("request_13")
                                                        .get("/wp-content/themes/politmoscow/img2/lines.png")
                                                        .headers(headersPM03_1),
                                                http("request_14")
                                                        .get(uri1Ya + "/watch/94094106?wmode=7&page-url=https%3A%2F%2Fpolit-moscow.ru%2Fvybory-v-moskovskuyu-gorodskuyu-dumu-2024%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.113%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.113%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.113%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A1070504886616%3Ahid%3A734949600%3Az%3A300%3Ai%3A20240830150200%3Aet%3A1725012121%3Ac%3A1%3Arn%3A476083122%3Arqn%3A18%3Au%3A172478250269200753%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C804%2C3%2C1%2C0%2C%2C73%2C0%2C%2C%2C%2C883%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1725012119657%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1725012121%3At%3A%D0%92%D1%8B%D0%B1%D0%BE%D1%80%D1%8B%20%D0%B4%D0%B5%D0%BF%D1%83%D1%82%D0%B0%D1%82%D0%BE%D0%B2%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%B3%D0%BE%D1%80%D0%B4%D1%83%D0%BC%D1%83%20%D0%B8%20%D0%BC%D1%83%D0%BD%D0%B8%D1%86%D0%B8%D0%BF%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D1%85%20%D0%B4%D0%B5%D0%BF%D1%83%D1%82%D0%B0%D1%82%D0%BE%D0%B2%20%D0%A2%D0%B8%D0%9D%D0%90%D0%9E%20%D0%B2%202024%20%D0%B3%D0%BE%D0%B4%D1%83%20%E2%80%94%20%D0%9F%D0%9E%D0%9B%D0%98%D0%A2%D0%9C%D0%9E%D0%A1%D0%9A%D0%92%D0%90&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
                                                        .headers(headersPM03_14),
                                                http("request_15")
                                                        .get(uri1Ya + "/metrika/metrika_match.html")
                                                        .headers(headersPM03_15)
                                        )
                        );

                HttpProtocolBuilder httpProtocol_IzbUch = http
                        .baseUrl("https://mc.yandex.ru")
                        .inferHtmlResources()
                        .userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headersPM04_0 = new HashMap<>();
                headersPM04_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
                headersPM04_0.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM04_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM04_0.put("priority", "u=0, i");
                headersPM04_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM04_0.put("sec-ch-ua-mobile", "?0");
                headersPM04_0.put("sec-ch-ua-platform", "Linux");
                headersPM04_0.put("sec-fetch-dest", "document");
                headersPM04_0.put("sec-fetch-mode", "navigate");
                headersPM04_0.put("sec-fetch-site", "same-origin");
                headersPM04_0.put("sec-fetch-user", "?1");
                headersPM04_0.put("upgrade-insecure-requests", "1");

                Map<CharSequence, String> headersPM04_1 = new HashMap<>();
                headersPM04_1.put("Origin", "https://polit-moscow.ru");
                headersPM04_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM04_1.put("sec-ch-ua-mobile", "?0");
                headersPM04_1.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM04_6 = new HashMap<>();
                headersPM04_6.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM04_6.put("sec-ch-ua-mobile", "?0");
                headersPM04_6.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM04_12 = new HashMap<>();
                headersPM04_12.put("accept", "*/*");
                headersPM04_12.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM04_12.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM04_12.put("origin", "https://polit-moscow.ru");
                headersPM04_12.put("priority", "u=1, i");
                headersPM04_12.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM04_12.put("sec-ch-ua-mobile", "?0");
                headersPM04_12.put("sec-ch-ua-platform", "Linux");
                headersPM04_12.put("sec-fetch-dest", "empty");
                headersPM04_12.put("sec-fetch-mode", "cors");
                headersPM04_12.put("sec-fetch-site", "cross-site");

                Map<CharSequence, String> headersPM04_13 = new HashMap<>();
                headersPM04_13.put("Upgrade-Insecure-Requests", "1");
                headersPM04_13.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM04_13.put("sec-ch-ua-mobile", "?0");
                headersPM04_13.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM04_14 = new HashMap<>();
                headersPM04_14.put("accept", "*/*");
                headersPM04_14.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM04_14.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM04_14.put("origin", "https://yandex.ru");
                headersPM04_14.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM04_14.put("sec-ch-ua-mobile", "?0");
                headersPM04_14.put("sec-ch-ua-platform", "Linux");
                headersPM04_14.put("sec-fetch-dest", "script");
                headersPM04_14.put("sec-fetch-mode", "cors");
                headersPM04_14.put("sec-fetch-site", "cross-site");

                Map<CharSequence, String> headersPM04_17 = new HashMap<>();
                headersPM04_17.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
                headersPM04_17.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM04_17.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM04_17.put("priority", "u=0, i");
                headersPM04_17.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM04_17.put("sec-ch-ua-mobile", "?0");
                headersPM04_17.put("sec-ch-ua-platform", "Linux");
                headersPM04_17.put("sec-fetch-dest", "iframe");
                headersPM04_17.put("sec-fetch-mode", "navigate");
                headersPM04_17.put("sec-fetch-site", "cross-site");
                headersPM04_17.put("upgrade-insecure-requests", "1");

                Map<CharSequence, String> headersPM04_18 = new HashMap<>();
                headersPM04_18.put("accept", "*/*");
                headersPM04_18.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM04_18.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM04_18.put("origin", "https://yandex.ru");
                headersPM04_18.put("priority", "u=1, i");
                headersPM04_18.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM04_18.put("sec-ch-ua-mobile", "?0");
                headersPM04_18.put("sec-ch-ua-platform", "Linux");
                headersPM04_18.put("sec-fetch-dest", "empty");
                headersPM04_18.put("sec-fetch-mode", "cors");
                headersPM04_18.put("sec-fetch-site", "cross-site");

                Map<CharSequence, String> headersPM04_21 = new HashMap<>();
                headersPM04_21.put("accept", "text/css,*/*;q=0.1");
                headersPM04_21.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM04_21.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM04_21.put("origin", "https://yandex.ru");
                headersPM04_21.put("priority", "u=0");
                headersPM04_21.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM04_21.put("sec-ch-ua-mobile", "?0");
                headersPM04_21.put("sec-ch-ua-platform", "Linux");
                headersPM04_21.put("sec-fetch-dest", "style");
                headersPM04_21.put("sec-fetch-mode", "cors");
                headersPM04_21.put("sec-fetch-site", "cross-site");

                Map<CharSequence, String> headersPM04_24 = new HashMap<>();
                headersPM04_24.put("accept", "*/*");
                headersPM04_24.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM04_24.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM04_24.put("origin", "https://yandex.ru");
                headersPM04_24.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM04_24.put("sec-ch-ua-mobile", "?0");
                headersPM04_24.put("sec-ch-ua-platform", "Linux");
                headersPM04_24.put("sec-fetch-dest", "script");
                headersPM04_24.put("sec-fetch-mode", "cors");
                headersPM04_24.put("sec-fetch-site", "same-site");

                Map<CharSequence, String> headersPM04_27 = new HashMap<>();
                headersPM04_27.put("accept", "*/*");
                headersPM04_27.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM04_27.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM04_27.put("priority", "u=4, i");
                headersPM04_27.put("sec-fetch-dest", "worker");
                headersPM04_27.put("sec-fetch-mode", "same-origin");
                headersPM04_27.put("sec-fetch-site", "same-origin");

                Map<CharSequence, String> PM04headersPM05_28 = new HashMap<>();
                PM04headersPM05_28.put("accept", "*/*");
                PM04headersPM05_28.put("accept-encoding", "gzip, deflate, br, zstd");
                PM04headersPM05_28.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                PM04headersPM05_28.put("origin", "https://yandex.ru");
                PM04headersPM05_28.put("priority", "u=1, i");
                PM04headersPM05_28.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                PM04headersPM05_28.put("sec-ch-ua-mobile", "?0");
                PM04headersPM05_28.put("sec-ch-ua-platform", "Linux");
                PM04headersPM05_28.put("sec-fetch-dest", "empty");
                PM04headersPM05_28.put("sec-fetch-mode", "cors");
                PM04headersPM05_28.put("sec-fetch-site", "same-site");

                Map<CharSequence, String> headersPM04_81 = new HashMap<>();
                headersPM04_81.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
                headersPM04_81.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM04_81.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM04_81.put("priority", "i");
                headersPM04_81.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM04_81.put("sec-ch-ua-mobile", "?0");
                headersPM04_81.put("sec-ch-ua-platform", "Linux");
                headersPM04_81.put("sec-fetch-dest", "image");
                headersPM04_81.put("sec-fetch-mode", "no-cors");
                headersPM04_81.put("sec-fetch-site", "cross-site");

                String uri2 = "https://yandex.ru/map-widget/v1";

                String uri3Polit = "https://polit-moscow.ru";

                String uri4core = "https://core-renderer-tiles.maps.yandex.net";


                String uri6 = "https://yastatic.net";

                String uri7 = "https://fonts.googleapis.com/css2";

                ScenarioBuilder scnPM04 = scenario("Pile.IzbUch")
                        .exec(
                                http("request_0")
                                        .get(uri3Polit + "/golosovanie-na-izbiratelnyh-uchastkah/")
                                        .headers(headersPM04_0)
                                        .resources(
                                                http("request_1")
                                                        .get(uri3Polit + "/wp-content/plugins/gallery-videos/public/css/fontawesome-webfont.woff2?v=4.6.3")
                                                        .headers(headersPM04_1),
                                                http("request_2")
                                                        .get(uri3Polit + "/wp-content/themes/politmoscow/fonts/GothamPro-Medium.woff")
                                                        .headers(headersPM04_1),
                                                http("request_3")
                                                        .get(uri3Polit + "/wp-content/themes/politmoscow/fonts/GothamPro-Bold.woff")
                                                        .headers(headersPM04_1),
                                                http("request_4")
                                                        .get(uri3Polit + "/wp-content/themes/politmoscow/fonts/GothamPro-Black.woff")
                                                        .headers(headersPM04_1),
                                                http("request_5")
                                                        .get(uri3Polit + "/wp-content/themes/politmoscow/fonts/GothamPro.woff")
                                                        .headers(headersPM04_1),
                                                http("request_6")
                                                        .get(uri7 + "?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap")
                                                        .headers(headersPM04_6),
                                                http("request_7")
                                                        .get("/metrika/tag.js")
                                                        .headers(headersPM04_6),
                                                http("request_8")
                                                        .get(uri3GS + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2")
                                                        .headers(headersPM04_1),
                                                http("request_9")
                                                        .get(uri3GS + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2")
                                                        .headers(headersPM04_1),
                                                http("request_10")
                                                        .get(uri3Polit + "/wp-content/themes/politmoscow/img/header-icon1b.png")
                                                        .headers(headersPM04_6),
                                                http("request_11")
                                                        .get(uri3Polit + "/wp-content/themes/politmoscow/img2/lines.png")
                                                        .headers(headersPM04_6),
                                                http("request_12")
                                                        .get("/watch/94094106?wmode=7&page-url=https%3A%2F%2Fpolit-moscow.ru%2Fgolosovanie-na-izbiratelnyh-uchastkah%2F&page-ref=https%3A%2F%2Fpolit-moscow.ru%2Fvybory-v-moskovskuyu-gorodskuyu-dumu-2024%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.113%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.113%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.113%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A1070504886616%3Ahid%3A698317592%3Az%3A300%3Ai%3A20240830150240%3Aet%3A1725012160%3Ac%3A1%3Arn%3A845107699%3Arqn%3A20%3Au%3A172478250269200753%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C648%2C3%2C3%2C0%2C%2C79%2C0%2C%2C%2C%2C733%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1725012159664%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1725012160%3At%3A%D0%98%D0%B7%D0%B1%D0%B8%D1%80%D0%B0%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D1%8B%D0%B5%20%D1%83%D1%87%D0%B0%D1%81%D1%82%D0%BA%D0%B8%20%D0%BD%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D1%85%20%D0%B4%D0%B5%D0%BF%D1%83%D1%82%D0%B0%D1%82%D0%BE%D0%B2%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%B3%D0%BE%D1%80%D0%B4%D1%83%D0%BC%D1%83%20%D0%B8%20%D0%A2%D0%B8%D0%9D%D0%90%D0%9E%202024%2C%20%D0%BD%D0%B0%D0%B9%D1%82%D0%B8%20%D1%83%D1%87%D0%B0%D1%81%D1%82%D0%BE%D0%BA%20%D0%B4%D0%BB%D1%8F%20%D0%B3%D0%BE%D0%BB%D0%BE%D1%81%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F%20%E2%80%94%20%D0%9F%D0%9E%D0%9B%D0%98%D0%A2%D0%9C%D0%9E%D0%A1%D0%9A%D0%92%D0%90&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
                                                        .headers(headersPM04_12),
                                                http("request_13")
                                                        .get("/metrika/metrika_match.html")
                                                        .headers(headersPM04_13),
                                                http("request_14")
                                                        .get(uri6 + "/s3/front-maps-static/maps-front-maps/build/client/map-widget/chunks/map-widget-base/b7997d09cf76c84ddb30.yandex.ru.js")
                                                        .headers(headersPM04_14),
                                                http("request_15")
                                                        .get(uri6 + "/react/18.2.0/react-with-dom.min.js")
                                                        .headers(headersPM04_14),
                                                http("request_16")
                                                        .get(uri6 + "/s3/front-maps-static/maps-front-maps/build/client/map-widget/chunks/map-widget-app/57501a77aeb2375e364a.yandex.ru.js")
                                                        .headers(headersPM04_14),
                                                http("request_17")
                                                        .get(uri2 + "/?lang=ru_RU&scroll=true&source=constructor-api&um=constructor%3A174a1dc6fd94994d2d678bdaf68a6995b2ee8570350e21dcfdf7d34dfa265ca0")
                                                        .headers(headersPM04_17),
                                                http("request_18")
                                                        .get(uri6 + "/islands/_/SmqPmIMEXrW4lOY8QrhTUVDbrro.woff")
                                                        .headers(headersPM04_18),
                                                http("request_19")
                                                        .get(uri6 + "/islands/_/bIx8jOfCEfR-mECoDUEZywDBuHA.woff")
                                                        .headers(headersPM04_18),
                                                http("request_20")
                                                        .get(uri6 + "/islands/_/KtHQR1erf3spayoIM4M4ngg0e2E.woff")
                                                        .headers(headersPM04_18),
                                                http("request_21")
                                                        .get(uri6 + "/s3/front-maps-static/maps-front-maps/build/client/map-widget/chunks/ymaps/d1ca645121aad83cd2e4.css")
                                                        .headers(headersPM04_21),
                                                http("request_22")
                                                        .get(uri6 + "/s3/front-maps-static/maps-front-maps/build/client/map-widget/chunks/ymaps/f688c93a2e2128b5d509.yandex.ru.js")
                                                        .headers(headersPM04_14),
                                                http("request_23")
                                                        .get(uri6 + "/s3/front-maps-static/maps-front-maps/build/client/map-widget/chunks/ymaps-vector/3878a4cdd449453da9bb.yandex.ru.js")
                                                        .headers(headersPM04_14),
                                                http("request_24")
                                                        .get("/metrika/tag_turbo.js")
                                                        .headers(headersPM04_24),
                                                http("request_25")
                                                        .get(uri6 + "/s3/front-maps-static/maps-front-maps/static/v51/icons/core/logo-24.svg")
                                                        .headers(headersPM04_18),
                                                http("request_26")
                                                        .get(uri6 + "/s3/front-maps-static/maps-front-maps/_/fd161c881e6392111418a1036fe1188e.svg")
                                                        .headers(headersPM04_18),
                                                http("request_27")
                                                        .get(uri2 + "/build/client/worker/content_provider.worker/a3a480812b0b2481bd17.js")
                                                        .headers(headersPM04_27),
                                                http("request_28")
                                                        .get("/watch/44120344?wmode=7&page-url=https%3A%2F%2Fyandex.ru%2Fmap-widget%2Fv1%2F%3Flang%3Dru_RU%26scroll%3Dtrue%26source%3Dconstructor-api%26um%3Dconstructor%253A174a1dc6fd94994d2d678bdaf68a6995b2ee8570350e21dcfdf7d34dfa265ca0&page-ref=https%3A%2F%2Fpolit-moscow.ru%2F&nohit=1&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.113%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.113%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.113%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3A51ws7ei066ityj92vuvd23adxu%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A531681617170%3Ahid%3A924367085%3Az%3A300%3Ai%3A20240830150241%3Aet%3A1725012162%3Ac%3A1%3Arn%3A356044664%3Au%3A1715856246806726321%3Aw%3A1220x800%3As%3A1920x1080x24%3Ask%3A1%3Aifr%3A1%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1725012162%3At%3Amap%20frame&t=gdpr(13-0)yu(3354798091715856243)cdl(na)eco(25632)ti(2)")
                                                        .headers(PM04headersPM05_28),
                                                http("request_29")
                                                        .get("/watch/44120344?page-url=https%3A%2F%2Fyandex.ru%2Fmap-widget%2Fv1%2F%3Flang%3Dru_RU%26scroll%3Dtrue%26source%3Dconstructor-api%26um%3Dconstructor%253A174a1dc6fd94994d2d678bdaf68a6995b2ee8570350e21dcfdf7d34dfa265ca0&page-ref=https%3A%2F%2Fpolit-moscow.ru%2F&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.113%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.113%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.113%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1725012162_ea4047e64d306059b3ca9afd2745a2279e7177f9cbf3fc63cc289c25da0e6fe7&browser-info=pv%3A1%3Aar%3A1%3Avf%3A51ws7ei066ityj92vuvd23adxu%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A531681617170%3Ahid%3A924367085%3Aphid%3A698317592%3Az%3A300%3Ai%3A20240830150242%3Aet%3A1725012162%3Ac%3A1%3Arn%3A699101675%3Arqn%3A1%3Au%3A1715856246806726321%3Aw%3A1220x800%3As%3A1920x1080x24%3Ask%3A1%3Aifr%3A1%3Ads%3A3%2C126%2C111%2C555%2C1%2C0%2C%2C7%2C0%2C831%2C831%2C0%2C831%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1725012162%3At%3Amap%20frame&t=gdpr(13-0)mc(h-1)yu(3354798091715856243)cdl(na)eco(25632)ti(2)")
                                                        .headers(PM04headersPM05_28),
                                                http("request_30")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=154&y=80&z=8&zmin=9&zmax=9&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_31")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=78&y=41&z=7&zmin=8&zmax=8&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_32")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=155&y=80&z=8&zmin=9&zmax=9&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_33")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=76&y=41&z=7&zmin=8&zmax=8&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_34")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=76&y=40&z=7&zmin=8&zmax=8&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_35")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=76&y=39&z=7&zmin=8&zmax=8&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_36")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=155&y=81&z=8&zmin=9&zmax=9&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_37")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=78&y=39&z=7&zmin=8&zmax=8&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_38")
                                                        .get(uri4core + "/vmap2/glyphs?lang=ru_RU&font_id=915f3cad32f446e5df58ef8e63b6041edf0768ad~~3&range=512,640&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_39")
                                                        .get(uri4core + "/vmap2/glyphs?lang=ru_RU&font_id=915f3cad32f446e5df58ef8e63b6041edf0768ad~~3&range=0,128&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_40")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=154&y=81&z=8&zmin=9&zmax=9&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_41")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=77&y=41&z=7&zmin=8&zmax=8&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_42")
                                                        .get(uri4core + "/vmap2/glyphs?lang=ru_RU&font_id=87931be60dd7d1ced983a8030b11bd153c5e45ed~~3&range=0,128&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_43")
                                                        .get(uri4core + "/vmap2/glyphs?lang=ru_RU&font_id=87931be60dd7d1ced983a8030b11bd153c5e45ed~~3&range=128,256&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_44")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=78&y=40&z=7&zmin=8&zmax=8&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_45")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=77&y=39&z=7&zmin=8&zmax=8&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_46")
                                                        .get(uri4core + "/vmap2/glyphs?lang=ru_RU&font_id=87931be60dd7d1ced983a8030b11bd153c5e45ed~~3&range=512,640&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_47")
                                                        .get(uri4core + "/vmap2/glyphs?lang=ru_RU&font_id=915f3cad32f446e5df58ef8e63b6041edf0768ad~~3&range=384,512&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_48")
                                                        .get(uri4core + "/vmap2/glyphs?lang=ru_RU&font_id=9f08a647bf335ac646f57a03dbb3a12bd8cab4d0~~3&range=512,640&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_49")
                                                        .get(uri4core + "/vmap2/icons?id=5OUVCBDHHTMI&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_50")
                                                        .get(uri4core + "/vmap2/icons?id=MYAME2F7IXSA&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_51")
                                                        .get(uri4core + "/vmap2/icons?id=3MDHL74NGZ6I&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_52")
                                                        .get(uri4core + "/vmap2/icons?id=RBNVYF5LUL4O&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_53")
                                                        .get(uri4core + "/vmap2/icons?id=35KY2RCBV5UN&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_54")
                                                        .get(uri4core + "/vmap2/icons?id=BXMZY45DINKS&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_55")
                                                        .get(uri4core + "/vmap2/icons?id=WC7UI5W5A2ES&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_56")
                                                        .get(uri4core + "/vmap2/icons?id=FS6W7IMVXR26&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_57")
                                                        .get(uri4core + "/vmap2/glyphs?lang=ru_RU&font_id=8db20f4aff1fcc33f4eebad812e55d403dfaa7ad~~3&range=128,256&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_58")
                                                        .get(uri4core + "/vmap2/glyphs?lang=ru_RU&font_id=8db20f4aff1fcc33f4eebad812e55d403dfaa7ad~~3&range=512,640&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_59")
                                                        .get(uri4core + "/vmap2/glyphs?lang=ru_RU&font_id=9f08a647bf335ac646f57a03dbb3a12bd8cab4d0~~3&range=0,128&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_60")
                                                        .get(uri4core + "/vmap2/glyphs?lang=ru_RU&font_id=8db20f4aff1fcc33f4eebad812e55d403dfaa7ad~~3&range=0,128&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_61")
                                                        .get(uri4core + "/vmap2/icons?id=5MSS5TIZMCJG&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_62")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=155&y=79&z=8&zmin=9&zmax=9&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_63")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=153&y=80&z=8&zmin=9&zmax=9&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_64")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=154&y=79&z=8&zmin=9&zmax=9&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_65")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=153&y=81&z=8&zmin=9&zmax=9&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_66")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=153&y=79&z=8&zmin=9&zmax=9&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_67")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=152&y=78&z=8&zmin=9&zmax=9&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_68")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=155&y=78&z=8&zmin=9&zmax=9&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_69")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=152&y=80&z=8&zmin=9&zmax=9&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_70")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=75&y=41&z=7&zmin=8&zmax=8&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_71")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=75&y=39&z=7&zmin=8&zmax=8&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_72")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=78&y=38&z=7&zmin=8&zmax=8&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_73")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=154&y=78&z=8&zmin=9&zmax=9&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_74")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=76&y=38&z=7&zmin=8&zmax=8&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_75")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=152&y=81&z=8&zmin=9&zmax=9&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_76")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=153&y=78&z=8&zmin=9&zmax=9&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_77")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=77&y=38&z=7&zmin=8&zmax=8&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_78")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=152&y=79&z=8&zmin=9&zmax=9&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_79")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=75&y=40&z=7&zmin=8&zmax=8&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_80")
                                                        .get(uri4core + "/vmap2/tiles?lang=ru_RU&x=75&y=38&z=7&zmin=8&zmax=8&v=24.08.29-0-b240826101800&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp"),
                                                http("request_81")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=309&y=161&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_82")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=310&y=159&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_83")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=310&y=162&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_84")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=307&y=161&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_85")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=307&y=162&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_86")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=306&y=161&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_87")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=308&y=161&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_88")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=308&y=160&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_89")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=309&y=162&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_90")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=307&y=159&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_91")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=311&y=160&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_92")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=310&y=161&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_93")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=311&y=161&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_94")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=311&y=162&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_95")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=309&y=159&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_96")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=308&y=162&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_97")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=308&y=159&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_98")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=309&y=160&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_99")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=310&y=160&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_100")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=307&y=160&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_101")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=306&y=160&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_102")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=306&y=162&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_103")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=311&y=159&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81),
                                                http("request_104")
                                                        .get(uri4core + "/tiles?l=map&v=24.08.29-0-b240826101800&x=306&y=159&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                        .headers(headersPM04_81)
                                        )
                        );

                HttpProtocolBuilder httpProtocol_Candidates = http
                        .baseUrl("https://polit-moscow.ru")
                        .inferHtmlResources()
                        .userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headersPM05_0 = new HashMap<>();
                headersPM05_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
                headersPM05_0.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM05_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM05_0.put("priority", "u=0, i");
                headersPM05_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM05_0.put("sec-ch-ua-mobile", "?0");
                headersPM05_0.put("sec-ch-ua-platform", "Linux");
                headersPM05_0.put("sec-fetch-dest", "document");
                headersPM05_0.put("sec-fetch-mode", "navigate");
                headersPM05_0.put("sec-fetch-site", "same-origin");
                headersPM05_0.put("sec-fetch-user", "?1");
                headersPM05_0.put("upgrade-insecure-requests", "1");

                Map<CharSequence, String> headersPM05_1 = new HashMap<>();
                headersPM05_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM05_1.put("sec-ch-ua-mobile", "?0");
                headersPM05_1.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM05_3 = new HashMap<>();
                headersPM05_3.put("Origin", "https://polit-moscow.ru");
                headersPM05_3.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM05_3.put("sec-ch-ua-mobile", "?0");
                headersPM05_3.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM05_12 = new HashMap<>();
                headersPM05_12.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
                headersPM05_12.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM05_12.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM05_12.put("priority", "u=2, i");
                headersPM05_12.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM05_12.put("sec-ch-ua-mobile", "?0");
                headersPM05_12.put("sec-ch-ua-platform", "Linux");
                headersPM05_12.put("sec-fetch-dest", "image");
                headersPM05_12.put("sec-fetch-mode", "no-cors");
                headersPM05_12.put("sec-fetch-site", "same-origin");

                Map<CharSequence, String> headersPM05_15 = new HashMap<>();
                headersPM05_15.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
                headersPM05_15.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM05_15.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM05_15.put("priority", "i");
                headersPM05_15.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM05_15.put("sec-ch-ua-mobile", "?0");
                headersPM05_15.put("sec-ch-ua-platform", "Linux");
                headersPM05_15.put("sec-fetch-dest", "image");
                headersPM05_15.put("sec-fetch-mode", "no-cors");
                headersPM05_15.put("sec-fetch-site", "same-origin");

                Map<CharSequence, String> headersPM05_36 = new HashMap<>();
                headersPM05_36.put("accept", "*/*");
                headersPM05_36.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM05_36.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM05_36.put("origin", "https://polit-moscow.ru");
                headersPM05_36.put("priority", "u=1, i");
                headersPM05_36.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM05_36.put("sec-ch-ua-mobile", "?0");
                headersPM05_36.put("sec-ch-ua-platform", "Linux");
                headersPM05_36.put("sec-fetch-dest", "empty");
                headersPM05_36.put("sec-fetch-mode", "cors");
                headersPM05_36.put("sec-fetch-site", "cross-site");

                Map<CharSequence, String> headersPM05_38 = new HashMap<>();
                headersPM05_38.put("Upgrade-Insecure-Requests", "1");
                headersPM05_38.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM05_38.put("sec-ch-ua-mobile", "?0");
                headersPM05_38.put("sec-ch-ua-platform", "Linux");




                ScenarioBuilder scnPM05 = scenario("Pile.Candidates")
                        .exec(
                                http("request_0")
                                        .get("/spisok-kandidatov-na-vyborah-v-moskovskuyu-gorodskuyu-dumu-2024/")
                                        .headers(headersPM05_0)
                                        .resources(
                                                http("request_1")
                                                        .get(uri4 + "?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap")
                                                        .headers(headersPM05_1),
                                                http("request_2")
                                                        .get(uri1Ya + "/metrika/tag.js")
                                                        .headers(headersPM05_1),
                                                http("request_3")
                                                        .get("/wp-content/plugins/gallery-videos/public/css/fontawesome-webfont.woff2?v=4.6.3")
                                                        .headers(headersPM05_3),
                                                http("request_4")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Medium.woff")
                                                        .headers(headersPM05_3),
                                                http("request_5")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Bold.woff")
                                                        .headers(headersPM05_3),
                                                http("request_6")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Black.woff")
                                                        .headers(headersPM05_3),
                                                http("request_7")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro.woff")
                                                        .headers(headersPM05_3),
                                                http("request_8")
                                                        .get(uri3GS + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2")
                                                        .headers(headersPM05_3),
                                                http("request_9")
                                                        .get(uri3GS + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2")
                                                        .headers(headersPM05_3),
                                                http("request_10")
                                                        .get("/wp-content/themes/politmoscow/img/header-icon1b.png")
                                                        .headers(headersPM05_1),
                                                http("request_11")
                                                        .get("/wp-content/themes/politmoscow/img2/lines.png")
                                                        .headers(headersPM05_1),
                                                http("request_12")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/2.jpg.webp")
                                                        .headers(headersPM05_12),
                                                http("request_13")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/1_1.jpg.webp")
                                                        .headers(headersPM05_12),
                                                http("request_14")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/4.jpg.webp")
                                                        .headers(headersPM05_12),
                                                http("request_15")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/5.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_16")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/8.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_17")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/3.jpg.webp")
                                                        .headers(headersPM05_12),
                                                http("request_18")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/6.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_19")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/7.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_20")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/9.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_21")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/10.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_22")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/11.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_23")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/12.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_24")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/14.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_25")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/18.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_26")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/19.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_27")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/20.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_28")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/21.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_29")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/22.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_30")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/24.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_31")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/26.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_32")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/27.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_33")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/28.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_34")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/29.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_35")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/23.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_36")
                                                        .get(uri1Ya + "/watch/94094106?wmode=7&page-url=https%3A%2F%2Fpolit-moscow.ru%2Fspisok-kandidatov-na-vyborah-v-moskovskuyu-gorodskuyu-dumu-2024%2F&page-ref=https%3A%2F%2Fpolit-moscow.ru%2Fgolosovanie-na-izbiratelnyh-uchastkah%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.113%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.113%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.113%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A1070504886616%3Ahid%3A313985773%3Az%3A300%3Ai%3A20240830150333%3Aet%3A1725012214%3Ac%3A1%3Arn%3A1019100687%3Arqn%3A21%3Au%3A172478250269200753%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C682%2C4%2C2%2C0%2C%2C74%2C0%2C%2C%2C%2C763%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1725012213083%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1725012214%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%B2%20%D0%B4%D0%B5%D0%BF%D1%83%D1%82%D0%B0%D1%82%D1%8B%20%D0%9C%D0%BE%D1%81%D0%B3%D0%BE%D1%80%D0%B4%D1%83%D0%BC%D1%8B%202024%2C%20%D1%81%D0%BF%D0%B8%D1%81%D0%BE%D0%BA%20%D0%BA%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D0%BE%D0%B2%20%E2%80%94%20%D0%9F%D0%9E%D0%9B%D0%98%D0%A2%D0%9C%D0%9E%D0%A1%D0%9A%D0%92%D0%90&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
                                                        .headers(headersPM05_36),
                                                http("request_37")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/30.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_38")
                                                        .get(uri1Ya + "/metrika/metrika_match.html")
                                                        .headers(headersPM05_38),
                                                http("request_39")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/32.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_40")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/31.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_41")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/33.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_42")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/35.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_43")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/34.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_44")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/36.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_45")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/37.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_46")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/39.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_47")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/40.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_48")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/41.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_49")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/42.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_50")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/43.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_51")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/45.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_52")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/13.jpg.webp")
                                                        .headers(headersPM05_15),
                                                http("request_53")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img2/25.jpg.webp")
                                                        .headers(headersPM05_15)
                                        )
                        );
                HttpProtocolBuilder httpProtocol_CandidatesMun = http
                        .baseUrl("https://polit-moscow.ru")
                        .inferHtmlResources()
                        ;

                Map<CharSequence, String> headersPM06_0 = new HashMap<>();
                headersPM06_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
                headersPM06_0.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM06_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM06_0.put("priority", "u=0, i");
                headersPM06_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM06_0.put("sec-ch-ua-mobile", "?0");
                headersPM06_0.put("sec-ch-ua-platform", "Linux");
                headersPM06_0.put("sec-fetch-dest", "document");
                headersPM06_0.put("sec-fetch-mode", "navigate");
                headersPM06_0.put("sec-fetch-site", "same-origin");
                headersPM06_0.put("sec-fetch-user", "?1");
                headersPM06_0.put("upgrade-insecure-requests", "1");
                headersPM06_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headersPM06_1 = new HashMap<>();
                headersPM06_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headersPM06_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM06_1.put("sec-ch-ua-mobile", "?0");
                headersPM06_1.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM06_54 = new HashMap<>();
                headersPM06_54.put("Origin", "https://polit-moscow.ru");
                headersPM06_54.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headersPM06_54.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM06_54.put("sec-ch-ua-mobile", "?0");
                headersPM06_54.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM06_58 = new HashMap<>();
                headersPM06_58.put("accept", "*/*");
                headersPM06_58.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM06_58.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM06_58.put("origin", "https://polit-moscow.ru");
                headersPM06_58.put("priority", "u=1, i");
                headersPM06_58.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM06_58.put("sec-ch-ua-mobile", "?0");
                headersPM06_58.put("sec-ch-ua-platform", "Linux");
                headersPM06_58.put("sec-fetch-dest", "empty");
                headersPM06_58.put("sec-fetch-mode", "cors");
                headersPM06_58.put("sec-fetch-site", "cross-site");
                headersPM06_58.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headersPM06_59 = new HashMap<>();
                headersPM06_59.put("Upgrade-Insecure-Requests", "1");
                headersPM06_59.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headersPM06_59.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM06_59.put("sec-ch-ua-mobile", "?0");
                headersPM06_59.put("sec-ch-ua-platform", "Linux");




                ScenarioBuilder scnPM06 = scenario("Pile.CandidatesMun")
                        .exec(
                                http("request_0")
                                        .get("/kandidaty-na-vyborah-tinao-2024/")
                                        .headers(headersPM06_0)
                                        .resources(
                                                http("request_1")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/1.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_2")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/2.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_3")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/3.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_4")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/4.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_5")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/5.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_6")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/6.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_7")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/7.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_8")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/8.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_9")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/9.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_10")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/10.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_11")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/11.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_12")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/12.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_13")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/13.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_14")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/14.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_15")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/15.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_16")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/16.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_17")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/17.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_18")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/18.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_19")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/19.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_20")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/20.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_21")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/21.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_22")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/22.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_23")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/23.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_24")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/24.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_25")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/25.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_26")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/26.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_27")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/27.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_28")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/28.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_29")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/29.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_30")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/30.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_31")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/31.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_32")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/32.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_33")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/33.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_34")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/34.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_35")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/35.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_36")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/36.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_37")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/37.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_38")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/38.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_39")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/39.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_40")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/none.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_41")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/42.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_42")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/43.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_43")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/45.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_44")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/46.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_45")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/53.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_46")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/themes/politmoscow/img3/54.jpg.webp")
                                                        .headers(headersPM06_1),
                                                http("request_47")
                                                        .get("/wp-content/plugins/gallery-videos/public/css/fontawesome-webfont.woff2?v=4.6.3"),
                                                http("request_48")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Medium.woff"),
                                                http("request_49")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Bold.woff"),
                                                http("request_50")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Black.woff"),
                                                http("request_51")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro.woff"),
                                                http("request_52")
                                                        .get(uri4 + "?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap")
                                                        .headers(headersPM06_1),
                                                http("request_53")
                                                        .get(uri1Ya + "/metrika/tag.js")
                                                        .headers(headersPM06_1),
                                                http("request_54")
                                                        .get(uri3GS + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2")
                                                        .headers(headersPM06_54),
                                                http("request_55")
                                                        .get(uri3GS + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2")
                                                        .headers(headersPM06_54),
                                                http("request_56")
                                                        .get("/wp-content/themes/politmoscow/img/header-icon1b.png"),
                                                http("request_57")
                                                        .get("/wp-content/themes/politmoscow/img2/lines.png")
                                                        .headers(headersPM06_1),
                                                http("request_58")
                                                        .get(uri1Ya + "/watch/94094106?wmode=7&page-url=https%3A%2F%2Fpolit-moscow.ru%2Fkandidaty-na-vyborah-tinao-2024%2F&page-ref=https%3A%2F%2Fpolit-moscow.ru%2Fnews%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.113%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.113%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.113%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A1070504886616%3Ahid%3A884277043%3Az%3A300%3Ai%3A20240830150449%3Aet%3A1725012289%3Ac%3A1%3Arn%3A763083457%3Arqn%3A24%3Au%3A172478250269200753%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C701%2C3%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1725012288144%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1725012289%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%B2%20%D0%BC%D1%83%D0%BD%D0%B8%D1%86%D0%B8%D0%BF%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D0%B5%20%D0%B4%D0%B5%D0%BF%D1%83%D1%82%D0%B0%D1%82%D1%8B%20%D0%A2%D0%B8%D0%9D%D0%90%D0%9E%202024%2C%20%D1%81%D0%BF%D0%B8%D1%81%D0%BE%D0%BA%20%D0%BA%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D0%BE%D0%B2%20%E2%80%94%20%D0%9F%D0%9E%D0%9B%D0%98%D0%A2%D0%9C%D0%9E%D0%A1%D0%9A%D0%92%D0%90&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
                                                        .headers(headersPM06_58),
                                                http("request_59")
                                                        .get(uri1Ya + "/metrika/metrika_match.html")
                                                        .headers(headersPM06_59)
                                        )
                        );

                HttpProtocolBuilder httpProtocol_ShtabPhoto1 = http
                        .baseUrl("https://polit-moscow.ru")
                        .inferHtmlResources()
                        ;

                Map<CharSequence, String> headersPM07_0 = new HashMap<>();
                headersPM07_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
                headersPM07_0.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM07_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM07_0.put("priority", "u=0, i");
                headersPM07_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM07_0.put("sec-ch-ua-mobile", "?0");
                headersPM07_0.put("sec-ch-ua-platform", "Linux");
                headersPM07_0.put("sec-fetch-dest", "document");
                headersPM07_0.put("sec-fetch-mode", "navigate");
                headersPM07_0.put("sec-fetch-site", "same-origin");
                headersPM07_0.put("sec-fetch-user", "?1");
                headersPM07_0.put("upgrade-insecure-requests", "1");
                headersPM07_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headersPM07_8 = new HashMap<>();
                headersPM07_8.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headersPM07_8.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM07_8.put("sec-ch-ua-mobile", "?0");
                headersPM07_8.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM07_11 = new HashMap<>();
                headersPM07_11.put("accept", "*/*");
                headersPM07_11.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM07_11.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM07_11.put("origin", "https://polit-moscow.ru");
                headersPM07_11.put("priority", "u=1, i");
                headersPM07_11.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM07_11.put("sec-ch-ua-mobile", "?0");
                headersPM07_11.put("sec-ch-ua-platform", "Linux");
                headersPM07_11.put("sec-fetch-dest", "empty");
                headersPM07_11.put("sec-fetch-mode", "cors");
                headersPM07_11.put("sec-fetch-site", "cross-site");
                headersPM07_11.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headersPM07_12 = new HashMap<>();
                headersPM07_12.put("Upgrade-Insecure-Requests", "1");
                headersPM07_12.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headersPM07_12.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM07_12.put("sec-ch-ua-mobile", "?0");
                headersPM07_12.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM07_14 = new HashMap<>();
                headersPM07_14.put("accept", "*/*");
                headersPM07_14.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM07_14.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM07_14.put("origin", "https://polit-moscow.ru");
                headersPM07_14.put("priority", "u=4, i");
                headersPM07_14.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM07_14.put("sec-ch-ua-mobile", "?0");
                headersPM07_14.put("sec-ch-ua-platform", "Linux");
                headersPM07_14.put("sec-fetch-dest", "empty");
                headersPM07_14.put("sec-fetch-mode", "no-cors");
                headersPM07_14.put("sec-fetch-site", "cross-site");
                headersPM07_14.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headersPM07_15 = new HashMap<>();
                headersPM07_15.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
                headersPM07_15.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM07_15.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM07_15.put("priority", "i");
                headersPM07_15.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM07_15.put("sec-ch-ua-mobile", "?0");
                headersPM07_15.put("sec-ch-ua-platform", "Linux");
                headersPM07_15.put("sec-fetch-dest", "image");
                headersPM07_15.put("sec-fetch-mode", "no-cors");
                headersPM07_15.put("sec-fetch-site", "same-origin");
                headersPM07_15.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");


                ScenarioBuilder scnPM07 = scenario("Pile.ShtabPhoto1")
                        .exec(
                                http("request_0")
                                        .get("/oficialnye-foto-shtaba/nggallery/album/%d0%be%d1%82%d0%ba%d1%80%d1%8b%d1%82%d0%b8%d0%b5-%d1%88%d1%82%d0%b0%d0%b1%d0%b0-%d0%bd%d0%b0-%d0%bf%d0%be%d0%ba%d1%80%d0%be%d0%b2%d0%ba%d0%b5")
                                        .headers(headersPM07_0)
                                        .resources(
                                                http("request_1")
                                                        .get("/wp-content/plugins/gallery-videos/public/css/fontawesome-webfont.woff2?v=4.6.3"),
                                                http("request_2")
                                                        .get("/wp-content/plugins/nextgen-gallery/static/FontAwesome/webfonts/fa-brands-400.woff2"),
                                                http("request_3")
                                                        .get("/wp-content/plugins/nextgen-gallery/static/FontAwesome/webfonts/fa-solid-900.woff2"),
                                                http("request_4")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Medium.woff"),
                                                http("request_5")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Bold.woff"),
                                                http("request_6")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Black.woff"),
                                                http("request_7")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro.woff"),
                                                http("request_8")
                                                        .get(uri1Ya + "/metrika/tag.js")
                                                        .headers(headersPM07_8),
                                                http("request_9")
                                                        .get("/wp-content/plugins/wp-postratings/images/heart_crystal/rating_1_over.gif")
                                                        .headers(headersPM07_8),
                                                http("request_10")
                                                        .get("/wp-content/themes/politmoscow/img/header-icon1b.png"),
                                                http("request_11")
                                                        .get(uri1Ya + "/watch/94094106?wmode=7&page-url=https%3A%2F%2Fpolit-moscow.ru%2Foficialnye-foto-shtaba%2Fnggallery%2Falbum%2F%25d0%25be%25d1%2582%25d0%25ba%25d1%2580%25d1%258b%25d1%2582%25d0%25b8%25d0%25b5-%25d1%2588%25d1%2582%25d0%25b0%25d0%25b1%25d0%25b0-%25d0%25bd%25d0%25b0-%25d0%25bf%25d0%25be%25d0%25ba%25d1%2580%25d0%25be%25d0%25b2%25d0%25ba%25d0%25b5&page-ref=https%3A%2F%2Fpolit-moscow.ru%2Foficialnye-foto-shtaba%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.113%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.113%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.113%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A1070504886616%3Ahid%3A721454826%3Az%3A300%3Ai%3A20240830150641%3Aet%3A1725012402%3Ac%3A1%3Arn%3A61855842%3Arqn%3A39%3Au%3A172478250269200753%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C793%2C3%2C2%2C0%2C%2C96%2C0%2C%2C%2C%2C913%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1725012400753%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1725012402%3At%3A%D0%A4%D0%BE%D1%82%D0%BE%20%D0%B8%20%D0%B2%D0%B8%D0%B4%D0%B5%D0%BE%20%E2%80%93%20%D0%9F%D0%9E%D0%9B%D0%98%D0%A2%D0%9C%D0%9E%D0%A1%D0%9A%D0%92%D0%90&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
                                                        .headers(headersPM07_11),
                                                http("request_12")
                                                        .get(uri1Ya + "/metrika/metrika_match.html")
                                                        .headers(headersPM07_12)
                                        )
                        )
                        .exec(
                                http("request_13")
                                        .get("/wp-content/plugins/nextgen-gallery/static/Lightbox/fancybox/fancybox.png")
                                        .resources(
                                                http("request_14")
                                                        .post(uri1Ya + "/watch/94094106?page-url=https%3A%2F%2Fpolit-moscow.ru%2Fwp-content%2Fgallery%2Fd0bed182d0bad180d18bd182d0b8d0b5-d188d182d0b0d0b1d0b0%2FDMR_0863.jpg&page-ref=https%3A%2F%2Fpolit-moscow.ru%2Foficialnye-foto-shtaba%2Fnggallery%2Falbum%2F%25d0%25be%25d1%2582%25d0%25ba%25d1%2580%25d1%258b%25d1%2582%25d0%25b8%25d0%25b5-%25d1%2588%25d1%2582%25d0%25b0%25d0%25b1%25d0%25b0-%25d0%25bd%25d0%25b0-%25d0%25bf%25d0%25be%25d0%25ba%25d1%2580%25d0%25be%25d0%25b2%25d0%25ba%25d0%25b5&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.113%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.113%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.113%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1725012401_a4153aa8d3b33ef3485fddb660466a179d9e17d69d838d831b9593379dd9e700&browser-info=ite%3A1%3Adl%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A3%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A1070504886616%3Ahid%3A721454826%3Az%3A300%3Ai%3A20240830150643%3Aet%3A1725012404%3Ac%3A1%3Arn%3A649000573%3Arqn%3A40%3Au%3A172478250269200753%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A948%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C%2C966%2C966%2C0%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1725012400753%3Aadb%3A2%3App%3A3629563401%3Arqnl%3A1%3Ast%3A1725012404%3At%3ADMR_0863&t=gdpr(14)clc(0-0-0)rqnt(2)aw(1)rcm(0)cdl(na)eco(21037568)dss(2)ti(0)&force-urlencoded=1")
                                                        .headers(headersPM07_14),
                                                http("request_15")
                                                        .get("/wp-content/gallery/d0bed182d0bad180d18bd182d0b8d0b5-d188d182d0b0d0b1d0b0/DMR_0863.jpg")
                                                        .headers(headersPM07_15),
                                                http("request_16")
                                                        .get("/wp-content/plugins/nextgen-gallery/static/Lightbox/fancybox/blank.gif"),
                                                http("request_17")
                                                        .get("/wp-content/gallery/d0bed182d0bad180d18bd182d0b8d0b5-d188d182d0b0d0b1d0b0/DMR_0869.jpg")
                                                        .headers(headersPM07_15)
                                        )
                        );

                HttpProtocolBuilder httpProtocol_News1 = http
                        .baseUrl("https://polit-moscow.ru")
                        .inferHtmlResources()
                        ;

                Map<CharSequence, String> headersPM08_0 = new HashMap<>();
                headersPM08_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
                headersPM08_0.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM08_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM08_0.put("priority", "u=0, i");
                headersPM08_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM08_0.put("sec-ch-ua-mobile", "?0");
                headersPM08_0.put("sec-ch-ua-platform", "Linux");
                headersPM08_0.put("sec-fetch-dest", "document");
                headersPM08_0.put("sec-fetch-mode", "navigate");
                headersPM08_0.put("sec-fetch-site", "same-origin");
                headersPM08_0.put("sec-fetch-user", "?1");
                headersPM08_0.put("upgrade-insecure-requests", "1");
                headersPM08_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headersPM08_1 = new HashMap<>();
                headersPM08_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headersPM08_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM08_1.put("sec-ch-ua-mobile", "?0");
                headersPM08_1.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM08_9 = new HashMap<>();
                headersPM08_9.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
                headersPM08_9.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM08_9.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM08_9.put("priority", "u=2, i");
                headersPM08_9.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM08_9.put("sec-ch-ua-mobile", "?0");
                headersPM08_9.put("sec-ch-ua-platform", "Linux");
                headersPM08_9.put("sec-fetch-dest", "image");
                headersPM08_9.put("sec-fetch-mode", "no-cors");
                headersPM08_9.put("sec-fetch-site", "same-origin");
                headersPM08_9.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headersPM08_10 = new HashMap<>();
                headersPM08_10.put("Upgrade-Insecure-Requests", "1");
                headersPM08_10.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headersPM08_10.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM08_10.put("sec-ch-ua-mobile", "?0");
                headersPM08_10.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM08_11 = new HashMap<>();
                headersPM08_11.put("accept", "*/*");
                headersPM08_11.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM08_11.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM08_11.put("origin", "https://polit-moscow.ru");
                headersPM08_11.put("priority", "u=1, i");
                headersPM08_11.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM08_11.put("sec-ch-ua-mobile", "?0");
                headersPM08_11.put("sec-ch-ua-platform", "Linux");
                headersPM08_11.put("sec-fetch-dest", "empty");
                headersPM08_11.put("sec-fetch-mode", "cors");
                headersPM08_11.put("sec-fetch-site", "cross-site");
                headersPM08_11.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");


                ScenarioBuilder scnPM08 = scenario("Pile.News1")
                        .exec(
                                http("request_0")
                                        .get("/muzykant-rodion-gazmanov-soprovodil-gumanitarnyj-gruz-dlya-uchastnikov-svo/")
                                        .headers(headersPM08_0)
                                        .resources(
                                                http("request_1")
                                                        .get(uri1Ya + "/metrika/tag.js")
                                                        .headers(headersPM08_1),
                                                http("request_2")
                                                        .get("/wp-content/plugins/wp-postratings/images/heart_crystal/rating_1_over.gif")
                                                        .headers(headersPM08_1),
                                                http("request_3")
                                                        .get("/wp-content/plugins/gallery-videos/public/css/fontawesome-webfont.woff2?v=4.6.3"),
                                                http("request_4")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Medium.woff"),
                                                http("request_5")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Bold.woff"),
                                                http("request_6")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Black.woff"),
                                                http("request_7")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro.woff"),
                                                http("request_8")
                                                        .get("/wp-content/themes/politmoscow/img/header-icon1b.png"),
                                                http("request_9")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/uploads/2024/08/photo_2024-08-28_20-46-48.jpg.webp")
                                                        .headers(headersPM08_9),
                                                http("request_10")
                                                        .get(uri1Ya + "/metrika/metrika_match.html")
                                                        .headers(headersPM08_10),
                                                http("request_11")
                                                        .get(uri1Ya + "/watch/94094106?wmode=7&page-url=https%3A%2F%2Fpolit-moscow.ru%2Fmuzykant-rodion-gazmanov-soprovodil-gumanitarnyj-gruz-dlya-uchastnikov-svo%2F&page-ref=https%3A%2F%2Fpolit-moscow.ru%2Fnews%2Fobshhestvo%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.113%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.113%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.113%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A1070504886616%3Ahid%3A393527914%3Az%3A300%3Ai%3A20240830150741%3Aet%3A1725012462%3Ac%3A1%3Arn%3A581786734%3Arqn%3A43%3Au%3A172478250269200753%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C644%2C3%2C3%2C0%2C%2C69%2C0%2C%2C%2C%2C721%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1725012460746%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1725012462%3At%3A%D0%9C%D1%83%D0%B7%D1%8B%D0%BA%D0%B0%D0%BD%D1%82%20%D0%A0%D0%BE%D0%B4%D0%B8%D0%BE%D0%BD%20%D0%93%D0%B0%D0%B7%D0%BC%D0%B0%D0%BD%D0%BE%D0%B2%20%D1%81%D0%BE%D0%BF%D1%80%D0%BE%D0%B2%D0%BE%D0%B4%D0%B8%D0%BB%20%D0%B3%D1%83%D0%BC%D0%B0%D0%BD%D0%B8%D1%82%D0%B0%D1%80%D0%BD%D1%8B%D0%B9%20%D0%B3%D1%80%D1%83%D0%B7%20%D0%B4%D0%BB%D1%8F%20%D1%83%D1%87%D0%B0%D1%81%D1%82%D0%BD%D0%B8%D0%BA%D0%BE%D0%B2%20%D0%A1%D0%92%D0%9E%20%E2%80%93%20%D0%9F%D0%9E%D0%9B%D0%98%D0%A2%D0%9C%D0%9E%D0%A1%D0%9A%D0%92%D0%90&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
                                                        .headers(headersPM08_11)
                                        )
                        );

                HttpProtocolBuilder httpProtocol_News2 = http
                        .baseUrl("https://polit-moscow.ru")
                        .inferHtmlResources()
                        ;

                Map<CharSequence, String> headersPM09_0 = new HashMap<>();
                headersPM09_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
                headersPM09_0.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM09_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM09_0.put("priority", "u=0, i");
                headersPM09_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM09_0.put("sec-ch-ua-mobile", "?0");
                headersPM09_0.put("sec-ch-ua-platform", "Linux");
                headersPM09_0.put("sec-fetch-dest", "document");
                headersPM09_0.put("sec-fetch-mode", "navigate");
                headersPM09_0.put("sec-fetch-site", "same-origin");
                headersPM09_0.put("sec-fetch-user", "?1");
                headersPM09_0.put("upgrade-insecure-requests", "1");
                headersPM09_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headersPM09_1 = new HashMap<>();
                headersPM09_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headersPM09_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM09_1.put("sec-ch-ua-mobile", "?0");
                headersPM09_1.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM09_12 = new HashMap<>();
                headersPM09_12.put("Upgrade-Insecure-Requests", "1");
                headersPM09_12.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headersPM09_12.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM09_12.put("sec-ch-ua-mobile", "?0");
                headersPM09_12.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM09_13 = new HashMap<>();
                headersPM09_13.put("accept", "*/*");
                headersPM09_13.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM09_13.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM09_13.put("origin", "https://polit-moscow.ru");
                headersPM09_13.put("priority", "u=1, i");
                headersPM09_13.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM09_13.put("sec-ch-ua-mobile", "?0");
                headersPM09_13.put("sec-ch-ua-platform", "Linux");
                headersPM09_13.put("sec-fetch-dest", "empty");
                headersPM09_13.put("sec-fetch-mode", "cors");
                headersPM09_13.put("sec-fetch-site", "cross-site");
                headersPM09_13.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");


                ScenarioBuilder scnPM09 = scenario("Pile.News2")
                        .exec(
                                http("request_0")
                                        .get("/9-maya-na-czentralnyh-stancziyah-metro-budut-dezhurit-sotrudniki-czentra-obespecheniya-mobilnosti-passazhirov/")
                                        .headers(headersPM09_0)
                                        .resources(
                                                http("request_1")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/uploads/2024/05/nbksuhl2h1alm8y0jb6brnop2z3z8zj21ideh_fh_nkupxuadyxtjhou4mvo6bcvozkf9gqve5q_cpawk214lywk9g1n5houhok00xrenkntucsrvxp2g.jpg.webp")
                                                        .headers(headersPM09_1),
                                                http("request_2")
                                                        .get("/wp-content/plugins/gallery-videos/public/css/fontawesome-webfont.woff2?v=4.6.3"),
                                                http("request_3")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-BoldItalic.woff"),
                                                http("request_4")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Italic.woff"),
                                                http("request_5")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Bold.woff"),
                                                http("request_6")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Black.woff"),
                                                http("request_7")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro.woff"),
                                                http("request_8")
                                                        .get(uri1Ya + "/metrika/tag.js")
                                                        .headers(headersPM09_1),
                                                http("request_9")
                                                        .get("/wp-content/plugins/wp-postratings/images/heart_crystal/rating_1_over.gif")
                                                        .headers(headersPM09_1),
                                                http("request_10")
                                                        .get("/wp-content/themes/politmoscow/img/header-icon1b.png"),
                                                http("request_11")
                                                        .get("/favicon.ico")
                                                        .headers(headersPM09_1),
                                                http("request_12")
                                                        .get(uri1Ya + "/metrika/metrika_match.html")
                                                        .headers(headersPM09_12),
                                                http("request_13")
                                                        .get(uri1Ya + "/watch/94094106?wmode=7&page-url=https%3A%2F%2Fpolit-moscow.ru%2F9-maya-na-czentralnyh-stancziyah-metro-budut-dezhurit-sotrudniki-czentra-obespecheniya-mobilnosti-passazhirov%2F&page-ref=https%3A%2F%2Fpolit-moscow.ru%2Fnews%2Fobshhestvo%2Fpage%2F25%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.113%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.113%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.113%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A1070504886616%3Ahid%3A50887758%3Az%3A300%3Ai%3A20240830150830%3Aet%3A1725012511%3Ac%3A1%3Arn%3A678752291%3Arqn%3A47%3Au%3A172478250269200753%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C646%2C4%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1725012509965%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1725012511%3At%3A9%20%D0%BC%D0%B0%D1%8F%20%D0%BD%D0%B0%20%D1%86%D0%B5%D0%BD%D1%82%D1%80%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D1%85%20%D1%81%D1%82%D0%B0%D0%BD%D1%86%D0%B8%D1%8F%D1%85%20%D0%BC%D0%B5%D1%82%D1%80%D0%BE%20%D0%B1%D1%83%D0%B4%D1%83%D1%82%20%D0%B4%D0%B5%D0%B6%D1%83%D1%80%D0%B8%D1%82%D1%8C%20%D1%81%D0%BE%D1%82%D1%80%D1%83%D0%B4%D0%BD%D0%B8%D0%BA%D0%B8%20%D0%A6%D0%B5%D0%BD%D1%82%D1%80%D0%B0%20%D0%BE%D0%B1%D0%B5%D1%81%D0%BF%D0%B5%D1%87%D0%B5%D0%BD%D0%B8%D1%8F%20%D0%BC%D0%BE%D0%B1%D0%B8%D0%BB%D1%8C%D0%BD%D0%BE%D1%81%D1%82%D0%B8%20%D0%BF%D0%B0%D1%81%D1%81%D0%B0%D0%B6%D0%B8%D1%80%D0%BE%D0%B2%20%E2%80%93%20%D0%9F%D0%9E%D0%9B%D0%98%D0%A2%D0%9C%D0%9E%D0%A1%D0%9A%D0%92%D0%90&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
                                                        .headers(headersPM09_13)
                                        )
                        );

                HttpProtocolBuilder httpProtocol_News3 = http
                        .baseUrl("https://polit-moscow.ru")
                        .inferHtmlResources()
                        ;

                Map<CharSequence, String> headersPM10_0 = new HashMap<>();
                headersPM10_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
                headersPM10_0.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM10_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM10_0.put("priority", "u=0, i");
                headersPM10_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM10_0.put("sec-ch-ua-mobile", "?0");
                headersPM10_0.put("sec-ch-ua-platform", "Linux");
                headersPM10_0.put("sec-fetch-dest", "document");
                headersPM10_0.put("sec-fetch-mode", "navigate");
                headersPM10_0.put("sec-fetch-site", "same-origin");
                headersPM10_0.put("sec-fetch-user", "?1");
                headersPM10_0.put("upgrade-insecure-requests", "1");
                headersPM10_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headersPM10_1 = new HashMap<>();
                headersPM10_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headersPM10_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM10_1.put("sec-ch-ua-mobile", "?0");
                headersPM10_1.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM10_10 = new HashMap<>();
                headersPM10_10.put("accept", "*/*");
                headersPM10_10.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM10_10.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM10_10.put("origin", "https://polit-moscow.ru");
                headersPM10_10.put("priority", "u=1, i");
                headersPM10_10.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM10_10.put("sec-ch-ua-mobile", "?0");
                headersPM10_10.put("sec-ch-ua-platform", "Linux");
                headersPM10_10.put("sec-fetch-dest", "empty");
                headersPM10_10.put("sec-fetch-mode", "cors");
                headersPM10_10.put("sec-fetch-site", "cross-site");
                headersPM10_10.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headersPM10_11 = new HashMap<>();
                headersPM10_11.put("Upgrade-Insecure-Requests", "1");
                headersPM10_11.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headersPM10_11.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM10_11.put("sec-ch-ua-mobile", "?0");
                headersPM10_11.put("sec-ch-ua-platform", "Linux");



                ScenarioBuilder scnPM10 = scenario("Pile.News3")
                        .exec(
                                http("request_0")
                                        .get("/stancziya-novatorskaya-troiczkoj-linii-metro-gotova-bolee-chem-na-80/")
                                        .headers(headersPM10_0)
                                        .resources(
                                                http("request_1")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/uploads/2024/03/blog_novatorskaya_06_03.jpeg.webp")
                                                        .headers(headersPM10_1),
                                                http("request_2")
                                                        .get("/wp-content/plugins/gallery-videos/public/css/fontawesome-webfont.woff2?v=4.6.3"),
                                                http("request_3")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Bold.woff"),
                                                http("request_4")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Black.woff"),
                                                http("request_5")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro.woff"),
                                                http("request_6")
                                                        .get(uri1Ya + "/metrika/tag.js")
                                                        .headers(headersPM10_1),
                                                http("request_7")
                                                        .get("/wp-content/plugins/wp-postratings/images/heart_crystal/rating_1_over.gif")
                                                        .headers(headersPM10_1),
                                                http("request_8")
                                                        .get("/wp-content/themes/politmoscow/img/header-icon1b.png"),
                                                http("request_9")
                                                        .get("/favicon.ico")
                                                        .headers(headersPM10_1),
                                                http("request_10")
                                                        .get(uri1Ya + "/watch/94094106?wmode=7&page-url=https%3A%2F%2Fpolit-moscow.ru%2Fstancziya-novatorskaya-troiczkoj-linii-metro-gotova-bolee-chem-na-80%2F&page-ref=https%3A%2F%2Fpolit-moscow.ru%2Fnews%2Fobshhestvo%2Fpage%2F50%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.113%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.113%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.113%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A1070504886616%3Ahid%3A1059537666%3Az%3A300%3Ai%3A20240830150912%3Aet%3A1725012552%3Ac%3A1%3Arn%3A65299065%3Arqn%3A51%3Au%3A172478250269200753%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C669%2C3%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1725012551236%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1725012552%3At%3A%D0%A1%D1%82%D0%B0%D0%BD%D1%86%D0%B8%D1%8F%20%C2%AB%D0%9D%D0%BE%D0%B2%D0%B0%D1%82%D0%BE%D1%80%D1%81%D0%BA%D0%B0%D1%8F%C2%BB%20%D0%A2%D1%80%D0%BE%D0%B8%D1%86%D0%BA%D0%BE%D0%B9%20%D0%BB%D0%B8%D0%BD%D0%B8%D0%B8%20%D0%BC%D0%B5%D1%82%D1%80%D0%BE%20%D0%B3%D0%BE%D1%82%D0%BE%D0%B2%D0%B0%20%D0%B1%D0%BE%D0%BB%D0%B5%D0%B5%20%D1%87%D0%B5%D0%BC%20%D0%BD%D0%B0%2080%25%20%E2%80%93%20%D0%9F%D0%9E%D0%9B%D0%98%D0%A2%D0%9C%D0%9E%D0%A1%D0%9A%D0%92%D0%90&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
                                                        .headers(headersPM10_10),
                                                http("request_11")
                                                        .get(uri1Ya + "/metrika/metrika_match.html")
                                                        .headers(headersPM10_11)
                                        )
                        );

                HttpProtocolBuilder httpProtocol_News4 = http
                        .baseUrl("https://polit-moscow.ru")
                        .inferHtmlResources()
                        ;

                Map<CharSequence, String> headersPM11_0 = new HashMap<>();
                headersPM11_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
                headersPM11_0.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM11_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM11_0.put("priority", "u=0, i");
                headersPM11_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM11_0.put("sec-ch-ua-mobile", "?0");
                headersPM11_0.put("sec-ch-ua-platform", "Linux");
                headersPM11_0.put("sec-fetch-dest", "document");
                headersPM11_0.put("sec-fetch-mode", "navigate");
                headersPM11_0.put("sec-fetch-site", "same-origin");
                headersPM11_0.put("sec-fetch-user", "?1");
                headersPM11_0.put("upgrade-insecure-requests", "1");
                headersPM11_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headersPM11_1 = new HashMap<>();
                headersPM11_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headersPM11_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM11_1.put("sec-ch-ua-mobile", "?0");
                headersPM11_1.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM11_10 = new HashMap<>();
                headersPM11_10.put("accept", "*/*");
                headersPM11_10.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM11_10.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM11_10.put("origin", "https://polit-moscow.ru");
                headersPM11_10.put("priority", "u=1, i");
                headersPM11_10.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM11_10.put("sec-ch-ua-mobile", "?0");
                headersPM11_10.put("sec-ch-ua-platform", "Linux");
                headersPM11_10.put("sec-fetch-dest", "empty");
                headersPM11_10.put("sec-fetch-mode", "cors");
                headersPM11_10.put("sec-fetch-site", "cross-site");
                headersPM11_10.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headersPM11_11 = new HashMap<>();
                headersPM11_11.put("Upgrade-Insecure-Requests", "1");
                headersPM11_11.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headersPM11_11.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM11_11.put("sec-ch-ua-mobile", "?0");
                headersPM11_11.put("sec-ch-ua-platform", "Linux");



                ScenarioBuilder scnPM11 = scenario("Pile.News4")
                        .exec(
                                http("request_0")
                                        .get("/v-blizhajshie-pyat-let-v-moskve-rekonstruiruyut-ne-menee-500-zdanij-gorodskih-shkol/")
                                        .headers(headersPM11_0)
                                        .resources(
                                                http("request_1")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/uploads/2023/09/prezidium_rekonstruktsiya_shkol_samarin.jpg.webp")
                                                        .headers(headersPM11_1),
                                                http("request_2")
                                                        .get("/wp-content/plugins/gallery-videos/public/css/fontawesome-webfont.woff2?v=4.6.3"),
                                                http("request_3")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Bold.woff"),
                                                http("request_4")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Black.woff"),
                                                http("request_5")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro.woff"),
                                                http("request_6")
                                                        .get(uri1Ya + "/metrika/tag.js")
                                                        .headers(headersPM11_1),
                                                http("request_7")
                                                        .get("/wp-content/plugins/wp-postratings/images/heart_crystal/rating_1_over.gif")
                                                        .headers(headersPM11_1),
                                                http("request_8")
                                                        .get("/wp-content/themes/politmoscow/img/header-icon1b.png"),
                                                http("request_9")
                                                        .get("/favicon.ico")
                                                        .headers(headersPM11_1),
                                                http("request_10")
                                                        .get(uri1Ya + "/watch/94094106?wmode=7&page-url=https%3A%2F%2Fpolit-moscow.ru%2Fv-blizhajshie-pyat-let-v-moskve-rekonstruiruyut-ne-menee-500-zdanij-gorodskih-shkol%2F&page-ref=https%3A%2F%2Fpolit-moscow.ru%2Fnews%2Fobshhestvo%2Fpage%2F100%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.113%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.113%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.113%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A1070504886616%3Ahid%3A36989826%3Az%3A300%3Ai%3A20240830150945%3Aet%3A1725012586%3Ac%3A1%3Arn%3A549811186%3Arqn%3A54%3Au%3A172478250269200753%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C650%2C3%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1725012584840%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1725012586%3At%3A%D0%92%20%D0%B1%D0%BB%D0%B8%D0%B6%D0%B0%D0%B9%D1%88%D0%B8%D0%B5%20%D0%BF%D1%8F%D1%82%D1%8C%20%D0%BB%D0%B5%D1%82%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5%20%D1%80%D0%B5%D0%BA%D0%BE%D0%BD%D1%81%D1%82%D1%80%D1%83%D0%B8%D1%80%D1%83%D1%8E%D1%82%20%D0%BD%D0%B5%20%D0%BC%D0%B5%D0%BD%D0%B5%D0%B5%20500%20%D0%B7%D0%B4%D0%B0%D0%BD%D0%B8%D0%B9%20%D0%B3%D0%BE%D1%80%D0%BE%D0%B4%D1%81%D0%BA%D0%B8%D1%85%20%D1%88%D0%BA%D0%BE%D0%BB%20%E2%80%93%20%D0%9F%D0%9E%D0%9B%D0%98%D0%A2%D0%9C%D0%9E%D0%A1%D0%9A%D0%92%D0%90&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
                                                        .headers(headersPM11_10),
                                                http("request_11")
                                                        .get(uri1Ya + "/metrika/metrika_match.html")
                                                        .headers(headersPM11_11)
                                        )
                        );

                HttpProtocolBuilder httpProtocol_News5 = http
                        .baseUrl("https://polit-moscow.ru")
                        .inferHtmlResources()
                        ;

                Map<CharSequence, String> headersPM12_0 = new HashMap<>();
                headersPM12_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
                headersPM12_0.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM12_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM12_0.put("priority", "u=0, i");
                headersPM12_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM12_0.put("sec-ch-ua-mobile", "?0");
                headersPM12_0.put("sec-ch-ua-platform", "Linux");
                headersPM12_0.put("sec-fetch-dest", "document");
                headersPM12_0.put("sec-fetch-mode", "navigate");
                headersPM12_0.put("sec-fetch-site", "same-origin");
                headersPM12_0.put("sec-fetch-user", "?1");
                headersPM12_0.put("upgrade-insecure-requests", "1");
                headersPM12_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headersPM12_1 = new HashMap<>();
                headersPM12_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headersPM12_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM12_1.put("sec-ch-ua-mobile", "?0");
                headersPM12_1.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM12_10 = new HashMap<>();
                headersPM12_10.put("Upgrade-Insecure-Requests", "1");
                headersPM12_10.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headersPM12_10.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM12_10.put("sec-ch-ua-mobile", "?0");
                headersPM12_10.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM12_12 = new HashMap<>();
                headersPM12_12.put("accept", "*/*");
                headersPM12_12.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM12_12.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM12_12.put("origin", "https://polit-moscow.ru");
                headersPM12_12.put("priority", "u=1, i");
                headersPM12_12.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM12_12.put("sec-ch-ua-mobile", "?0");
                headersPM12_12.put("sec-ch-ua-platform", "Linux");
                headersPM12_12.put("sec-fetch-dest", "empty");
                headersPM12_12.put("sec-fetch-mode", "cors");
                headersPM12_12.put("sec-fetch-site", "cross-site");
                headersPM12_12.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");


                ScenarioBuilder scnPM12 = scenario("Pile.News5")
                        .exec(
                                http("request_0")
                                        .get("/vozrozhdenie-usadebnyh-parkov/")
                                        .headers(headersPM12_0)
                                        .resources(
                                                http("request_1")
                                                        .get("/wp-content/webp-express/webp-images/doc-root/wp-content/uploads/2023/08/gl-15.jpg.webp")
                                                        .headers(headersPM12_1),
                                                http("request_2")
                                                        .get("/wp-content/plugins/gallery-videos/public/css/fontawesome-webfont.woff2?v=4.6.3"),
                                                http("request_3")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Italic.woff"),
                                                http("request_4")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Bold.woff"),
                                                http("request_5")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Black.woff"),
                                                http("request_6")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro.woff"),
                                                http("request_7")
                                                        .get(uri1Ya + "/metrika/tag.js")
                                                        .headers(headersPM12_1),
                                                http("request_8")
                                                        .get("/wp-content/plugins/wp-postratings/images/heart_crystal/rating_1_over.gif")
                                                        .headers(headersPM12_1),
                                                http("request_9")
                                                        .get("/wp-content/themes/politmoscow/img/header-icon1b.png"),
                                                http("request_10")
                                                        .get(uri1Ya + "/metrika/metrika_match.html")
                                                        .headers(headersPM12_10),
                                                http("request_11")
                                                        .get("/favicon.ico")
                                                        .headers(headersPM12_1),
                                                http("request_12")
                                                        .get(uri1Ya + "/watch/94094106?wmode=7&page-url=https%3A%2F%2Fpolit-moscow.ru%2Fvozrozhdenie-usadebnyh-parkov%2F&page-ref=https%3A%2F%2Fpolit-moscow.ru%2Fnews%2Fobshhestvo%2Fpage%2F120%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.113%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.113%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.113%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A1070504886616%3Ahid%3A299063293%3Az%3A300%3Ai%3A20240830151020%3Aet%3A1725012621%3Ac%3A1%3Arn%3A147880576%3Arqn%3A60%3Au%3A172478250269200753%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C717%2C3%2C0%2C0%2C%2C69%2C0%2C%2C%2C%2C790%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1725012619718%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1725012621%3At%3A%D0%92%D0%BE%D0%B7%D1%80%D0%BE%D0%B6%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5%20%D1%83%D1%81%D0%B0%D0%B4%D0%B5%D0%B1%D0%BD%D1%8B%D1%85%20%D0%BF%D0%B0%D1%80%D0%BA%D0%BE%D0%B2%3A%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5%20%D1%81%202017%20%D0%B3%D0%BE%D0%B4%D0%B0%20%D0%B1%D0%BB%D0%B0%D0%B3%D0%BE%D1%83%D1%81%D1%82%D1%80%D0%BE%D0%B8%D0%BB%D0%B8%20%D1%83%D0%B6%D0%B5%20%D0%B2%D0%BE%D1%81%D0%B5%D0%BC%D1%8C%20%D1%83%D1%81%D0%B0%D0%B4%D0%B5%D0%B1%20%E2%80%93%20%D0%9F%D0%9E%D0%9B%D0%98%D0%A2%D0%9C%D0%9E%D0%A1%D0%9A%D0%92%D0%90&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
                                                        .headers(headersPM12_12)
                                        )
                        );

                HttpProtocolBuilder httpProtocol_Videonew = http
                        .baseUrl("https://polit-moscow.ru")
                        .inferHtmlResources()
                        ;

                Map<CharSequence, String> headers_0 = new HashMap<>();
                headers_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
                headers_0.put("accept-encoding", "gzip, deflate, br, zstd");
                headers_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_0.put("priority", "u=0, i");
                headers_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_0.put("sec-ch-ua-mobile", "?0");
                headers_0.put("sec-ch-ua-platform", "Linux");
                headers_0.put("sec-fetch-dest", "document");
                headers_0.put("sec-fetch-mode", "navigate");
                headers_0.put("sec-fetch-site", "same-origin");
                headers_0.put("sec-fetch-user", "?1");
                headers_0.put("upgrade-insecure-requests", "1");
                headers_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_7 = new HashMap<>();
                headers_7.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headers_7.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_7.put("sec-ch-ua-mobile", "?0");
                headers_7.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headers_8 = new HashMap<>();
                headers_8.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
                headers_8.put("accept-encoding", "gzip, deflate, br, zstd");
                headers_8.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_8.put("priority", "u=2, i");
                headers_8.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_8.put("sec-ch-ua-mobile", "?0");
                headers_8.put("sec-ch-ua-platform", "Linux");
                headers_8.put("sec-fetch-dest", "image");
                headers_8.put("sec-fetch-mode", "no-cors");
                headers_8.put("sec-fetch-site", "same-origin");
                headers_8.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_9 = new HashMap<>();
                headers_9.put("Origin", "https://polit-moscow.ru");
                headers_9.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headers_9.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_9.put("sec-ch-ua-mobile", "?0");
                headers_9.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headers_11 = new HashMap<>();
                headers_11.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
                headers_11.put("accept-encoding", "gzip, deflate, br, zstd");
                headers_11.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_11.put("priority", "i");
                headers_11.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_11.put("sec-ch-ua-mobile", "?0");
                headers_11.put("sec-ch-ua-platform", "Linux");
                headers_11.put("sec-fetch-dest", "image");
                headers_11.put("sec-fetch-mode", "no-cors");
                headers_11.put("sec-fetch-site", "same-origin");
                headers_11.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_12 = new HashMap<>();
                headers_12.put("accept", "*/*");
                headers_12.put("accept-encoding", "gzip, deflate, br, zstd");
                headers_12.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_12.put("origin", "https://polit-moscow.ru");
                headers_12.put("priority", "u=1, i");
                headers_12.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_12.put("sec-ch-ua-mobile", "?0");
                headers_12.put("sec-ch-ua-platform", "Linux");
                headers_12.put("sec-fetch-dest", "empty");
                headers_12.put("sec-fetch-mode", "cors");
                headers_12.put("sec-fetch-site", "cross-site");
                headers_12.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_13 = new HashMap<>();
                headers_13.put("Upgrade-Insecure-Requests", "1");
                headers_13.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headers_13.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_13.put("sec-ch-ua-mobile", "?0");
                headers_13.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headers_26 = new HashMap<>();
                headers_26.put("accept", "*/*");
                headers_26.put("accept-encoding", "gzip, deflate, br, zstd");
                headers_26.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_26.put("origin", "https://polit-moscow.ru");
                headers_26.put("priority", "u=0");
                headers_26.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_26.put("sec-ch-ua-mobile", "?0");
                headers_26.put("sec-ch-ua-platform", "Linux");
                headers_26.put("sec-fetch-dest", "font");
                headers_26.put("sec-fetch-mode", "cors");
                headers_26.put("sec-fetch-site", "cross-site");
                headers_26.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headers_26.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");

                Map<CharSequence, String> headers_46 = new HashMap<>();
                headers_46.put("accept", "*/*");
                headers_46.put("accept-encoding", "identity;q=1, *;q=0");
                headers_46.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_46.put("priority", "i");
                headers_46.put("range", "bytes=0-");
                headers_46.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_46.put("sec-ch-ua-mobile", "?0");
                headers_46.put("sec-ch-ua-platform", "Linux");
                headers_46.put("sec-fetch-dest", "video");
                headers_46.put("sec-fetch-mode", "no-cors");
                headers_46.put("sec-fetch-site", "same-origin");
                headers_46.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_107 = new HashMap<>();
                headers_107.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
                headers_107.put("accept-encoding", "gzip, deflate, br, zstd");
                headers_107.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_107.put("priority", "u=1, i");
                headers_107.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_107.put("sec-ch-ua-mobile", "?0");
                headers_107.put("sec-ch-ua-platform", "Linux");
                headers_107.put("sec-fetch-dest", "image");
                headers_107.put("sec-fetch-mode", "no-cors");
                headers_107.put("sec-fetch-site", "same-origin");
                headers_107.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_152 = new HashMap<>();
                headers_152.put("accept", "*/*");
                headers_152.put("accept-encoding", "identity;q=1, *;q=0");
                headers_152.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_152.put("priority", "i");
                headers_152.put("range", "bytes=11796480-11836665");
                headers_152.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_152.put("sec-ch-ua-mobile", "?0");
                headers_152.put("sec-ch-ua-platform", "Linux");
                headers_152.put("sec-fetch-dest", "video");
                headers_152.put("sec-fetch-mode", "no-cors");
                headers_152.put("sec-fetch-site", "same-origin");
                headers_152.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_153 = new HashMap<>();
                headers_153.put("accept", "*/*");
                headers_153.put("accept-encoding", "identity;q=1, *;q=0");
                headers_153.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_153.put("priority", "i");
                headers_153.put("range", "bytes=38305792-38405064");
                headers_153.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_153.put("sec-ch-ua-mobile", "?0");
                headers_153.put("sec-ch-ua-platform", "Linux");
                headers_153.put("sec-fetch-dest", "video");
                headers_153.put("sec-fetch-mode", "no-cors");
                headers_153.put("sec-fetch-site", "same-origin");
                headers_153.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_154 = new HashMap<>();
                headers_154.put("accept", "*/*");
                headers_154.put("accept-encoding", "identity;q=1, *;q=0");
                headers_154.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_154.put("priority", "i");
                headers_154.put("range", "bytes=50102272-50159214");
                headers_154.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_154.put("sec-ch-ua-mobile", "?0");
                headers_154.put("sec-ch-ua-platform", "Linux");
                headers_154.put("sec-fetch-dest", "video");
                headers_154.put("sec-fetch-mode", "no-cors");
                headers_154.put("sec-fetch-site", "same-origin");
                headers_154.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_155 = new HashMap<>();
                headers_155.put("accept", "*/*");
                headers_155.put("accept-encoding", "identity;q=1, *;q=0");
                headers_155.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_155.put("priority", "i");
                headers_155.put("range", "bytes=7176192-7236166");
                headers_155.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_155.put("sec-ch-ua-mobile", "?0");
                headers_155.put("sec-ch-ua-platform", "Linux");
                headers_155.put("sec-fetch-dest", "video");
                headers_155.put("sec-fetch-mode", "no-cors");
                headers_155.put("sec-fetch-site", "same-origin");
                headers_155.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_157 = new HashMap<>();
                headers_157.put("accept", "*/*");
                headers_157.put("accept-encoding", "identity;q=1, *;q=0");
                headers_157.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_157.put("priority", "i");
                headers_157.put("range", "bytes=17989632-18070188");
                headers_157.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_157.put("sec-ch-ua-mobile", "?0");
                headers_157.put("sec-ch-ua-platform", "Linux");
                headers_157.put("sec-fetch-dest", "video");
                headers_157.put("sec-fetch-mode", "no-cors");
                headers_157.put("sec-fetch-site", "same-origin");
                headers_157.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_158 = new HashMap<>();
                headers_158.put("accept", "*/*");
                headers_158.put("accept-encoding", "identity;q=1, *;q=0");
                headers_158.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_158.put("priority", "i");
                headers_158.put("range", "bytes=66748416-66826525");
                headers_158.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_158.put("sec-ch-ua-mobile", "?0");
                headers_158.put("sec-ch-ua-platform", "Linux");
                headers_158.put("sec-fetch-dest", "video");
                headers_158.put("sec-fetch-mode", "no-cors");
                headers_158.put("sec-fetch-site", "same-origin");
                headers_158.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_159 = new HashMap<>();
                headers_159.put("accept", "*/*");
                headers_159.put("accept-encoding", "identity;q=1, *;q=0");
                headers_159.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_159.put("priority", "i");
                headers_159.put("range", "bytes=16842752-16915044");
                headers_159.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_159.put("sec-ch-ua-mobile", "?0");
                headers_159.put("sec-ch-ua-platform", "Linux");
                headers_159.put("sec-fetch-dest", "video");
                headers_159.put("sec-fetch-mode", "no-cors");
                headers_159.put("sec-fetch-site", "same-origin");
                headers_159.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_160 = new HashMap<>();
                headers_160.put("accept", "*/*");
                headers_160.put("accept-encoding", "identity;q=1, *;q=0");
                headers_160.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_160.put("priority", "i");
                headers_160.put("range", "bytes=17137664-17176525");
                headers_160.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_160.put("sec-ch-ua-mobile", "?0");
                headers_160.put("sec-ch-ua-platform", "Linux");
                headers_160.put("sec-fetch-dest", "video");
                headers_160.put("sec-fetch-mode", "no-cors");
                headers_160.put("sec-fetch-site", "same-origin");
                headers_160.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_162 = new HashMap<>();
                headers_162.put("accept", "*/*");
                headers_162.put("accept-encoding", "identity;q=1, *;q=0");
                headers_162.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_162.put("priority", "i");
                headers_162.put("range", "bytes=11894784-11993754");
                headers_162.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_162.put("sec-ch-ua-mobile", "?0");
                headers_162.put("sec-ch-ua-platform", "Linux");
                headers_162.put("sec-fetch-dest", "video");
                headers_162.put("sec-fetch-mode", "no-cors");
                headers_162.put("sec-fetch-site", "same-origin");
                headers_162.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_163 = new HashMap<>();
                headers_163.put("accept", "*/*");
                headers_163.put("accept-encoding", "identity;q=1, *;q=0");
                headers_163.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_163.put("priority", "i");
                headers_163.put("range", "bytes=39747584-39826480");
                headers_163.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_163.put("sec-ch-ua-mobile", "?0");
                headers_163.put("sec-ch-ua-platform", "Linux");
                headers_163.put("sec-fetch-dest", "video");
                headers_163.put("sec-fetch-mode", "no-cors");
                headers_163.put("sec-fetch-site", "same-origin");
                headers_163.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_164 = new HashMap<>();
                headers_164.put("Accept-Encoding", "identity;q=1, *;q=0");
                headers_164.put("Range", "bytes=32768-");
                headers_164.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headers_164.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_164.put("sec-ch-ua-mobile", "?0");
                headers_164.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headers_167 = new HashMap<>();
                headers_167.put("Accept-Encoding", "identity;q=1, *;q=0");
                headers_167.put("Range", "bytes=11993088-");
                headers_167.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headers_167.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_167.put("sec-ch-ua-mobile", "?0");
                headers_167.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headers_168 = new HashMap<>();
                headers_168.put("Accept-Encoding", "identity;q=1, *;q=0");
                headers_168.put("Range", "bytes=39813120-");
                headers_168.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headers_168.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_168.put("sec-ch-ua-mobile", "?0");
                headers_168.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headers_169 = new HashMap<>();
                headers_169.put("accept", "*/*");
                headers_169.put("accept-encoding", "identity;q=1, *;q=0");
                headers_169.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_169.put("priority", "i");
                headers_169.put("range", "bytes=29720576-29762821");
                headers_169.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_169.put("sec-ch-ua-mobile", "?0");
                headers_169.put("sec-ch-ua-platform", "Linux");
                headers_169.put("sec-fetch-dest", "video");
                headers_169.put("sec-fetch-mode", "no-cors");
                headers_169.put("sec-fetch-site", "same-origin");
                headers_169.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_170 = new HashMap<>();
                headers_170.put("accept", "*/*");
                headers_170.put("accept-encoding", "identity;q=1, *;q=0");
                headers_170.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_170.put("priority", "i");
                headers_170.put("range", "bytes=30146560-30204381");
                headers_170.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_170.put("sec-ch-ua-mobile", "?0");
                headers_170.put("sec-ch-ua-platform", "Linux");
                headers_170.put("sec-fetch-dest", "video");
                headers_170.put("sec-fetch-mode", "no-cors");
                headers_170.put("sec-fetch-site", "same-origin");
                headers_170.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_171 = new HashMap<>();
                headers_171.put("accept", "*/*");
                headers_171.put("accept-encoding", "identity;q=1, *;q=0");
                headers_171.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_171.put("priority", "i");
                headers_171.put("range", "bytes=44892160-44977272");
                headers_171.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_171.put("sec-ch-ua-mobile", "?0");
                headers_171.put("sec-ch-ua-platform", "Linux");
                headers_171.put("sec-fetch-dest", "video");
                headers_171.put("sec-fetch-mode", "no-cors");
                headers_171.put("sec-fetch-site", "same-origin");
                headers_171.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_172 = new HashMap<>();
                headers_172.put("accept", "*/*");
                headers_172.put("accept-encoding", "identity;q=1, *;q=0");
                headers_172.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_172.put("priority", "i");
                headers_172.put("range", "bytes=20807680-20892759");
                headers_172.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_172.put("sec-ch-ua-mobile", "?0");
                headers_172.put("sec-ch-ua-platform", "Linux");
                headers_172.put("sec-fetch-dest", "video");
                headers_172.put("sec-fetch-mode", "no-cors");
                headers_172.put("sec-fetch-site", "same-origin");
                headers_172.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_173 = new HashMap<>();
                headers_173.put("accept", "*/*");
                headers_173.put("accept-encoding", "identity;q=1, *;q=0");
                headers_173.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_173.put("priority", "i");
                headers_173.put("range", "bytes=17432576-17496252");
                headers_173.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_173.put("sec-ch-ua-mobile", "?0");
                headers_173.put("sec-ch-ua-platform", "Linux");
                headers_173.put("sec-fetch-dest", "video");
                headers_173.put("sec-fetch-mode", "no-cors");
                headers_173.put("sec-fetch-site", "same-origin");
                headers_173.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_175 = new HashMap<>();
                headers_175.put("accept", "*/*");
                headers_175.put("accept-encoding", "identity;q=1, *;q=0");
                headers_175.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_175.put("priority", "i");
                headers_175.put("range", "bytes=18612224-18644366");
                headers_175.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_175.put("sec-ch-ua-mobile", "?0");
                headers_175.put("sec-ch-ua-platform", "Linux");
                headers_175.put("sec-fetch-dest", "video");
                headers_175.put("sec-fetch-mode", "no-cors");
                headers_175.put("sec-fetch-site", "same-origin");
                headers_175.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_176 = new HashMap<>();
                headers_176.put("accept", "*/*");
                headers_176.put("accept-encoding", "identity;q=1, *;q=0");
                headers_176.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_176.put("priority", "i");
                headers_176.put("range", "bytes=47185920-47298335");
                headers_176.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_176.put("sec-ch-ua-mobile", "?0");
                headers_176.put("sec-ch-ua-platform", "Linux");
                headers_176.put("sec-fetch-dest", "video");
                headers_176.put("sec-fetch-mode", "no-cors");
                headers_176.put("sec-fetch-site", "same-origin");
                headers_176.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_177 = new HashMap<>();
                headers_177.put("accept", "*/*");
                headers_177.put("accept-encoding", "identity;q=1, *;q=0");
                headers_177.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_177.put("priority", "i");
                headers_177.put("range", "bytes=12779520-12885011");
                headers_177.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_177.put("sec-ch-ua-mobile", "?0");
                headers_177.put("sec-ch-ua-platform", "Linux");
                headers_177.put("sec-fetch-dest", "video");
                headers_177.put("sec-fetch-mode", "no-cors");
                headers_177.put("sec-fetch-site", "same-origin");
                headers_177.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_178 = new HashMap<>();
                headers_178.put("accept", "*/*");
                headers_178.put("accept-encoding", "identity;q=1, *;q=0");
                headers_178.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_178.put("priority", "i");
                headers_178.put("range", "bytes=24608768-24693061");
                headers_178.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_178.put("sec-ch-ua-mobile", "?0");
                headers_178.put("sec-ch-ua-platform", "Linux");
                headers_178.put("sec-fetch-dest", "video");
                headers_178.put("sec-fetch-mode", "no-cors");
                headers_178.put("sec-fetch-site", "same-origin");
                headers_178.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_179 = new HashMap<>();
                headers_179.put("accept", "*/*");
                headers_179.put("accept-encoding", "identity;q=1, *;q=0");
                headers_179.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_179.put("priority", "i");
                headers_179.put("range", "bytes=25526272-25592143");
                headers_179.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_179.put("sec-ch-ua-mobile", "?0");
                headers_179.put("sec-ch-ua-platform", "Linux");
                headers_179.put("sec-fetch-dest", "video");
                headers_179.put("sec-fetch-mode", "no-cors");
                headers_179.put("sec-fetch-site", "same-origin");
                headers_179.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_180 = new HashMap<>();
                headers_180.put("accept", "*/*");
                headers_180.put("accept-encoding", "identity;q=1, *;q=0");
                headers_180.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_180.put("priority", "i");
                headers_180.put("range", "bytes=117473280-117529479");
                headers_180.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_180.put("sec-ch-ua-mobile", "?0");
                headers_180.put("sec-ch-ua-platform", "Linux");
                headers_180.put("sec-fetch-dest", "video");
                headers_180.put("sec-fetch-mode", "no-cors");
                headers_180.put("sec-fetch-site", "same-origin");
                headers_180.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_181 = new HashMap<>();
                headers_181.put("accept", "*/*");
                headers_181.put("accept-encoding", "identity;q=1, *;q=0");
                headers_181.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_181.put("priority", "i");
                headers_181.put("range", "bytes=37912576-37982615");
                headers_181.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_181.put("sec-ch-ua-mobile", "?0");
                headers_181.put("sec-ch-ua-platform", "Linux");
                headers_181.put("sec-fetch-dest", "video");
                headers_181.put("sec-fetch-mode", "no-cors");
                headers_181.put("sec-fetch-site", "same-origin");
                headers_181.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_182 = new HashMap<>();
                headers_182.put("accept", "*/*");
                headers_182.put("accept-encoding", "identity;q=1, *;q=0");
                headers_182.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_182.put("priority", "i");
                headers_182.put("range", "bytes=40271872-44833717");
                headers_182.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_182.put("sec-ch-ua-mobile", "?0");
                headers_182.put("sec-ch-ua-platform", "Linux");
                headers_182.put("sec-fetch-dest", "video");
                headers_182.put("sec-fetch-mode", "no-cors");
                headers_182.put("sec-fetch-site", "same-origin");
                headers_182.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_183 = new HashMap<>();
                headers_183.put("accept", "*/*");
                headers_183.put("accept-encoding", "identity;q=1, *;q=0");
                headers_183.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_183.put("priority", "i");
                headers_183.put("range", "bytes=66748416-66876485");
                headers_183.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_183.put("sec-ch-ua-mobile", "?0");
                headers_183.put("sec-ch-ua-platform", "Linux");
                headers_183.put("sec-fetch-dest", "video");
                headers_183.put("sec-fetch-mode", "no-cors");
                headers_183.put("sec-fetch-site", "same-origin");
                headers_183.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_184 = new HashMap<>();
                headers_184.put("accept", "*/*");
                headers_184.put("accept-encoding", "identity;q=1, *;q=0");
                headers_184.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_184.put("priority", "i");
                headers_184.put("range", "bytes=147259392-147343764");
                headers_184.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_184.put("sec-ch-ua-mobile", "?0");
                headers_184.put("sec-ch-ua-platform", "Linux");
                headers_184.put("sec-fetch-dest", "video");
                headers_184.put("sec-fetch-mode", "no-cors");
                headers_184.put("sec-fetch-site", "same-origin");
                headers_184.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_185 = new HashMap<>();
                headers_185.put("accept", "*/*");
                headers_185.put("accept-encoding", "identity;q=1, *;q=0");
                headers_185.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_185.put("priority", "i");
                headers_185.put("range", "bytes=189431808-189505102");
                headers_185.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_185.put("sec-ch-ua-mobile", "?0");
                headers_185.put("sec-ch-ua-platform", "Linux");
                headers_185.put("sec-fetch-dest", "video");
                headers_185.put("sec-fetch-mode", "no-cors");
                headers_185.put("sec-fetch-site", "same-origin");
                headers_185.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_186 = new HashMap<>();
                headers_186.put("accept", "*/*");
                headers_186.put("accept-encoding", "identity;q=1, *;q=0");
                headers_186.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_186.put("priority", "i");
                headers_186.put("range", "bytes=52264960-52288701");
                headers_186.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_186.put("sec-ch-ua-mobile", "?0");
                headers_186.put("sec-ch-ua-platform", "Linux");
                headers_186.put("sec-fetch-dest", "video");
                headers_186.put("sec-fetch-mode", "no-cors");
                headers_186.put("sec-fetch-site", "same-origin");
                headers_186.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_187 = new HashMap<>();
                headers_187.put("accept", "*/*");
                headers_187.put("accept-encoding", "identity;q=1, *;q=0");
                headers_187.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_187.put("priority", "i");
                headers_187.put("range", "bytes=113901568-113947290");
                headers_187.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_187.put("sec-ch-ua-mobile", "?0");
                headers_187.put("sec-ch-ua-platform", "Linux");
                headers_187.put("sec-fetch-dest", "video");
                headers_187.put("sec-fetch-mode", "no-cors");
                headers_187.put("sec-fetch-site", "same-origin");
                headers_187.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_188 = new HashMap<>();
                headers_188.put("accept", "*/*");
                headers_188.put("accept-encoding", "identity;q=1, *;q=0");
                headers_188.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_188.put("priority", "i");
                headers_188.put("range", "bytes=62488576-62519834");
                headers_188.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_188.put("sec-ch-ua-mobile", "?0");
                headers_188.put("sec-ch-ua-platform", "Linux");
                headers_188.put("sec-fetch-dest", "video");
                headers_188.put("sec-fetch-mode", "no-cors");
                headers_188.put("sec-fetch-site", "same-origin");
                headers_188.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_189 = new HashMap<>();
                headers_189.put("accept", "*/*");
                headers_189.put("accept-encoding", "identity;q=1, *;q=0");
                headers_189.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_189.put("priority", "i");
                headers_189.put("range", "bytes=104202240-104248839");
                headers_189.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_189.put("sec-ch-ua-mobile", "?0");
                headers_189.put("sec-ch-ua-platform", "Linux");
                headers_189.put("sec-fetch-dest", "video");
                headers_189.put("sec-fetch-mode", "no-cors");
                headers_189.put("sec-fetch-site", "same-origin");
                headers_189.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_190 = new HashMap<>();
                headers_190.put("accept", "*/*");
                headers_190.put("accept-encoding", "identity;q=1, *;q=0");
                headers_190.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_190.put("priority", "i");
                headers_190.put("range", "bytes=64126976-64157233");
                headers_190.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_190.put("sec-ch-ua-mobile", "?0");
                headers_190.put("sec-ch-ua-platform", "Linux");
                headers_190.put("sec-fetch-dest", "video");
                headers_190.put("sec-fetch-mode", "no-cors");
                headers_190.put("sec-fetch-site", "same-origin");
                headers_190.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_191 = new HashMap<>();
                headers_191.put("accept", "*/*");
                headers_191.put("accept-encoding", "identity;q=1, *;q=0");
                headers_191.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_191.put("priority", "i");
                headers_191.put("range", "bytes=54198272-54247830");
                headers_191.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_191.put("sec-ch-ua-mobile", "?0");
                headers_191.put("sec-ch-ua-platform", "Linux");
                headers_191.put("sec-fetch-dest", "video");
                headers_191.put("sec-fetch-mode", "no-cors");
                headers_191.put("sec-fetch-site", "same-origin");
                headers_191.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_192 = new HashMap<>();
                headers_192.put("accept", "*/*");
                headers_192.put("accept-encoding", "identity;q=1, *;q=0");
                headers_192.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_192.put("priority", "i");
                headers_192.put("range", "bytes=103546880-103614794");
                headers_192.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_192.put("sec-ch-ua-mobile", "?0");
                headers_192.put("sec-ch-ua-platform", "Linux");
                headers_192.put("sec-fetch-dest", "video");
                headers_192.put("sec-fetch-mode", "no-cors");
                headers_192.put("sec-fetch-site", "same-origin");
                headers_192.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_193 = new HashMap<>();
                headers_193.put("accept", "*/*");
                headers_193.put("accept-encoding", "identity;q=1, *;q=0");
                headers_193.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_193.put("priority", "i");
                headers_193.put("range", "bytes=48845-16842751");
                headers_193.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_193.put("sec-ch-ua-mobile", "?0");
                headers_193.put("sec-ch-ua-platform", "Linux");
                headers_193.put("sec-fetch-dest", "video");
                headers_193.put("sec-fetch-mode", "no-cors");
                headers_193.put("sec-fetch-site", "same-origin");
                headers_193.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_195 = new HashMap<>();
                headers_195.put("accept", "*/*");
                headers_195.put("accept-encoding", "identity;q=1, *;q=0");
                headers_195.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_195.put("priority", "i");
                headers_195.put("range", "bytes=48845-38305791");
                headers_195.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_195.put("sec-ch-ua-mobile", "?0");
                headers_195.put("sec-ch-ua-platform", "Linux");
                headers_195.put("sec-fetch-dest", "video");
                headers_195.put("sec-fetch-mode", "no-cors");
                headers_195.put("sec-fetch-site", "same-origin");
                headers_195.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_196 = new HashMap<>();
                headers_196.put("accept", "*/*");
                headers_196.put("accept-encoding", "identity;q=1, *;q=0");
                headers_196.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_196.put("priority", "i");
                headers_196.put("range", "bytes=48845-39747583");
                headers_196.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_196.put("sec-ch-ua-mobile", "?0");
                headers_196.put("sec-ch-ua-platform", "Linux");
                headers_196.put("sec-fetch-dest", "video");
                headers_196.put("sec-fetch-mode", "no-cors");
                headers_196.put("sec-fetch-site", "same-origin");
                headers_196.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_197 = new HashMap<>();
                headers_197.put("accept", "*/*");
                headers_197.put("accept-encoding", "identity;q=1, *;q=0");
                headers_197.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_197.put("priority", "i");
                headers_197.put("range", "bytes=48845-29720575");
                headers_197.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_197.put("sec-ch-ua-mobile", "?0");
                headers_197.put("sec-ch-ua-platform", "Linux");
                headers_197.put("sec-fetch-dest", "video");
                headers_197.put("sec-fetch-mode", "no-cors");
                headers_197.put("sec-fetch-site", "same-origin");
                headers_197.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_198 = new HashMap<>();
                headers_198.put("accept", "*/*");
                headers_198.put("accept-encoding", "identity;q=1, *;q=0");
                headers_198.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_198.put("priority", "i");
                headers_198.put("range", "bytes=48845-17137663");
                headers_198.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_198.put("sec-ch-ua-mobile", "?0");
                headers_198.put("sec-ch-ua-platform", "Linux");
                headers_198.put("sec-fetch-dest", "video");
                headers_198.put("sec-fetch-mode", "no-cors");
                headers_198.put("sec-fetch-site", "same-origin");
                headers_198.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_206 = new HashMap<>();
                headers_206.put("accept", "*/*");
                headers_206.put("accept-encoding", "identity;q=1, *;q=0");
                headers_206.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_206.put("priority", "i");
                headers_206.put("range", "bytes=48845-25526271");
                headers_206.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_206.put("sec-ch-ua-mobile", "?0");
                headers_206.put("sec-ch-ua-platform", "Linux");
                headers_206.put("sec-fetch-dest", "video");
                headers_206.put("sec-fetch-mode", "no-cors");
                headers_206.put("sec-fetch-site", "same-origin");
                headers_206.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_210 = new HashMap<>();
                headers_210.put("accept", "*/*");
                headers_210.put("accept-encoding", "identity;q=1, *;q=0");
                headers_210.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_210.put("priority", "i");
                headers_210.put("range", "bytes=48842-117473279");
                headers_210.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_210.put("sec-ch-ua-mobile", "?0");
                headers_210.put("sec-ch-ua-platform", "Linux");
                headers_210.put("sec-fetch-dest", "video");
                headers_210.put("sec-fetch-mode", "no-cors");
                headers_210.put("sec-fetch-site", "same-origin");
                headers_210.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_212 = new HashMap<>();
                headers_212.put("accept", "*/*");
                headers_212.put("accept-encoding", "identity;q=1, *;q=0");
                headers_212.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_212.put("priority", "i");
                headers_212.put("range", "bytes=27394048-27465171");
                headers_212.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_212.put("sec-ch-ua-mobile", "?0");
                headers_212.put("sec-ch-ua-platform", "Linux");
                headers_212.put("sec-fetch-dest", "video");
                headers_212.put("sec-fetch-mode", "no-cors");
                headers_212.put("sec-fetch-site", "same-origin");
                headers_212.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_213 = new HashMap<>();
                headers_213.put("accept", "*/*");
                headers_213.put("accept-encoding", "identity;q=1, *;q=0");
                headers_213.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_213.put("priority", "i");
                headers_213.put("range", "bytes=48845-37912575");
                headers_213.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_213.put("sec-ch-ua-mobile", "?0");
                headers_213.put("sec-ch-ua-platform", "Linux");
                headers_213.put("sec-fetch-dest", "video");
                headers_213.put("sec-fetch-mode", "no-cors");
                headers_213.put("sec-fetch-site", "same-origin");
                headers_213.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_214 = new HashMap<>();
                headers_214.put("accept", "*/*");
                headers_214.put("accept-encoding", "identity;q=1, *;q=0");
                headers_214.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_214.put("priority", "i");
                headers_214.put("range", "bytes=48845-54198271");
                headers_214.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_214.put("sec-ch-ua-mobile", "?0");
                headers_214.put("sec-ch-ua-platform", "Linux");
                headers_214.put("sec-fetch-dest", "video");
                headers_214.put("sec-fetch-mode", "no-cors");
                headers_214.put("sec-fetch-site", "same-origin");
                headers_214.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_215 = new HashMap<>();
                headers_215.put("accept", "*/*");
                headers_215.put("accept-encoding", "identity;q=1, *;q=0");
                headers_215.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_215.put("priority", "i");
                headers_215.put("range", "bytes=48842-147259391");
                headers_215.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_215.put("sec-ch-ua-mobile", "?0");
                headers_215.put("sec-ch-ua-platform", "Linux");
                headers_215.put("sec-fetch-dest", "video");
                headers_215.put("sec-fetch-mode", "no-cors");
                headers_215.put("sec-fetch-site", "same-origin");
                headers_215.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_216 = new HashMap<>();
                headers_216.put("accept", "*/*");
                headers_216.put("accept-encoding", "identity;q=1, *;q=0");
                headers_216.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_216.put("priority", "i");
                headers_216.put("range", "bytes=48842-189431807");
                headers_216.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_216.put("sec-ch-ua-mobile", "?0");
                headers_216.put("sec-ch-ua-platform", "Linux");
                headers_216.put("sec-fetch-dest", "video");
                headers_216.put("sec-fetch-mode", "no-cors");
                headers_216.put("sec-fetch-site", "same-origin");
                headers_216.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_217 = new HashMap<>();
                headers_217.put("accept", "*/*");
                headers_217.put("accept-encoding", "identity;q=1, *;q=0");
                headers_217.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_217.put("priority", "i");
                headers_217.put("range", "bytes=48842-103546879");
                headers_217.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_217.put("sec-ch-ua-mobile", "?0");
                headers_217.put("sec-ch-ua-platform", "Linux");
                headers_217.put("sec-fetch-dest", "video");
                headers_217.put("sec-fetch-mode", "no-cors");
                headers_217.put("sec-fetch-site", "same-origin");
                headers_217.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_218 = new HashMap<>();
                headers_218.put("accept", "*/*");
                headers_218.put("accept-encoding", "identity;q=1, *;q=0");
                headers_218.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_218.put("priority", "i");
                headers_218.put("range", "bytes=48845-64126975");
                headers_218.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_218.put("sec-ch-ua-mobile", "?0");
                headers_218.put("sec-ch-ua-platform", "Linux");
                headers_218.put("sec-fetch-dest", "video");
                headers_218.put("sec-fetch-mode", "no-cors");
                headers_218.put("sec-fetch-site", "same-origin");
                headers_218.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_219 = new HashMap<>();
                headers_219.put("accept", "*/*");
                headers_219.put("accept-encoding", "identity;q=1, *;q=0");
                headers_219.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_219.put("priority", "i");
                headers_219.put("range", "bytes=48827-52264959");
                headers_219.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_219.put("sec-ch-ua-mobile", "?0");
                headers_219.put("sec-ch-ua-platform", "Linux");
                headers_219.put("sec-fetch-dest", "video");
                headers_219.put("sec-fetch-mode", "no-cors");
                headers_219.put("sec-fetch-site", "same-origin");
                headers_219.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_221 = new HashMap<>();
                headers_221.put("accept", "*/*");
                headers_221.put("accept-encoding", "identity;q=1, *;q=0");
                headers_221.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_221.put("priority", "i");
                headers_221.put("range", "bytes=48842-113901567");
                headers_221.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_221.put("sec-ch-ua-mobile", "?0");
                headers_221.put("sec-ch-ua-platform", "Linux");
                headers_221.put("sec-fetch-dest", "video");
                headers_221.put("sec-fetch-mode", "no-cors");
                headers_221.put("sec-fetch-site", "same-origin");
                headers_221.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_222 = new HashMap<>();
                headers_222.put("accept", "*/*");
                headers_222.put("accept-encoding", "identity;q=1, *;q=0");
                headers_222.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_222.put("priority", "i");
                headers_222.put("range", "bytes=48842-104202239");
                headers_222.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_222.put("sec-ch-ua-mobile", "?0");
                headers_222.put("sec-ch-ua-platform", "Linux");
                headers_222.put("sec-fetch-dest", "video");
                headers_222.put("sec-fetch-mode", "no-cors");
                headers_222.put("sec-fetch-site", "same-origin");
                headers_222.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_223 = new HashMap<>();
                headers_223.put("accept", "*/*");
                headers_223.put("accept-encoding", "identity;q=1, *;q=0");
                headers_223.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_223.put("priority", "i");
                headers_223.put("range", "bytes=48845-40271871");
                headers_223.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_223.put("sec-ch-ua-mobile", "?0");
                headers_223.put("sec-ch-ua-platform", "Linux");
                headers_223.put("sec-fetch-dest", "video");
                headers_223.put("sec-fetch-mode", "no-cors");
                headers_223.put("sec-fetch-site", "same-origin");
                headers_223.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_224 = new HashMap<>();
                headers_224.put("accept", "*/*");
                headers_224.put("accept-encoding", "identity;q=1, *;q=0");
                headers_224.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_224.put("priority", "i");
                headers_224.put("range", "bytes=48845-62488575");
                headers_224.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_224.put("sec-ch-ua-mobile", "?0");
                headers_224.put("sec-ch-ua-platform", "Linux");
                headers_224.put("sec-fetch-dest", "video");
                headers_224.put("sec-fetch-mode", "no-cors");
                headers_224.put("sec-fetch-site", "same-origin");
                headers_224.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");



                String uri3Fonts = "https://fonts.gstatic.com/s/amaranth/v16/KtkuALODe433f0j1zMnFHdA.woff2";

                ScenarioBuilder scnPM13 = scenario("Pile.Videonew")
                        .exec(
                                http("request_0")
                                        .get("/videonew/")
                                        .headers(headers_0)
                                        .resources(
                                                http("request_1")
                                                        .get("/wp-content/plugins/gallery-videos/public/css/fontawesome-webfont.woff2?v=4.6.3"),
                                                http("request_2")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Medium.woff"),
                                                http("request_3")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Bold.woff"),
                                                http("request_4")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Black.woff"),
                                                http("request_5")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro.woff"),
                                                http("request_6")
                                                        .get("/wp-content/themes/politmoscow/img/header-icon1b.png"),
                                                http("request_7")
                                                        .get(uri1Ya + "/metrika/tag.js")
                                                        .headers(headers_7),
                                                http("request_8")
                                                        .get("/wp-content/uploads/2024/08/plashka-video-2.jpg")
                                                        .headers(headers_8),
                                                http("request_9")
                                                        .get("/wp-content/plugins/gallery-videos/public/css/fontawesome-webfont.woff2?v=4.6.3")
                                                        .headers(headers_9),
                                                http("request_10")
                                                        .get("/wp-content/plugins/wp-postratings/images/heart_crystal/rating_1_over.gif")
                                                        .headers(headers_7),
                                                http("request_11")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-23.jpg")
                                                        .headers(headers_11),
                                                http("request_12")
                                                        .get(uri1Ya + "/watch/94094106?wmode=7&page-url=https%3A%2F%2Fpolit-moscow.ru%2Fvideonew%2F&page-ref=https%3A%2F%2Fpolit-moscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.113%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.113%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.113%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A1070504886616%3Ahid%3A4271985%3Az%3A300%3Ai%3A20240830151137%3Aet%3A1725012697%3Ac%3A1%3Arn%3A265289189%3Arqn%3A74%3Au%3A172478250269200753%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A855%3Awv%3A2%3Ads%3A0%2C0%2C723%2C4%2C5%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1725012696565%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1725012698%3At%3A%D0%92%D0%B8%D0%B4%D0%B5%D0%BE%20%E2%80%93%20%D0%9F%D0%9E%D0%9B%D0%98%D0%A2%D0%9C%D0%9E%D0%A1%D0%9A%D0%92%D0%90&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
                                                        .headers(headers_12),
                                                http("request_13")
                                                        .get(uri1Ya + "/metrika/metrika_match.html")
                                                        .headers(headers_13),
                                                http("request_14")
                                                        .get("/wp-content/uploads/2024/08/plashka-video-6.jpg")
                                                        .headers(headers_8),
                                                http("request_15")
                                                        .get("/wp-content/uploads/2024/08/plashka-video.jpg")
                                                        .headers(headers_8),
                                                http("request_16")
                                                        .get("/wp-content/uploads/2024/08/plashka-video-1.jpg")
                                                        .headers(headers_8),
                                                http("request_17")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-22.jpg")
                                                        .headers(headers_11),
                                                http("request_18")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-21.jpg")
                                                        .headers(headers_11),
                                                http("request_19")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-15.jpg")
                                                        .headers(headers_11),
                                                http("request_20")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-24.jpg")
                                                        .headers(headers_11),
                                                http("request_21")
                                                        .get("/wp-content/uploads/2024/08/plashka-video-4.jpg")
                                                        .headers(headers_11),
                                                http("request_22")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-18.jpg")
                                                        .headers(headers_11),
                                                http("request_23")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-17.jpg")
                                                        .headers(headers_11),
                                                http("request_24")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-16.jpg")
                                                        .headers(headers_11),
                                                http("request_25")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-14.jpg")
                                                        .headers(headers_11),
                                                http("request_26")
                                                        .get(uri3Fonts)
                                                        .headers(headers_26),
                                                http("request_27")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-11.jpg")
                                                        .headers(headers_11),
                                                http("request_28")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-19.jpg")
                                                        .headers(headers_11),
                                                http("request_29")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-12.jpg")
                                                        .headers(headers_11),
                                                http("request_30")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-10.jpg")
                                                        .headers(headers_11),
                                                http("request_31")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-2.jpg")
                                                        .headers(headers_11),
                                                http("request_32")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-8.jpg")
                                                        .headers(headers_11),
                                                http("request_33")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-9.jpg")
                                                        .headers(headers_11),
                                                http("request_34")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-1.jpg")
                                                        .headers(headers_11),
                                                http("request_35")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-6.jpg")
                                                        .headers(headers_11),
                                                http("request_36")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-5.jpg")
                                                        .headers(headers_11),
                                                http("request_37")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.jpg")
                                                        .headers(headers_11),
                                                http("request_38")
                                                        .get("/wp-content/uploads/2023/07/%D0%A1%D0%BA%D1%80%D0%B8%D0%BD%D1%88%D0%BE%D1%82-15-07-2023-152820.jpg")
                                                        .headers(headers_11),
                                                http("request_39")
                                                        .get("/wp-content/uploads/2023/07/%D0%A1%D0%BA%D1%80%D0%B8%D0%BD%D1%88%D0%BE%D1%82-18-07-2023-143246.jpg")
                                                        .headers(headers_11),
                                                http("request_40")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-13.jpg")
                                                        .headers(headers_11),
                                                http("request_41")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-4.jpg")
                                                        .headers(headers_11),
                                                http("request_42")
                                                        .get("/wp-content/uploads/2023/07/%D0%A1%D0%BA%D1%80%D0%B8%D0%BD%D1%88%D0%BE%D1%82-14-07-2023-104944.jpg")
                                                        .headers(headers_11),
                                                http("request_43")
                                                        .get("/wp-content/uploads/2023/07/2023-07-24-2.jpg")
                                                        .headers(headers_11),
                                                http("request_44")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-3.jpg")
                                                        .headers(headers_11),
                                                http("request_45")
                                                        .get("/wp-content/uploads/2023/07/2023-07-19.jpg")
                                                        .headers(headers_11),
                                                http("request_46")
                                                        .get("/wp-content/uploads/2023/07/2023_07_14_3.mp4")
                                                        .headers(headers_46),
                                                http("request_47")
                                                        .get("/wp-content/uploads/2023/07/2023.07.20.jpg")
                                                        .headers(headers_11),
                                                http("request_48")
                                                        .get("/wp-content/uploads/2023/08/photo__2023-08-01_.jpg")
                                                        .headers(headers_11),
                                                http("request_49")
                                                        .get("/wp-content/uploads/2023/07/2023.07.20-%D0%9D%D0%B0%D0%B3%D0%BE%D1%80%D0%BD%D1%8B%D0%B9.jpg")
                                                        .headers(headers_11),
                                                http("request_50")
                                                        .get("/wp-content/uploads/2023/07/2023-07-27-3.jpg")
                                                        .headers(headers_11),
                                                http("request_51")
                                                        .get("/wp-content/uploads/2023/07/photo_2023-07-31_.jpg")
                                                        .headers(headers_11),
                                                http("request_52")
                                                        .get("/wp-content/uploads/2023/07/photo_2023-07-22_22-13-33.jpg")
                                                        .headers(headers_11),
                                                http("request_53")
                                                        .get("/wp-content/uploads/2023/08/photo_2023-08-01_17-40.jpg")
                                                        .headers(headers_11),
                                                http("request_54")
                                                        .get("/wp-content/uploads/2023/08/2023_08_%D0%9C%D0%A3%D0%A4_-1.jpg")
                                                        .headers(headers_11),
                                                http("request_55")
                                                        .get("/wp-content/uploads/2023/08/2023-08-05-16.55-1.jpg")
                                                        .headers(headers_11),
                                                http("request_56")
                                                        .get("/wp-content/uploads/2023/08/2023-08.jpg")
                                                        .headers(headers_11),
                                                http("request_57")
                                                        .get("/wp-content/uploads/2023/08/photo_2023-08-04.jpg")
                                                        .headers(headers_11),
                                                http("request_58")
                                                        .get("/wp-content/uploads/2023/08/photo_2023-08-01.jpg")
                                                        .headers(headers_11),
                                                http("request_59")
                                                        .get("/wp-content/uploads/2023/08/2023-08-22-18.45.09.jpg")
                                                        .headers(headers_11),
                                                http("request_60")
                                                        .get("/wp-content/uploads/2023/08/photo_2023-08-11_18-10.jpg")
                                                        .headers(headers_11),
                                                http("request_61")
                                                        .get("/wp-content/uploads/2023/08/2023-08-23-18.00.49.jpg")
                                                        .headers(headers_11),
                                                http("request_62")
                                                        .get("/wp-content/uploads/2023/08/IMG_2253.jpeg")
                                                        .headers(headers_11),
                                                http("request_63")
                                                        .get("/wp-content/uploads/2023/08/2023-08-09-14.00.jpg")
                                                        .headers(headers_11),
                                                http("request_64")
                                                        .get("/wp-content/uploads/2023/08/2023-08-21-20.21.00.jpg")
                                                        .headers(headers_11),
                                                http("request_65")
                                                        .get("/wp-content/uploads/2023/08/photo_2023-08-17_15-30.jpg")
                                                        .headers(headers_11),
                                                http("request_66")
                                                        .get("/wp-content/uploads/2023/09/2023-09-08-18.55.03.jpg")
                                                        .headers(headers_11),
                                                http("request_67")
                                                        .get("/wp-content/uploads/2023/08/2023-08-25-14.15.36.jpg")
                                                        .headers(headers_11),
                                                http("request_68")
                                                        .get("/wp-content/uploads/2023/09/2023_semennikov.jpg")
                                                        .headers(headers_11),
                                                http("request_69")
                                                        .get("/wp-content/uploads/2023/09/2023-09-08-13.13.07.jpg")
                                                        .headers(headers_11),
                                                http("request_70")
                                                        .get("/wp-content/uploads/2023/09/2023-09-08_shtab-obshhestvennoj-podderzhki.jpg")
                                                        .headers(headers_11),
                                                http("request_71")
                                                        .get("/wp-content/uploads/2023/09/2023-09-09_deputat-mgd-k.shhitov.jpg")
                                                        .headers(headers_11),
                                                http("request_72")
                                                        .get("/wp-content/uploads/2023/09/2023_titov.jpg")
                                                        .headers(headers_11),
                                                http("request_73")
                                                        .get("/wp-content/uploads/2023/09/2023_shtab-obshhestvennoj-podderzhki.jpg")
                                                        .headers(headers_11),
                                                http("request_74")
                                                        .get("/wp-content/uploads/2023/09/2023-09_08-09-10.jpg")
                                                        .headers(headers_11),
                                                http("request_75")
                                                        .get("/wp-content/uploads/2023/09/2023-09-09_a.shaposhnikov.jpg")
                                                        .headers(headers_11),
                                                http("request_76")
                                                        .get("/wp-content/uploads/2024/08/img_3059-1-video-converter.com_.mp4")
                                                        .headers(headers_46),
                                                http("request_77")
                                                        .get("/wp-content/uploads/2023/09/2023-09_petr-tolstoj.jpg")
                                                        .headers(headers_11),
                                                http("request_78")
                                                        .get("/wp-content/uploads/2024/08/img_2526.mp4")
                                                        .headers(headers_46),
                                                http("request_79")
                                                        .get("/wp-content/uploads/2023/09/2023-09_shtab_den-goroda.jpg")
                                                        .headers(headers_11),
                                                http("request_80")
                                                        .get("/wp-content/uploads/2024/08/img_2298_tg.mp4")
                                                        .headers(headers_46),
                                                http("request_81")
                                                        .get("/wp-content/uploads/2024/08/2066162.576p-video-converter.com_.mp4")
                                                        .headers(headers_46),
                                                http("request_82")
                                                        .get("/wp-content/uploads/2024/07/video_2024-07-24_10-50-02.mp4")
                                                        .headers(headers_46),
                                                http("request_83")
                                                        .get("/wp-content/uploads/2024/08/czvetkova-medlennye-zony_v3.mp4")
                                                        .headers(headers_46),
                                                http("request_84")
                                                        .get("/wp-content/uploads/2024/08/img_1150.mp4")
                                                        .headers(headers_46),
                                                http("request_85")
                                                        .get("/wp-content/uploads/2024/07/2063334.576p-video-converter.com_.mp4")
                                                        .headers(headers_46),
                                                http("request_86")
                                                        .get("/wp-content/uploads/2024/07/23msk_mosgorduma_hqdbp3rkquduckxlbu_lo.mp4")
                                                        .headers(headers_46),
                                                http("request_87")
                                                        .get("/wp-content/uploads/2024/07/img_3631-video-converter.com_.mp4")
                                                        .headers(headers_46),
                                                http("request_88")
                                                        .get("/wp-content/uploads/2024/07/img_1354.mp4")
                                                        .headers(headers_46),
                                                http("request_89")
                                                        .get("/wp-content/uploads/2024/07/img_2697.mp4")
                                                        .headers(headers_46),
                                                http("request_90")
                                                        .get("/wp-content/uploads/2024/07/img_2980.mp4")
                                                        .headers(headers_46),
                                                http("request_91")
                                                        .get("/wp-content/uploads/2024/07/img_2675.mp4")
                                                        .headers(headers_46),
                                                http("request_92")
                                                        .get("/wp-content/uploads/2024/07/img_2826.mp4")
                                                        .headers(headers_46),
                                                http("request_93")
                                                        .get("/wp-content/uploads/2024/07/img_4083-video-converter.com_.mp4")
                                                        .headers(headers_46),
                                                http("request_94")
                                                        .get("/wp-content/uploads/2024/07/video_2024-07-11_16-20-31.mp4")
                                                        .headers(headers_46),
                                                http("request_95")
                                                        .get("/wp-content/uploads/2024/07/img_3347.mp4")
                                                        .headers(headers_46),
                                                http("request_96")
                                                        .get("/wp-content/uploads/2024/07/img_8962.mp4")
                                                        .headers(headers_46),
                                                http("request_97")
                                                        .get("/wp-content/uploads/2024/07/serebryanye-truby-30.06.24.mp4")
                                                        .headers(headers_46),
                                                http("request_98")
                                                        .get("/wp-content/uploads/2024/07/img_8484.mp4")
                                                        .headers(headers_46),
                                                http("request_99")
                                                        .get("/wp-content/uploads/2024/07/proforientaczionnyj_festival_shag_v_budushhee.mp4")
                                                        .headers(headers_46),
                                                http("request_100")
                                                        .get("/wp-content/uploads/2023/09/i.m.butman.jpg")
                                                        .headers(headers_11),
                                                http("request_101")
                                                        .get("/wp-content/uploads/2024/07/outputcompress-video-online.com-33.mp4")
                                                        .headers(headers_46),
                                                http("request_102")
                                                        .get("/wp-content/uploads/2024/07/2024_07_07-5.mp4")
                                                        .headers(headers_46),
                                                http("request_103")
                                                        .get("/wp-content/uploads/2024/07/img_0979.mp4")
                                                        .headers(headers_46),
                                                http("request_104")
                                                        .get("/wp-content/uploads/2024/07/apppr.mp4")
                                                        .headers(headers_46),
                                                http("request_105")
                                                        .get("/wp-content/uploads/2024/07/img_6971.mp4")
                                                        .headers(headers_46),
                                                http("request_106")
                                                        .get("/wp-content/uploads/2023/07/DSC08237.jpg")
                                                        .headers(headers_11),
                                                http("request_107")
                                                        .get("/wp-content/uploads/2024/08/plashka-video-3.jpg")
                                                        .headers(headers_107),
                                                http("request_108")
                                                        .get("/wp-content/uploads/2023/07/11-07-23-.mp4")
                                                        .headers(headers_46),
                                                http("request_109")
                                                        .get("/wp-content/uploads/2024/07/na-ulicze-vavilova-prodolzhaetsya-stroitelstvo-konsultativno-diagnosticheskogo-czentra-s-poliklinikoj.mp4")
                                                        .headers(headers_46),
                                                http("request_110")
                                                        .get("/wp-content/uploads/2023/07/13-07-23-%D1%86%D0%B4%D0%BF.mp4")
                                                        .headers(headers_46),
                                                http("request_111")
                                                        .get("/wp-content/uploads/2024/07/video3-poliklinika-26.06.mp4")
                                                        .headers(headers_46),
                                                http("request_112")
                                                        .get("/wp-content/uploads/2023/07/2023_07_17_2-3.mp4")
                                                        .headers(headers_46),
                                                http("request_113")
                                                        .get("/wp-content/uploads/2023/07/2023_07_19_3.mp4")
                                                        .headers(headers_46),
                                                http("request_114")
                                                        .get("/wp-content/uploads/2023/07/2023_07_20_1.mp4")
                                                        .headers(headers_46),
                                                http("request_115")
                                                        .get("/wp-content/uploads/2023/07/2023-07-25-1.jpg")
                                                        .headers(headers_11),
                                                http("request_116")
                                                        .get("/wp-content/uploads/2023/08/15-08-2023_.jpg")
                                                        .headers(headers_11),
                                                http("request_117")
                                                        .get("/wp-content/uploads/2023/08/DSC_9844.jpg")
                                                        .headers(headers_11),
                                                http("request_118")
                                                        .get("/wp-content/uploads/2023/07/2023_07_20-%D0%9D%D0%B0%D0%B3%D0%BE%D1%80%D0%BD%D1%8B%D0%B9.mp4")
                                                        .headers(headers_46),
                                                http("request_119")
                                                        .get("/wp-content/uploads/2023/07/2023_07_22_3.mp4")
                                                        .headers(headers_46),
                                                http("request_120")
                                                        .get("/wp-content/uploads/2023/07/2023_07_20-%D0%B2%D0%BE%D0%B4%D0%BD%D1%8B%D0%B9-%D1%82%D1%80%D0%B0%D0%BD%D1%81%D0%BF%D0%BE%D1%80%D1%822-.mp4")
                                                        .headers(headers_46),
                                                http("request_121")
                                                        .get("/wp-content/uploads/2023/07/24-07-23-2.mp4")
                                                        .headers(headers_46),
                                                http("request_122")
                                                        .get("/wp-content/uploads/2023/07/2022_07_28-%D0%BF%D0%BE%D0%BA%D1%80%D0%BE%D0%B2%D0%BA%D0%B0.mp4")
                                                        .headers(headers_46),
                                                http("request_123")
                                                        .get("/wp-content/uploads/2023/07/2022_07_28-%D0%BF%D0%BE%D0%BA%D1%80%D0%BE%D0%B2%D0%BA%D0%B0-%D0%B7%D0%BE%D0%B6.mp4")
                                                        .headers(headers_46),
                                                http("request_124")
                                                        .get("/wp-content/uploads/2023/08/28-07-23.mp4")
                                                        .headers(headers_46),
                                                http("request_125")
                                                        .get("/wp-content/uploads/2023/08/28-07-23-%D0%BC%D0%BE%D1%80%D0%BE%D0%B7%D0%BE%D0%B2%D0%B0-%D1%81%D0%B8%D0%BD%D1%85%D1%80%D0%BE%D0%BD.mp4")
                                                        .headers(headers_46),
                                                http("request_126")
                                                        .get("/wp-content/uploads/2023/08/02.08.23-%D0%92%D0%B0%D1%81%D0%B8%D0%BB%D1%8C%D1%87%D1%83%D0%BA_4.mp4")
                                                        .headers(headers_46),
                                                http("request_127")
                                                        .get("/wp-content/uploads/2023/08/03.08.23_1.mp4")
                                                        .headers(headers_46),
                                                http("request_128")
                                                        .get("/wp-content/uploads/2023/08/05.08.23_2.mp4")
                                                        .headers(headers_46),
                                                http("request_129")
                                                        .get("/wp-content/uploads/2023/07/2023_07_26_2.mp4")
                                                        .headers(headers_46),
                                                http("request_130")
                                                        .get("/wp-content/uploads/2023/08/2023_08_16_8.mp4")
                                                        .headers(headers_46),
                                                http("request_131")
                                                        .get("/wp-content/uploads/2023/08/02.08.23_3.mp4")
                                                        .headers(headers_46),
                                                http("request_132")
                                                        .get("/wp-content/uploads/2023/08/01.08.23_3.mp4")
                                                        .headers(headers_46),
                                                http("request_133")
                                                        .get("/wp-content/uploads/2023/08/04.08.23_4.mp4")
                                                        .headers(headers_46),
                                                http("request_134")
                                                        .get("/wp-content/uploads/2023/08/07.08.23_4.mp4")
                                                        .headers(headers_46),
                                                http("request_135")
                                                        .get("/wp-content/uploads/2023/08/11.08.23_3.mp4")
                                                        .headers(headers_46),
                                                http("request_136")
                                                        .get("/wp-content/uploads/2023/09/seliverstov.mp4")
                                                        .headers(headers_46),
                                                http("request_137")
                                                        .get("/wp-content/uploads/2023/08/22.08.23_3.mp4")
                                                        .headers(headers_46),
                                                http("request_138")
                                                        .get("/wp-content/uploads/2023/09/kozlov.mp4")
                                                        .headers(headers_46),
                                                http("request_139")
                                                        .get("/wp-content/uploads/2023/09/semennikov.mp4")
                                                        .headers(headers_46),
                                                http("request_140")
                                                        .get("/wp-content/uploads/2023/09/nifantev.mp4")
                                                        .headers(headers_46),
                                                http("request_141")
                                                        .get("/wp-content/uploads/2023/09/shhitov.mp4")
                                                        .headers(headers_46),
                                                http("request_142")
                                                        .get("/wp-content/uploads/2023/09/shaposhnikov.mp4")
                                                        .headers(headers_46),
                                                http("request_143")
                                                        .get("/wp-content/uploads/2023/09/2023_08_28_2.mp4")
                                                        .headers(headers_46),
                                                http("request_144")
                                                        .get("/wp-content/uploads/2023/09/2023_08_17_1.mp4")
                                                        .headers(headers_46),
                                                http("request_145")
                                                        .get("/wp-content/uploads/2023/09/svyatenko.mp4")
                                                        .headers(headers_46),
                                                http("request_146")
                                                        .get("/wp-content/uploads/2023/09/tolstoj-2.mp4")
                                                        .headers(headers_46),
                                                http("request_147")
                                                        .get("/wp-content/uploads/2023/09/titov-polit-moskva.mp4")
                                                        .headers(headers_46),
                                                http("request_148")
                                                        .get("/wp-content/uploads/2023/09/lytkin.mp4")
                                                        .headers(headers_46),
                                                http("request_149")
                                                        .get("/wp-content/uploads/2023/09/2023_08_24_3.mp4")
                                                        .headers(headers_46),
                                                http("request_150")
                                                        .get("/wp-content/uploads/2023/08/09.08.23_5.mp4")
                                                        .headers(headers_46),
                                                http("request_151")
                                                        .get("/wp-content/uploads/2023/07/%D0%A1%D0%BA%D1%80%D0%B8%D0%BD%D1%88%D0%BE%D1%82-15-07-2023-153419.jpg")
                                                        .headers(headers_107),
                                                http("request_152")
                                                        .get("/wp-content/uploads/2024/08/img_2526.mp4")
                                                        .headers(headers_152),
                                                http("request_153")
                                                        .get("/wp-content/uploads/2024/08/img_3059-1-video-converter.com_.mp4")
                                                        .headers(headers_153),
                                                http("request_154")
                                                        .get("/wp-content/uploads/2024/08/img_2298_tg.mp4")
                                                        .headers(headers_154),
                                                http("request_155")
                                                        .get("/wp-content/uploads/2024/08/2066162.576p-video-converter.com_.mp4")
                                                        .headers(headers_155),
                                                http("request_156")
                                                        .get("/wp-content/uploads/2024/07/plashka-ramka-1400-x-800-piks.-7.jpg")
                                                        .headers(headers_11),
                                                http("request_157")
                                                        .get("/wp-content/uploads/2024/07/2063334.576p-video-converter.com_.mp4")
                                                        .headers(headers_157),
                                                http("request_158")
                                                        .get("/wp-content/uploads/2024/08/czvetkova-medlennye-zony_v3.mp4")
                                                        .headers(headers_158),
                                                http("request_159")
                                                        .get("/wp-content/uploads/2024/07/img_3631-video-converter.com_.mp4")
                                                        .headers(headers_159),
                                                http("request_160")
                                                        .get("/wp-content/uploads/2024/07/img_2697.mp4")
                                                        .headers(headers_160),
                                                http("request_161")
                                                        .get("/wp-content/uploads/2023/08/21.08.23-lektorij.mp4")
                                                        .headers(headers_46),
                                                http("request_162")
                                                        .get("/wp-content/uploads/2024/07/video_2024-07-24_10-50-02.mp4")
                                                        .headers(headers_162),
                                                http("request_163")
                                                        .get("/wp-content/uploads/2024/07/img_1354.mp4")
                                                        .headers(headers_163),
                                                http("request_164")
                                                        .get("/wp-content/uploads/2024/07/video_2024-07-24_10-50-02.mp4")
                                                        .headers(headers_164),
                                                http("request_165")
                                                        .get("/wp-content/uploads/2024/07/img_1354.mp4")
                                                        .headers(headers_164),
                                                http("request_166")
                                                        .get("/wp-content/uploads/2024/07/img_5584.mp4")
                                                        .headers(headers_46),
                                                http("request_167")
                                                        .get("/wp-content/uploads/2024/07/video_2024-07-24_10-50-02.mp4")
                                                        .headers(headers_167),
                                                http("request_168")
                                                        .get("/wp-content/uploads/2024/07/img_1354.mp4")
                                                        .headers(headers_168),
                                                http("request_169")
                                                        .get("/wp-content/uploads/2024/07/img_2675.mp4")
                                                        .headers(headers_169),
                                                http("request_170")
                                                        .get("/wp-content/uploads/2024/07/img_2826.mp4")
                                                        .headers(headers_170),
                                                http("request_171")
                                                        .get("/wp-content/uploads/2024/07/img_2980.mp4")
                                                        .headers(headers_171),
                                                http("request_172")
                                                        .get("/wp-content/uploads/2024/07/img_4083-video-converter.com_.mp4")
                                                        .headers(headers_172),
                                                http("request_173")
                                                        .get("/wp-content/uploads/2024/07/img_8962.mp4")
                                                        .headers(headers_173),
                                                http("request_174")
                                                        .get("/wp-content/uploads/2023/08/23-08-23.mp4")
                                                        .headers(headers_46),
                                                http("request_175")
                                                        .get("/wp-content/uploads/2024/07/serebryanye-truby-30.06.24.mp4")
                                                        .headers(headers_175),
                                                http("request_176")
                                                        .get("/wp-content/uploads/2024/07/img_3347.mp4")
                                                        .headers(headers_176),
                                                http("request_177")
                                                        .get("/wp-content/uploads/2024/07/video_2024-07-11_16-20-31.mp4")
                                                        .headers(headers_177),
                                                http("request_178")
                                                        .get("/wp-content/uploads/2024/07/img_8484.mp4")
                                                        .headers(headers_178),
                                                http("request_179")
                                                        .get("/wp-content/uploads/2024/07/img_6971.mp4")
                                                        .headers(headers_179),
                                                http("request_180")
                                                        .get("/wp-content/uploads/2023/09/seliverstov.mp4")
                                                        .headers(headers_180),
                                                http("request_181")
                                                        .get("/wp-content/uploads/2024/07/apppr.mp4")
                                                        .headers(headers_181),
                                                http("request_182")
                                                        .get("/wp-content/uploads/2024/07/outputcompress-video-online.com-33.mp4")
                                                        .headers(headers_182),
                                                http("request_183")
                                                        .get("/wp-content/uploads/2024/07/img_0979.mp4")
                                                        .headers(headers_183),
                                                http("request_184")
                                                        .get("/wp-content/uploads/2023/09/kozlov.mp4")
                                                        .headers(headers_184),
                                                http("request_185")
                                                        .get("/wp-content/uploads/2023/09/semennikov.mp4")
                                                        .headers(headers_185),
                                                http("request_186")
                                                        .get("/wp-content/uploads/2023/09/nifantev.mp4")
                                                        .headers(headers_186),
                                                http("request_187")
                                                        .get("/wp-content/uploads/2023/09/shhitov.mp4")
                                                        .headers(headers_187),
                                                http("request_188")
                                                        .get("/wp-content/uploads/2023/09/tolstoj-2.mp4")
                                                        .headers(headers_188),
                                                http("request_189")
                                                        .get("/wp-content/uploads/2023/09/shaposhnikov.mp4")
                                                        .headers(headers_189),
                                                http("request_190")
                                                        .get("/wp-content/uploads/2023/09/titov-polit-moskva.mp4")
                                                        .headers(headers_190),
                                                http("request_191")
                                                        .get("/wp-content/uploads/2023/09/lytkin.mp4")
                                                        .headers(headers_191),
                                                http("request_192")
                                                        .get("/wp-content/uploads/2023/09/svyatenko.mp4")
                                                        .headers(headers_192),
                                                http("request_193")
                                                        .get("/wp-content/uploads/2024/07/img_3631-video-converter.com_.mp4")
                                                        .headers(headers_193),
                                                http("request_194")
                                                        .get("/wp-content/uploads/2023/09/ko-dnyu-goroda-1.mp4")
                                                        .headers(headers_46),
                                                http("request_195")
                                                        .get("/wp-content/uploads/2024/08/img_3059-1-video-converter.com_.mp4")
                                                        .headers(headers_195),
                                                http("request_196")
                                                        .get("/wp-content/uploads/2024/07/img_1354.mp4")
                                                        .headers(headers_196),
                                                http("request_197")
                                                        .get("/wp-content/uploads/2024/07/img_2675.mp4")
                                                        .headers(headers_197),
                                                http("request_198")
                                                        .get("/wp-content/uploads/2024/07/img_2697.mp4")
                                                        .headers(headers_198),
                                                http("request_199")
                                                        .get("/wp-content/uploads/2023/09/shhitov.mp4")
                                                        .headers(headers_164),
                                                http("request_200")
                                                        .get("/wp-content/uploads/2023/09/tolstoj-2.mp4")
                                                        .headers(headers_164),
                                                http("request_201")
                                                        .get("/wp-content/uploads/2023/09/shaposhnikov.mp4")
                                                        .headers(headers_164),
                                                http("request_202")
                                                        .get("/wp-content/uploads/2023/09/titov-polit-moskva.mp4")
                                                        .headers(headers_164),
                                                http("request_203")
                                                        .get("/wp-content/uploads/2023/09/kozlov.mp4")
                                                        .headers(headers_164),
                                                http("request_204")
                                                        .get("/wp-content/uploads/2023/09/lytkin.mp4")
                                                        .headers(headers_164),
                                                http("request_205")
                                                        .get("/wp-content/uploads/2023/09/svyatenko.mp4")
                                                        .headers(headers_164),
                                                http("request_206")
                                                        .get("/wp-content/uploads/2024/07/img_6971.mp4")
                                                        .headers(headers_206),
                                                http("request_207")
                                                        .get("/wp-content/uploads/2024/07/apppr.mp4")
                                                        .headers(headers_164),
                                                http("request_208")
                                                        .get("/wp-content/uploads/2024/07/outputcompress-video-online.com-33.mp4")
                                                        .headers(headers_164),
                                                http("request_209")
                                                        .get("/wp-content/uploads/2023/09/semennikov.mp4")
                                                        .headers(headers_164),
                                                http("request_210")
                                                        .get("/wp-content/uploads/2023/09/seliverstov.mp4")
                                                        .headers(headers_210),
                                                http("request_211")
                                                        .get("/wp-content/uploads/2023/09/nifantev.mp4")
                                                        .headers(headers_164),
                                                http("request_212")
                                                        .get("/wp-content/uploads/2024/07/img_5584.mp4")
                                                        .headers(headers_212),
                                                http("request_213")
                                                        .get("/wp-content/uploads/2024/07/apppr.mp4")
                                                        .headers(headers_213),
                                                http("request_214")
                                                        .get("/wp-content/uploads/2023/09/lytkin.mp4")
                                                        .headers(headers_214),
                                                http("request_215")
                                                        .get("/wp-content/uploads/2023/09/kozlov.mp4")
                                                        .headers(headers_215),
                                                http("request_216")
                                                        .get("/wp-content/uploads/2023/09/semennikov.mp4")
                                                        .headers(headers_216),
                                                http("request_217")
                                                        .get("/wp-content/uploads/2023/09/svyatenko.mp4")
                                                        .headers(headers_217),
                                                http("request_218")
                                                        .get("/wp-content/uploads/2023/09/titov-polit-moskva.mp4")
                                                        .headers(headers_218),
                                                http("request_219")
                                                        .get("/wp-content/uploads/2023/09/nifantev.mp4")
                                                        .headers(headers_219),
                                                http("request_220")
                                                        .get("/wp-content/uploads/2024/07/img_6971.mp4")
                                                        .headers(headers_206),
                                                http("request_221")
                                                        .get("/wp-content/uploads/2023/09/shhitov.mp4")
                                                        .headers(headers_221),
                                                http("request_222")
                                                        .get("/wp-content/uploads/2023/09/shaposhnikov.mp4")
                                                        .headers(headers_222),
                                                http("request_223")
                                                        .get("/wp-content/uploads/2024/07/outputcompress-video-online.com-33.mp4")
                                                        .headers(headers_223),
                                                http("request_224")
                                                        .get("/wp-content/uploads/2023/09/tolstoj-2.mp4")
                                                        .headers(headers_224),
                                                http("request_225")
                                                        .get("/wp-content/uploads/2023/09/seliverstov.mp4")
                                                        .headers(headers_210)
                                        )
                        );

                HttpProtocolBuilder httpProtocol_SearchPanda = http
                        .baseUrl("https://polit-moscow.ru")
                        .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
                        .acceptEncodingHeader("gzip, deflate, br, zstd")
                        .acceptLanguageHeader("ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
                        .inferHtmlResources();
                FeederBuilder<String> searchFeeder = csv("search.csv").circular()
                        ;

                Map<CharSequence, String> headersPM14_0 = new HashMap<>();
                headersPM14_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
                headersPM14_0.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM14_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM14_0.put("priority", "u=0, i");
                headersPM14_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM14_0.put("sec-ch-ua-mobile", "?0");
                headersPM14_0.put("sec-ch-ua-platform", "Linux");
                headersPM14_0.put("sec-fetch-dest", "document");
                headersPM14_0.put("sec-fetch-mode", "navigate");
                headersPM14_0.put("sec-fetch-site", "same-origin");
                headersPM14_0.put("sec-fetch-user", "?1");
                headersPM14_0.put("upgrade-insecure-requests", "1");
                headersPM14_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headersPM14_1 = new HashMap<>();
                headersPM14_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headersPM14_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM14_1.put("sec-ch-ua-mobile", "?0");
                headersPM14_1.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersPM14_9 = new HashMap<>();
                headersPM14_9.put("accept", "*/*");
                headersPM14_9.put("accept-encoding", "gzip, deflate, br, zstd");
                headersPM14_9.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersPM14_9.put("origin", "https://polit-moscow.ru");
                headersPM14_9.put("priority", "u=1, i");
                headersPM14_9.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM14_9.put("sec-ch-ua-mobile", "?0");
                headersPM14_9.put("sec-ch-ua-platform", "Linux");
                headersPM14_9.put("sec-fetch-dest", "empty");
                headersPM14_9.put("sec-fetch-mode", "cors");
                headersPM14_9.put("sec-fetch-site", "cross-site");
                headersPM14_9.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headersPM14_10 = new HashMap<>();
                headersPM14_10.put("Upgrade-Insecure-Requests", "1");
                headersPM14_10.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headersPM14_10.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersPM14_10.put("sec-ch-ua-mobile", "?0");
                headersPM14_10.put("sec-ch-ua-platform", "Linux");


                ScenarioBuilder scnPM14 = scenario("Pile.SearchPanda")
                        .feed(searchFeeder)
                        .exec(
                                http("request_0")
                                        .get("/?s=#{searchQuery}")
                                        .headers(headersPM14_0)
                                        .check(status().is(200))  // Поставил 200, указать нужный.
                                        .resources(
                                                http("request_1")
                                                        .get(uri1Ya + "/metrika/tag.js")
                                                        .headers(headersPM14_1),
                                                http("request_2")
                                                        .get("/wp-content/plugins/wp-postratings/images/heart_crystal/rating_1_over.gif")
                                                        .headers(headersPM14_1),
                                                http("request_3")
                                                        .get("/wp-content/plugins/gallery-videos/public/css/fontawesome-webfont.woff2?v=4.6.3"),
                                                http("request_4")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Medium.woff"),
                                                http("request_5")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Bold.woff"),
                                                http("request_6")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro-Black.woff"),
                                                http("request_7")
                                                        .get("/wp-content/themes/politmoscow/fonts/GothamPro.woff"),
                                                http("request_8")
                                                        .get("/wp-content/themes/politmoscow/img/header-icon1b.png"),
                                                http("request_9")
                                                        .get(uri1Ya + "/watch/94094106?wmode=7&page-url=https%3A%2F%2Fpolit-moscow.ru%2F%3Fs%3D%25D0%259F%25D0%25B0%25D0%25BD%25D0%25B4%25D0%25B0%2B&page-ref=https%3A%2F%2Fpolit-moscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.113%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.113%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.113%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A1070504886616%3Ahid%3A682148987%3Az%3A300%3Ai%3A20240830151433%3Aet%3A1725012873%3Ac%3A1%3Arn%3A210203119%3Arqn%3A81%3Au%3A172478250269200753%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C806%2C2%2C3%2C0%2C%2C62%2C0%2C%2C%2C%2C876%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1725012872528%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1725012873%3At%3A%D0%92%D1%8B%20%D0%B8%D1%81%D0%BA%D0%B0%D0%BB%D0%B8%20%D0%9F%D0%B0%D0%BD%D0%B4%D0%B0%20%E2%80%93%20%D0%9F%D0%9E%D0%9B%D0%98%D0%A2%D0%9C%D0%9E%D0%A1%D0%9A%D0%92%D0%90&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
                                                        .headers(headersPM14_9),
                                                http("request_10")
                                                        .get(uri1Ya + "/metrika/metrika_match.html")
                                                        .headers(headersPM14_10)
                                        )
                        );
//        Установки

                setUp(
                        scnPM01.injectOpen(
                                rampUsersPerSec(1).to(50).during(Duration.ofMinutes(25)),
                                constantUsersPerSec(50).during(Duration.ofHours(1))
                        ).protocols(httpProtocol_MainPage)
                        ,
                        scnPM02.injectOpen(
                                rampUsersPerSec(1).to(50).during(Duration.ofMinutes(25)),
                                constantUsersPerSec(50).during(Duration.ofHours(1))
                        ).protocols(httpProtocol_DistGol)
                        ,
                        scnPM03.injectOpen(
                                rampUsersPerSec(1).to(50).during(Duration.ofMinutes(25)),
                                constantUsersPerSec(50).during(Duration.ofHours(1))
                        ).protocols(httpProtocol_VyboryDuma)
                        ,
                        scnPM04.injectOpen(
                                rampUsersPerSec(1).to(50).during(Duration.ofMinutes(25)),
                                constantUsersPerSec(50).during(Duration.ofHours(1))
                        ).protocols(httpProtocol_IzbUch)
                        ,
                        scnPM05.injectOpen(
                                rampUsersPerSec(1).to(50).during(Duration.ofMinutes(25)),
                                constantUsersPerSec(50).during(Duration.ofHours(1))
                        ).protocols(httpProtocol_Candidates)
                        ,
                        scnPM06.injectOpen(
                                rampUsersPerSec(1).to(50).during(Duration.ofMinutes(25)),
                                constantUsersPerSec(50).during(Duration.ofHours(1))
                        ).protocols(httpProtocol_CandidatesMun)
                        ,
                        scnPM07.injectOpen(
                                rampUsersPerSec(1).to(50).during(Duration.ofMinutes(25)),
                                constantUsersPerSec(50).during(Duration.ofHours(1))
                        ).protocols(httpProtocol_ShtabPhoto1)
                        ,
                        scnPM08.injectOpen(
                                rampUsersPerSec(1).to(50).during(Duration.ofMinutes(25)),
                                constantUsersPerSec(50).during(Duration.ofHours(1))
                        ).protocols(httpProtocol_News1)
                        ,
                        scnPM09.injectOpen(
                                rampUsersPerSec(1).to(50).during(Duration.ofMinutes(25)),
                                constantUsersPerSec(50).during(Duration.ofHours(1))
                        ).protocols(httpProtocol_News2)
                        ,
                        scnPM10.injectOpen(
                                rampUsersPerSec(1).to(50).during(Duration.ofMinutes(25)),
                                constantUsersPerSec(50).during(Duration.ofHours(1))
                        ).protocols(httpProtocol_News3)
                        ,
                        scnPM11.injectOpen(
                                rampUsersPerSec(1).to(50).during(Duration.ofMinutes(25)),
                                constantUsersPerSec(50).during(Duration.ofHours(1))
                        ).protocols(httpProtocol_News4)
                        ,
                        scnPM12.injectOpen(
                                rampUsersPerSec(1).to(50).during(Duration.ofMinutes(25)),
                                constantUsersPerSec(50).during(Duration.ofHours(1))
                        ).protocols(httpProtocol_News5)
                        ,
                        scnPM13.injectOpen(
                                rampUsersPerSec(1).to(50).during(Duration.ofMinutes(25)),
                                constantUsersPerSec(50).during(Duration.ofHours(1))
                        ).protocols(httpProtocol_Videonew)
                        ,
                        scnPM14.injectOpen(
                                rampUsersPerSec(1).to(50).during(Duration.ofMinutes(25)),
                                constantUsersPerSec(50).during(Duration.ofHours(1))
                        ).protocols(httpProtocol_SearchPanda)
                );


        }
}

//