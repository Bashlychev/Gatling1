package voteGD.com;

import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import java.util.HashMap;
import java.util.Map;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.http;

public class CombinedSimulation extends Simulation {
    {
        //  Параметризация.
        String csrf = "5BxBixxo28b9-47OSomCb6eRLlf-yIFpkJwqOK066iKIKnPpcS2J9Ki-6L0A8_U_nsVXAY_x4xjC-R8L2gqdTA==";
        String contact = "NameTest";
        String message= "MessageTest";
        String captcha = "unpvoaj";

        int users_flood_MP1 = Integer.getInteger("users_flood_MP", 0); // it works
        int users_flood_MAC2 = Integer.getInteger("users_flood_MAC", 0); // KO = 100%
        int users_flood_RCM3 = Integer.getInteger("users_flood_RCM", 0); // KO = 100%
        int users_flood_MgdAC4 = Integer.getInteger("users_flood_MgdAC", 0); // KO = 100%
        int users_flood_MgdIU5 = Integer.getInteger("users_flood_MgdIU", 0); // KO = 100%
        int users_flood_NA6 = Integer.getInteger("users_flood_NA", 1); // KO = 100%
        int users_flood_RN1142_7 = Integer.getInteger("users_flood_RN1142", 0); // KO = 100%
        int users_flood_SWQ8 = Integer.getInteger("users_flood_SWQ", 0); // KO = 100% > Check validator resolution crashed: j.l.RuntimeException: Resource searchwithqueryab/0000_response.html not found

//        int users_flood_Message9 = Integer.getInteger("users_flood_Message", 0);
        int users_flood_TY10 = Integer.getInteger("users_flood_TY", 0); // it works
        int users_flood_Sub11 = Integer.getInteger("users_flood_Sub", 0); // it works



//Сценарий 1.Главная страница

        HttpProtocolBuilder httpProtocol_MainPage1 = http
                .baseUrl("https://votegd.com")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersMP_0 = new HashMap<>();
        headersMP_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersMP_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersMP_0.put("accept-language", "ru-RU,ru;q=0.9");
        headersMP_0.put("priority", "u=0, i");
        headersMP_0.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersMP_0.put("sec-ch-ua-mobile", "?0");
        headersMP_0.put("sec-ch-ua-platform", "Linux");
        headersMP_0.put("sec-fetch-dest", "document");
        headersMP_0.put("sec-fetch-mode", "navigate");
        headersMP_0.put("sec-fetch-site", "none");
        headersMP_0.put("sec-fetch-user", "?1");
        headersMP_0.put("upgrade-insecure-requests", "1");
        headersMP_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersMP_1 = new HashMap<>();
        headersMP_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
        headersMP_1.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersMP_1.put("sec-ch-ua-mobile", "?0");
        headersMP_1.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersMP_4 = new HashMap<>();
        headersMP_4.put("Origin", "https://votegd.com");
        headersMP_4.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
        headersMP_4.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersMP_4.put("sec-ch-ua-mobile", "?0");
        headersMP_4.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersMP_7 = new HashMap<>();
        headersMP_7.put("accept", "*/*");
        headersMP_7.put("accept-encoding", "gzip, deflate, br, zstd");
        headersMP_7.put("accept-language", "ru-RU,ru;q=0.9");
        headersMP_7.put("origin", "https://votegd.com");
        headersMP_7.put("priority", "u=1, i");
        headersMP_7.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersMP_7.put("sec-ch-ua-mobile", "?0");
        headersMP_7.put("sec-ch-ua-platform", "Linux");
        headersMP_7.put("sec-fetch-dest", "empty");
        headersMP_7.put("sec-fetch-mode", "cors");
        headersMP_7.put("sec-fetch-site", "cross-site");
        headersMP_7.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersMP_8 = new HashMap<>();
        headersMP_8.put("Upgrade-Insecure-Requests", "1");
        headersMP_8.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
        headersMP_8.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersMP_8.put("sec-ch-ua-mobile", "?0");
        headersMP_8.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersMP_9 = new HashMap<>();
        headersMP_9.put("accept", "*/*");
        headersMP_9.put("accept-encoding", "gzip, deflate, br, zstd");
        headersMP_9.put("accept-language", "ru-RU,ru;q=0.9");
        headersMP_9.put("origin", "https://votegd.com");
        headersMP_9.put("priority", "u=1, i");
        headersMP_9.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersMP_9.put("sec-ch-ua-mobile", "?0");
        headersMP_9.put("sec-ch-ua-platform", "Linux");
        headersMP_9.put("sec-fetch-dest", "empty");
        headersMP_9.put("sec-fetch-mode", "no-cors");
        headersMP_9.put("sec-fetch-site", "cross-site");
        headersMP_9.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        String uri2 = "https://fonts.gstatic.com/s/montserrat/v26";
//
//        String uri3 = "https://www.google-analytics.com/g/collect";
//
//        String uri4 = "https://mc.yandex.ru";

