package Simulations;

import io.gatling.javaapi.core.Simulation;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.http;

import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import java.util.HashMap;
import java.util.Map;


public class SC03 extends Simulation {
    {

        int users_flood_UC11 = Integer.getInteger("users_flood_UC11", 1);
        int users_flood_UC12 = Integer.getInteger("users_flood_UC12", 1);
        int users_flood_UC13 = Integer.getInteger("users_flood_UC13", 1);
        int users_flood_UC14 = Integer.getInteger("users_flood_UC14", 1);
        int users_flood_UC15 = Integer.getInteger("users_flood_UC15", 1);
        int users_flood_UC16 = Integer.getInteger("users_flood_UC16", 1);
        int users_flood_UC17 = Integer.getInteger("users_flood_UC17", 1);
        int users_flood_UC18 = Integer.getInteger("users_flood_UC18", 1);
        int users_flood_UC19 = Integer.getInteger("users_flood_UC19", 1);


        // Scenarious

        HttpProtocolBuilder httpProtocol_Kandidati = http
                .baseUrl("https://mc.yandex.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersUC11_0 = new HashMap<>();
        headersUC11_0.put("accept", "*/*");
        headersUC11_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC11_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC11_0.put("content-type", "text/plain");
        headersUC11_0.put("origin", "https://shtab.opmoscow.ru");
        headersUC11_0.put("priority", "u=1, i");
        headersUC11_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC11_0.put("sec-ch-ua-mobile", "?0");
        headersUC11_0.put("sec-ch-ua-platform", "Linux");
        headersUC11_0.put("sec-fetch-dest", "empty");
        headersUC11_0.put("sec-fetch-mode", "cors");
        headersUC11_0.put("sec-fetch-site", "cross-site");
        headersUC11_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC11_1 = new HashMap<>();
        headersUC11_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC11_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC11_1.put("sec-ch-ua-mobile", "?0");
        headersUC11_1.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC11_33 = new HashMap<>();
        headersUC11_33.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC11_33.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC11_33.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC11_33.put("priority", "u=0, i");
        headersUC11_33.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC11_33.put("sec-ch-ua-mobile", "?0");
        headersUC11_33.put("sec-ch-ua-platform", "Linux");
        headersUC11_33.put("sec-fetch-dest", "document");
        headersUC11_33.put("sec-fetch-mode", "navigate");
        headersUC11_33.put("sec-fetch-site", "same-origin");
        headersUC11_33.put("sec-fetch-user", "?1");
        headersUC11_33.put("upgrade-insecure-requests", "1");
        headersUC11_33.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC11_44 = new HashMap<>();
        headersUC11_44.put("Upgrade-Insecure-Requests", "1");
        headersUC11_44.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC11_44.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC11_44.put("sec-ch-ua-mobile", "?0");
        headersUC11_44.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC11_45 = new HashMap<>();
        headersUC11_45.put("accept", "*/*");
        headersUC11_45.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC11_45.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC11_45.put("origin", "https://shtab.opmoscow.ru");
        headersUC11_45.put("priority", "u=1, i");
        headersUC11_45.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC11_45.put("sec-ch-ua-mobile", "?0");
        headersUC11_45.put("sec-ch-ua-platform", "Linux");
        headersUC11_45.put("sec-fetch-dest", "empty");
        headersUC11_45.put("sec-fetch-mode", "cors");
        headersUC11_45.put("sec-fetch-site", "cross-site");
        headersUC11_45.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        String uri2 = "https://shtab.opmoscow.ru";

        ScenarioBuilder scnUC11 = scenario("Kandidati")
                .exec(
                        http("request_0")
                                .post("/webvisor/89667203?wv-part=3&wv-type=7&wmode=0&wv-hit=295113844&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fkandidaty&rn=961630866&browser-info=we%3A1%3Aet%3A1724420352%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823183911%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724420352&t=gdpr(14)ti(1)")
                                .headers(headersUC11_0)
//                                .body(RawFileBody("kandidati/0000_request.gif"))
                                .resources(
                                        http("request_1")
                                                .get(uri2 + "/build/5758.f38a32ed.css")
                                                .headers(headersUC11_1),
                                        http("request_2")
                                                .get(uri2 + "/build/6395.76430bbc.css")
                                                .headers(headersUC11_1),
                                        http("request_3")
                                                .get(uri2 + "/build/8886.31d6cfe0.css")
                                                .headers(headersUC11_1),
                                        http("request_4")
                                                .get(uri2 + "/build/shtadopm_css_head.dfe3f750.css")
                                                .headers(headersUC11_1),
                                        http("request_5")
                                                .get(uri2 + "/build/runtime.aaa04269.js")
                                                .headers(headersUC11_1),
                                        http("request_6")
                                                .get(uri2 + "/build/9755.89d0240d.js")
                                                .headers(headersUC11_1),
                                        http("request_7")
                                                .get(uri2 + "/build/shtadopm_app_head.a800bb8d.js")
                                                .headers(headersUC11_1),
                                        http("request_8")
                                                .get(uri2 + "/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
                                                .headers(headersUC11_1),
                                        http("request_9")
                                                .get(uri2 + "/build/images/shtadopm/menu-arrow.svg")
                                                .headers(headersUC11_1),
                                        http("request_10")
                                                .get(uri2 + "/cache/f/c/e/b/6/fceb652d4b4aed86e4b7baf387f1da74ddde1e79.jpeg")
                                                .headers(headersUC11_1),
                                        http("request_11")
                                                .get(uri2 + "/cache/6/c/3/b/4/6c3b4ab4c8aa8746a2a4855e03a2bd15c60c4ce3.jpeg")
                                                .headers(headersUC11_1),
                                        http("request_12")
                                                .get(uri2 + "/cache/5/1/f/e/a/51feafea52abd4cd4d5428a70731f95720eccb9b.png")
                                                .headers(headersUC11_1),
                                        http("request_13")
                                                .get(uri2 + "/cache/f/7/9/6/d/f796dd12f583c524e35df7e2541fea9a0dcc8763.jpeg")
                                                .headers(headersUC11_1),
                                        http("request_14")
                                                .get(uri2 + "/cache/4/4/2/a/f/442af39a0353822e89f8751c1435be9e8d40753b.jpeg")
                                                .headers(headersUC11_1),
                                        http("request_15")
                                                .get(uri2 + "/cache/d/a/a/e/1/daae1d18bec766a897a5c77db1ae254661c737ec.jpeg")
                                                .headers(headersUC11_1),
                                        http("request_16")
                                                .get(uri2 + "/cache/c/2/e/2/a/c2e2ab4c04d799e96be1098062c00129a2dbf7a6.jpeg")
                                                .headers(headersUC11_1),
                                        http("request_17")
                                                .get(uri2 + "/cache/a/3/9/c/e/a39ce9aa3137b8e066a478a8ac1d14dfedcb2de3.jpeg")
                                                .headers(headersUC11_1),
                                        http("request_18")
                                                .get(uri2 + "/cache/3/a/1/f/7/3a1f7aa046a731c622e69a6fbe26ee15b1c73ca9.jpeg")
                                                .headers(headersUC11_1),
                                        http("request_19")
                                                .get(uri2 + "/cache/6/6/e/7/7/66e7767bfb250027d7a04d41a50724ae85e5ccc1.jpeg")
                                                .headers(headersUC11_1),
                                        http("request_20")
                                                .get(uri2 + "/cache/0/8/6/8/9/0868959f58c583c849bf7e37b0f06f01c5fcea37.jpeg")
                                                .headers(headersUC11_1),
                                        http("request_21")
                                                .get(uri2 + "/cache/5/c/9/b/b/5c9bb8891d8822a8321945cb8dbea12288d78414.jpeg")
                                                .headers(headersUC11_1),
                                        http("request_22")
                                                .get(uri2 + "/cache/c/a/6/7/e/ca67ec946d0cff8eeed64062e9ac3a97984a99ad.jpeg")
                                                .headers(headersUC11_1),
                                        http("request_23")
                                                .get(uri2 + "/cache/c/e/a/9/b/cea9b176a530e943a394c5bc36e4948a93842c25.jpeg")
                                                .headers(headersUC11_1),
                                        http("request_24")
                                                .get(uri2 + "/cache/4/d/6/f/5/4d6f5e11013510ddd78974effecb47a1c709a4ee.jpeg")
                                                .headers(headersUC11_1),
                                        http("request_25")
                                                .get(uri2 + "/cache/c/a/9/7/c/ca97c16fd5f5d46456ed022f535d5c221338a700.png")
                                                .headers(headersUC11_1),
                                        http("request_26")
                                                .get(uri2 + "/cache/3/f/9/6/c/3f96ccaa08906eff744ac9bd8198cfc3d72420cf.jpeg")
                                                .headers(headersUC11_1),
                                        http("request_27")
                                                .get(uri2 + "/cache/e/7/8/5/4/e7854c040bf140e32cc8bfdcaf8713033162609e.jpeg")
                                                .headers(headersUC11_1),
                                        http("request_28")
                                                .get(uri2 + "/build/images/opmoscow/loading.svg")
                                                .headers(headersUC11_1),
                                        http("request_29")
                                                .get("/metrika/tag.js")
                                                .headers(headersUC11_1),
                                        http("request_30")
                                                .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                        http("request_31")
                                                .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                        http("request_32")
                                                .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                        http("request_33")
                                                .get(uri2 + "/kandidaty")
                                                .headers(headersUC11_33),
                                        http("request_34")
                                                .get(uri2 + "/build/7255.871eb160.js")
                                                .headers(headersUC11_1),
                                        http("request_35")
                                                .get(uri2 + "/build/6889.3f713c69.js")
                                                .headers(headersUC11_1),
                                        http("request_36")
                                                .get(uri2 + "/build/7729.67d87565.js")
                                                .headers(headersUC11_1),
                                        http("request_37")
                                                .get(uri2 + "/build/8981.bc50772a.js")
                                                .headers(headersUC11_1),
                                        http("request_38")
                                                .get(uri2 + "/build/3734.2c5e1582.js")
                                                .headers(headersUC11_1),
                                        http("request_39")
                                                .get(uri2 + "/build/9154.f1370752.js")
                                                .headers(headersUC11_1),
                                        http("request_40")
                                                .get(uri2 + "/build/1676.2634f191.js")
                                                .headers(headersUC11_1),
                                        http("request_41")
                                                .get(uri2 + "/build/shtadopm_app_footer.9745ecad.js")
                                                .headers(headersUC11_1),
                                        http("request_42")
                                                .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
                                                .headers(headersUC11_1),
                                        http("request_43")
                                                .get(uri2 + "/build/images/shtadopm/favicon/favicon.ico")
                                                .headers(headersUC11_1),
                                        http("request_44")
                                                .get("/metrika/metrika_match.html")
                                                .headers(headersUC11_44),
                                        http("request_45")
                                                .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fkandidaty&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fzelyonye&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A963215201%3Az%3A300%3Ai%3A20240823183912%3Aet%3A1724420353%3Ac%3A1%3Arn%3A586053256%3Arqn%3A52%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C339%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724420352219%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724420353%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%B2%20%D0%B4%D0%B5%D0%BF%D1%83%D1%82%D0%B0%D1%82%D1%8B%20%D0%9C%D0%BE%D1%81%D0%B3%D0%BE%D1%80%D0%B4%D1%83%D0%BC%D1%8B%2C%20%D0%A2%D0%B8%D0%9D%D0%90%D0%9E%20%D0%B8%20%D0%9A%D1%83%D1%80%D0%BA%D0%B8%D0%BD%D0%BE%202024&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(1)cdl(na)eco(21037572)ti(1)")
                                                .headers(headersUC11_45)
                                )
                );

        HttpProtocolBuilder httpProtocol_CandidatesER = http
                .baseUrl("https://shtab.opmoscow.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersUC12_0 = new HashMap<>();
        headersUC12_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC12_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC12_0.put("sec-ch-ua-mobile", "?0");
        headersUC12_0.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC12_48 = new HashMap<>();
        headersUC12_48.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC12_48.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC12_48.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC12_48.put("priority", "u=0, i");
        headersUC12_48.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC12_48.put("sec-ch-ua-mobile", "?0");
        headersUC12_48.put("sec-ch-ua-platform", "Linux");
        headersUC12_48.put("sec-fetch-dest", "document");
        headersUC12_48.put("sec-fetch-mode", "navigate");
        headersUC12_48.put("sec-fetch-site", "same-origin");
        headersUC12_48.put("sec-fetch-user", "?1");
        headersUC12_48.put("upgrade-insecure-requests", "1");
        headersUC12_48.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC12_74 = new HashMap<>();
        headersUC12_74.put("Upgrade-Insecure-Requests", "1");
        headersUC12_74.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC12_74.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC12_74.put("sec-ch-ua-mobile", "?0");
        headersUC12_74.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC12_75 = new HashMap<>();
        headersUC12_75.put("accept", "*/*");
        headersUC12_75.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC12_75.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC12_75.put("origin", "https://shtab.opmoscow.ru");
        headersUC12_75.put("priority", "u=1, i");
        headersUC12_75.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC12_75.put("sec-ch-ua-mobile", "?0");
        headersUC12_75.put("sec-ch-ua-platform", "Linux");
        headersUC12_75.put("sec-fetch-dest", "empty");
        headersUC12_75.put("sec-fetch-mode", "cors");
        headersUC12_75.put("sec-fetch-site", "cross-site");
        headersUC12_75.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        String uri1 = "https://mc.yandex.ru";

        ScenarioBuilder scnUC12 = scenario("Y2024.CandidatesER")
                .exec(
                        http("request_0")
                                .get("/build/5758.f38a32ed.css")
                                .headers(headersUC12_0)
                                .resources(
                                        http("request_1")
                                                .get("/build/6395.76430bbc.css")
                                                .headers(headersUC12_0),
                                        http("request_2")
                                                .get("/build/8886.31d6cfe0.css")
                                                .headers(headersUC12_0),
                                        http("request_3")
                                                .get("/build/shtadopm_css_head.dfe3f750.css")
                                                .headers(headersUC12_0),
                                        http("request_4")
                                                .get("/build/runtime.aaa04269.js")
                                                .headers(headersUC12_0),
                                        http("request_5")
                                                .get("/build/9755.89d0240d.js")
                                                .headers(headersUC12_0),
                                        http("request_6")
                                                .get("/build/shtadopm_app_head.a800bb8d.js")
                                                .headers(headersUC12_0),
                                        http("request_7")
                                                .get("/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
                                                .headers(headersUC12_0),
                                        http("request_8")
                                                .get("/build/images/shtadopm/menu-arrow.svg")
                                                .headers(headersUC12_0),
                                        http("request_9")
                                                .get("/cache/f/c/e/b/6/fceb652d4b4aed86e4b7baf387f1da74ddde1e79.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_10")
                                                .get("/cache/6/c/3/b/4/6c3b4ab4c8aa8746a2a4855e03a2bd15c60c4ce3.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_11")
                                                .get("/cache/5/1/f/e/a/51feafea52abd4cd4d5428a70731f95720eccb9b.png")
                                                .headers(headersUC12_0),
                                        http("request_12")
                                                .get("/cache/f/7/9/6/d/f796dd12f583c524e35df7e2541fea9a0dcc8763.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_13")
                                                .get("/cache/4/4/2/a/f/442af39a0353822e89f8751c1435be9e8d40753b.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_14")
                                                .get("/cache/d/a/a/e/1/daae1d18bec766a897a5c77db1ae254661c737ec.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_15")
                                                .get("/cache/c/2/e/2/a/c2e2ab4c04d799e96be1098062c00129a2dbf7a6.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_16")
                                                .get("/cache/a/3/9/c/e/a39ce9aa3137b8e066a478a8ac1d14dfedcb2de3.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_17")
                                                .get("/cache/7/7/0/d/9/770d9fc83f16fed1980973c8efe85e61b5594c44.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_18")
                                                .get("/cache/d/b/c/e/6/dbce6580536664696ca05ffa2f42a8591fbd6f6b.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_19")
                                                .get("/cache/2/1/e/b/4/21eb40436dbbeda1c94a4319e521e6c1f6d2eda8.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_20")
                                                .get("/cache/3/2/6/c/4/326c4ae6c4fa373c1c168e9ef3acfb0b3c1a41e1.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_21")
                                                .get("/cache/8/c/b/6/6/8cb66e3a86ee809cda5272d1c99330db8c184ee8.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_22")
                                                .get("/cache/c/e/7/4/b/ce74b1b75e622a8737f27237374d601adc286fc4.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_23")
                                                .get("/cache/a/0/0/e/6/a00e69ff3a93b52ed19a690b4f738b44440c7ebd.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_24")
                                                .get("/cache/8/0/f/4/c/80f4cc7693daec2150be2f5d4d1c8a17475beb91.png")
                                                .headers(headersUC12_0),
                                        http("request_25")
                                                .get("/cache/5/6/d/9/c/56d9c60a0c81c7dbe9344853d0466c6d14b835c6.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_26")
                                                .get("/cache/8/1/6/7/b/8167bd55d09b1bda8e31413af63a594fd61d84e5.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_27")
                                                .get("/cache/e/f/2/e/8/ef2e835cad41372c5637342dbf6d35c83f8065bc.png")
                                                .headers(headersUC12_0),
                                        http("request_28")
                                                .get("/cache/8/8/3/d/9/883d94470ccd3081598e5e2654665e845dc40672.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_29")
                                                .get("/cache/0/2/0/b/8/020b8ed38c743ec77f2adde321713a4711343f40.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_30")
                                                .get("/cache/c/f/d/c/0/cfdc0483309de521e14a94543008b31f689dc1a3.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_31")
                                                .get("/cache/9/2/f/3/e/92f3e42fe1444d4cf842d4e7d8d2c1e8b212c2de.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_32")
                                                .get("/cache/5/a/8/c/2/5a8c226f35985d4ce0cbdf2d5e984a548dcfa49f.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_33")
                                                .get("/cache/9/5/0/0/3/9500394911ef8b8559298c203d0445e67c275b6d.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_34")
                                                .get("/cache/8/a/b/d/e/8abde7a7e9c157cf88e84bf54af888fa80c29fc8.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_35")
                                                .get("/cache/b/c/2/1/d/bc21de5e69cce47d141335c1a0f9d33f1c05d136.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_36")
                                                .get("/cache/f/d/9/4/b/fd94b8fcb47518ad965e1c42f87bff34c57d8026.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_37")
                                                .get("/cache/7/2/9/1/4/729149adbb5d139787fe5552b2686c6302dde2f8.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_38")
                                                .get("/cache/e/a/4/5/9/ea459f9e19ba374311a376c29022c4077734464c.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_39")
                                                .get("/cache/5/4/1/1/b/5411bca2dd5c9370edb4d068532511032510d92a.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_40")
                                                .get("/cache/d/0/4/8/7/d0487a483794eef75b12e367ccd937b9ae58d678.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_41")
                                                .get("/cache/f/4/a/6/d/f4a6d3af80ffd0210021e8f26dc54ebfe044c70f.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_42")
                                                .get("/cache/5/1/6/5/4/51654203b4a2294bb6ba8da653cb28b2d924ecbd.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_43")
                                                .get("/cache/1/b/2/3/7/1b237d4d24fd12f7e95f3b6aa9871c192b5228b2.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_44")
                                                .get(uri1 + "/metrika/tag.js")
                                                .headers(headersUC12_0),
                                        http("request_45")
                                                .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                        http("request_46")
                                                .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                        http("request_47")
                                                .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                        http("request_48")
                                                .get("/party/view/edinaya-rossiya")
                                                .headers(headersUC12_48),
                                        http("request_49")
                                                .get("/cache/7/5/5/9/a/7559a2ec93c71cd4dc90234552548691b1ccdcf0.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_50")
                                                .get("/cache/9/0/5/c/f/905cf59e9534c8c96d159989f7af16f33f62118b.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_51")
                                                .get("/cache/2/5/d/1/1/25d1101b9418d0f70316bd9e3f1d17fee96903f8.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_52")
                                                .get("/cache/e/2/7/f/f/e27ffc7eb1f2e5377522abefd667f777244365e8.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_53")
                                                .get("/cache/4/e/e/c/f/4eecf4bb075668788e653f0c90d77ca7cfca7c0b.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_54")
                                                .get("/cache/9/3/a/d/c/93adce31689b303c0d0232d864de78432b856ffd.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_55")
                                                .get("/cache/d/5/d/6/5/d5d65dc3a4c18c96e8ad6f6e76e925fbf30d82d3.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_56")
                                                .get("/cache/8/4/4/e/3/844e348e57b6222d14fd17d41c71b06e41f2ad5a.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_57")
                                                .get("/cache/5/e/c/b/3/5ecb3d3006cb821cd4e2a135df5bda1c83a1fcf9.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_58")
                                                .get("/cache/8/7/0/d/7/870d74c0a93b99dfa2bc696cb199e0682ecf352e.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_59")
                                                .get("/cache/a/7/8/9/7/a789730a10a90758634cea4a3504c6f04fe9985e.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_60")
                                                .get("/cache/8/a/7/3/e/8a73ea9d204bf67f19cdc318fd99d4f47e8fd2ab.png")
                                                .headers(headersUC12_0),
                                        http("request_61")
                                                .get("/cache/8/6/8/d/2/868d22921a247d4864fbe845a48d19af40b7b27d.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_62")
                                                .get("/cache/9/7/e/8/d/97e8d6cc27dac7286afd8668d6d5f544b371ea0a.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_63")
                                                .get("/cache/5/b/b/c/f/5bbcf05888e729bd69d16144401a6050ba04c67e.jpeg")
                                                .headers(headersUC12_0),
                                        http("request_64")
                                                .get("/build/7255.871eb160.js")
                                                .headers(headersUC12_0),
                                        http("request_65")
                                                .get("/build/6889.3f713c69.js")
                                                .headers(headersUC12_0),
                                        http("request_66")
                                                .get("/build/7729.67d87565.js")
                                                .headers(headersUC12_0),
                                        http("request_67")
                                                .get("/build/8981.bc50772a.js")
                                                .headers(headersUC12_0),
                                        http("request_68")
                                                .get("/build/3734.2c5e1582.js")
                                                .headers(headersUC12_0),
                                        http("request_69")
                                                .get("/build/9154.f1370752.js")
                                                .headers(headersUC12_0),
                                        http("request_70")
                                                .get("/build/1676.2634f191.js")
                                                .headers(headersUC12_0),
                                        http("request_71")
                                                .get("/build/shtadopm_app_footer.9745ecad.js")
                                                .headers(headersUC12_0),
                                        http("request_72")
                                                .get("/build/images/shtadopm/favicon/site.webmanifest")
                                                .headers(headersUC12_0),
                                        http("request_73")
                                                .get("/build/images/shtadopm/favicon/favicon.ico")
                                                .headers(headersUC12_0),
                                        http("request_74")
                                                .get(uri1 + "/metrika/metrika_match.html")
                                                .headers(headersUC12_74),
                                        http("request_75")
                                                .get(uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fedinaya-rossiya&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fkandidaty&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A554287457%3Az%3A300%3Ai%3A20240823184020%3Aet%3A1724420421%3Ac%3A1%3Arn%3A307530342%3Arqn%3A54%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C559%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724420420107%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724420421%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%B2%20%D0%B4%D0%B5%D0%BF%D1%83%D1%82%D0%B0%D1%82%D1%8B%20%D0%9C%D0%BE%D1%81%D0%B3%D0%BE%D1%80%D0%B4%D1%83%D0%BC%D1%8B%2C%20%D0%A2%D0%B8%D0%9D%D0%90%D0%9E%20%D0%B8%20%D0%9A%D1%83%D1%80%D0%BA%D0%B8%D0%BD%D0%BE%202024%20%D0%BE%D1%82%20%D0%BF%D0%B0%D1%80%D1%82%D0%B8%D0%B8%20%D0%95%D0%B4%D0%B8%D0%BD%D0%B0%D1%8F%20%D0%A0%D0%BE%D1%81%D1%81%D0%B8%D1%8F&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(1)cdl(na)eco(21037572)ti(1)")
                                                .headers(headersUC12_75)
                                )
                );

        HttpProtocolBuilder httpProtocol_CandidatesKPRF = http
                .baseUrl("https://shtab.opmoscow.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersUC13_0 = new HashMap<>();
        headersUC13_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC13_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC13_0.put("sec-ch-ua-mobile", "?0");
        headersUC13_0.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC13_49 = new HashMap<>();
        headersUC13_49.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC13_49.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC13_49.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC13_49.put("priority", "u=0, i");
        headersUC13_49.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC13_49.put("sec-ch-ua-mobile", "?0");
        headersUC13_49.put("sec-ch-ua-platform", "Linux");
        headersUC13_49.put("sec-fetch-dest", "document");
        headersUC13_49.put("sec-fetch-mode", "navigate");
        headersUC13_49.put("sec-fetch-site", "same-origin");
        headersUC13_49.put("sec-fetch-user", "?1");
        headersUC13_49.put("upgrade-insecure-requests", "1");
        headersUC13_49.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC13_74 = new HashMap<>();
        headersUC13_74.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC13_74.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC13_74.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC13_74.put("priority", "u=0, i");
        headersUC13_74.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC13_74.put("sec-ch-ua-mobile", "?0");
        headersUC13_74.put("sec-ch-ua-platform", "Linux");
        headersUC13_74.put("sec-fetch-dest", "iframe");
        headersUC13_74.put("sec-fetch-mode", "navigate");
        headersUC13_74.put("sec-fetch-site", "cross-site");
        headersUC13_74.put("upgrade-insecure-requests", "1");
        headersUC13_74.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC13_75 = new HashMap<>();
        headersUC13_75.put("accept", "*/*");
        headersUC13_75.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC13_75.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC13_75.put("origin", "https://shtab.opmoscow.ru");
        headersUC13_75.put("priority", "u=1, i");
        headersUC13_75.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC13_75.put("sec-ch-ua-mobile", "?0");
        headersUC13_75.put("sec-ch-ua-platform", "Linux");
        headersUC13_75.put("sec-fetch-dest", "empty");
        headersUC13_75.put("sec-fetch-mode", "cors");
        headersUC13_75.put("sec-fetch-site", "cross-site");
        headersUC13_75.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        String UC13_uri1 = "https://mc.yandex.ru";

        ScenarioBuilder scnUC13 = scenario("Y2024.CandidatesKPRF")
                .exec(
                        http("request_0")
                                .get("/build/5758.f38a32ed.css")
                                .headers(headersUC13_0)
                                .resources(
                                        http("request_1")
                                                .get("/build/6395.76430bbc.css")
                                                .headers(headersUC13_0),
                                        http("request_2")
                                                .get("/build/8886.31d6cfe0.css")
                                                .headers(headersUC13_0),
                                        http("request_3")
                                                .get("/build/shtadopm_css_head.dfe3f750.css")
                                                .headers(headersUC13_0),
                                        http("request_4")
                                                .get("/build/runtime.aaa04269.js")
                                                .headers(headersUC13_0),
                                        http("request_5")
                                                .get("/build/9755.89d0240d.js")
                                                .headers(headersUC13_0),
                                        http("request_6")
                                                .get("/build/shtadopm_app_head.a800bb8d.js")
                                                .headers(headersUC13_0),
                                        http("request_7")
                                                .get("/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
                                                .headers(headersUC13_0),
                                        http("request_8")
                                                .get("/build/images/shtadopm/menu-arrow.svg")
                                                .headers(headersUC13_0),
                                        http("request_9")
                                                .get("/cache/f/c/e/b/6/fceb652d4b4aed86e4b7baf387f1da74ddde1e79.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_10")
                                                .get("/cache/6/c/3/b/4/6c3b4ab4c8aa8746a2a4855e03a2bd15c60c4ce3.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_11")
                                                .get("/cache/5/1/f/e/a/51feafea52abd4cd4d5428a70731f95720eccb9b.png")
                                                .headers(headersUC13_0),
                                        http("request_12")
                                                .get("/cache/f/7/9/6/d/f796dd12f583c524e35df7e2541fea9a0dcc8763.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_13")
                                                .get("/cache/4/4/2/a/f/442af39a0353822e89f8751c1435be9e8d40753b.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_14")
                                                .get("/cache/d/a/a/e/1/daae1d18bec766a897a5c77db1ae254661c737ec.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_15")
                                                .get("/cache/c/2/e/2/a/c2e2ab4c04d799e96be1098062c00129a2dbf7a6.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_16")
                                                .get("/cache/a/3/9/c/e/a39ce9aa3137b8e066a478a8ac1d14dfedcb2de3.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_17")
                                                .get("/cache/f/c/b/b/5/fcbb52286931297bc81767bf546f6e7e1598f309.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_18")
                                                .get("/cache/4/2/a/8/f/42a8fc44f7037c3b00198c2de5efc54a5ef1be3b.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_19")
                                                .get("/cache/2/b/e/9/5/2be9547c10349bcd6bf07699a793be4bbb64d948.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_20")
                                                .get("/cache/1/2/0/d/7/120d7d7f25e681a801f292dbff29fc06194a51a5.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_21")
                                                .get("/cache/9/a/9/3/d/9a93dfb6167b38a18b7106214c4c1bea4e90b513.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_22")
                                                .get("/cache/2/b/e/d/f/2bedf909001f8d8517156acf3158d92bcd072862.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_23")
                                                .get("/cache/7/f/7/0/1/7f701569753338b92c139d278f3ba8b3fb6fb9e2.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_24")
                                                .get("/cache/7/5/b/3/9/75b39d240ba9771f0fa972b1590d9474734e0e40.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_25")
                                                .get("/cache/e/9/7/c/6/e97c6acbd515443e779f1913b157e364b43974e1.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_26")
                                                .get("/cache/3/b/b/8/2/3bb826762205d7f20fa361da159be30b80e7e3f1.png")
                                                .headers(headersUC13_0),
                                        http("request_27")
                                                .get("/cache/8/a/c/a/f/8acafdb68b8430fa6dd864ca7f84d35334ecc98e.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_28")
                                                .get("/cache/e/2/6/c/1/e26c1a1f955096e2d9dd1d240fb48d26dd2879eb.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_29")
                                                .get("/cache/e/5/e/a/8/e5ea834da9f5372d364177d21928a525f70bfacd.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_30")
                                                .get("/cache/d/9/a/c/7/d9ac7c98caa4042118582f4fafdc3cbd06e8ca79.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_31")
                                                .get("/cache/7/1/b/d/8/71bd886d9c4f746a6a867ec9ac4d63ce2ea110b6.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_32")
                                                .get("/cache/2/3/8/e/5/238e57533a6aa104f7f98c41435555053103d3ad.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_33")
                                                .get("/cache/7/4/4/d/d/744dd843d10bcc93e56248039d8064c43e1c2032.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_34")
                                                .get("/cache/0/3/4/3/2/03432100c44db7ee51bde31e4857f1014844856b.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_35")
                                                .get("/cache/b/4/f/8/c/b4f8ce61c766b3a6d89a83ab026a90f2d94f15d0.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_36")
                                                .get("/cache/b/7/7/8/4/b7784349c04e2f00dbaa15ffbe9775fe05e2899f.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_37")
                                                .get("/cache/e/0/5/7/8/e05783c3a49e0021de817903302b8414fb46f9b1.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_38")
                                                .get("/cache/9/2/4/5/7/92457e7b6859d855253152084f1d6ac1bae3fd24.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_39")
                                                .get("/cache/4/e/3/7/4/4e374acc137ad102b8238d4b3cf4eabdb4b77c29.png")
                                                .headers(headersUC13_0),
                                        http("request_40")
                                                .get("/cache/5/1/e/3/0/51e30c7b2e63f13d97e0701cf2f0446896bfc2f3.png")
                                                .headers(headersUC13_0),
                                        http("request_41")
                                                .get("/cache/8/2/9/7/2/82972024ef49f37480c04e108e7262b6a9a2b508.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_42")
                                                .get("/cache/1/1/f/1/9/11f198e3c153294706800c40d0048c1d5cbdcf2a.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_43")
                                                .get("/cache/1/9/7/4/f/1974f1befe50b9c48e53619d88082505c0143c2d.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_44")
                                                .get("/cache/5/f/9/6/3/5f963b3042f145555e6fc8fae58497dcef919731.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_45")
                                                .get(UC13_uri1 + "/metrika/tag.js")
                                                .headers(headersUC13_0),
                                        http("request_46")
                                                .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                        http("request_47")
                                                .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                        http("request_48")
                                                .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                        http("request_49")
                                                .get("/party/view/kprf")
                                                .headers(headersUC13_49),
                                        http("request_50")
                                                .get("/cache/9/a/9/3/6/9a936d62f9c8e0bb6ba92966bbd9b9843bc6fd9b.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_51")
                                                .get("/cache/3/c/c/7/1/3cc71325ea14d314ecde2859f19f56b0c9e5f5be.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_52")
                                                .get("/cache/a/b/9/d/2/ab9d2cb50b67558fa07edecb67db3ce02f462a3b.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_53")
                                                .get("/cache/3/f/d/2/d/3fd2d661121582944803ba094333c15f973e1be2.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_54")
                                                .get("/cache/6/2/4/f/0/624f0e29e55d1ccb9bd66277a0d1206d93973b23.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_55")
                                                .get("/cache/8/6/2/5/4/86254a7d8c72fa2b8cc07fb47010548152746851.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_56")
                                                .get("/cache/d/a/8/5/8/da8588bec3051a685d6f53147cab321da45e13c6.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_57")
                                                .get("/cache/a/4/4/e/6/a44e6a2681b634c0f0107fd201d2c594c2280d8b.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_58")
                                                .get("/cache/8/3/a/0/3/83a0334607f2cd42833fb2c731bd6144e93fa0ee.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_59")
                                                .get("/cache/1/4/6/5/0/14650f75b396152cc67b2e58aae4b0caad6a0138.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_60")
                                                .get("/cache/b/b/2/6/9/bb269e4b384cf118b8b2e49f0a921067b78d484e.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_61")
                                                .get("/cache/e/a/b/8/8/eab88c26ecf12083a408d684baca215f82815488.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_62")
                                                .get("/cache/9/9/7/8/3/99783494aed4e68017e6ede5cc9a41512191de4e.png")
                                                .headers(headersUC13_0),
                                        http("request_63")
                                                .get("/cache/4/0/7/e/a/407ea411eac9304237fc18301b973e9d4b638b0f.jpeg")
                                                .headers(headersUC13_0),
                                        http("request_64")
                                                .get("/build/7255.871eb160.js")
                                                .headers(headersUC13_0),
                                        http("request_65")
                                                .get("/build/6889.3f713c69.js")
                                                .headers(headersUC13_0),
                                        http("request_66")
                                                .get("/build/7729.67d87565.js")
                                                .headers(headersUC13_0),
                                        http("request_67")
                                                .get("/build/8981.bc50772a.js")
                                                .headers(headersUC13_0),
                                        http("request_68")
                                                .get("/build/3734.2c5e1582.js")
                                                .headers(headersUC13_0),
                                        http("request_69")
                                                .get("/build/9154.f1370752.js")
                                                .headers(headersUC13_0),
                                        http("request_70")
                                                .get("/build/1676.2634f191.js")
                                                .headers(headersUC13_0),
                                        http("request_71")
                                                .get("/build/shtadopm_app_footer.9745ecad.js")
                                                .headers(headersUC13_0),
                                        http("request_72")
                                                .get("/build/images/shtadopm/favicon/site.webmanifest")
                                                .headers(headersUC13_0),
                                        http("request_73")
                                                .get("/build/images/shtadopm/favicon/favicon.ico")
                                                .headers(headersUC13_0),
                                        http("request_74")
                                                .get(UC13_uri1 + "/metrika/metrika_match.html")
                                                .headers(headersUC13_74),
                                        http("request_75")
                                                .get(UC13_uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fkprf&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A938525320%3Az%3A300%3Ai%3A20240823184612%3Aet%3A1724420772%3Ac%3A1%3Arn%3A41154201%3Arqn%3A63%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C585%2C%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724420771480%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724420772%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%BE%D1%82%20%D0%BF%D0%B0%D1%80%D1%82%D0%B8%D0%B8%20%D0%9A%D0%9F%D0%A0%D0%A4&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                                .headers(headersUC13_75)
                                )
                );

        HttpProtocolBuilder httpProtocol_CandidatesSR = http
                .baseUrl("https://shtab.opmoscow.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersUC14_0 = new HashMap<>();
        headersUC14_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC14_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC14_0.put("sec-ch-ua-mobile", "?0");
        headersUC14_0.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC14_41 = new HashMap<>();
        headersUC14_41.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC14_41.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC14_41.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC14_41.put("priority", "u=0, i");
        headersUC14_41.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC14_41.put("sec-ch-ua-mobile", "?0");
        headersUC14_41.put("sec-ch-ua-platform", "Linux");
        headersUC14_41.put("sec-fetch-dest", "document");
        headersUC14_41.put("sec-fetch-mode", "navigate");
        headersUC14_41.put("sec-fetch-site", "same-origin");
        headersUC14_41.put("sec-fetch-user", "?1");
        headersUC14_41.put("upgrade-insecure-requests", "1");
        headersUC14_41.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC14_50 = new HashMap<>();
        headersUC14_50.put("Upgrade-Insecure-Requests", "1");
        headersUC14_50.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC14_50.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC14_50.put("sec-ch-ua-mobile", "?0");
        headersUC14_50.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC14_51 = new HashMap<>();
        headersUC14_51.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
        headersUC14_51.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC14_51.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC14_51.put("priority", "i");
        headersUC14_51.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC14_51.put("sec-ch-ua-mobile", "?0");
        headersUC14_51.put("sec-ch-ua-platform", "Linux");
        headersUC14_51.put("sec-fetch-dest", "image");
        headersUC14_51.put("sec-fetch-mode", "no-cors");
        headersUC14_51.put("sec-fetch-site", "same-origin");
        headersUC14_51.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC14_74 = new HashMap<>();
        headersUC14_74.put("accept", "*/*");
        headersUC14_74.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC14_74.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC14_74.put("origin", "https://shtab.opmoscow.ru");
        headersUC14_74.put("priority", "u=1, i");
        headersUC14_74.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC14_74.put("sec-ch-ua-mobile", "?0");
        headersUC14_74.put("sec-ch-ua-platform", "Linux");
        headersUC14_74.put("sec-fetch-dest", "empty");
        headersUC14_74.put("sec-fetch-mode", "cors");
        headersUC14_74.put("sec-fetch-site", "cross-site");
        headersUC14_74.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        String UC14_uri1 = "https://mc.yandex.ru";

        ScenarioBuilder scnUC14 = scenario("CandidatesSR")
                .exec(
                        http("request_0")
                                .get("/build/5758.f38a32ed.css")
                                .headers(headersUC14_0)
                                .resources(
                                        http("request_1")
                                                .get("/build/6395.76430bbc.css")
                                                .headers(headersUC14_0),
                                        http("request_2")
                                                .get("/build/8886.31d6cfe0.css")
                                                .headers(headersUC14_0),
                                        http("request_3")
                                                .get("/build/shtadopm_css_head.dfe3f750.css")
                                                .headers(headersUC14_0),
                                        http("request_4")
                                                .get("/build/runtime.aaa04269.js")
                                                .headers(headersUC14_0),
                                        http("request_5")
                                                .get("/build/9755.89d0240d.js")
                                                .headers(headersUC14_0),
                                        http("request_6")
                                                .get("/build/shtadopm_app_head.a800bb8d.js")
                                                .headers(headersUC14_0),
                                        http("request_7")
                                                .get("/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
                                                .headers(headersUC14_0),
                                        http("request_8")
                                                .get("/build/images/shtadopm/menu-arrow.svg")
                                                .headers(headersUC14_0),
                                        http("request_9")
                                                .get(UC14_uri1 + "/metrika/tag.js")
                                                .headers(headersUC14_0),
                                        http("request_10")
                                                .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                        http("request_11")
                                                .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                        http("request_12")
                                                .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                        http("request_13")
                                                .get("/cache/f/c/e/b/6/fceb652d4b4aed86e4b7baf387f1da74ddde1e79.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_14")
                                                .get("/cache/6/c/3/b/4/6c3b4ab4c8aa8746a2a4855e03a2bd15c60c4ce3.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_15")
                                                .get("/cache/5/1/f/e/a/51feafea52abd4cd4d5428a70731f95720eccb9b.png")
                                                .headers(headersUC14_0),
                                        http("request_16")
                                                .get("/cache/f/7/9/6/d/f796dd12f583c524e35df7e2541fea9a0dcc8763.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_17")
                                                .get("/cache/4/4/2/a/f/442af39a0353822e89f8751c1435be9e8d40753b.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_18")
                                                .get("/cache/d/a/a/e/1/daae1d18bec766a897a5c77db1ae254661c737ec.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_19")
                                                .get("/cache/c/2/e/2/a/c2e2ab4c04d799e96be1098062c00129a2dbf7a6.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_20")
                                                .get("/cache/a/3/9/c/e/a39ce9aa3137b8e066a478a8ac1d14dfedcb2de3.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_21")
                                                .get("/cache/1/e/4/c/3/1e4c3705a53a062c9c969e87e3803c04c3d118d5.png")
                                                .headers(headersUC14_0),
                                        http("request_22")
                                                .get("/cache/8/0/2/f/8/802f84992255d0ba503ad037ffae62e671bad504.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_23")
                                                .get("/cache/2/9/3/3/9/29339fcee8b90a70ca81eb11cbd80a9bc4b42818.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_24")
                                                .get("/cache/3/8/f/3/7/38f3728ac4cdc557cddfc253126d4245d7e17d6f.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_25")
                                                .get("/cache/6/b/8/2/2/6b822478316ae5a09164d337db00c87170192bbd.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_26")
                                                .get("/cache/4/a/d/2/6/4ad267f7960c4a1e58b63b53bd20065dd424d360.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_27")
                                                .get("/cache/f/2/e/a/a/f2eaaa5869c958ca98dac25b3901c6afb002245b.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_28")
                                                .get("/cache/9/9/1/4/f/9914ff311d769f57ad7b03ea15d7f57cbfa4e0e4.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_29")
                                                .get("/cache/d/b/f/5/4/dbf5441379030ebb65b4151ed9de586879b04b3c.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_30")
                                                .get("/cache/7/5/0/0/7/75007d8b3ad43ff29acbf58168cb20b71f60dab7.png")
                                                .headers(headersUC14_0),
                                        http("request_31")
                                                .get("/cache/d/4/2/6/3/d42638da9e390d149688a8bba62f36f4232fb658.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_32")
                                                .get("/cache/3/a/f/0/2/3af02853de016370855d55d9a40c64e5bdb1c213.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_33")
                                                .get("/cache/0/0/7/2/e/0072ed6f837e7aba39ab6a8253358829dd52ca71.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_34")
                                                .get("/cache/f/4/d/7/6/f4d765d67d7614bc1fef76e658f3104f92c84c8b.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_35")
                                                .get("/cache/e/0/e/9/3/e0e93490420225aa06326db53f301e98eee20409.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_36")
                                                .get("/cache/5/f/7/0/7/5f707a2ded20ff0d8b3e8da69b3b6412c0e7528b.png")
                                                .headers(headersUC14_0),
                                        http("request_37")
                                                .get("/cache/2/a/8/4/4/2a8448329d59efae112dfe14f16b46565f6b4992.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_38")
                                                .get("/cache/7/0/f/a/d/70fad1440198abdd0435f5ec098a3807b570ce0c.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_39")
                                                .get("/cache/3/3/9/1/f/3391f92c2e81fb25591df0aaddc7cccdc0be6874.jpeg")
                                                .headers(headersUC14_0),
                                        http("request_40")
                                                .get("/cache/e/d/a/7/a/eda7abcf8082fedb5940b04b59ba1bb5ee5f9597.png")
                                                .headers(headersUC14_0),
                                        http("request_41")
                                                .get("/party/view/spravedlivaya-rossiya--za-pravdu")
                                                .headers(headersUC14_41),
                                        http("request_42")
                                                .get("/build/7255.871eb160.js")
                                                .headers(headersUC14_0),
                                        http("request_43")
                                                .get("/build/6889.3f713c69.js")
                                                .headers(headersUC14_0),
                                        http("request_44")
                                                .get("/build/7729.67d87565.js")
                                                .headers(headersUC14_0),
                                        http("request_45")
                                                .get("/build/8981.bc50772a.js")
                                                .headers(headersUC14_0),
                                        http("request_46")
                                                .get("/build/3734.2c5e1582.js")
                                                .headers(headersUC14_0),
                                        http("request_47")
                                                .get("/build/9154.f1370752.js")
                                                .headers(headersUC14_0),
                                        http("request_48")
                                                .get("/build/1676.2634f191.js")
                                                .headers(headersUC14_0),
                                        http("request_49")
                                                .get("/build/shtadopm_app_footer.9745ecad.js")
                                                .headers(headersUC14_0),
                                        http("request_50")
                                                .get(UC14_uri1 + "/metrika/metrika_match.html")
                                                .headers(headersUC14_50),
                                        http("request_51")
                                                .get("/cache/7/3/8/8/2/73882d61fbbbf795e0ce0ddda54cf12c32fc2de9.jpeg")
                                                .headers(headersUC14_51),
                                        http("request_52")
                                                .get("/cache/9/d/1/1/2/9d11215cd51349f7a4df73dfc217488d12c58ca5.png")
                                                .headers(headersUC14_51),
                                        http("request_53")
                                                .get("/cache/b/f/d/0/f/bfd0f8ca603f0adac4bd2bb54988977a6404d5e0.jpeg")
                                                .headers(headersUC14_51),
                                        http("request_54")
                                                .get("/build/images/shtadopm/favicon/site.webmanifest")
                                                .headers(headersUC14_0),
                                        http("request_55")
                                                .get("/cache/4/4/e/5/f/44e5f3a06b3967bcc205a9f0e6bc078a62315ea0.jpeg")
                                                .headers(headersUC14_51),
                                        http("request_56")
                                                .get("/cache/2/4/c/b/7/24cb7b68f086fa08dcbce5ce588d651abd19117b.jpeg")
                                                .headers(headersUC14_51),
                                        http("request_57")
                                                .get("/cache/d/d/6/e/d/dd6ed71641c4a121f861b2c0cd312694fa192efe.jpeg")
                                                .headers(headersUC14_51),
                                        http("request_58")
                                                .get("/cache/5/6/0/9/e/5609e1d4362e02b3da70c18da281c482bd7a9616.jpeg")
                                                .headers(headersUC14_51),
                                        http("request_59")
                                                .get("/cache/8/b/1/6/2/8b162c67e20920f4fa81b44256443bc2dd455dba.jpeg")
                                                .headers(headersUC14_51),
                                        http("request_60")
                                                .get("/cache/9/6/2/0/f/9620f5a58bb263c0984c6e2917791953a5bd5155.jpeg")
                                                .headers(headersUC14_51),
                                        http("request_61")
                                                .get("/cache/9/6/9/d/6/969d68a4456fe3580343da3afae3c6d2da11b567.jpeg")
                                                .headers(headersUC14_51),
                                        http("request_62")
                                                .get("/cache/0/b/4/9/9/0b499989d77a3622e260ed65729438c1de5bca39.jpeg")
                                                .headers(headersUC14_51),
                                        http("request_63")
                                                .get("/cache/a/e/7/d/d/ae7dd8bc16e319711217ca2c1eed2c2185dc60ba.jpeg")
                                                .headers(headersUC14_51),
                                        http("request_64")
                                                .get("/cache/e/b/2/b/8/eb2b8198da4633b480d731b7bffb86b558729f70.jpeg")
                                                .headers(headersUC14_51),
                                        http("request_65")
                                                .get("/cache/a/1/5/c/9/a15c974b6fb05caf4bfa265a3183001ea0b84919.jpeg")
                                                .headers(headersUC14_51),
                                        http("request_66")
                                                .get("/cache/8/1/d/8/6/81d868f71115de5ff6be783abc6ce9671d2f149c.jpeg")
                                                .headers(headersUC14_51),
                                        http("request_67")
                                                .get("/cache/f/f/5/9/8/ff598ec78b78b06fe355e8876a4bcc67000fc617.jpeg")
                                                .headers(headersUC14_51),
                                        http("request_68")
                                                .get("/cache/b/9/4/7/3/b9473801a53869d379b19ca0ec5b71d31439037f.jpeg")
                                                .headers(headersUC14_51),
                                        http("request_69")
                                                .get("/cache/5/e/3/f/6/5e3f67b90da3a10c53921b1046cf73456ea925c6.jpeg")
                                                .headers(headersUC14_51),
                                        http("request_70")
                                                .get("/cache/e/9/7/9/0/e9790585f058982acf327ff8b0d33088e094c0f3.jpeg")
                                                .headers(headersUC14_51),
                                        http("request_71")
                                                .get("/cache/9/f/8/7/2/9f8725a2cf2639bdef090c94ae9459b2b2fd7d8b.jpeg")
                                                .headers(headersUC14_51),
                                        http("request_72")
                                                .get("/cache/d/0/1/5/6/d0156e80d95f2ab2d6f7e617252c9199d1e39df3.jpeg")
                                                .headers(headersUC14_51),
                                        http("request_73")
                                                .get("/cache/b/1/d/b/9/b1db9213644e025d4958f7cdb39e56e51f802c6c.jpeg")
                                                .headers(headersUC14_51),
                                        http("request_74")
                                                .get(UC14_uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fspravedlivaya-rossiya--za-pravdu&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fkprf&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A792086320%3Az%3A300%3Ai%3A20240823184755%3Aet%3A1724420875%3Ac%3A1%3Arn%3A814962355%3Arqn%3A65%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C678%2C%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724420874550%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724420875%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%BE%D1%82%20%D0%BF%D0%B0%D1%80%D1%82%D0%B8%D0%B8%20%D0%A1%D0%BF%D1%80%D0%B0%D0%B2%D0%B5%D0%B4%D0%BB%D0%B8%D0%B2%D0%B0%D1%8F%20%D0%A0%D0%BE%D1%81%D1%81%D0%B8%D1%8F%20%E2%80%93%20%D0%97%D0%B0%20%D0%BF%D1%80%D0%B0%D0%B2%D0%B4%D1%83&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                                .headers(headersUC14_74),
                                        http("request_75")
                                                .get("/cache/b/b/2/4/7/bb2477eb69db739520cf4ed181aa7906d3a5b228.png")
                                                .headers(headersUC14_51),
                                        http("request_76")
                                                .get("/cache/a/1/7/6/9/a1769b12a5a0fc03e05719282a25caf61345c796.jpeg")
                                                .headers(headersUC14_51)
                                )
                );

        HttpProtocolBuilder httpProtocol_CandidatesCommunistsRus = http
                .baseUrl("https://shtab.opmoscow.ru")
                .inferHtmlResources()
                ;


        Map<CharSequence, String> headersUC15_0 = new HashMap<>();
        headersUC15_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC15_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC15_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC15_0.put("priority", "u=0, i");
        headersUC15_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC15_0.put("sec-ch-ua-mobile", "?0");
        headersUC15_0.put("sec-ch-ua-platform", "Linux");
        headersUC15_0.put("sec-fetch-dest", "document");
        headersUC15_0.put("sec-fetch-mode", "navigate");
        headersUC15_0.put("sec-fetch-site", "same-origin");
        headersUC15_0.put("sec-fetch-user", "?1");
        headersUC15_0.put("upgrade-insecure-requests", "1");
        headersUC15_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC15_1 = new HashMap<>();
        headersUC15_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC15_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC15_1.put("sec-ch-ua-mobile", "?0");
        headersUC15_1.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC15_5 = new HashMap<>();
        headersUC15_5.put("Upgrade-Insecure-Requests", "1");
        headersUC15_5.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC15_5.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC15_5.put("sec-ch-ua-mobile", "?0");
        headersUC15_5.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC15_7 = new HashMap<>();
        headersUC15_7.put("accept", "*/*");
        headersUC15_7.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC15_7.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC15_7.put("origin", "https://shtab.opmoscow.ru");
        headersUC15_7.put("priority", "u=1, i");
        headersUC15_7.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC15_7.put("sec-ch-ua-mobile", "?0");
        headersUC15_7.put("sec-ch-ua-platform", "Linux");
        headersUC15_7.put("sec-fetch-dest", "empty");
        headersUC15_7.put("sec-fetch-mode", "cors");
        headersUC15_7.put("sec-fetch-site", "cross-site");
        headersUC15_7.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        String UC16_uri1 = "https://mc.yandex.ru";

        ScenarioBuilder scnUC15 = scenario("Y2024.CandidatesCommunistsRus")
                .exec(
                        http("request_0")
                                .get("/party/view/kommunisty-rossii")
                                .headers(headersUC15_0)
                                .resources(
                                        http("request_1")
                                                .get(UC16_uri1 + "/metrika/tag.js")
                                                .headers(headersUC15_1),
                                        http("request_2")
                                                .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                        http("request_3")
                                                .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                        http("request_4")
                                                .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                        http("request_5")
                                                .get(UC16_uri1 + "/metrika/metrika_match.html")
                                                .headers(headersUC15_5),
                                        http("request_6")
                                                .get("/build/images/shtadopm/favicon/site.webmanifest")
                                                .headers(headersUC15_1),
                                        http("request_7")
                                                .get(UC16_uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fkommunisty-rossii&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fspravedlivaya-rossiya--za-pravdu&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A395314238%3Az%3A300%3Ai%3A20240823184856%3Aet%3A1724420937%3Ac%3A1%3Arn%3A842303713%3Arqn%3A67%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C531%2C1%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724420935961%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724420937%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%BE%D1%82%20%D0%BF%D0%B0%D1%80%D1%82%D0%B8%D0%B8%20%D0%9A%D0%BE%D0%BC%D0%BC%D1%83%D0%BD%D0%B8%D1%81%D1%82%D1%8B%20%D0%A0%D0%BE%D1%81%D1%81%D0%B8%D0%B8&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                                .headers(headersUC15_7)
                                )
                );
        HttpProtocolBuilder httpProtocol_CandidatesLDPR = http
                .baseUrl("https://shtab.opmoscow.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersUC16_0 = new HashMap<>();
        headersUC16_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC16_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC16_0.put("sec-ch-ua-mobile", "?0");
        headersUC16_0.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC16_45 = new HashMap<>();
        headersUC16_45.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC16_45.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC16_45.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC16_45.put("priority", "u=0, i");
        headersUC16_45.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC16_45.put("sec-ch-ua-mobile", "?0");
        headersUC16_45.put("sec-ch-ua-platform", "Linux");
        headersUC16_45.put("sec-fetch-dest", "document");
        headersUC16_45.put("sec-fetch-mode", "navigate");
        headersUC16_45.put("sec-fetch-site", "same-origin");
        headersUC16_45.put("sec-fetch-user", "?1");
        headersUC16_45.put("upgrade-insecure-requests", "1");
        headersUC16_45.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC16_66 = new HashMap<>();
        headersUC16_66.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
        headersUC16_66.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC16_66.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC16_66.put("priority", "i");
        headersUC16_66.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC16_66.put("sec-ch-ua-mobile", "?0");
        headersUC16_66.put("sec-ch-ua-platform", "Linux");
        headersUC16_66.put("sec-fetch-dest", "image");
        headersUC16_66.put("sec-fetch-mode", "no-cors");
        headersUC16_66.put("sec-fetch-site", "same-origin");
        headersUC16_66.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC16_70 = new HashMap<>();
        headersUC16_70.put("Upgrade-Insecure-Requests", "1");
        headersUC16_70.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC16_70.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC16_70.put("sec-ch-ua-mobile", "?0");
        headersUC16_70.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC16_74 = new HashMap<>();
        headersUC16_74.put("accept", "*/*");
        headersUC16_74.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC16_74.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC16_74.put("origin", "https://shtab.opmoscow.ru");
        headersUC16_74.put("priority", "u=1, i");
        headersUC16_74.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC16_74.put("sec-ch-ua-mobile", "?0");
        headersUC16_74.put("sec-ch-ua-platform", "Linux");
        headersUC16_74.put("sec-fetch-dest", "empty");
        headersUC16_74.put("sec-fetch-mode", "cors");
        headersUC16_74.put("sec-fetch-site", "cross-site");
        headersUC16_74.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        String UC15_uri1 = "https://mc.yandex.ru";

        ScenarioBuilder scnUC16 = scenario("Y2024.CandidatesLDPR")
                .exec(
                        http("request_0")
                                .get("/build/5758.f38a32ed.css")
                                .headers(headersUC16_0)
                                .resources(
                                        http("request_1")
                                                .get("/build/6395.76430bbc.css")
                                                .headers(headersUC16_0),
                                        http("request_2")
                                                .get("/build/8886.31d6cfe0.css")
                                                .headers(headersUC16_0),
                                        http("request_3")
                                                .get("/build/shtadopm_css_head.dfe3f750.css")
                                                .headers(headersUC16_0),
                                        http("request_4")
                                                .get("/build/runtime.aaa04269.js")
                                                .headers(headersUC16_0),
                                        http("request_5")
                                                .get("/build/9755.89d0240d.js")
                                                .headers(headersUC16_0),
                                        http("request_6")
                                                .get("/build/shtadopm_app_head.a800bb8d.js")
                                                .headers(headersUC16_0),
                                        http("request_7")
                                                .get("/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
                                                .headers(headersUC16_0),
                                        http("request_8")
                                                .get("/build/images/shtadopm/menu-arrow.svg")
                                                .headers(headersUC16_0),
                                        http("request_9")
                                                .get("/cache/f/c/e/b/6/fceb652d4b4aed86e4b7baf387f1da74ddde1e79.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_10")
                                                .get("/cache/6/c/3/b/4/6c3b4ab4c8aa8746a2a4855e03a2bd15c60c4ce3.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_11")
                                                .get("/cache/5/1/f/e/a/51feafea52abd4cd4d5428a70731f95720eccb9b.png")
                                                .headers(headersUC16_0),
                                        http("request_12")
                                                .get("/cache/f/7/9/6/d/f796dd12f583c524e35df7e2541fea9a0dcc8763.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_13")
                                                .get("/cache/4/4/2/a/f/442af39a0353822e89f8751c1435be9e8d40753b.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_14")
                                                .get("/cache/d/a/a/e/1/daae1d18bec766a897a5c77db1ae254661c737ec.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_15")
                                                .get("/cache/c/2/e/2/a/c2e2ab4c04d799e96be1098062c00129a2dbf7a6.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_16")
                                                .get("/cache/a/3/9/c/e/a39ce9aa3137b8e066a478a8ac1d14dfedcb2de3.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_17")
                                                .get("/cache/9/3/7/e/5/937e57a0faf748efde1edee4da69c8795ab17752.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_18")
                                                .get("/cache/0/0/c/5/7/00c5762c7c6851f580125a2223e0db22f55e0f0b.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_19")
                                                .get("/cache/d/1/9/0/e/d190e339d90b2b3c01ad8f807f9edfdb461dc054.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_20")
                                                .get("/cache/d/e/9/f/f/de9ff9d3136aac5505b09e6b823ac2110f417c76.png")
                                                .headers(headersUC16_0),
                                        http("request_21")
                                                .get("/cache/6/d/3/5/2/6d352fddfa485861905c4c8bebc587c4385e3f9b.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_22")
                                                .get("/cache/e/b/0/9/7/eb09736a423c1b59c2ff6759c4dbbd42ce5d2853.png")
                                                .headers(headersUC16_0),
                                        http("request_23")
                                                .get("/cache/b/6/7/9/6/b6796c8ad829660569e5d40eef50e728bef734ad.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_24")
                                                .get("/cache/6/b/7/5/a/6b75a534b4e05922e30b2484374c736467a1e33c.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_25")
                                                .get("/cache/d/1/c/2/c/d1c2c90f951e81ef3edf31f59c00ba7b622bc53a.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_26")
                                                .get("/cache/3/9/8/5/d/3985d385973dd34090f5cbd600eda6fe54809fe7.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_27")
                                                .get("/cache/7/f/b/f/1/7fbf1e45c017476860042725871dbc99c1a24da4.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_28")
                                                .get("/cache/1/a/f/1/2/1af12ef55a569ce2c3e7b352c9eb130f85f2ffc7.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_29")
                                                .get("/cache/6/2/2/e/4/622e4968101dd0baae1e304a57cd64413d2838d8.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_30")
                                                .get("/cache/8/9/1/8/1/89181ef4c300d15b551845b338050446f8dd7c76.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_31")
                                                .get("/cache/1/d/0/4/b/1d04b98ae36ab2d142cb0ab8d6167459f768a4bb.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_32")
                                                .get("/cache/3/5/3/9/a/3539a6f2371071f1193435ec353b2ee1316106e2.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_33")
                                                .get("/cache/f/a/0/b/a/fa0babd10b2cacabe8398213a656aaa610c438c0.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_34")
                                                .get("/cache/1/c/d/d/3/1cdd313658bffa460915af3d4478e3e56e201f84.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_35")
                                                .get("/cache/4/7/e/5/1/47e513f33c6fda38b81a1d6944eabf1c3f42ef10.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_36")
                                                .get("/cache/8/e/0/a/a/8e0aa877a106aab9947ddc13259b9648bfcf2296.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_37")
                                                .get("/cache/1/f/1/b/0/1f1b0e6a121bbf9a8bc415e884b6c58442287afc.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_38")
                                                .get("/cache/6/6/a/5/c/66a5cf64334ed9a8232ba13c50794be99fb593ae.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_39")
                                                .get("/cache/7/9/0/0/f/7900fed3378f2edda839b5c37e11cb00f554a6fe.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_40")
                                                .get("/cache/2/0/1/5/d/2015defcf94414a540419db1a7fc927bd0dbf7e4.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_41")
                                                .get("/cache/5/7/e/c/b/57ecbb0366d96ed51fd7fd7be408588613ed9255.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_42")
                                                .get("/cache/0/9/9/0/d/0990df123059a1ff0ce2988fd2848ba7dd480df5.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_43")
                                                .get("/cache/a/5/d/1/4/a5d145acf2fdce274505d7bc64e397c7122927e3.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_44")
                                                .get("/cache/1/b/c/1/2/1bc12f1877ad35707c9dc301666ac5c6ae881360.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_45")
                                                .get("/party/view/ldpr")
                                                .headers(headersUC16_45),
                                        http("request_46")
                                                .get(UC15_uri1 + "/metrika/tag.js")
                                                .headers(headersUC16_0),
                                        http("request_47")
                                                .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                        http("request_48")
                                                .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                        http("request_49")
                                                .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                        http("request_50")
                                                .get("/cache/e/d/7/0/d/ed70d13a07e73720c0043d42f9c3c11030bbc549.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_51")
                                                .get("/cache/a/4/1/b/d/a41bd973508442fac8f66e1baadcbbaa37442125.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_52")
                                                .get("/cache/0/a/1/5/3/0a15371ca80dd85896eb3e4574227415451d8240.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_53")
                                                .get("/cache/5/4/1/0/f/5410f363624ba3ba6ceb5610b2b7ff36d0bc65d1.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_54")
                                                .get("/cache/8/2/6/5/c/8265c5ac35286dbcbc1cb33f07d4414cb0290b8b.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_55")
                                                .get("/cache/1/b/4/0/8/1b4085061ccd7b3b3b116ad25cc32597d90f17f8.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_56")
                                                .get("/cache/d/0/a/9/5/d0a9548f5e29a9bc768f59d672ddc6d5c6d2f17e.jpeg")
                                                .headers(headersUC16_0),
                                        http("request_57")
                                                .get("/cache/3/1/7/7/f/3177f30560f9f06c2e34fc80dc51795a0cf59125.png")
                                                .headers(headersUC16_0),
                                        http("request_58")
                                                .get("/build/7255.871eb160.js")
                                                .headers(headersUC16_0),
                                        http("request_59")
                                                .get("/build/6889.3f713c69.js")
                                                .headers(headersUC16_0),
                                        http("request_60")
                                                .get("/build/7729.67d87565.js")
                                                .headers(headersUC16_0),
                                        http("request_61")
                                                .get("/build/8981.bc50772a.js")
                                                .headers(headersUC16_0),
                                        http("request_62")
                                                .get("/build/3734.2c5e1582.js")
                                                .headers(headersUC16_0),
                                        http("request_63")
                                                .get("/build/9154.f1370752.js")
                                                .headers(headersUC16_0),
                                        http("request_64")
                                                .get("/build/1676.2634f191.js")
                                                .headers(headersUC16_0),
                                        http("request_65")
                                                .get("/build/shtadopm_app_footer.9745ecad.js")
                                                .headers(headersUC16_0),
                                        http("request_66")
                                                .get("/cache/8/f/8/c/b/8f8cbc1ba7d61dbad84e6b47a01689750a3f7f79.jpeg")
                                                .headers(headersUC16_66),
                                        http("request_67")
                                                .get("/cache/8/f/a/e/b/8faebfa0c40b6ec064fd3e8badbba6f5d4ad685e.jpeg")
                                                .headers(headersUC16_66),
                                        http("request_68")
                                                .get("/cache/3/3/3/c/4/333c48746176859d57c4999a1a7418eadf2f3a1e.jpeg")
                                                .headers(headersUC16_66),
                                        http("request_69")
                                                .get("/cache/2/3/f/5/9/23f5956697cfffb798da360f6fd383320eb3f6aa.jpeg")
                                                .headers(headersUC16_66),
                                        http("request_70")
                                                .get(UC15_uri1 + "/metrika/metrika_match.html")
                                                .headers(headersUC16_70),
                                        http("request_71")
                                                .get("/build/images/shtadopm/favicon/site.webmanifest")
                                                .headers(headersUC16_0),
                                        http("request_72")
                                                .get("/cache/3/2/2/6/4/32264fb5764a25bd512653f957ca6760953b4eef.jpeg")
                                                .headers(headersUC16_66),
                                        http("request_73")
                                                .get("/cache/f/0/d/7/b/f0d7bdacbab63911ed072be33f13b98e0d8c33b8.jpeg")
                                                .headers(headersUC16_66),
                                        http("request_74")
                                                .get(UC15_uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fldpr&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fkommunisty-rossii&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A378890624%3Az%3A300%3Ai%3A20240823185005%3Aet%3A1724421005%3Ac%3A1%3Arn%3A379095546%3Arqn%3A69%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C1302%2C23%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724421003782%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724421005%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%BE%D1%82%20%D0%BF%D0%B0%D1%80%D1%82%D0%B8%D0%B8%20%D0%9B%D0%94%D0%9F%D0%A0&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                                .headers(headersUC16_74)
                                )
                );
        HttpProtocolBuilder httpProtocol_CandidatesNewPeople = http
                .baseUrl("https://mc.yandex.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersUC17_0 = new HashMap<>();
        headersUC17_0.put("accept", "*/*");
        headersUC17_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC17_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC17_0.put("content-type", "text/plain");
        headersUC17_0.put("origin", "https://shtab.opmoscow.ru");
        headersUC17_0.put("priority", "u=1, i");
        headersUC17_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC17_0.put("sec-ch-ua-mobile", "?0");
        headersUC17_0.put("sec-ch-ua-platform", "Linux");
        headersUC17_0.put("sec-fetch-dest", "empty");
        headersUC17_0.put("sec-fetch-mode", "cors");
        headersUC17_0.put("sec-fetch-site", "cross-site");
        headersUC17_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC17_1 = new HashMap<>();
        headersUC17_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC17_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC17_1.put("sec-ch-ua-mobile", "?0");
        headersUC17_1.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC17_33 = new HashMap<>();
        headersUC17_33.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC17_33.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC17_33.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC17_33.put("priority", "u=0, i");
        headersUC17_33.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC17_33.put("sec-ch-ua-mobile", "?0");
        headersUC17_33.put("sec-ch-ua-platform", "Linux");
        headersUC17_33.put("sec-fetch-dest", "document");
        headersUC17_33.put("sec-fetch-mode", "navigate");
        headersUC17_33.put("sec-fetch-site", "same-origin");
        headersUC17_33.put("sec-fetch-user", "?1");
        headersUC17_33.put("upgrade-insecure-requests", "1");
        headersUC17_33.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC17_77 = new HashMap<>();
        headersUC17_77.put("Upgrade-Insecure-Requests", "1");
        headersUC17_77.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC17_77.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC17_77.put("sec-ch-ua-mobile", "?0");
        headersUC17_77.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC17_78 = new HashMap<>();
        headersUC17_78.put("accept", "*/*");
        headersUC17_78.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC17_78.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC17_78.put("origin", "https://shtab.opmoscow.ru");
        headersUC17_78.put("priority", "u=1, i");
        headersUC17_78.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC17_78.put("sec-ch-ua-mobile", "?0");
        headersUC17_78.put("sec-ch-ua-platform", "Linux");
        headersUC17_78.put("sec-fetch-dest", "empty");
        headersUC17_78.put("sec-fetch-mode", "cors");
        headersUC17_78.put("sec-fetch-site", "cross-site");
        headersUC17_78.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        String UC17_uri2 = "https://shtab.opmoscow.ru";

        ScenarioBuilder scnUC17 = scenario("CandidatesNewPeople")
                .exec(
                        http("request_0")
                                .post("/webvisor/89667203?wv-part=5&wv-type=7&wmode=0&wv-hit=261223731&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fnovye-lyudi&rn=655673936&browser-info=we%3A1%3Aet%3A1724421067%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823185107%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724421067&t=gdpr(14)ti(1)")
                                .headers(headersUC17_0)
//                                .body(RawFileBody("candidatesnewpeople/0000_request.gif"))
                                .resources(
                                        http("request_1")
                                                .get(UC17_uri2 + "/build/5758.f38a32ed.css")
                                                .headers(headersUC17_1),
                                        http("request_2")
                                                .get(UC17_uri2 + "/build/6395.76430bbc.css")
                                                .headers(headersUC17_1),
                                        http("request_3")
                                                .get(UC17_uri2 + "/build/8886.31d6cfe0.css")
                                                .headers(headersUC17_1),
                                        http("request_4")
                                                .get(UC17_uri2 + "/build/shtadopm_css_head.dfe3f750.css")
                                                .headers(headersUC17_1),
                                        http("request_5")
                                                .get(UC17_uri2 + "/build/runtime.aaa04269.js")
                                                .headers(headersUC17_1),
                                        http("request_6")
                                                .get(UC17_uri2 + "/build/9755.89d0240d.js")
                                                .headers(headersUC17_1),
                                        http("request_7")
                                                .get(UC17_uri2 + "/build/shtadopm_app_head.a800bb8d.js")
                                                .headers(headersUC17_1),
                                        http("request_8")
                                                .get(UC17_uri2 + "/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
                                                .headers(headersUC17_1),
                                        http("request_9")
                                                .get(UC17_uri2 + "/build/images/shtadopm/menu-arrow.svg")
                                                .headers(headersUC17_1),
                                        http("request_10")
                                                .get(UC17_uri2 + "/cache/f/c/e/b/6/fceb652d4b4aed86e4b7baf387f1da74ddde1e79.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_11")
                                                .get(UC17_uri2 + "/cache/6/c/3/b/4/6c3b4ab4c8aa8746a2a4855e03a2bd15c60c4ce3.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_12")
                                                .get(UC17_uri2 + "/cache/5/1/f/e/a/51feafea52abd4cd4d5428a70731f95720eccb9b.png")
                                                .headers(headersUC17_1),
                                        http("request_13")
                                                .get(UC17_uri2 + "/cache/f/7/9/6/d/f796dd12f583c524e35df7e2541fea9a0dcc8763.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_14")
                                                .get(UC17_uri2 + "/cache/4/4/2/a/f/442af39a0353822e89f8751c1435be9e8d40753b.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_15")
                                                .get(UC17_uri2 + "/cache/d/a/a/e/1/daae1d18bec766a897a5c77db1ae254661c737ec.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_16")
                                                .get(UC17_uri2 + "/cache/c/2/e/2/a/c2e2ab4c04d799e96be1098062c00129a2dbf7a6.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_17")
                                                .get(UC17_uri2 + "/cache/a/3/9/c/e/a39ce9aa3137b8e066a478a8ac1d14dfedcb2de3.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_18")
                                                .get(UC17_uri2 + "/cache/7/a/d/c/7/7adc78913d4489f72173ed4ab29ef4969d563cac.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_19")
                                                .get(UC17_uri2 + "/cache/7/a/9/a/3/7a9a3d01806f7a6e91a4112835de72ee5669b967.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_20")
                                                .get(UC17_uri2 + "/cache/7/d/7/7/7/7d777a31e034963eacc5bc3af4e4a18263fa2bec.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_21")
                                                .get(UC17_uri2 + "/cache/c/2/3/a/7/c23a7a221730f4771eb68b5d4e3447e5cb0ac105.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_22")
                                                .get(UC17_uri2 + "/cache/f/1/7/2/8/f17286aec1b807ffea52e357967f5909856983fc.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_23")
                                                .get(UC17_uri2 + "/cache/7/3/e/9/6/73e96d9bcabf95057a518f1d4d650d08f817c65e.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_24")
                                                .get(UC17_uri2 + "/cache/a/f/6/8/6/af6863b26b186cf6a1bbadd1b2ba431b3edbc5e9.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_25")
                                                .get(UC17_uri2 + "/cache/6/8/1/3/e/6813e079bb9889e573d15c2c65eb96cb61f5b111.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_26")
                                                .get(UC17_uri2 + "/cache/b/3/e/e/b/b3eebaeaf19daa7976ade70a60e746fcf940c412.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_27")
                                                .get(UC17_uri2 + "/cache/f/a/7/c/3/fa7c3204f9a45e2323f6a769fd9757803f8332eb.png")
                                                .headers(headersUC17_1),
                                        http("request_28")
                                                .get(UC17_uri2 + "/cache/f/2/a/2/0/f2a202f255aef49e731d602e72e27a7352c38ef1.png")
                                                .headers(headersUC17_1),
                                        http("request_29")
                                                .get(UC17_uri2 + "/cache/e/2/6/f/5/e26f5ec5a3920d342a35a9dc37b6c04247511d32.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_30")
                                                .get(UC17_uri2 + "/cache/e/7/f/a/2/e7fa2f28f4bd58725cda4e33b5c6075d66d8f8e6.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_31")
                                                .get(UC17_uri2 + "/cache/e/d/e/1/3/ede13e5726e1eaa8aecd368625471fd65b49adb8.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_32")
                                                .get(UC17_uri2 + "/cache/c/1/4/1/7/c14170756fe4a6352bfa4ec95a84ca1a47904631.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_33")
                                                .get(UC17_uri2 + "/party/view/novye-lyudi")
                                                .headers(headersUC17_33),
                                        http("request_34")
                                                .get(UC17_uri2 + "/cache/6/6/f/c/0/66fc0cefef3861eca2fd48580e2f36d473511976.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_35")
                                                .get(UC17_uri2 + "/cache/4/1/a/0/f/41a0fcb9170b22c1994e4cb9ca844bf896ca2712.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_36")
                                                .get(UC17_uri2 + "/cache/f/8/b/3/d/f8b3d13b1e3ea6f6ed23a48e0131f0e0561b051a.png")
                                                .headers(headersUC17_1),
                                        http("request_37")
                                                .get(UC17_uri2 + "/cache/a/0/f/0/5/a0f053bc0724383fa17ef188ef2797edf2d304a5.png")
                                                .headers(headersUC17_1),
                                        http("request_38")
                                                .get(UC17_uri2 + "/cache/1/3/6/5/2/1365201d806fae70c3e80a9e3e8ca5bbdcebecac.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_39")
                                                .get(UC17_uri2 + "/cache/d/f/b/e/2/dfbe2a778141a79c4b40c0ed07630f5ad44ca174.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_40")
                                                .get(UC17_uri2 + "/cache/4/c/0/6/e/4c06e49224b23f072f8e764f620258b94d45354a.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_41")
                                                .get(UC17_uri2 + "/cache/3/d/e/8/9/3de893e189d87f904edd57f27ba994949c46dd5b.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_42")
                                                .get(UC17_uri2 + "/cache/7/0/e/5/a/70e5ad16621ea2bfcb01b8fee48034c0a061b29b.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_43")
                                                .get(UC17_uri2 + "/cache/7/6/b/4/4/76b449f691530eb5d64b9fc904c1387c61b19201.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_44")
                                                .get(UC17_uri2 + "/cache/5/6/5/0/7/565070d9529f48c98021e0e178aeaf93abb7c7a9.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_45")
                                                .get(UC17_uri2 + "/cache/1/2/c/0/1/12c0188c4894fff25953ca22ceeee019f59e4d1c.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_46")
                                                .get(UC17_uri2 + "/cache/d/e/5/e/f/de5ef5434776d7ef220a8049d8d44c2fcbecaad3.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_47")
                                                .get(UC17_uri2 + "/cache/2/4/9/2/d/2492dbbcb66026f1d748d760ed15182ba96ad89d.png")
                                                .headers(headersUC17_1),
                                        http("request_48")
                                                .get("/metrika/tag.js")
                                                .headers(headersUC17_1),
                                        http("request_49")
                                                .get(UC17_uri2 + "/cache/1/0/8/8/5/10885b71df68e219e32b18dd93fa8e0a725088e5.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_50")
                                                .get(UC17_uri2 + "/cache/0/e/4/9/1/0e4919d7fe13bfe919ff948a08ab130964991d71.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_51")
                                                .get(UC17_uri2 + "/cache/e/5/5/1/5/e5515eaea5e984a1318dadd7300f2c4862c72bf5.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_52")
                                                .get(UC17_uri2 + "/cache/d/b/f/5/4/dbf5441379030ebb65b4151ed9de586879b04b3c.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_53")
                                                .get(UC17_uri2 + "/cache/2/4/6/a/2/246a2c30b044eb4566b73876afe2b4657a52537e.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_54")
                                                .get(UC17_uri2 + "/cache/9/8/7/3/1/98731c729a21688e05c0e5601fba47235b2fe4b6.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_55")
                                                .get(UC17_uri2 + "/cache/f/9/8/e/d/f98ed89b5077e6f81e253a491d0760a1fcc59b21.png")
                                                .headers(headersUC17_1),
                                        http("request_56")
                                                .get(UC17_uri2 + "/cache/5/d/9/3/5/5d935582397a3353bb08b3e29bbffb64f1450fbf.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_57")
                                                .get(UC17_uri2 + "/cache/e/2/b/f/3/e2bf32409ce6539882516f863474ef4aa5421dd1.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_58")
                                                .get(UC17_uri2 + "/cache/f/d/1/a/8/fd1a804e0445f85b3057d6e68c80f77d25cf186f.png")
                                                .headers(headersUC17_1),
                                        http("request_59")
                                                .get(UC17_uri2 + "/cache/9/0/f/8/9/90f892803fe8116a2663069f385a1ce5a3ddba29.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_60")
                                                .get(UC17_uri2 + "/cache/a/4/e/d/c/a4edcbd784da2e21409eb94f938a79c06f59fb1c.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_61")
                                                .get(UC17_uri2 + "/cache/f/5/f/b/0/f5fb01561107d4a785616251bbd607e093232aec.png")
                                                .headers(headersUC17_1),
                                        http("request_62")
                                                .get(UC17_uri2 + "/cache/a/a/8/4/1/aa8419a8ed907ecc233da5d304648d0d7e642993.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_63")
                                                .get(UC17_uri2 + "/cache/0/1/3/1/6/01316a956247f6c96c684ade7335eb120f071bf7.jpeg")
                                                .headers(headersUC17_1),
                                        http("request_64")
                                                .get(UC17_uri2 + "/build/7255.871eb160.js")
                                                .headers(headersUC17_1),
                                        http("request_65")
                                                .get(UC17_uri2 + "/build/6889.3f713c69.js")
                                                .headers(headersUC17_1),
                                        http("request_66")
                                                .get(UC17_uri2 + "/build/7729.67d87565.js")
                                                .headers(headersUC17_1),
                                        http("request_67")
                                                .get(UC17_uri2 + "/build/8981.bc50772a.js")
                                                .headers(headersUC17_1),
                                        http("request_68")
                                                .get(UC17_uri2 + "/build/3734.2c5e1582.js")
                                                .headers(headersUC17_1),
                                        http("request_69")
                                                .get(UC17_uri2 + "/build/9154.f1370752.js")
                                                .headers(headersUC17_1),
                                        http("request_70")
                                                .get(UC17_uri2 + "/build/1676.2634f191.js")
                                                .headers(headersUC17_1),
                                        http("request_71")
                                                .get(UC17_uri2 + "/build/shtadopm_app_footer.9745ecad.js")
                                                .headers(headersUC17_1),
                                        http("request_72")
                                                .get(UC17_uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                        http("request_73")
                                                .get(UC17_uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                        http("request_74")
                                                .get(UC17_uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                        http("request_75")
                                                .get(UC17_uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
                                                .headers(headersUC17_1),
                                        http("request_76")
                                                .get(UC17_uri2 + "/build/images/shtadopm/favicon/favicon.ico")
                                                .headers(headersUC17_1),
                                        http("request_77")
                                                .get("/metrika/metrika_match.html")
                                                .headers(headersUC17_77),
                                        http("request_78")
                                                .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fnovye-lyudi&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fldpr&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A631036800%3Az%3A300%3Ai%3A20240823185108%3Aet%3A1724421069%3Ac%3A1%3Arn%3A215071001%3Arqn%3A72%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C505%2C23%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724421068112%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724421069%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%BE%D1%82%20%D0%BF%D0%B0%D1%80%D1%82%D0%B8%D0%B8%20%D0%9D%D0%BE%D0%B2%D1%8B%D0%B5%20%D0%BB%D1%8E%D0%B4%D0%B8&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                                .headers(headersUC17_78)
                                )
                );
        HttpProtocolBuilder httpProtocol_CandidatesGreens = http
                .baseUrl("https://mc.yandex.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersUC18_0 = new HashMap<>();
        headersUC18_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC18_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC18_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC18_0.put("priority", "u=0, i");
        headersUC18_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC18_0.put("sec-ch-ua-mobile", "?0");
        headersUC18_0.put("sec-ch-ua-platform", "Linux");
        headersUC18_0.put("sec-fetch-dest", "document");
        headersUC18_0.put("sec-fetch-mode", "navigate");
        headersUC18_0.put("sec-fetch-site", "same-origin");
        headersUC18_0.put("sec-fetch-user", "?1");
        headersUC18_0.put("upgrade-insecure-requests", "1");
        headersUC18_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC18_1 = new HashMap<>();
        headersUC18_1.put("accept", "*/*");
        headersUC18_1.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC18_1.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC18_1.put("content-type", "text/plain");
        headersUC18_1.put("origin", "https://shtab.opmoscow.ru");
        headersUC18_1.put("priority", "u=1, i");
        headersUC18_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC18_1.put("sec-ch-ua-mobile", "?0");
        headersUC18_1.put("sec-ch-ua-platform", "Linux");
        headersUC18_1.put("sec-fetch-dest", "empty");
        headersUC18_1.put("sec-fetch-mode", "cors");
        headersUC18_1.put("sec-fetch-site", "cross-site");
        headersUC18_1.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC18__2 = new HashMap<>();
        headersUC18__2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC18__2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC18__2.put("sec-ch-ua-mobile", "?0");
        headersUC18__2.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC18_7 = new HashMap<>();
        headersUC18_7.put("accept", "*/*");
        headersUC18_7.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC18_7.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC18_7.put("origin", "https://shtab.opmoscow.ru");
        headersUC18_7.put("priority", "u=1, i");
        headersUC18_7.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC18_7.put("sec-ch-ua-mobile", "?0");
        headersUC18_7.put("sec-ch-ua-platform", "Linux");
        headersUC18_7.put("sec-fetch-dest", "empty");
        headersUC18_7.put("sec-fetch-mode", "cors");
        headersUC18_7.put("sec-fetch-site", "cross-site");
        headersUC18_7.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC18_8 = new HashMap<>();
        headersUC18_8.put("Upgrade-Insecure-Requests", "1");
        headersUC18_8.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC18_8.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC18_8.put("sec-ch-ua-mobile", "?0");
        headersUC18_8.put("sec-ch-ua-platform", "Linux");

        String UC18_uri2 = "https://shtab.opmoscow.ru";

        ScenarioBuilder scnUC18 = scenario("Y2024.CandidatesGreens")
                .exec(
                        http("request_0")
                                .get(UC18_uri2 + "/party/view/zelyonye")
                                .headers(headersUC18_0)
                                .resources(
//                                        http("request_1")
//                                                .post("/webvisor/89667203?wv-part=2&wv-type=7&wmode=0&wv-hit=414794426&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fzelyonye&rn=33863958&browser-info=we%3A1%3Aet%3A1724421140%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823185220%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724421140&t=gdpr(14)ti(1)")
//                                                .headers(headersUC18_1)
//                                                .body(RawFileBody("candidatesgreens/0001_request.gif")),
                                        http("request_2")
                                                .get("/metrika/tag.js")
                                                .headers(headersUC18__2),
                                        http("request_3")
                                                .get(UC18_uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                        http("request_4")
                                                .get(UC18_uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                        http("request_5")
                                                .get(UC18_uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                        http("request_6")
                                                .get(UC18_uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
                                                .headers(headersUC18__2),
                                        http("request_7")
                                                .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fzelyonye&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fnovye-lyudi&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A550097042%3Az%3A300%3Ai%3A20240823185221%3Aet%3A1724421142%3Ac%3A1%3Arn%3A817963467%3Arqn%3A74%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C2259%2C2%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724421139531%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724421142%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%BE%D1%82%20%D0%BF%D0%B0%D1%80%D1%82%D0%B8%D0%B8%20%D0%97%D0%B5%D0%BB%D0%B5%D0%BD%D1%8B%D0%B5&t=gdpr(14)clc(0-0-0)rqnt(1)aw(0)rcm(0)cdl(na)eco(21037572)ti(1)")
                                                .headers(headersUC18_7)
                                )
                );

        HttpProtocolBuilder httpProtocol_CandidatesSelfNominated = http
                .baseUrl("https://mc.yandex.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersUC19_0 = new HashMap<>();
        headersUC19_0.put("accept", "*/*");
        headersUC19_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC19_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC19_0.put("content-type", "text/plain");
        headersUC19_0.put("origin", "https://shtab.opmoscow.ru");
        headersUC19_0.put("priority", "u=1, i");
        headersUC19_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC19_0.put("sec-ch-ua-mobile", "?0");
        headersUC19_0.put("sec-ch-ua-platform", "Linux");
        headersUC19_0.put("sec-fetch-dest", "empty");
        headersUC19_0.put("sec-fetch-mode", "cors");
        headersUC19_0.put("sec-fetch-site", "cross-site");
        headersUC19_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC17_2 = new HashMap<>();
        headersUC17_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC17_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC17_2.put("sec-ch-ua-mobile", "?0");
        headersUC17_2.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC17_15 = new HashMap<>();
        headersUC17_15.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC17_15.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC17_15.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC17_15.put("priority", "u=0, i");
        headersUC17_15.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC17_15.put("sec-ch-ua-mobile", "?0");
        headersUC17_15.put("sec-ch-ua-platform", "Linux");
        headersUC17_15.put("sec-fetch-dest", "document");
        headersUC17_15.put("sec-fetch-mode", "navigate");
        headersUC17_15.put("sec-fetch-site", "same-origin");
        headersUC17_15.put("sec-fetch-user", "?1");
        headersUC17_15.put("upgrade-insecure-requests", "1");
        headersUC17_15.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC17_54 = new HashMap<>();
        headersUC17_54.put("accept", "*/*");
        headersUC17_54.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC17_54.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC17_54.put("origin", "https://shtab.opmoscow.ru");
        headersUC17_54.put("priority", "u=1, i");
        headersUC17_54.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC17_54.put("sec-ch-ua-mobile", "?0");
        headersUC17_54.put("sec-ch-ua-platform", "Linux");
        headersUC17_54.put("sec-fetch-dest", "empty");
        headersUC17_54.put("sec-fetch-mode", "cors");
        headersUC17_54.put("sec-fetch-site", "cross-site");
        headersUC17_54.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC17_55 = new HashMap<>();
        headersUC17_55.put("Upgrade-Insecure-Requests", "1");
        headersUC17_55.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC17_55.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC17_55.put("sec-ch-ua-mobile", "?0");
        headersUC17_55.put("sec-ch-ua-platform", "Linux");

        String UC19_uri2 = "https://shtab.opmoscow.ru";

        ScenarioBuilder scnUC19 = scenario("CandidatesSelfNominated")
                .exec(
                        http("request_0")
                                .post("/webvisor/89667203?wv-part=2&wv-check=44765&wv-type=0&wmode=0&wv-hit=744178719&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fsamovydvizhenec&rn=445974004&browser-info=we%3A1%3Aet%3A1724421230%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823185350%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724421230&t=gdpr(14)ti(1)")
                                .headers(headersUC19_0)
//                                .body(RawFileBody("candidatesselfnominated/0000_request.gif"))
                                .resources(
                                        http("request_1")
                                                .post("/webvisor/89667203?wv-part=7&wv-type=7&wmode=0&wv-hit=744178719&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fsamovydvizhenec&rn=548969985&browser-info=we%3A1%3Aet%3A1724421231%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823185351%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724421231&t=gdpr(14)ti(1)")
                                                .headers(headersUC19_0),
//                                                .body(RawFileBody("candidatesselfnominated/0001_request.gif")),
                                        http("request_2")
                                                .get(UC19_uri2 + "/build/5758.f38a32ed.css")
                                                .headers(headersUC17_2),
                                        http("request_3")
                                                .get(UC19_uri2 + "/build/6395.76430bbc.css")
                                                .headers(headersUC17_2),
                                        http("request_4")
                                                .get(UC19_uri2 + "/build/8886.31d6cfe0.css")
                                                .headers(headersUC17_2),
                                        http("request_5")
                                                .get(UC19_uri2 + "/build/shtadopm_css_head.dfe3f750.css")
                                                .headers(headersUC17_2),
                                        http("request_6")
                                                .get(UC19_uri2 + "/build/runtime.aaa04269.js")
                                                .headers(headersUC17_2),
                                        http("request_7")
                                                .get(UC19_uri2 + "/build/9755.89d0240d.js")
                                                .headers(headersUC17_2),
                                        http("request_8")
                                                .get(UC19_uri2 + "/build/shtadopm_app_head.a800bb8d.js")
                                                .headers(headersUC17_2),
                                        http("request_9")
                                                .get(UC19_uri2 + "/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
                                                .headers(headersUC17_2),
                                        http("request_10")
                                                .get(UC19_uri2 + "/build/images/shtadopm/menu-arrow.svg")
                                                .headers(headersUC17_2),
                                        http("request_11")
                                                .get("/metrika/tag.js")
                                                .headers(headersUC17_2),
                                        http("request_12")
                                                .get(UC19_uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                        http("request_13")
                                                .get(UC19_uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                        http("request_14")
                                                .get(UC19_uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                        http("request_15")
                                                .get(UC19_uri2 + "/party/view/samovydvizhenec")
                                                .headers(headersUC17_15),
                                        http("request_16")
                                                .get(UC19_uri2 + "/cache/f/c/e/b/6/fceb652d4b4aed86e4b7baf387f1da74ddde1e79.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_17")
                                                .get(UC19_uri2 + "/cache/6/c/3/b/4/6c3b4ab4c8aa8746a2a4855e03a2bd15c60c4ce3.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_18")
                                                .get(UC19_uri2 + "/cache/5/1/f/e/a/51feafea52abd4cd4d5428a70731f95720eccb9b.png")
                                                .headers(headersUC17_2),
                                        http("request_19")
                                                .get(UC19_uri2 + "/cache/f/7/9/6/d/f796dd12f583c524e35df7e2541fea9a0dcc8763.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_20")
                                                .get(UC19_uri2 + "/cache/4/4/2/a/f/442af39a0353822e89f8751c1435be9e8d40753b.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_21")
                                                .get(UC19_uri2 + "/cache/d/a/a/e/1/daae1d18bec766a897a5c77db1ae254661c737ec.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_22")
                                                .get(UC19_uri2 + "/cache/c/2/e/2/a/c2e2ab4c04d799e96be1098062c00129a2dbf7a6.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_23")
                                                .get(UC19_uri2 + "/cache/a/3/9/c/e/a39ce9aa3137b8e066a478a8ac1d14dfedcb2de3.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_24")
                                                .get(UC19_uri2 + "/cache/d/b/f/5/4/dbf5441379030ebb65b4151ed9de586879b04b3c.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_25")
                                                .get(UC19_uri2 + "/cache/f/6/9/9/7/f6997c4f54bfef9cfff22e3c794ab7384b93fab4.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_26")
                                                .get(UC19_uri2 + "/cache/f/3/c/d/6/f3cd639a78084d1a2537e1d1d7350f2faa357260.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_27")
                                                .get(UC19_uri2 + "/cache/a/3/5/5/4/a3554ccb0a1c529e1322149871676e85895be7a7.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_28")
                                                .get(UC19_uri2 + "/cache/d/9/1/4/8/d91486849827e8cd91f7b7a395583ce77dd0c8f5.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_29")
                                                .get(UC19_uri2 + "/cache/0/7/f/a/7/07fa730260e36e620282b133ab70d74eb369ccfb.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_30")
                                                .get(UC19_uri2 + "/cache/c/9/4/5/a/c945a2ec1bf4e719c0338077544a49a4460ec2d7.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_31")
                                                .get(UC19_uri2 + "/cache/1/5/a/c/c/15acc0bb74bc00f605bfbb7c2f677f1afd33090d.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_32")
                                                .get(UC19_uri2 + "/cache/4/c/8/1/5/4c8151974b7e418ce475e09796e8a6695411451c.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_33")
                                                .get(UC19_uri2 + "/cache/6/7/2/c/d/672cd123e702540c915bca9ecad3d8681ae99404.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_34")
                                                .get(UC19_uri2 + "/cache/8/3/0/2/5/8302506c32a14d7d4b99bd9420d559e58e343179.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_35")
                                                .get(UC19_uri2 + "/cache/6/8/2/8/f/6828f358592a3bb5860a5cbca698753867f125af.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_36")
                                                .get(UC19_uri2 + "/cache/9/8/6/5/1/98651dc843db2c4fa20b205a5d86c3e29c7a00ae.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_37")
                                                .get(UC19_uri2 + "/cache/2/3/e/d/f/23edf8250f6d6f5055df5b6eac9cdb8c8e5e055c.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_38")
                                                .get(UC19_uri2 + "/cache/3/6/8/e/1/368e102cdf2e7f23feb9437b4f89d808ec8c1c12.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_39")
                                                .get(UC19_uri2 + "/cache/2/b/1/b/0/2b1b087bb43e5575c197a1db15393527705c7c30.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_40")
                                                .get(UC19_uri2 + "/cache/3/c/3/6/8/3c368239b1fcf23f3b2c5d06298605884c579f83.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_41")
                                                .get(UC19_uri2 + "/cache/b/4/5/c/4/b45c4ae0a35543658427c50afe0ffedbeac74bc2.png")
                                                .headers(headersUC17_2),
                                        http("request_42")
                                                .get(UC19_uri2 + "/cache/e/c/1/2/e/ec12e99984ff7fe0928c822511d3e36a9a0ce615.png")
                                                .headers(headersUC17_2),
                                        http("request_43")
                                                .get(UC19_uri2 + "/cache/c/6/d/0/7/c6d07fd8c5f92a90bf3d02ce05771de33c6dacb6.jpeg")
                                                .headers(headersUC17_2),
                                        http("request_44")
                                                .get(UC19_uri2 + "/build/7255.871eb160.js")
                                                .headers(headersUC17_2),
                                        http("request_45")
                                                .get(UC19_uri2 + "/build/6889.3f713c69.js")
                                                .headers(headersUC17_2),
                                        http("request_46")
                                                .get(UC19_uri2 + "/build/7729.67d87565.js")
                                                .headers(headersUC17_2),
                                        http("request_47")
                                                .get(UC19_uri2 + "/build/8981.bc50772a.js")
                                                .headers(headersUC17_2),
                                        http("request_48")
                                                .get(UC19_uri2 + "/build/3734.2c5e1582.js")
                                                .headers(headersUC17_2),
                                        http("request_49")
                                                .get(UC19_uri2 + "/build/9154.f1370752.js")
                                                .headers(headersUC17_2),
                                        http("request_50")
                                                .get(UC19_uri2 + "/build/1676.2634f191.js")
                                                .headers(headersUC17_2),
                                        http("request_51")
                                                .get(UC19_uri2 + "/build/shtadopm_app_footer.9745ecad.js")
                                                .headers(headersUC17_2),
                                        http("request_52")
                                                .get(UC19_uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
                                                .headers(headersUC17_2),
                                        http("request_53")
                                                .get(UC19_uri2 + "/build/images/shtadopm/favicon/favicon.ico")
                                                .headers(headersUC17_2),
                                        http("request_54")
                                                .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fsamovydvizhenec&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fzelyonye&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A400334354%3Az%3A300%3Ai%3A20240823185354%3Aet%3A1724421235%3Ac%3A1%3Arn%3A442417363%3Arqn%3A76%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C5518%2C537%2C%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724421228697%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724421235%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D1%81%D0%B0%D0%BC%D0%BE%D0%B2%D1%8B%D0%B4%D0%B2%D0%B8%D0%B6%D0%B5%D0%BD%D1%86%D1%8B&t=gdpr(14)clc(0-0-0)rqnt(1)aw(0)rcm(0)cdl(na)eco(21037572)ti(1)")
                                                .headers(headersUC17_54)
                                )
                );


//        Установки

        setUp(
                scnUC11.injectClosed(
                        constantConcurrentUsers(users_flood_UC11).during(40000)
                ).protocols(httpProtocol_Kandidati)
                ,
                scnUC12.injectClosed(
                        constantConcurrentUsers(users_flood_UC12).during(40000)
                ).protocols(httpProtocol_CandidatesER)
                ,
                scnUC13.injectClosed(
                        constantConcurrentUsers(users_flood_UC13).during(40000)
                ).protocols(httpProtocol_CandidatesKPRF)
                ,
                scnUC14.injectClosed(
                        constantConcurrentUsers(users_flood_UC14).during(40000)
                ).protocols(httpProtocol_CandidatesSR)
                ,
                scnUC15.injectClosed(
                        constantConcurrentUsers(users_flood_UC15).during(40000)
                ).protocols(httpProtocol_CandidatesCommunistsRus)
                ,
                scnUC16.injectClosed(
                        constantConcurrentUsers(users_flood_UC16).during(40000)
                ).protocols(httpProtocol_CandidatesLDPR)
                ,
                scnUC17.injectClosed(
                        constantConcurrentUsers(users_flood_UC17).during(40000)
                ).protocols(httpProtocol_CandidatesNewPeople)
                ,
                scnUC18.injectClosed(
                        constantConcurrentUsers(users_flood_UC18).during(40000)
                ).protocols(httpProtocol_CandidatesGreens)
                ,
                scnUC19.injectClosed(
                        constantConcurrentUsers(users_flood_UC19).during(40000)
                ).protocols(httpProtocol_CandidatesSelfNominated)

        );
    }
}