        ScenarioBuilder scnMP1 = scenario("MainPage")
                .exec(
                        http("request_0")
                                .get("/")
                                .headers(headersMP_0)
                                .resources(
//                                        http("request_1")
//                                                .get(uri4 + "/metrika/tag.js")
//                                                .headers(headers_1),
                                        http("request_2")
                                                .get(uri2 + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2"),
//                                        http("request_3")
//                                                .get(uri2 + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2"),
                                        http("request_4")
                                                .get("/layout/fonts/fontawesome-webfont.woff2?v=4.7.0")
                                                .headers(headersMP_4),
                                        http("request_5")
                                                .get("/layout/fonts/Linearicons.ttf")
                                                .headers(headersMP_4),
                                        http("request_6")
                                                .get("/favicon.ico")
                                                .headers(headersMP_1)
//                                        http("request_7")
//                                                .get(uri4 + "/watch/78422502?wmode=7&page-url=https%3A%2F%2Fvotegd.com%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1675303360769%3Ahid%3A768269281%3Az%3A300%3Ai%3A20240817140727%3Aet%3A1723885647%3Ac%3A1%3Arn%3A47083343%3Arqn%3A2%3Au%3A1723885632123336677%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C155%2C2%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1723885646901%3Agi%3AR0ExLjEuMTczNjQ1OTI0OS4xNzIzODg1NjMy%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723885647%3At%3AVote%D0%93%D0%94%20%D1%82%D0%B2%D0%BE%D0%B9%20%D1%81%D0%B0%D0%B9%D1%82%20%D0%BE%20%D0%BF%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%BE%D0%B9%20%D1%82%D1%83%D1%81%D0%BE%D0%B2%D0%BA%D0%B5%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D1%8B&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
//                                                .headers(headers_7),
//                                        http("request_8")
//                                                .get(uri4 + "/metrika/metrika_match.html")
//                                                .headers(headers_8)
                                )
                );

// Сценарий 2.Кандидаты в муниципальные депутаты ТиНАО 2024.


        HttpProtocolBuilder httpProtocol_MunicipalAllCandidates2 = http
                .baseUrl("https://votegd.com")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersMAC_0 = new HashMap<>();
        headersMAC_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersMAC_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersMAC_0.put("accept-language", "ru-RU,ru;q=0.9");
        headersMAC_0.put("priority", "u=0, i");
        headersMAC_0.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersMAC_0.put("sec-ch-ua-mobile", "?0");
        headersMAC_0.put("sec-ch-ua-platform", "Linux");
        headersMAC_0.put("sec-fetch-dest", "document");
        headersMAC_0.put("sec-fetch-mode", "navigate");
        headersMAC_0.put("sec-fetch-site", "same-origin");
        headersMAC_0.put("sec-fetch-user", "?1");
        headersMAC_0.put("upgrade-insecure-requests", "1");
        headersMAC_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersMAC_1 = new HashMap<>();
        headersMAC_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
        headersMAC_1.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersMAC_1.put("sec-ch-ua-mobile", "?0");
        headersMAC_1.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersMAC_7 = new HashMap<>();
        headersMAC_7.put("accept", "*/*");
        headersMAC_7.put("accept-encoding", "gzip, deflate, br, zstd");
        headersMAC_7.put("accept-language", "ru-RU,ru;q=0.9");
        headersMAC_7.put("origin", "https://votegd.com");
        headersMAC_7.put("priority", "u=1, i");
        headersMAC_7.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersMAC_7.put("sec-ch-ua-mobile", "?0");
        headersMAC_7.put("sec-ch-ua-platform", "Linux");
        headersMAC_7.put("sec-fetch-dest", "empty");
        headersMAC_7.put("sec-fetch-mode", "cors");
        headersMAC_7.put("sec-fetch-site", "cross-site");
        headersMAC_7.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersMAC_8 = new HashMap<>();
        headersMAC_8.put("Upgrade-Insecure-Requests", "1");
        headersMAC_8.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
        headersMAC_8.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersMAC_8.put("sec-ch-ua-mobile", "?0");
        headersMAC_8.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersMAC_9 = new HashMap<>();
        headersMAC_9.put("accept", "*/*");
        headersMAC_9.put("accept-encoding", "gzip, deflate, br, zstd");
        headersMAC_9.put("accept-language", "ru-RU,ru;q=0.9");
        headersMAC_9.put("origin", "https://votegd.com");
        headersMAC_9.put("priority", "u=1, i");
        headersMAC_9.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersMAC_9.put("sec-ch-ua-mobile", "?0");
        headersMAC_9.put("sec-ch-ua-platform", "Linux");
        headersMAC_9.put("sec-fetch-dest", "empty");
        headersMAC_9.put("sec-fetch-mode", "no-cors");
        headersMAC_9.put("sec-fetch-site", "cross-site");
        headersMAC_9.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        String urisos = "https://sosenskoe-omsu.ru/upload/iblock/8ac/%D0%93%D1%83%D1%89%D0%B8%D0%BD%D0%B0%20%D0%98%D1%80%D0%B8%D0%BD%D0%B0%20%D0%95%D0%B2%D0%B3%D0%B5%D0%BD%D1%8C%D0%B5%D0%B2%D0%BD%D0%B0%20%D0%9A%D0%BE%D0%BC%D0%BC%D1%83%D0%BD%D0%B0%D1%80%D0%BA%D0%B0%20%D0%BC%D0%B8%D0%BA%D1%80%D0%BE%D1%80%D0%B0%D0%B9%D0%BE%D0%BD%20%D0%AD%D0%B4%D0%B0%D0%BB%D1%8C%D0%B3%D0%BE%201.jpg";

        String uri3 = "https://fonts.gstatic.com/s/montserrat/v26";

        String uri4 = "https://www.google-analytics.com/g/collect";

        String uri5 = "https://mc.yandex.ru";

        ScenarioBuilder scnMAC2 = scenario("MunicipalAllCandidates")
                .exec(
                        http("request_0")
                                .get("/municipal/2024/")
                                .headers(headersMAC_0)
                                .check(bodyBytes().is(RawFileBody("municipalallcandidates/0000_response.html")))
                                .resources(
                                        http("request_1")
                                                .get(uri5 + "/metrika/tag.js")
                                                .headers(headersMAC_1)
                                                .check(bodyBytes().is(RawFileBody("municipalallcandidates/0001_response.js"))),
                                        http("request_2")
                                                .get(uri3 + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2"),
                                        http("request_3")
                                                .get(uri3 + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2"),
                                        http("request_4")
                                                .get("/layout/fonts/fontawesome-webfont.woff2?v=4.7.0"),
                                        http("request_5")
                                                .get("/layout/fonts/Linearicons.ttf"),
                                        http("request_6")
                                                .get(urisos)
                                                .headers(headersMAC_1)
                                                .check(bodyBytes().is(RawFileBody("municipalallcandidates/0006_response.jpeg"))),
                                        http("request_7")
                                                .get(uri5 + "/watch/78422502?wmode=7&page-url=https%3A%2F%2Fvotegd.com%2Fmunicipal%2F2024%2F&page-ref=https%3A%2F%2Fvotegd.com%2Fmunicipal%2Ffaq%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1675303360769%3Ahid%3A290289531%3Az%3A300%3Ai%3A20240817142158%3Aet%3A1723886519%3Ac%3A1%3Arn%3A611626643%3Arqn%3A33%3Au%3A1723885632123336677%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C227%2C5%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1723886518302%3Agi%3AR0ExLjEuMTczNjQ1OTI0OS4xNzIzODg1NjMy%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723886519%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%B2%20%D0%BC%D1%83%D0%BD%D0%B8%D1%86%D0%B8%D0%BF%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D0%B5%20%D0%B4%D0%B5%D0%BF%D1%83%D1%82%D0%B0%D1%82%D1%8B%20%D0%A2%D0%B8%D0%9D%D0%90%D0%9E%202024%2C%20%D1%81%D0%BF%D0%B8%D1%81%D0%BE%D0%BA%20%D0%BA%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D0%BE%D0%B2%20%7C%20VoteGD&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
                                                .headers(headersMAC_7),
                                        http("request_8")
                                                .get(uri5 + "/metrika/metrika_match.html")
                                                .headers(headersMAC_8)
                                )
                );

//    Сценарий 3.Рандомный кандидат Бусаров Марсель Филиппович 7766.

        HttpProtocolBuilder httpProtocol_RandomCandidateMarsel3 = http
                .baseUrl("https://votegd.com")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersRCM_0 = new HashMap<>();
        headersRCM_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersRCM_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersRCM_0.put("accept-language", "ru-RU,ru;q=0.9");
        headersRCM_0.put("priority", "u=0, i");
        headersRCM_0.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersRCM_0.put("sec-ch-ua-mobile", "?0");
        headersRCM_0.put("sec-ch-ua-platform", "Linux");
        headersRCM_0.put("sec-fetch-dest", "document");
        headersRCM_0.put("sec-fetch-mode", "navigate");
        headersRCM_0.put("sec-fetch-site", "same-origin");
        headersRCM_0.put("sec-fetch-user", "?1");
        headersRCM_0.put("upgrade-insecure-requests", "1");
        headersRCM_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersRCM_1 = new HashMap<>();
        headersRCM_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
        headersRCM_1.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersRCM_1.put("sec-ch-ua-mobile", "?0");
        headersRCM_1.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersRCM_6 = new HashMap<>();
        headersRCM_6.put("accept", "*/*");
        headersRCM_6.put("accept-encoding", "gzip, deflate, br, zstd");
        headersRCM_6.put("accept-language", "ru-RU,ru;q=0.9");
        headersRCM_6.put("origin", "https://votegd.com");
        headersRCM_6.put("priority", "u=1, i");
        headersRCM_6.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersRCM_6.put("sec-ch-ua-mobile", "?0");
        headersRCM_6.put("sec-ch-ua-platform", "Linux");
        headersRCM_6.put("sec-fetch-dest", "empty");
        headersRCM_6.put("sec-fetch-mode", "cors");
        headersRCM_6.put("sec-fetch-site", "cross-site");
        headersRCM_6.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersRCM_8 = new HashMap<>();
        headersRCM_8.put("accept", "*/*");
        headersRCM_8.put("accept-encoding", "gzip, deflate, br, zstd");
        headersRCM_8.put("accept-language", "ru-RU,ru;q=0.9");
        headersRCM_8.put("origin", "https://votegd.com");
        headersRCM_8.put("priority", "u=1, i");
        headersRCM_8.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersRCM_8.put("sec-ch-ua-mobile", "?0");
        headersRCM_8.put("sec-ch-ua-platform", "Linux");
        headersRCM_8.put("sec-fetch-dest", "empty");
        headersRCM_8.put("sec-fetch-mode", "no-cors");
        headersRCM_8.put("sec-fetch-site", "cross-site");
        headersRCM_8.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

//        String uri2 = "https://fonts.gstatic.com/s/montserrat/v26";
//
//        String uri3 = "https://www.google-analytics.com/g/collect";
//
//        String uri4 = "https://mc.yandex.ru";

        ScenarioBuilder scnRCM3 = scenario("RandomCandidateMarsel")
                .exec(
                        http("request_0")
                                .get("/people/7766-busarov-marsel/")
                                .headers(headersRCM_0)
                                .check(bodyBytes().is(RawFileBody("randomcandidatemarsel/0000_response.html")))
                                .resources(
//                                        http("request_1")
//                                                .get(uri4 + "/metrika/tag.js")
//                                                .headers(headersRCM_1)
//                                                .check(bodyBytes().is(RawFileBody("randomcandidatemarsel/0001_response.js"))),
                                        http("request_2")
                                                .get(uri2 + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2"),
                                        http("request_3")
                                                .get(uri2 + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2"),
                                        http("request_4")
                                                .get("/layout/fonts/fontawesome-webfont.woff2?v=4.7.0"),
                                        http("request_5")
                                                .get("/favicon.ico")
                                                .headers(headersRCM_1)
                                                .check(bodyBytes().is(RawFileBody("randomcandidatemarsel/0005_response.ico")))
//                                        http("request_6")
//                                                .get(uri4 + "/watch/78422502?wmode=7&page-url=https%3A%2F%2Fvotegd.com%2Fpeople%2F7766-busarov-marsel%2F&page-ref=https%3A%2F%2Fvotegd.com%2Fmunicipal%2F2024%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1675303360769%3Ahid%3A384945393%3Az%3A300%3Ai%3A20240817143124%3Aet%3A1723887084%3Ac%3A1%3Arn%3A670976498%3Arqn%3A63%3Au%3A1723885632123336677%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C114%2C1%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1723887084192%3Agi%3AR0ExLjEuMTczNjQ1OTI0OS4xNzIzODg1NjMy%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723887084%3At%3A%D0%91%D1%83%D1%81%D0%B0%D1%80%D0%BE%D0%B2%20%D0%9C%D0%B0%D1%80%D1%81%D0%B5%D0%BB%D1%8C%20%D0%A4%D0%B8%D0%BB%D0%B8%D0%BF%D0%BF%D0%BE%D0%B2%D0%B8%D1%87%20%7C%20%D0%9F%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D0%BA%D0%B8%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D1%8B&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
//                                                .headers(headersRCM_6),
//                                        http("request_7")
//                                                .get(uri4 + "/watch/78422502/1?wmode=7&page-url=https%3A%2F%2Fvotegd.com%2Fpeople%2F7766-busarov-marsel%2F&page-ref=https%3A%2F%2Fvotegd.com%2Fmunicipal%2F2024%2F&charset=utf-8&uah=chu%0A%22Not%29A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not%29A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1675303360769%3Ahid%3A384945393%3Az%3A300%3Ai%3A20240817143124%3Aet%3A1723887084%3Ac%3A1%3Arn%3A670976498%3Arqn%3A63%3Au%3A1723885632123336677%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C114%2C1%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1723887084192%3Agi%3AR0ExLjEuMTczNjQ1OTI0OS4xNzIzODg1NjMy%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723887084%3At%3A%D0%91%D1%83%D1%81%D0%B0%D1%80%D0%BE%D0%B2%20%D0%9C%D0%B0%D1%80%D1%81%D0%B5%D0%BB%D1%8C%20%D0%A4%D0%B8%D0%BB%D0%B8%D0%BF%D0%BF%D0%BE%D0%B2%D0%B8%D1%87%20%7C%20%D0%9F%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D0%BA%D0%B8%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D1%8B&t=gdpr%2814%29clc%280-0-0%29rqnt%281%29aw%281%29rcm%280%29cdl%28na%29eco%2821037568%29ti%281%29&redirnss=1")
//                                                .headers(headersRCM_6)
//                                                .check(bodyBytes().is(RawFileBody("randomcandidatemarsel/0007_response.json")))
                                )
                );

//        Сценарий 4.Кандидаты в Мосгордуму 2024.

        HttpProtocolBuilder httpProtocol_MgdAllCandidates4 = http
                .baseUrl("https://votegd.com")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersMgdAC_0 = new HashMap<>();
        headersMgdAC_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersMgdAC_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersMgdAC_0.put("accept-language", "ru-RU,ru;q=0.9");
        headersMgdAC_0.put("priority", "u=0, i");
        headersMgdAC_0.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersMgdAC_0.put("sec-ch-ua-mobile", "?0");
        headersMgdAC_0.put("sec-ch-ua-platform", "Linux");
        headersMgdAC_0.put("sec-fetch-dest", "document");
        headersMgdAC_0.put("sec-fetch-mode", "navigate");
        headersMgdAC_0.put("sec-fetch-site", "same-origin");
        headersMgdAC_0.put("sec-fetch-user", "?1");
        headersMgdAC_0.put("upgrade-insecure-requests", "1");
        headersMgdAC_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersMgdAC_1 = new HashMap<>();
        headersMgdAC_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
        headersMgdAC_1.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersMgdAC_1.put("sec-ch-ua-mobile", "?0");
        headersMgdAC_1.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersMgdAC_8 = new HashMap<>();
        headersMgdAC_8.put("accept", "*/*");
        headersMgdAC_8.put("accept-encoding", "gzip, deflate, br, zstd");
        headersMgdAC_8.put("accept-language", "ru-RU,ru;q=0.9");
        headersMgdAC_8.put("origin", "https://votegd.com");
        headersMgdAC_8.put("priority", "u=1, i");
        headersMgdAC_8.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersMgdAC_8.put("sec-ch-ua-mobile", "?0");
        headersMgdAC_8.put("sec-ch-ua-platform", "Linux");
        headersMgdAC_8.put("sec-fetch-dest", "empty");
        headersMgdAC_8.put("sec-fetch-mode", "cors");
        headersMgdAC_8.put("sec-fetch-site", "cross-site");
        headersMgdAC_8.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersMgdAC_10 = new HashMap<>();
        headersMgdAC_10.put("accept", "*/*");
        headersMgdAC_10.put("accept-encoding", "gzip, deflate, br, zstd");
        headersMgdAC_10.put("accept-language", "ru-RU,ru;q=0.9");
        headersMgdAC_10.put("origin", "https://votegd.com");
        headersMgdAC_10.put("priority", "u=1, i");
        headersMgdAC_10.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersMgdAC_10.put("sec-ch-ua-mobile", "?0");
        headersMgdAC_10.put("sec-ch-ua-platform", "Linux");
        headersMgdAC_10.put("sec-fetch-dest", "empty");
        headersMgdAC_10.put("sec-fetch-mode", "no-cors");
        headersMgdAC_10.put("sec-fetch-site", "cross-site");
        headersMgdAC_10.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

//        String uri2 = "https://fonts.gstatic.com/s/montserrat/v26";
//
//        String uri3 = "https://www.google-analytics.com/g/collect";
//
//        String uri4 = "https://mc.yandex.ru";

        ScenarioBuilder scnMgdAC4 = scenario("MgdAllCandidates")
                .exec(
                        http("request_0")
                                .get("/mgd/2024/candidate/")
                                .headers(headersMgdAC_0)
                                .check(bodyBytes().is(RawFileBody("mgdallcandidates/0000_response.html")))
                                .resources(
//                                        http("request_1")
//                                                .get(uri4 + "/metrika/tag.js")
//                                                .headers(headers_1)
//                                                .check(bodyBytes().is(RawFileBody("mgdallcandidates/0001_response.js"))),
//                                        http("request_2")
//                                                .get(uri2 + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2"),
//                                        http("request_3")
//                                                .get(uri2 + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2"),
                                        http("request_4")
                                                .get("/layout/fonts/fontawesome-webfont.woff2?v=4.7.0"),
                                        http("request_5")
                                                .get("/layout/fonts/Linearicons.ttf"),
                                        http("request_6")
                                                .get("/img/shol.jpg")
                                                .headers(headersMgdAC_1)
                                                .check(bodyBytes().is(RawFileBody("mgdallcandidates/0006_response.jpeg"))),
                                        http("request_7")
                                                .get("/favicon.ico")
                                                .headers(headersMgdAC_1)
                                                .check(bodyBytes().is(RawFileBody("mgdallcandidates/0007_response.ico")))
//                                        http("request_8")
//                                                .get(uri4 + "/watch/78422502?wmode=7&page-url=https%3A%2F%2Fvotegd.com%2Fmgd%2F2024%2Fcandidate%2F&page-ref=https%3A%2F%2Fvotegd.com%2Fmunicipal%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1675303360769%3Ahid%3A938409796%3Az%3A300%3Ai%3A20240817144113%3Aet%3A1723887673%3Ac%3A1%3Arn%3A313718389%3Arqn%3A90%3Au%3A1723885632123336677%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C249%2C9%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1723887672668%3Agi%3AR0ExLjEuMTczNjQ1OTI0OS4xNzIzODg1NjMy%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723887673%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%B3%D0%BE%D1%80%D0%B4%D1%83%D0%BC%D1%83%202024%2C%20%D1%81%D0%BF%D0%B8%D1%81%D0%BE%D0%BA%20%D0%BA%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D0%BE%D0%B2%20%D0%B2%20%D0%B4%D0%B5%D0%BF%D1%83%D1%82%D0%B0%D1%82%D1%8B%20%D0%9C%D0%93%D0%94%20%7C%20VoteGD&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
//                                                .headers(headers_8),
//                                        http("request_9")
//                                                .get(uri4 + "/watch/78422502/1?wmode=7&page-url=https%3A%2F%2Fvotegd.com%2Fmgd%2F2024%2Fcandidate%2F&page-ref=https%3A%2F%2Fvotegd.com%2Fmunicipal%2F&charset=utf-8&uah=chu%0A%22Not%29A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not%29A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1675303360769%3Ahid%3A938409796%3Az%3A300%3Ai%3A20240817144113%3Aet%3A1723887673%3Ac%3A1%3Arn%3A313718389%3Arqn%3A90%3Au%3A1723885632123336677%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C249%2C9%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1723887672668%3Agi%3AR0ExLjEuMTczNjQ1OTI0OS4xNzIzODg1NjMy%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723887673%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%B3%D0%BE%D1%80%D0%B4%D1%83%D0%BC%D1%83%202024%2C%20%D1%81%D0%BF%D0%B8%D1%81%D0%BE%D0%BA%20%D0%BA%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D0%BE%D0%B2%20%D0%B2%20%D0%B4%D0%B5%D0%BF%D1%83%D1%82%D0%B0%D1%82%D1%8B%20%D0%9C%D0%93%D0%94%20%7C%20VoteGD&t=gdpr%2814%29clc%280-0-0%29rqnt%281%29aw%281%29rcm%280%29cdl%28na%29eco%2821037568%29ti%281%29&redirnss=1")
//                                                .headers(headers_8)
//                                                .check(bodyBytes().is(RawFileBody("mgdallcandidates/0009_response.json")))
                                )
                );
//        Сценарий 5. Избирательные участки Москвы и ТиНАО.

        HttpProtocolBuilder httpProtocol_MgdIzbiratUchastki5 = http
                .baseUrl("https://votegd.com")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersIU_0 = new HashMap<>();
        headersIU_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersIU_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersIU_0.put("accept-language", "ru-RU,ru;q=0.9");
        headersIU_0.put("priority", "u=0, i");
        headersIU_0.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersIU_0.put("sec-ch-ua-mobile", "?0");
        headersIU_0.put("sec-ch-ua-platform", "Linux");
        headersIU_0.put("sec-fetch-dest", "document");
        headersIU_0.put("sec-fetch-mode", "navigate");
        headersIU_0.put("sec-fetch-site", "same-origin");
        headersIU_0.put("sec-fetch-user", "?1");
        headersIU_0.put("upgrade-insecure-requests", "1");
        headersIU_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersIU_1 = new HashMap<>();
        headersIU_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
        headersIU_1.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersIU_1.put("sec-ch-ua-mobile", "?0");
        headersIU_1.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersIU_6 = new HashMap<>();
        headersIU_6.put("accept", "*/*");
        headersIU_6.put("accept-encoding", "gzip, deflate, br, zstd");
        headersIU_6.put("accept-language", "ru-RU,ru;q=0.9");
        headersIU_6.put("origin", "https://votegd.com");
        headersIU_6.put("priority", "u=1, i");
        headersIU_6.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersIU_6.put("sec-ch-ua-mobile", "?0");
        headersIU_6.put("sec-ch-ua-platform", "Linux");
        headersIU_6.put("sec-fetch-dest", "empty");
        headersIU_6.put("sec-fetch-mode", "cors");
        headersIU_6.put("sec-fetch-site", "cross-site");
        headersIU_6.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersIU_7 = new HashMap<>();
        headersIU_7.put("Origin", "https://yandex.ru");
        headersIU_7.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
        headersIU_7.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersIU_7.put("sec-ch-ua-mobile", "?0");
        headersIU_7.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersIU_10 = new HashMap<>();
        headersIU_10.put("Upgrade-Insecure-Requests", "1");
        headersIU_10.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
        headersIU_10.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersIU_10.put("sec-ch-ua-mobile", "?0");
        headersIU_10.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersIU_11 = new HashMap<>();
        headersIU_11.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersIU_11.put("accept-encoding", "gzip, deflate, br, zstd");
        headersIU_11.put("accept-language", "ru-RU,ru;q=0.9");
        headersIU_11.put("priority", "u=0, i");
        headersIU_11.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersIU_11.put("sec-ch-ua-mobile", "?0");
        headersIU_11.put("sec-ch-ua-platform", "Linux");
        headersIU_11.put("sec-fetch-dest", "iframe");
        headersIU_11.put("sec-fetch-mode", "navigate");
        headersIU_11.put("sec-fetch-site", "cross-site");
        headersIU_11.put("upgrade-insecure-requests", "1");
        headersIU_11.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersIU_29 = new HashMap<>();
        headersIU_29.put("accept", "*/*");
        headersIU_29.put("accept-encoding", "gzip, deflate, br, zstd");
        headersIU_29.put("accept-language", "ru-RU,ru;q=0.9");
        headersIU_29.put("origin", "https://yandex.ru");
        headersIU_29.put("priority", "u=1, i");
        headersIU_29.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersIU_29.put("sec-ch-ua-mobile", "?0");
        headersIU_29.put("sec-ch-ua-platform", "Linux");
        headersIU_29.put("sec-fetch-dest", "empty");
        headersIU_29.put("sec-fetch-mode", "cors");
        headersIU_29.put("sec-fetch-site", "same-site");
        headersIU_29.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersIU_31 = new HashMap<>();
        headersIU_31.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersIU_63 = new HashMap<>();
        headersIU_63.put("accept", "*/*");
        headersIU_63.put("accept-encoding", "gzip, deflate, br, zstd");
        headersIU_63.put("accept-language", "ru-RU,ru;q=0.9");
        headersIU_63.put("origin", "https://votegd.com");
        headersIU_63.put("priority", "u=1, i");
        headersIU_63.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersIU_63.put("sec-ch-ua-mobile", "?0");
        headersIU_63.put("sec-ch-ua-platform", "Linux");
        headersIU_63.put("sec-fetch-dest", "empty");
        headersIU_63.put("sec-fetch-mode", "no-cors");
        headersIU_63.put("sec-fetch-site", "cross-site");
        headersIU_63.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

//        String uri2 = "https://yandex.ru/map-widget/v1";

//        String uri3 = "https://core-renderer-tiles.maps.yandex.net";
//
//        String uri4 = "https://fonts.gstatic.com/s/montserrat/v26";

//        String uri5 = "https://yastatic.net";
//
//        String uri6 = "https://www.google-analytics.com/g/collect";
//
//        String uri7 = "https://mc.yandex.ru";

        ScenarioBuilder scnMgdIU5 = scenario("MgdIzbiratUchastki")
                .exec(
                        http("request_0")
                                .get("/mgd/2024/izbiratelnye-uchastki/")
                                .headers(headersIU_0)
                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0000_response.html")))
                                .resources(
//                                        http("request_1")
//                                                .get(uri7 + "/metrika/tag.js")
//                                                .headers(headersIU_1)
//                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0001_response.js"))),
                                        http("request_2")
                                                .get(uri4 + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2"),
                                        http("request_3")
                                                .get(uri4 + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2"),
                                        http("request_4")
                                                .get("/layout/fonts/fontawesome-webfont.woff2?v=4.7.0"),
                                        http("request_5")
                                                .get("/layout/fonts/Linearicons.ttf"),
//                                        http("request_6")
//                                                .get(uri7 + "/watch/78422502?wmode=7&page-url=https%3A%2F%2Fvotegd.com%2Fmgd%2F2024%2Fizbiratelnye-uchastki%2F&page-ref=https%3A%2F%2Fvotegd.com%2Fmgd%2F2024%2Fdistrict%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1675303360769%3Ahid%3A488701907%3Az%3A300%3Ai%3A20240817145028%3Aet%3A1723888229%3Ac%3A1%3Arn%3A492107975%3Arqn%3A106%3Au%3A1723885632123336677%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C90%2C1%2C3%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1723888228467%3Agi%3AR0ExLjEuMTczNjQ1OTI0OS4xNzIzODg1NjMy%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723888229%3At%3A%D0%98%D0%B7%D0%B1%D0%B8%D1%80%D0%B0%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D1%8B%D0%B5%20%D1%83%D1%87%D0%B0%D1%81%D1%82%D0%BA%D0%B8%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D1%8B%20%D0%B8%20%D0%A2%D0%B8%D0%9D%D0%90%D0%9E%2C%20%D0%BD%D0%B0%D0%B9%D1%82%D0%B8%20%D0%B8%D0%B7%D0%B1%D0%B8%D1%80%D0%B0%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D1%8B%D0%B9%20%D1%83%D1%87%D0%B0%D1%81%D1%82%D0%BE%D0%BA%20%D0%BF%D0%BE%20%D0%B0%D0%B4%D1%80%D0%B5%D1%81%D1%83%20%7C%20VoteGD&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
//                                                .headers(headersIU_6),
//                                        http("request_7")
//                                                .get(uri5 + "/react/18.2.0/react-with-dom.min.js")
//                                                .headers(headersIU_7)
//                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0007_response.js"))),
//                                        http("request_8")
//                                                .get(uri5 + "/s3/front-maps-static/maps-front-maps/build/client/map-widget/chunks/map-widget-base/b7997d09cf76c84ddb30.yandex.ru.js")
//                                                .headers(headersIU_7)
//                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0008_response.js"))),
//                                        http("request_9")
//                                                .get(uri5 + "/s3/front-maps-static/maps-front-maps/build/client/map-widget/chunks/map-widget-app/53973c938b1b5e99d06b.yandex.ru.js")
//                                                .headers(headersIU_7)
//                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0009_response.js"))),
//                                        http("request_10")
//                                                .get(uri7 + "/metrika/metrika_match.html")
//                                                .headers(headersIU_10),
                                        http("request_11")
                                                .get(uri2 + "/?lang=ru_RU&scroll=true&source=constructor-api&um=constructor%3A174a1dc6fd94994d2d678bdaf68a6995b2ee8570350e21dcfdf7d34dfa265ca0")
                                                .headers(headersIU_11)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0011_response.html"))),
                                        http("request_12")
                                                .get("/favicon.ico")
                                                .headers(headersIU_1)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0012_response.ico"))),
//                                        http("request_13")
//                                                .get(uri7 + "/metrika/tag_turbo.js")
//                                                .headers(headersIU_7)
//                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0013_response.js"))),
//                                        http("request_14")
//                                                .get(uri5 + "/s3/front-maps-static/maps-front-maps/build/client/map-widget/chunks/ymaps/e78769675abf0f02e6ea.css")
//                                                .headers(headersIU_7)
//                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0014_response.css"))),
//                                        http("request_15")
//                                                .get(uri5 + "/s3/front-maps-static/maps-front-maps/build/client/map-widget/chunks/ymaps/183d1189d7d05a8929fc.yandex.ru.js")
//                                                .headers(headersIU_7)
//                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0015_response.js"))),
//                                        http("request_16")
//                                                .get(uri7 + "/metrika/advert.gif")
//                                                .headers(headersIU_1)
//                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0016_response.gif"))),
//                                        http("request_17")
//                                                .get(uri5 + "/s3/front-maps-static/maps-front-maps/build/client/map-widget/chunks/ymaps-vector/ee842efbec35c2934006.yandex.ru.js")
//                                                .headers(headersIU_7)
//                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0017_response.js"))),
//                                        http("request_18")
//                                                .get(uri5 + "/s3/front-maps-static/maps-front-maps/static/v48/icons/core/logo-24.svg")
//                                                .headers(headersIU_1)
//                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0018_response.svg"))),
//                                        http("request_19")
//                                                .get(uri5 + "/s3/front-maps-static/maps-front-maps/_/fd161c881e6392111418a1036fe1188e.svg")
//                                                .headers(headersIU_1)
//                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0019_response.svg"))),
                                        http("request_20")
                                                .get(uri3 + "/tiles?l=map&v=24.08.14-3-b240606123130&x=309&y=161&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                .headers(headersIU_1)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0020_response.png"))),
                                        http("request_21")
                                                .get(uri3 + "/tiles?l=map&v=24.08.14-3-b240606123130&x=308&y=161&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                .headers(headersIU_1)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0021_response.png"))),
                                        http("request_22")
                                                .get(uri3 + "/tiles?l=map&v=24.08.14-3-b240606123130&x=309&y=160&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                .headers(headersIU_1)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0022_response.png"))),
                                        http("request_23")
                                                .get(uri3 + "/tiles?l=map&v=24.08.14-3-b240606123130&x=308&y=160&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                .headers(headersIU_1)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0023_response.png"))),
                                        http("request_24")
                                                .get(uri3 + "/tiles?l=map&v=24.08.14-3-b240606123130&x=309&y=162&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                .headers(headersIU_1)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0024_response.png"))),
                                        http("request_25")
                                                .get(uri3 + "/tiles?l=map&v=24.08.14-3-b240606123130&x=310&y=161&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                .headers(headersIU_1)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0025_response.png"))),
                                        http("request_26")
                                                .get(uri3 + "/tiles?l=map&v=24.08.14-3-b240606123130&x=308&y=162&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                .headers(headersIU_1)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0026_response.png"))),
                                        http("request_27")
                                                .get(uri3 + "/tiles?l=map&v=24.08.14-3-b240606123130&x=310&y=160&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                .headers(headersIU_1)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0027_response.png"))),
                                        http("request_28")
                                                .get(uri3 + "/tiles?l=map&v=24.08.14-3-b240606123130&x=310&y=162&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp&ads=enabled")
                                                .headers(headersIU_1)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0028_response.png"))),
//                                        http("request_29")
//                                                .get(uri7 + "/watch/44120344?wmode=7&page-url=https%3A%2F%2Fyandex.ru%2Fmap-widget%2Fv1%2F%3Flang%3Dru_RU%26scroll%3Dtrue%26source%3Dconstructor-api%26um%3Dconstructor%253A174a1dc6fd94994d2d678bdaf68a6995b2ee8570350e21dcfdf7d34dfa265ca0&page-ref=https%3A%2F%2Fvotegd.com%2F&nohit=1&charset=utf-8&ut=noindex&browser-info=pv%3A1%3Avf%3A51ws7ei066ityj92vuvd23adxu%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1396948963104%3Ahid%3A583198923%3Az%3A300%3Ai%3A20240817145029%3Aet%3A1723888229%3Ac%3A1%3Arn%3A983645160%3Au%3A172388805013444438%3Aw%3A500x400%3As%3A1920x1080x24%3Ask%3A1%3Aifr%3A1%3Arqnl%3A1%3Ast%3A1723888229%3At%3Amap%20frame&t=gdpr(8-0)mc(h-1)cdl(na)eco(25632)ti(2)")
//                                                .headers(headersIU_29),
//                                        http("request_30")
//                                                .get(uri7 + "/watch/44120344?page-url=https%3A%2F%2Fyandex.ru%2Fmap-widget%2Fv1%2F%3Flang%3Dru_RU%26scroll%3Dtrue%26source%3Dconstructor-api%26um%3Dconstructor%253A174a1dc6fd94994d2d678bdaf68a6995b2ee8570350e21dcfdf7d34dfa265ca0&page-ref=https%3A%2F%2Fvotegd.com%2F&charset=utf-8&ut=noindex&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Aar%3A1%3Avf%3A51ws7ei066ityj92vuvd23adxu%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1396948963104%3Ahid%3A583198923%3Az%3A300%3Ai%3A20240817145029%3Aet%3A1723888229%3Ac%3A1%3Arn%3A159854778%3Arqn%3A2%3Au%3A172388805013444438%3Aw%3A500x400%3As%3A1920x1080x24%3Ask%3A1%3Aifr%3A1%3Afp%3A454%3Ads%3A0%2C0%2C120%2C356%2C2%2C0%2C%2C8%2C0%2C510%2C511%2C0%2C510%3Arqnl%3A1%3Ast%3A1723888230%3At%3Amap%20frame&t=gdpr(8-0)mc(h-1)cdl(na)eco(25632)ti(2)")
//                                                .headers(headersIU_29),
                                        http("request_31")
                                                .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=154&y=81&z=8&zmin=9&zmax=9&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0031_response.dat"))),
                                        http("request_32")
                                                .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=155&y=81&z=8&zmin=9&zmax=9&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0032_response.dat"))),
                                        http("request_33")
                                                .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=155&y=80&z=8&zmin=9&zmax=9&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0033_response.dat"))),
                                        http("request_34")
                                                .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=76&y=40&z=7&zmin=8&zmax=8&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0034_response.dat"))),
                                        http("request_35")
                                                .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=76&y=39&z=7&zmin=8&zmax=8&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0035_response.dat"))),
                                        http("request_36")
                                                .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=78&y=39&z=7&zmin=8&zmax=8&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0036_response.dat"))),
                                        http("request_37")
                                                .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=76&y=41&z=7&zmin=8&zmax=8&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0037_response.dat"))),
                                        http("request_38")
                                                .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=77&y=41&z=7&zmin=8&zmax=8&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0038_response.dat"))),
                                        http("request_39")
                                                .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=78&y=41&z=7&zmin=8&zmax=8&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0039_response.dat"))),
                                        http("request_40")
                                                .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=78&y=40&z=7&zmin=8&zmax=8&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0040_response.dat"))),
                                        http("request_41")
                                                .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=77&y=39&z=7&zmin=8&zmax=8&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0041_response.dat"))),
                                        http("request_42")
                                                .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=915f3cad32f446e5df58ef8e63b6041edf0768ad~~3&range=512,640&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0042_response.dat"))),
                                        http("request_43")
                                                .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=915f3cad32f446e5df58ef8e63b6041edf0768ad~~3&range=384,512&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0043_response.dat"))),
                                        http("request_44")
                                                .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=915f3cad32f446e5df58ef8e63b6041edf0768ad~~3&range=0,128&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0044_response.dat"))),
                                        http("request_45")
                                                .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=87931be60dd7d1ced983a8030b11bd153c5e45ed~~3&range=0,128&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0045_response.dat"))),
                                        http("request_46")
                                                .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=87931be60dd7d1ced983a8030b11bd153c5e45ed~~3&range=512,640&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0046_response.dat"))),
                                        http("request_47")
                                                .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=87931be60dd7d1ced983a8030b11bd153c5e45ed~~3&range=128,256&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0047_response.dat"))),
                                        http("request_48")
                                                .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=9f08a647bf335ac646f57a03dbb3a12bd8cab4d0~~3&range=512,640&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0048_response.dat"))),
                                        http("request_49")
                                                .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=8db20f4aff1fcc33f4eebad812e55d403dfaa7ad~~3&range=512,640&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0049_response.dat"))),
                                        http("request_50")
                                                .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=8db20f4aff1fcc33f4eebad812e55d403dfaa7ad~~3&range=0,128&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0050_response.dat"))),
                                        http("request_51")
                                                .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=8db20f4aff1fcc33f4eebad812e55d403dfaa7ad~~3&range=128,256&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0051_response.dat"))),
//                                        http("request_52")
//                                                .get(uri7 + "/watch/44120344/1?page-url=https%3A%2F%2Fyandex.ru%2Fmap-widget%2Fv1%2F%3Flang%3Dru_RU%26scroll%3Dtrue%26source%3Dconstructor-api%26um%3Dconstructor%253A174a1dc6fd94994d2d678bdaf68a6995b2ee8570350e21dcfdf7d34dfa265ca0&page-ref=https%3A%2F%2Fvotegd.com%2F&charset=utf-8&ut=noindex&uah=chu%0A%22Not%29A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not%29A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Aar%3A1%3Avf%3A51ws7ei066ityj92vuvd23adxu%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1396948963104%3Ahid%3A583198923%3Az%3A300%3Ai%3A20240817145029%3Aet%3A1723888229%3Ac%3A1%3Arn%3A159854778%3Arqn%3A2%3Au%3A172388805013444438%3Aw%3A500x400%3As%3A1920x1080x24%3Ask%3A1%3Aifr%3A1%3Afp%3A454%3Ads%3A0%2C0%2C120%2C356%2C2%2C0%2C%2C8%2C0%2C510%2C511%2C0%2C510%3Arqnl%3A1%3Ast%3A1723888230%3At%3Amap%20frame&t=gdpr%288-0%29mc%28h-1%29cdl%28na%29eco%2825632%29ti%282%29&redirnss=1")
//                                                .headers(headersIU_29)
//                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0052_response.gif"))),
                                        http("request_53")
                                                .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=9f08a647bf335ac646f57a03dbb3a12bd8cab4d0~~3&range=0,128&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0053_response.dat"))),
                                        http("request_54")
                                                .get(uri3 + "/vmap2/icons?id=35KY2RCBV5UN&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0054_response.png"))),
                                        http("request_55")
                                                .get(uri3 + "/vmap2/icons?id=3MDHL74NGZ6I&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0055_response.png"))),
                                        http("request_56")
                                                .get(uri3 + "/vmap2/icons?id=MYAME2F7IXSA&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0056_response.png"))),
                                        http("request_57")
                                                .get(uri3 + "/vmap2/icons?id=5OUVCBDHHTMI&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0057_response.png"))),
                                        http("request_58")
                                                .get(uri3 + "/vmap2/icons?id=WC7UI5W5A2ES&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0058_response.png"))),
                                        http("request_59")
                                                .get(uri3 + "/vmap2/icons?id=5MSS5TIZMCJG&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0059_response.png"))),
                                        http("request_60")
                                                .get(uri3 + "/vmap2/icons?id=FS6W7IMVXR26&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0060_response.png"))),
                                        http("request_61")
                                                .get(uri3 + "/vmap2/icons?id=RBNVYF5LUL4O&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0061_response.png"))),
                                        http("request_62")
                                                .get(uri3 + "/vmap2/icons?id=BXMZY45DINKS&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
                                                .headers(headersIU_31)
                                                .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0062_response.png")))
                                )
                );

//  Сценарий 6.Новости и материалы.

        HttpProtocolBuilder httpProtocol_users_flood_NA6 = http
                .baseUrl("https://votegd.com")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersNA_0 = new HashMap<>();
        headersNA_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersNA_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersNA_0.put("accept-language", "ru-RU,ru;q=0.9");
        headersNA_0.put("priority", "u=0, i");
        headersNA_0.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersNA_0.put("sec-ch-ua-mobile", "?0");
        headersNA_0.put("sec-ch-ua-platform", "Linux");
        headersNA_0.put("sec-fetch-dest", "document");
        headersNA_0.put("sec-fetch-mode", "navigate");
        headersNA_0.put("sec-fetch-site", "same-origin");
        headersNA_0.put("sec-fetch-user", "?1");
        headersNA_0.put("upgrade-insecure-requests", "1");
        headersNA_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        Map<CharSequence, String> headerNA_1 = new HashMap<>();
        headerNA_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
        headerNA_1.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headerNA_1.put("sec-ch-ua-mobile", "?0");
        headerNA_1.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersNA_9 = new HashMap<>();
        headersNA_9.put("accept", "*/*");
        headersNA_9.put("accept-encoding", "gzip, deflate, br, zstd");
        headersNA_9.put("accept-language", "ru-RU,ru;q=0.9");
        headersNA_9.put("origin", "https://votegd.com");
        headersNA_9.put("priority", "u=1, i");
        headersNA_9.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersNA_9.put("sec-ch-ua-mobile", "?0");
        headersNA_9.put("sec-ch-ua-platform", "Linux");
        headersNA_9.put("sec-fetch-dest", "empty");
        headersNA_9.put("sec-fetch-mode", "cors");
        headersNA_9.put("sec-fetch-site", "cross-site");
        headersNA_9.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersNA_11 = new HashMap<>();
        headersNA_11.put("accept", "*/*");
        headersNA_11.put("accept-encoding", "gzip, deflate, br, zstd");
        headersNA_11.put("accept-language", "ru-RU,ru;q=0.9");
        headersNA_11.put("origin", "https://votegd.com");
        headersNA_11.put("priority", "u=1, i");
        headersNA_11.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersNA_11.put("sec-ch-ua-mobile", "?0");
        headersNA_11.put("sec-ch-ua-platform", "Linux");
        headersNA_11.put("sec-fetch-dest", "empty");
        headersNA_11.put("sec-fetch-mode", "no-cors");
        headersNA_11.put("sec-fetch-site", "cross-site");
        headersNA_11.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

//        String uri2 = "https://fonts.gstatic.com/s/montserrat/v26";

//        String uri3 = "https://www.google-analytics.com/g/collect";
//
//        String uri4 = "https://mc.yandex.ru";

        ScenarioBuilder scnNA6 = scenario("NewsAll")
                .exec(
                        http("request_0")
                                .get("/news/all/")
                                .headers(headersNA_0)
                                .check(bodyBytes().is(RawFileBody("newsall/0000_response.html")))
                                .resources(
//                                        http("request_1")
//                                                .get(uri4 + "/metrika/tag.js")
//                                                .headers(headerNA_1)
//                                                .check(bodyBytes().is(RawFileBody("newsall/0001_response.js"))),
                                        http("request_2")
                                                .get(uri2 + "/JTUQjIg1_i6t8kCHKm459WxRzS7mw9c.woff2"),
                                        http("request_3")
                                                .get(uri2 + "/JTUQjIg1_i6t8kCHKm459WxRyS7m.woff2"),
                                        http("request_4")
                                                .get(uri2 + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2"),
                                        http("request_5")
                                                .get(uri2 + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2"),
                                        http("request_6")
                                                .get("/layout/fonts/fontawesome-webfont.woff2?v=4.7.0"),
                                        http("request_7")
                                                .get("/layout/fonts/Linearicons.ttf"),
                                        http("request_8")
                                                .get("/favicon.ico")
                                                .headers(headerNA_1)
                                                .check(bodyBytes().is(RawFileBody("newsall/0008_response.ico")))
//                                        http("request_9")
//                                                .get(uri4 + "/watch/78422502?wmode=7&page-url=https%3A%2F%2Fvotegd.com%2Fnews%2Fall%2F&page-ref=https%3A%2F%2Fvotegd.com%2Fmgd%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1675303360769%3Ahid%3A240534491%3Az%3A300%3Ai%3A20240817145914%3Aet%3A1723888755%3Ac%3A1%3Arn%3A438418138%3Arqn%3A122%3Au%3A1723885632123336677%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C222%2C2%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1723888754188%3Agi%3AR0ExLjEuMTczNjQ1OTI0OS4xNzIzODg1NjMy%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723888755%3At%3A%D0%92%D1%81%D0%B5%20%D0%BD%D0%BE%D0%B2%D0%BE%D1%81%D1%82%D0%B8%20%7C%20VoteGD%20%D0%B2%D1%81%D0%B5%20%D0%BE%20%D0%BF%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D0%BA%D0%B0%D1%85%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D1%8B&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
//                                                .headers(headersNA_9),
//                                        http("request_10")
//                                                .get(uri4 + "/watch/78422502/1?wmode=7&page-url=https%3A%2F%2Fvotegd.com%2Fnews%2Fall%2F&page-ref=https%3A%2F%2Fvotegd.com%2Fmgd%2F&charset=utf-8&uah=chu%0A%22Not%29A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not%29A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1675303360769%3Ahid%3A240534491%3Az%3A300%3Ai%3A20240817145914%3Aet%3A1723888755%3Ac%3A1%3Arn%3A438418138%3Arqn%3A122%3Au%3A1723885632123336677%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C222%2C2%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1723888754188%3Agi%3AR0ExLjEuMTczNjQ1OTI0OS4xNzIzODg1NjMy%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723888755%3At%3A%D0%92%D1%81%D0%B5%20%D0%BD%D0%BE%D0%B2%D0%BE%D1%81%D1%82%D0%B8%20%7C%20VoteGD%20%D0%B2%D1%81%D0%B5%20%D0%BE%20%D0%BF%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D0%BA%D0%B0%D1%85%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D1%8B&t=gdpr%2814%29clc%280-0-0%29rqnt%281%29aw%281%29rcm%280%29cdl%28na%29eco%2821037568%29ti%281%29&redirnss=1")
//                                                .headers(headersNA_9)
//                                                .check(bodyBytes().is(RawFileBody("newsall/0010_response.json")))
                                )
                );

//      Сценарий 7. Статья 1142.

        HttpProtocolBuilder httpProtocol_RandomNews1142_7 = http
                .baseUrl("https://votegd.com")
                .inferHtmlResources()
                ;


        Map<CharSequence, String> headersRN_0 = new HashMap<>();
        headersRN_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersRN_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersRN_0.put("accept-language", "ru-RU,ru;q=0.9");
        headersRN_0.put("priority", "u=0, i");
        headersRN_0.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersRN_0.put("sec-ch-ua-mobile", "?0");
        headersRN_0.put("sec-ch-ua-platform", "Linux");
        headersRN_0.put("sec-fetch-dest", "document");
        headersRN_0.put("sec-fetch-mode", "navigate");
        headersRN_0.put("sec-fetch-site", "same-origin");
        headersRN_0.put("sec-fetch-user", "?1");
        headersRN_0.put("upgrade-insecure-requests", "1");
        headersRN_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersRN_1 = new HashMap<>();
        headersRN_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
        headersRN_1.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersRN_1.put("sec-ch-ua-mobile", "?0");
        headersRN_1.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersRN_9 = new HashMap<>();
        headersRN_9.put("accept", "*/*");
        headersRN_9.put("accept-encoding", "gzip, deflate, br, zstd");
        headersRN_9.put("accept-language", "ru-RU,ru;q=0.9");
        headersRN_9.put("origin", "https://votegd.com");
        headersRN_9.put("priority", "u=1, i");
        headersRN_9.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersRN_9.put("sec-ch-ua-mobile", "?0");
        headersRN_9.put("sec-ch-ua-platform", "Linux");
        headersRN_9.put("sec-fetch-dest", "empty");
        headersRN_9.put("sec-fetch-mode", "cors");
        headersRN_9.put("sec-fetch-site", "cross-site");
        headersRN_9.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersRN_10 = new HashMap<>();
        headersRN_10.put("Upgrade-Insecure-Requests", "1");
        headersRN_10.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
        headersRN_10.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersRN_10.put("sec-ch-ua-mobile", "?0");
        headersRN_10.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersRN_11 = new HashMap<>();
        headersRN_11.put("accept", "*/*");
        headersRN_11.put("accept-encoding", "gzip, deflate, br, zstd");
        headersRN_11.put("accept-language", "ru-RU,ru;q=0.9");
        headersRN_11.put("origin", "https://votegd.com");
        headersRN_11.put("priority", "u=1, i");
        headersRN_11.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersRN_11.put("sec-ch-ua-mobile", "?0");
        headersRN_11.put("sec-ch-ua-platform", "Linux");
        headersRN_11.put("sec-fetch-dest", "empty");
        headersRN_11.put("sec-fetch-mode", "no-cors");
        headersRN_11.put("sec-fetch-site", "cross-site");
        headersRN_11.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

//        String uri2 = "https://fonts.gstatic.com/s/montserrat/v26";

//        String uri3 = "https://www.google-analytics.com/g/collect";
//
//        String uri4 = "https://mc.yandex.ru";

        ScenarioBuilder scnRN1142_7 = scenario("RandomNews1142")
                .exec(
                        http("request_0")
                                .get("/news/1142-reyting-samyh-bogatyh-kandidatov-v-mosgordumu-po-itogam-izucheniya-deklaraciy/")
                                .headers(headersRN_0)
                                .check(bodyBytes().is(RawFileBody("randomnews1142/0000_response.html")))
                                .resources(
                                        http("request_1")
                                                .get(uri4 + "/metrika/tag.js")
                                                .headers(headersRN_1)
                                                .check(bodyBytes().is(RawFileBody("randomnews1142/0001_response.js"))),
                                        http("request_2")
                                                .get(uri2 + "/JTUQjIg1_i6t8kCHKm459WxRzS7mw9c.woff2"),
                                        http("request_3")
                                                .get(uri2 + "/JTUQjIg1_i6t8kCHKm459WxRyS7m.woff2"),
                                        http("request_4")
                                                .get(uri2 + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2"),
                                        http("request_5")
                                                .get(uri2 + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2"),
                                        http("request_6")
                                                .get("/layout/fonts/fontawesome-webfont.woff2?v=4.7.0"),
                                        http("request_7")
                                                .get("/layout/fonts/Linearicons.ttf"),
                                        http("request_8")
                                                .get("/favicon.ico")
                                                .headers(headersRN_1)
                                                .check(bodyBytes().is(RawFileBody("randomnews1142/0008_response.ico")))
//                                        http("request_9")
//                                                .get(uri4 + "/watch/78422502?wmode=7&page-url=https%3A%2F%2Fvotegd.com%2Fnews%2F1142-reyting-samyh-bogatyh-kandidatov-v-mosgordumu-po-itogam-izucheniya-deklaraciy%2F&page-ref=https%3A%2F%2Fvotegd.com%2Fnews%2Fall%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1675303360769%3Ahid%3A624999586%3Az%3A300%3Ai%3A20240817150157%3Aet%3A1723888917%3Ac%3A1%3Arn%3A944839012%3Arqn%3A130%3Au%3A1723885632123336677%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C110%2C2%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1723888917178%3Agi%3AR0ExLjEuMTczNjQ1OTI0OS4xNzIzODg1NjMy%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723888917%3At%3A%D0%A0%D0%B5%D0%B9%D1%82%D0%B8%D0%BD%D0%B3%20%D1%81%D0%B0%D0%BC%D1%8B%D1%85%20%D0%B1%D0%BE%D0%B3%D0%B0%D1%82%D1%8B%D1%85%20%D0%BA%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D0%BE%D0%B2%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%B3%D0%BE%D1%80%D0%B4%D1%83%D0%BC%D1%83%20%D0%BF%D0%BE%20%D0%B8%D1%82%D0%BE%D0%B3%D0%B0%D0%BC%20%D0%B8%D0%B7%D1%83%D1%87%D0%B5%D0%BD%D0%B8%D1%8F%20%D0%B4%D0%B5%D0%BA%D0%BB%D0%B0%D1%80%D0%B0%D1%86%D0%B8%D0%B9%20%7C%20VoteGD%20%D0%B2%D1%81%D0%B5%20%D0%BE%20%D0%BF%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D0%BA%D0%B0%D1%85%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D1%8B&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
//                                                .headers(headersRN_9),
//                                        http("request_10")
//                                                .get(uri4 + "/metrika/metrika_match.html")
//                                                .headers(headersRN_10)
                                )
                );

//        Сценарий 8.Поиск с запрсом: "Аб"

        HttpProtocolBuilder httpProtocol_SearchWithQueryAb8 = http
                .baseUrl("https://votegd.com")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersSWQ_0 = new HashMap<>();
        headersSWQ_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersSWQ_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersSWQ_0.put("accept-language", "ru-RU,ru;q=0.9");
        headersSWQ_0.put("priority", "u=0, i");
        headersSWQ_0.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersSWQ_0.put("sec-ch-ua-mobile", "?0");
        headersSWQ_0.put("sec-ch-ua-platform", "Linux");
        headersSWQ_0.put("sec-fetch-dest", "document");
        headersSWQ_0.put("sec-fetch-mode", "navigate");
        headersSWQ_0.put("sec-fetch-site", "same-origin");
        headersSWQ_0.put("sec-fetch-user", "?1");
        headersSWQ_0.put("upgrade-insecure-requests", "1");
        headersSWQ_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersSWQ_1 = new HashMap<>();
        headersSWQ_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
        headersSWQ_1.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersSWQ_1.put("sec-ch-ua-mobile", "?0");
        headersSWQ_1.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersSWQ_7 = new HashMap<>();
        headersSWQ_7.put("accept", "*/*");
        headersSWQ_7.put("accept-encoding", "gzip, deflate, br, zstd");
        headersSWQ_7.put("accept-language", "ru-RU,ru;q=0.9");
        headersSWQ_7.put("origin", "https://votegd.com");
        headersSWQ_7.put("priority", "u=1, i");
        headersSWQ_7.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersSWQ_7.put("sec-ch-ua-mobile", "?0");
        headersSWQ_7.put("sec-ch-ua-platform", "Linux");
        headersSWQ_7.put("sec-fetch-dest", "empty");
        headersSWQ_7.put("sec-fetch-mode", "cors");
        headersSWQ_7.put("sec-fetch-site", "cross-site");
        headersSWQ_7.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersSWQ_8 = new HashMap<>();
        headersSWQ_8.put("accept", "*/*");
        headersSWQ_8.put("accept-encoding", "gzip, deflate, br, zstd");
        headersSWQ_8.put("accept-language", "ru-RU,ru;q=0.9");
        headersSWQ_8.put("origin", "https://votegd.com");
        headersSWQ_8.put("priority", "u=1, i");
        headersSWQ_8.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersSWQ_8.put("sec-ch-ua-mobile", "?0");
        headersSWQ_8.put("sec-ch-ua-platform", "Linux");
        headersSWQ_8.put("sec-fetch-dest", "empty");
        headersSWQ_8.put("sec-fetch-mode", "no-cors");
        headersSWQ_8.put("sec-fetch-site", "cross-site");
        headersSWQ_8.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersSWQ_9 = new HashMap<>();
        headersSWQ_9.put("Upgrade-Insecure-Requests", "1");
        headersSWQ_9.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
        headersSWQ_9.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersSWQ_9.put("sec-ch-ua-mobile", "?0");
        headersSWQ_9.put("sec-ch-ua-platform", "Linux");

//        String uri2 = "https://fonts.gstatic.com/s/montserrat/v26";

//        String uri3 = "https://www.google-analytics.com/g/collect";
//
//        String uri4 = "https://mc.yandex.ru";

        ScenarioBuilder scnSWQ8 = scenario("SearchWithQueryAb")
                .exec(
                        http("request_0")
                                .get("/people/search/?query=%D0%90%D0%B1")
                                .headers(headersSWQ_0)
                                .check(bodyBytes().is(RawFileBody("searchwithqueryab/0000_response.html")))
                                .resources(
                                        http("request_1")
                                                .get(uri4 + "/metrika/tag.js")
                                                .headers(headersSWQ_1)
                                                .check(bodyBytes().is(RawFileBody("searchwithqueryab/0001_response.js"))),
                                        http("request_2")
                                                .get(uri2 + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2"),
                                        http("request_3")
                                                .get(uri2 + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2"),
                                        http("request_4")
                                                .get("/layout/fonts/fontawesome-webfont.woff2?v=4.7.0"),
                                        http("request_5")
                                                .get("/layout/fonts/Linearicons.ttf"),
                                        http("request_6")
                                                .get("/img/sab.jpg")
                                                .headers(headersSWQ_1)
                                                .check(bodyBytes().is(RawFileBody("searchwithqueryab/0006_response.jpeg"))),
//                                        http("request_7")
//                                                .get(uri4 + "/watch/78422502?wmode=7&page-url=https%3A%2F%2Fvotegd.com%2Fpeople%2Fsearch%2F%3Fquery%3D%25D0%2590%25D0%25B1&page-ref=https%3A%2F%2Fvotegd.com%2Fpeople%2Fsearch%2F%3Fquery%3D%25D0%2590&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1675303360769%3Ahid%3A858452232%3Az%3A300%3Ai%3A20240817151615%3Aet%3A1723889775%3Ac%3A1%3Arn%3A1014954056%3Arqn%3A195%3Au%3A1723885632123336677%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C225%2C3%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1723889774856%3Agi%3AR0ExLjEuMTczNjQ1OTI0OS4xNzIzODg1NjMy%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723889775%3At%3A%D0%90%D0%B1%20%7C%20%D0%9F%D0%BE%D0%B8%D1%81%D0%BA%20%D0%BF%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D0%BA%D0%BE%D0%B2%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
//                                                .headers(headersSWQ_7),
                                        http("request_8")
                                                .post(uri3 + "?v=2&tid=G-126E14W1P6&gtm=45je48e0v9113022429za200&_p=1723889775097&gcd=13l3l3l3l1&npa=0&dma=0&tag_exp=0&cid=1736459249.1723885632&ul=ru-ru&sr=1920x1080&uaa=x86&uab=64&uafvl=Not)A%253BBrand%3B99.0.0.0%7CGoogle%2520Chrome%3B127.0.6533.119%7CChromium%3B127.0.6533.119&uamb=0&uam=&uap=Linux&uapv=6.5.0&uaw=0&are=1&frm=0&pscdl=noapi&_s=1&sid=1723885632&sct=1&seg=1&dl=https%3A%2F%2Fvotegd.com%2Fpeople%2Fsearch%2F%3Fquery%3D%25D0%2590%25D0%25B1&dr=https%3A%2F%2Fvotegd.com%2Fpeople%2Fsearch%2F%3Fquery%3D%25D0%2590&dt=%D0%90%D0%B1%20%7C%20%D0%9F%D0%BE%D0%B8%D1%81%D0%BA%20%D0%BF%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D0%BA%D0%BE%D0%B2%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5&en=page_view&_ee=1&tfd=325")
                                                .headers(headersSWQ_8)
//                                        http("request_9")
//                                                .get(uri4 + "/metrika/metrika_match.html")
//                                                .headers(headersSWQ_9)
                                )
                );


////    Сценарий 9. Сообщение.
//
//        HttpProtocolBuilder httpProtocol_Message9 = http
//                .baseUrl("https://votegd.com")
//                .inferHtmlResources()
//                .acceptHeader("*/*")
//                .acceptEncodingHeader("gzip, deflate, br")
//                .acceptLanguageHeader("ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
//                .userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
//
//        Map<CharSequence, String> headersMessage_0 = new HashMap<>();
//        headersMessage_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
//        headersMessage_0.put("pragma", "no-cache");
//        headersMessage_0.put("priority", "u=0, i");
//        headersMessage_0.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
//        headersMessage_0.put("sec-ch-ua-mobile", "?0");
//        headersMessage_0.put("sec-ch-ua-platform", "Linux");
//        headersMessage_0.put("sec-fetch-dest", "document");
//        headersMessage_0.put("sec-fetch-mode", "navigate");
//        headersMessage_0.put("sec-fetch-site", "cross-site");
//        headersMessage_0.put("sec-fetch-user", "?1");
//        headersMessage_0.put("upgrade-insecure-requests", "1");
//
//        Map<CharSequence, String> headersMessage_1 = new HashMap<>();
//        headersMessage_1.put("pragma", "no-cache");
//        headersMessage_1.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
//        headersMessage_1.put("sec-ch-ua-mobile", "?0");
//        headersMessage_1.put("sec-ch-ua-platform", "Linux");
//        headersMessage_1.put("sec-fetch-dest", "script");
//        headersMessage_1.put("sec-fetch-mode", "no-cors");
//        headersMessage_1.put("sec-fetch-site", "cross-site");
//
//        Map<CharSequence, String> headersMessage_2 = new HashMap<>();
//        headersMessage_2.put("origin", "https://votegd.com");
//        headersMessage_2.put("pragma", "no-cache");
//        headersMessage_2.put("priority", "u=1, i");
//        headersMessage_2.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
//        headersMessage_2.put("sec-ch-ua-mobile", "?0");
//        headersMessage_2.put("sec-ch-ua-platform", "Linux");
//        headersMessage_2.put("sec-fetch-dest", "empty");
//        headersMessage_2.put("sec-fetch-mode", "cors");
//        headersMessage_2.put("sec-fetch-site", "cross-site");
//
//        Map<CharSequence, String> headersMessage_3 = new HashMap<>();
//        headersMessage_3.put("origin", "https://votegd.com");
//        headersMessage_3.put("pragma", "no-cache");
//        headersMessage_3.put("priority", "u=0");
//        headersMessage_3.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
//        headersMessage_3.put("sec-ch-ua-mobile", "?0");
//        headersMessage_3.put("sec-ch-ua-platform", "Linux");
//        headersMessage_3.put("sec-fetch-dest", "font");
//        headersMessage_3.put("sec-fetch-mode", "cors");
//        headersMessage_3.put("sec-fetch-site", "cross-site");
//        headersMessage_3.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlKHLAQiHoM0BCLnIzQEY9snNAQ==");
//
//        Map<CharSequence, String> headersMessage_5 = new HashMap<>();
//        headersMessage_5.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
//        headersMessage_5.put("pragma", "no-cache");
//        headersMessage_5.put("priority", "u=0, i");
//        headersMessage_5.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
//        headersMessage_5.put("sec-ch-ua-mobile", "?0");
//        headersMessage_5.put("sec-ch-ua-platform", "Linux");
//        headersMessage_5.put("sec-fetch-dest", "iframe");
//        headersMessage_5.put("sec-fetch-mode", "navigate");
//        headersMessage_5.put("sec-fetch-site", "cross-site");
//        headersMessage_5.put("upgrade-insecure-requests", "1");
//
//        Map<CharSequence, String> headersMessage_6 = new HashMap<>();
//        headersMessage_6.put("origin", "https://votegd.com");
//        headersMessage_6.put("pragma", "no-cache");
//        headersMessage_6.put("priority", "u=0");
//        headersMessage_6.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
//        headersMessage_6.put("sec-ch-ua-mobile", "?0");
//        headersMessage_6.put("sec-ch-ua-platform", "Linux");
//        headersMessage_6.put("sec-fetch-dest", "font");
//        headersMessage_6.put("sec-fetch-mode", "cors");
//        headersMessage_6.put("sec-fetch-site", "same-origin");
//
//        Map<CharSequence, String> headersMessage_8 = new HashMap<>();
//        headersMessage_8.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
//        headersMessage_8.put("pragma", "no-cache");
//        headersMessage_8.put("priority", "u=1, i");
//        headersMessage_8.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
//        headersMessage_8.put("sec-ch-ua-mobile", "?0");
//        headersMessage_8.put("sec-ch-ua-platform", "Linux");
//        headersMessage_8.put("sec-fetch-dest", "image");
//        headersMessage_8.put("sec-fetch-mode", "no-cors");
//        headersMessage_8.put("sec-fetch-site", "same-origin");
//
//        Map<CharSequence, String> headersMessage_9 = new HashMap<>();
//        headersMessage_9.put("origin", "https://votegd.com");
//        headersMessage_9.put("pragma", "no-cache");
//        headersMessage_9.put("priority", "u=1, i");
//        headersMessage_9.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
//        headersMessage_9.put("sec-ch-ua-mobile", "?0");
//        headersMessage_9.put("sec-ch-ua-platform", "Linux");
//        headersMessage_9.put("sec-fetch-dest", "empty");
//        headersMessage_9.put("sec-fetch-mode", "no-cors");
//        headersMessage_9.put("sec-fetch-site", "cross-site");
//
////        String uri2 = "https://fonts.gstatic.com/s/montserrat/v26";
//
////        String uri3 = "https://www.google-analytics.com/g/collect";
////
////        String uri4 = "https://mc.yandex.ru";
//
//        ScenarioBuilder scnMessage9 = scenario("Message")
//                .exec(
//                        http("request_0")
//                                .get("/message/")
//                                .headers(headersMessage_0)
//                                .resources(
////                                        http("request_1")
////                                                .get(uri4 + "/metrika/tag.js")
////                                                .headers(headersMessage_1),
////                                        http("request_2")
////                                                .get(uri4 + "/watch/78422502?wmode=7&page-url=https%3A%2F%2Fvotegd.com%2Fmessage%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1611288404515%3Ahid%3A432861832%3Az%3A300%3Ai%3A20240818131354%3Aet%3A1723968834%3Ac%3A1%3Arn%3A141902968%3Arqn%3A63%3Au%3A1723808625578809752%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C102%2C1%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1723968834039%3Agi%3AR0ExLjEuMzM0MzkwMzc0LjE3MjM4MDg2MjU%3D%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723968834%3At%3A%D0%9D%D0%B0%D0%BF%D0%B8%D1%81%D0%B0%D1%82%D1%8C%20%D0%BD%D0%B0%D0%BC%20%7C%20Vote%D0%93%D0%94&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(1)cdl(na)eco(21037568)ti(1)")
////                                                .headers(headersMessage_2),
//                                        http("request_3")
//                                                .get(uri2 + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2")
//                                                .headers(headersMessage_3),
//                                        http("request_4")
//                                                .get(uri2 + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2")
//                                                .headers(headersMessage_3),
////                                        http("request_5")
////                                                .get(uri4 + "/metrika/metrika_match.html")
////                                                .headers(headersMessage_5),
//                                        http("request_6")
//                                                .get("/layout/fonts/fontawesome-webfont.woff2?v=4.7.0")
//                                                .headers(headersMessage_6),
//                                        http("request_7")
//                                                .get("/layout/fonts/Linearicons.ttf")
//                                                .headers(headersMessage_6),
//                                        http("request_8")
//                                                .get("/favicon.ico")
//                                                .headers(headersMessage_8)
//                                )
//                );

//        Сценарий 10. Отправка сообщения.

        HttpProtocolBuilder httpProtocol_ThankYou10 = http
                .baseUrl("https://mc.yandex.ru")
                .inferHtmlResources()
                .acceptHeader("*/*")
                .acceptEncodingHeader("gzip, deflate, br")
                .acceptLanguageHeader("ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
                .userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");



        Map<CharSequence, String> headersTY_0 = new HashMap<>();
        headersTY_0.put("origin", "https://votegd.com");
        headersTY_0.put("pragma", "no-cache");
        headersTY_0.put("priority", "u=4, i");
        headersTY_0.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersTY_0.put("sec-ch-ua-mobile", "?0");
        headersTY_0.put("sec-ch-ua-platform", "Linux");
        headersTY_0.put("sec-fetch-dest", "empty");
        headersTY_0.put("sec-fetch-mode", "no-cors");
        headersTY_0.put("sec-fetch-site", "cross-site");

        Map<CharSequence, String> headersTY_1 = new HashMap<>();
        headersTY_1.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersTY_1.put("origin", "https://votegd.com");
        headersTY_1.put("pragma", "no-cache");
        headersTY_1.put("priority", "u=0, i");
        headersTY_1.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersTY_1.put("sec-ch-ua-mobile", "?0");
        headersTY_1.put("sec-ch-ua-platform", "Linux");
        headersTY_1.put("sec-fetch-dest", "document");
        headersTY_1.put("sec-fetch-mode", "navigate");
        headersTY_1.put("sec-fetch-site", "same-origin");
        headersTY_1.put("sec-fetch-user", "?1");
        headersTY_1.put("upgrade-insecure-requests", "1");

        Map<CharSequence, String> headersTY_2 = new HashMap<>();
        headersTY_2.put("origin", "https://votegd.com");
        headersTY_2.put("pragma", "no-cache");
        headersTY_2.put("priority", "u=1, i");
        headersTY_2.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersTY_2.put("sec-ch-ua-mobile", "?0");
        headersTY_2.put("sec-ch-ua-platform", "Linux");
        headersTY_2.put("sec-fetch-dest", "empty");
        headersTY_2.put("sec-fetch-mode", "cors");
        headersTY_2.put("sec-fetch-site", "cross-site");

        Map<CharSequence, String> headersTY_3 = new HashMap<>();
        headersTY_3.put("accept", "text/css,*/*;q=0.1");
        headersTY_3.put("pragma", "no-cache");
        headersTY_3.put("priority", "u=0");
        headersTY_3.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersTY_3.put("sec-ch-ua-mobile", "?0");
        headersTY_3.put("sec-ch-ua-platform", "Linux");
        headersTY_3.put("sec-fetch-dest", "style");
        headersTY_3.put("sec-fetch-mode", "no-cors");
        headersTY_3.put("sec-fetch-site", "cross-site");
        headersTY_3.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlKHLAQiHoM0BCLnIzQEY9snNAQ==");

        Map<CharSequence, String> headersTY_4 = new HashMap<>();
        headersTY_4.put("pragma", "no-cache");
        headersTY_4.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersTY_4.put("sec-ch-ua-mobile", "?0");
        headersTY_4.put("sec-ch-ua-platform", "Linux");
        headersTY_4.put("sec-fetch-dest", "script");
        headersTY_4.put("sec-fetch-mode", "no-cors");
        headersTY_4.put("sec-fetch-site", "cross-site");

        Map<CharSequence, String> headersTV_7 = new HashMap<>();
        headersTV_7.put("origin", "https://votegd.com");
        headersTV_7.put("pragma", "no-cache");
        headersTV_7.put("priority", "u=0");
        headersTV_7.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersTV_7.put("sec-ch-ua-mobile", "?0");
        headersTV_7.put("sec-ch-ua-platform", "Linux");
        headersTV_7.put("sec-fetch-dest", "font");
        headersTV_7.put("sec-fetch-mode", "cors");
        headersTV_7.put("sec-fetch-site", "cross-site");
        headersTV_7.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlKHLAQiHoM0BCLnIzQEY9snNAQ==");

        Map<CharSequence, String> headersTY_9 = new HashMap<>();
        headersTY_9.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersTY_9.put("pragma", "no-cache");
        headersTY_9.put("priority", "u=0, i");
        headersTY_9.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersTY_9.put("sec-ch-ua-mobile", "?0");
        headersTY_9.put("sec-ch-ua-platform", "Linux");
        headersTY_9.put("sec-fetch-dest", "iframe");
        headersTY_9.put("sec-fetch-mode", "navigate");
        headersTY_9.put("sec-fetch-site", "cross-site");
        headersTY_9.put("upgrade-insecure-requests", "1");

        Map<CharSequence, String> headersTY_10 = new HashMap<>();
        headersTY_10.put("accept", "text/css,*/*;q=0.1");
        headersTY_10.put("pragma", "no-cache");
        headersTY_10.put("priority", "u=0");
        headersTY_10.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersTY_10.put("sec-ch-ua-mobile", "?0");
        headersTY_10.put("sec-ch-ua-platform", "Linux");
        headersTY_10.put("sec-fetch-dest", "style");
        headersTY_10.put("sec-fetch-mode", "no-cors");
        headersTY_10.put("sec-fetch-site", "same-origin");

        Map<CharSequence, String> headersTY_12 = new HashMap<>();
        headersTY_12.put("pragma", "no-cache");
        headersTY_12.put("priority", "u=1");
        headersTY_12.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersTY_12.put("sec-ch-ua-mobile", "?0");
        headersTY_12.put("sec-ch-ua-platform", "Linux");
        headersTY_12.put("sec-fetch-dest", "script");
        headersTY_12.put("sec-fetch-mode", "no-cors");
        headersTY_12.put("sec-fetch-site", "same-origin");

        Map<CharSequence, String> headersTV_13 = new HashMap<>();
        headersTV_13.put("pragma", "no-cache");
        headersTV_13.put("priority", "u=2");
        headersTV_13.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersTV_13.put("sec-ch-ua-mobile", "?0");
        headersTV_13.put("sec-ch-ua-platform", "Linux");
        headersTV_13.put("sec-fetch-dest", "script");
        headersTV_13.put("sec-fetch-mode", "no-cors");
        headersTV_13.put("sec-fetch-site", "same-origin");

        Map<CharSequence, String> headersTY_15 = new HashMap<>();
        headersTY_15.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
        headersTY_15.put("pragma", "no-cache");
        headersTY_15.put("priority", "i");
        headersTY_15.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersTY_15.put("sec-ch-ua-mobile", "?0");
        headersTY_15.put("sec-ch-ua-platform", "Linux");
        headersTY_15.put("sec-fetch-dest", "image");
        headersTY_15.put("sec-fetch-mode", "no-cors");
        headersTY_15.put("sec-fetch-site", "same-origin");

        Map<CharSequence, String> headersTY_17 = new HashMap<>();
        headersTY_17.put("origin", "https://votegd.com");
        headersTY_17.put("pragma", "no-cache");
        headersTY_17.put("priority", "u=0");
        headersTY_17.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersTY_17.put("sec-ch-ua-mobile", "?0");
        headersTY_17.put("sec-ch-ua-platform", "Linux");
        headersTY_17.put("sec-fetch-dest", "font");
        headersTY_17.put("sec-fetch-mode", "cors");
        headersTY_17.put("sec-fetch-site", "same-origin");

        Map<CharSequence, String> headersTY_18 = new HashMap<>();
        headersTY_18.put("origin", "https://votegd.com");
        headersTY_18.put("pragma", "no-cache");
        headersTY_18.put("priority", "u=1, i");
        headersTY_18.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersTY_18.put("sec-ch-ua-mobile", "?0");
        headersTY_18.put("sec-ch-ua-platform", "Linux");
        headersTY_18.put("sec-fetch-dest", "empty");
        headersTY_18.put("sec-fetch-mode", "no-cors");
        headersTY_18.put("sec-fetch-site", "cross-site");

        String uri1 = "https://votegd.com";

//        String uri2 = "https://www.googletagmanager.com/gtag/js";
//
//        String uri3 = "https://fonts.gstatic.com/s/montserrat/v26";
//
//        String uri4 = "https://fonts.googleapis.com/css2";
//
//        String uri5 = "https://www.google-analytics.com/g/collect";

        ScenarioBuilder scnTY10 = scenario("ThankYou")
                .exec(
                        http("request_0")
                                .post("/watch/78422502/1?page-url=form%3A%2F%2Fvotegd.com%2F%3Fi%3Dw0%26p%3DFAAA%25C2%2584A&page-ref=https%3A%2F%2Fvotegd.com%2Fmessage%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1723969246_dd2d6f10911ae954873356593e6d8256d1fe1ee8b76e2653a726e6d8ad95255b&browser-info=ar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A3%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A1%3Als%3A1611288404515%3Ahid%3A533944847%3Az%3A300%3Ai%3A20240818132106%3Aet%3A1723969266%3Ac%3A1%3Arn%3A224116031%3Arqn%3A72%3Au%3A1723808625578809752%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1723969246190%3Agi%3AR0ExLjEuMzM0MzkwMzc0LjE3MjM4MDg2MjU%3D%3Aadb%3A2%3App%3A3629563401%3Arqnl%3A1%3Ast%3A1723969266%3At%3A%D0%9D%D0%B0%D0%BF%D0%B8%D1%81%D0%B0%D1%82%D1%8C%20%D0%BD%D0%B0%D0%BC%20%7C%20Vote%D0%93%D0%94&t=gdpr(14)clc(5-776-710)rqnt(3)aw(1)rcm(1)cdl(na)eco(21037568)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22__ym%22%3A%7B%22ite%22%3A1%7D%7D")
                                .headers(headersTY_0)
                                .resources(
                                        http("request_1")
                                                .post(uri1 + "/message/")
                                                .headers(headersTY_1)
                                                .formParam("_csrf", csrf) // Параметризация токена
                                                .formParam("Feedback[contact]", contact) // Параметризация контакта
                                                .formParam("Feedback[message]", message) // Параметризация сообщения
                                                .formParam("Feedback[captcha]", captcha), // Параметризация капчи
                                        http("request_2")
                                                .get("/clmap/78422502?page-url=https%3A%2F%2Fvotegd.com%2Fmessage%2F&pointer-click=rn%3A201365201%3Ax%3A33444%3Ay%3A3389%3At%3A199%3Ap%3A%3FFAAA%C2%84A%3AX%3A954%3AY%3A916&browser-info=u%3A1723808625578809752%3Av%3A1410%3Avf%3Acstsejpczyib8nf716ce02r1en%3Arqnl%3A1%3Ast%3A1723969266&t=gdpr(14)ti(1)")
                                                .headers(headersTY_2),
                                        http("request_3")
                                                .get(uri4 + "?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap")
                                                .headers(headersTY_3),
                                        http("request_4")
                                                .get("/metrika/tag.js")
                                                .headers(headersTY_4),
                                        http("request_5")
                                                .get(uri2 + "?id=G-126E14W1P6")
                                                .headers(headersTY_4),
                                        http("request_6")
                                                .get("/watch/78422502?wmode=7&page-url=https%3A%2F%2Fvotegd.com%2Fthank-you%2F&page-ref=https%3A%2F%2Fvotegd.com%2Fmessage%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1611288404515%3Ahid%3A72126281%3Az%3A300%3Ai%3A20240818132106%3Aet%3A1723969267%3Ac%3A1%3Arn%3A282279506%3Arqn%3A73%3Au%3A1723808625578809752%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C99%2C2%2C118%2C116%2C1%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1723969266480%3Agi%3AR0ExLjEuMzM0MzkwMzc0LjE3MjM4MDg2MjU%3D%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723969267%3At%3A&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(1)cdl(na)eco(21037568)ti(1)")
                                                .headers(headersTY_2),
                                        http("request_7")
                                                .get(uri3 + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2")
                                                .headers(headersTV_7),
                                        http("request_8")
                                                .get(uri3 + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2")
                                                .headers(headersTV_7),
                                        http("request_9")
                                                .get("/metrika/metrika_match.html")
                                                .headers(headersTY_9),
                                        http("request_10")
                                                .get(uri1 + "/layout/css/bootstrap.css")
                                                .headers(headersTY_10),
                                        http("request_11")
                                                .get(uri1 + "/layout/css/style.css")
                                                .headers(headersTY_10),
                                        http("request_12")
                                                .get(uri1 + "/assets/777cc481/jquery.js")
                                                .headers(headersTY_12),
                                        http("request_13")
                                                .get(uri1 + "/assets/8f4a1b0a/yii.js")
                                                .headers(headersTV_13),
                                        http("request_14")
                                                .get(uri1 + "/layout/js/core.min.js")
                                                .headers(headersTV_13),
                                        http("request_15")
                                                .get(uri1 + "/layout/images/minilogo.png")
                                                .headers(headersTY_15),
                                        http("request_16")
                                                .get(uri1 + "/layout/js/script.js")
                                                .headers(headersTV_13),
                                        http("request_17")
                                                .get(uri1 + "/layout/fonts/fontawesome-webfont.woff2?v=4.7.0")
                                                .headers(headersTY_17)
                                )
                );

//        Сценарий 11. Подписка

        HttpProtocolBuilder httpProtocol_Subscribe11 = http
                .baseUrl("https://mc.yandex.ru")
                .inferHtmlResources()
                .acceptHeader("*/*")
                .acceptEncodingHeader("gzip, deflate, br")
                .acceptLanguageHeader("ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
                .userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersS_0 = new HashMap<>();
        headersS_0.put("origin", "https://votegd.com");
        headersS_0.put("pragma", "no-cache");
        headersS_0.put("priority", "u=4, i");
        headersS_0.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersS_0.put("sec-ch-ua-mobile", "?0");
        headersS_0.put("sec-ch-ua-platform", "Linux");
        headersS_0.put("sec-fetch-dest", "empty");
        headersS_0.put("sec-fetch-mode", "no-cors");
        headersS_0.put("sec-fetch-site", "cross-site");

        Map<CharSequence, String> headersS_3 = new HashMap<>();
        headersS_3.put("pragma", "no-cache");
        headersS_3.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersS_3.put("sec-ch-ua-mobile", "?0");
        headersS_3.put("sec-ch-ua-platform", "Linux");
        headersS_3.put("sec-fetch-dest", "script");
        headersS_3.put("sec-fetch-mode", "no-cors");
        headersS_3.put("sec-fetch-site", "cross-site");

        Map<CharSequence, String> headersS_4 = new HashMap<>();
        headersS_4.put("origin", "https://votegd.com");
        headersS_4.put("pragma", "no-cache");
        headersS_4.put("priority", "u=1, i");
        headersS_4.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
        headersS_4.put("sec-ch-ua-mobile", "?0");
        headersS_4.put("sec-ch-ua-platform", "Linux");
        headersS_4.put("sec-fetch-dest", "empty");
        headersS_4.put("sec-fetch-mode", "no-cors");
        headersS_4.put("sec-fetch-site", "cross-site");

//        String Buri1 = "https://templatermonster.createsend.com/t/j/s/zjjikd";
//
//        String Buri2 = "https://www.google-analytics.com/g/collect";

        ScenarioBuilder scnSub11 = scenario("Subscribe")
                .exec(
                        http("request_0")
                                .post("/watch/78422502/1?page-url=https%3A%2F%2Fvotegd.com%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1723899123_58e78d7ca2be2a8694c7f5f17ba5b5dd5e39da98389dbfc435f03b6c3898ab5b&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A1%3Als%3A1611288404515%3Ahid%3A283034204%3Az%3A300%3Ai%3A20240817175244%3Aet%3A1723899165%3Ac%3A1%3Arn%3A826626279%3Arqn%3A49%3Au%3A1723808625578809752%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1723899123048%3Agi%3AR0ExLjEuMzM0MzkwMzc0LjE3MjM4MDg2MjU%3D%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723899165&t=gdpr(14)mc(p-1)clc(4-884-553)rqnt(3)aw(1)rcm(1)cdl(na)eco(21037568)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22__ym%22%3A%7B%22fi%22%3A%22a(1)b(PAFAAA%C2%843A)c(YWudgAH%2FOUrcSBPjw2F2eD8Xslr7WdkXhwYmUEzch1s%3D)%22%2C%22ite%22%3A1%7D%7D")
                                .headers(headersS_0)
                                .resources(
                                        http("request_1")
                                                .post("/watch/78422502/1?page-url=form%3A%2F%2Fvotegd.com%2F%3Fp%3DFAAA%25C2%25843A&page-ref=https%3A%2F%2Fvotegd.com%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1723899123_58e78d7ca2be2a8694c7f5f17ba5b5dd5e39da98389dbfc435f03b6c3898ab5b&browser-info=ar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A3%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A1%3Als%3A1611288404515%3Ahid%3A283034204%3Az%3A300%3Ai%3A20240817175244%3Aet%3A1723899165%3Ac%3A1%3Arn%3A606670524%3Arqn%3A50%3Au%3A1723808625578809752%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1723899123048%3Agi%3AR0ExLjEuMzM0MzkwMzc0LjE3MjM4MDg2MjU%3D%3Aadb%3A2%3App%3A3629563401%3Arqnl%3A1%3Ast%3A1723899165%3At%3AVote%D0%93%D0%94%20%D1%82%D0%B2%D0%BE%D0%B9%20%D1%81%D0%B0%D0%B9%D1%82%20%D0%BE%20%D0%BF%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%BE%D0%B9%20%D1%82%D1%83%D1%81%D0%BE%D0%B2%D0%BA%D0%B5%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D1%8B&t=gdpr(14)mc(p-2)clc(5-924-553)rqnt(4)aw(1)rcm(1)cdl(na)eco(21037568)dss(2)fid(320)ti(0)&force-urlencoded=1&site-info=%7B%22__ym%22%3A%7B%22ite%22%3A1%7D%7D")
                                                .headers(headersS_0),
                                        http("request_2")
                                                .post("/watch/78422502/1?page-url=https%3A%2F%2Fvotegd.com%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1723899123_58e78d7ca2be2a8694c7f5f17ba5b5dd5e39da98389dbfc435f03b6c3898ab5b&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A1%3Als%3A1611288404515%3Ahid%3A283034204%3Az%3A300%3Ai%3A20240817175244%3Aet%3A1723899165%3Ac%3A1%3Arn%3A1065001835%3Arqn%3A51%3Au%3A1723808625578809752%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1723899123048%3Agi%3AR0ExLjEuMzM0MzkwMzc0LjE3MjM4MDg2MjU%3D%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723899165&t=gdpr(14)mc(p-2)clc(5-924-553)rqnt(5)aw(1)rcm(1)cdl(na)eco(21037568)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22__ym%22%3A%7B%22fi%22%3A%22a(1)b(PAFAAA%C2%843A)c(YWudgAH%2FOUrcSBPjw2F2eD8Xslr7WdkXhwYmUEzch1s%3D)e(1)%22%2C%22ite%22%3A1%7D%7D")
                                                .headers(headersS_0),
                                        http("request_3")
                                                .get(uri1 + "/?callback=jQuery32109497347423600881_1723899123864&cm-zjjikd-zjjikd=Sobaka%40mail.ru&_=1723899123865")
                                                .headers(headersS_3),
                                        http("request_4")
                                                .post(uri2 + "?v=2&tid=G-126E14W1P6&gtm=45je48e0v9113022429za200&_p=1723899123220&gcd=13l3l3l3l1&npa=0&dma=0&tag_exp=0&cid=334390374.1723808625&ul=ru-ru&sr=1920x1080&uaa=x86&uab=64&uafvl=Not)A%253BBrand%3B99.0.0.0%7CGoogle%2520Chrome%3B127.0.6533.119%7CChromium%3B127.0.6533.119&uamb=0&uam=&uap=Linux&uapv=6.5.0&uaw=0&are=1&frm=0&pscdl=noapi&_eu=AEE&_s=3&sid=1723899024&sct=5&seg=1&dl=https%3A%2F%2Fvotegd.com%2F&dr=https%3A%2F%2Fvotegd.com%2Fmessage%2F&dt=Vote%D0%93%D0%94%20%D1%82%D0%B2%D0%BE%D0%B9%20%D1%81%D0%B0%D0%B9%D1%82%20%D0%BE%20%D0%BF%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%BE%D0%B9%20%D1%82%D1%83%D1%81%D0%BE%D0%B2%D0%BA%D0%B5%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D1%8B&en=form_start&ep.form_id=&ep.form_name=&ep.form_destination=https%3A%2F%2Ftemplatermonster.createsend.com%2Ft%2Fj%2Fs%2Fzjjikd%2F&epn.form_length=2&ep.first_field_id=campaign-email&ep.first_field_name=cm-zjjikd-zjjikd&ep.first_field_type=email&epn.first_field_position=1&_et=23949&tfd=42995")
                                                .headers(headersS_4)
                                )
                );

//        Установки

        setUp(
                scnMP1.injectClosed(
                        constantConcurrentUsers(users_flood_MP1).during(40000)
                ).protocols(httpProtocol_MainPage1)
                ,
                scnMAC2.injectClosed(
                        constantConcurrentUsers(users_flood_MAC2).during(40000)
                ).protocols(httpProtocol_MunicipalAllCandidates2)
                ,
                scnRCM3.injectClosed(
                        constantConcurrentUsers(users_flood_RCM3).during(40000)
                ).protocols(httpProtocol_RandomCandidateMarsel3)
                ,
                scnMgdAC4.injectClosed(
                        constantConcurrentUsers(users_flood_MgdAC4).during(40000)
                ).protocols(httpProtocol_MgdAllCandidates4)
                ,
                scnMgdIU5.injectClosed(
                        constantConcurrentUsers(users_flood_MgdIU5).during(40000)
                ).protocols(httpProtocol_MgdIzbiratUchastki5)
                ,
                scnNA6.injectClosed(
                        constantConcurrentUsers(users_flood_NA6).during(40000)
                ).protocols(httpProtocol_users_flood_NA6)
                ,
                scnRN1142_7.injectClosed(
                        constantConcurrentUsers(users_flood_RN1142_7).during(40000)
                ).protocols(httpProtocol_RandomNews1142_7)
                ,
                scnSWQ8.injectClosed(
                        constantConcurrentUsers(users_flood_SWQ8).during(40000)
                ).protocols(httpProtocol_SearchWithQueryAb8)
                ,
//                scnMessage9.injectClosed(
//                        constantConcurrentUsers(users_flood_Message9).during(40000)
//                ).protocols(httpProtocol_Message9)
//                ,
                scnTY10.injectClosed(
                        constantConcurrentUsers(users_flood_TY10).during(40000)
                ).protocols(httpProtocol_ThankYou10)
                ,
                scnSub11.injectClosed(
                        constantConcurrentUsers(users_flood_Sub11).during(40000)
                ).protocols(httpProtocol_Subscribe11)
        );
    }
}




