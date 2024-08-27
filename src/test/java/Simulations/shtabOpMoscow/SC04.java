package Simulations.shtabOpMoscow;

import io.gatling.javaapi.core.Simulation;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.http;

import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import java.util.HashMap;
import java.util.Map;


public class SC04 extends Simulation {
    {

        int users_flood_UC25 = Integer.getInteger("users_flood_UC25", 1);
        int users_flood_UC29 = Integer.getInteger("users_flood_UC29", 1);
        int users_flood_UC30 = Integer.getInteger("users_flood_UC30", 1);
        int users_flood_UC31 = Integer.getInteger("users_flood_UC31", 1);
        int users_flood_UC35 = Integer.getInteger("users_flood_UC35", 1);
        int users_flood_UC36 = Integer.getInteger("users_flood_UC36", 1);
        int users_flood_UC40 = Integer.getInteger("users_flood_UC40", 1);
        int users_flood_UC41 = Integer.getInteger("users_flood_UC41", 1);
        int users_flood_UC42 = Integer.getInteger("users_flood_UC42", 1);


        // Scenarious
        HttpProtocolBuilder httpProtocol_MainPage2023 = http
                .baseUrl("https://mc.yandex.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersUC25_0 = new HashMap<>();
        headersUC25_0.put("accept", "*/*");
        headersUC25_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC25_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC25_0.put("content-type", "text/plain");
        headersUC25_0.put("origin", "https://shtab.opmoscow.ru");
        headersUC25_0.put("priority", "u=1, i");
        headersUC25_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC25_0.put("sec-ch-ua-mobile", "?0");
        headersUC25_0.put("sec-ch-ua-platform", "Linux");
        headersUC25_0.put("sec-fetch-dest", "empty");
        headersUC25_0.put("sec-fetch-mode", "cors");
        headersUC25_0.put("sec-fetch-site", "cross-site");
        headersUC25_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC25_1 = new HashMap<>();
        headersUC25_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC25_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC25_1.put("sec-ch-ua-mobile", "?0");
        headersUC25_1.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC25_37 = new HashMap<>();
        headersUC25_37.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC25_37.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC25_37.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC25_37.put("priority", "u=0, i");
        headersUC25_37.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC25_37.put("sec-ch-ua-mobile", "?0");
        headersUC25_37.put("sec-ch-ua-platform", "Linux");
        headersUC25_37.put("sec-fetch-dest", "document");
        headersUC25_37.put("sec-fetch-mode", "navigate");
        headersUC25_37.put("sec-fetch-site", "same-origin");
        headersUC25_37.put("sec-fetch-user", "?1");
        headersUC25_37.put("upgrade-insecure-requests", "1");
        headersUC25_37.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC25_48 = new HashMap<>();
        headersUC25_48.put("accept", "*/*");
        headersUC25_48.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC25_48.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC25_48.put("origin", "https://shtab.opmoscow.ru");
        headersUC25_48.put("priority", "u=1, i");
        headersUC25_48.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC25_48.put("sec-ch-ua-mobile", "?0");
        headersUC25_48.put("sec-ch-ua-platform", "Linux");
        headersUC25_48.put("sec-fetch-dest", "empty");
        headersUC25_48.put("sec-fetch-mode", "cors");
        headersUC25_48.put("sec-fetch-site", "cross-site");
        headersUC25_48.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC25_49 = new HashMap<>();
        headersUC25_49.put("Upgrade-Insecure-Requests", "1");
        headersUC25_49.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC25_49.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC25_49.put("sec-ch-ua-mobile", "?0");
        headersUC25_49.put("sec-ch-ua-platform", "Linux");

        String uri2 = "https://shtab.opmoscow.ru";

        ScenarioBuilder scnUC25 = scenario("Archive.MainPage2023")
                .exec(
                        http("request_0")
                                .post("/webvisor/89667203?wv-part=3&wv-type=7&wmode=0&wv-hit=4997530&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&rn=247839678&browser-info=we%3A1%3Aet%3A1724481694%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824114134%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724481694&t=gdpr(14)ti(1)")
                                .headers(headersUC25_0)
//                                .body(RawFileBody("mainpage2023/0000_request.gif"))
                                .resources(
                                        http("request_1")
                                                .get(uri2 + "/build/5758.f38a32ed.css")
                                                .headers(headersUC25_1),
                                        http("request_2")
                                                .get(uri2 + "/build/6395.76430bbc.css")
                                                .headers(headersUC25_1),
                                        http("request_3")
                                                .get(uri2 + "/build/8886.31d6cfe0.css")
                                                .headers(headersUC25_1),
                                        http("request_4")
                                                .get(uri2 + "/build/shtadopm_css_head.dfe3f750.css")
                                                .headers(headersUC25_1),
                                        http("request_5")
                                                .get(uri2 + "/build/runtime.aaa04269.js")
                                                .headers(headersUC25_1),
                                        http("request_6")
                                                .get(uri2 + "/build/9755.89d0240d.js")
                                                .headers(headersUC25_1),
                                        http("request_7")
                                                .get(uri2 + "/build/shtadopm_app_head.a800bb8d.js")
                                                .headers(headersUC25_1),
                                        http("request_8")
                                                .get(uri2 + "/uploads/media/default/0002/08/eaeb42854c5147ecd4db172ab7aa6a48cf0de830.png")
                                                .headers(headersUC25_1),
                                        http("request_9")
                                                .get(uri2 + "/build/images/shtadopm/menu-arrow.svg")
                                                .headers(headersUC25_1),
                                        http("request_10")
                                                .get(uri2 + "/cache/4/e/4/b/c/4e4bce3ff9353a38a8cf548abd48c406354a014c.jpeg")
                                                .headers(headersUC25_1),
                                        http("request_11")
                                                .get(uri2 + "/cache/3/9/f/1/5/39f15709c006290e19dd68a664d2f3bea1beafcf.jpeg")
                                                .headers(headersUC25_1),
                                        http("request_12")
                                                .get(uri2 + "/cache/4/2/d/4/2/42d42c8d0e90edb4524715cf885ac23da58ee495.png")
                                                .headers(headersUC25_1),
                                        http("request_13")
                                                .get(uri2 + "/uploads/media/default/0001/28/8381d6d787f039276e071d762399a29444faa61d.jpeg")
                                                .headers(headersUC25_1),
                                        http("request_14")
                                                .get(uri2 + "/build/images/shtadopm/structure5.jpg")
                                                .headers(headersUC25_1),
                                        http("request_15")
                                                .get(uri2 + "/build/images/shtadopm/structure6.jpg")
                                                .headers(headersUC25_1),
                                        http("request_16")
                                                .get(uri2 + "/build/images/shtadopm/structure4.jpg")
                                                .headers(headersUC25_1),
                                        http("request_17")
                                                .get(uri2 + "/build/images/shtadopm/structure1.jpg")
                                                .headers(headersUC25_1),
                                        http("request_18")
                                                .get(uri2 + "/build/images/shtadopm/structure3.jpg")
                                                .headers(headersUC25_1),
                                        http("request_19")
                                                .get(uri2 + "/cache/c/f/1/d/2/cf1d21ddbaadf8635959a8e5eb813fda6f2c4868.jpeg")
                                                .headers(headersUC25_1),
                                        http("request_20")
                                                .get(uri2 + "/cache/c/e/a/0/2/cea024e923a1eca76df9aa638d7a2a8433b53862.jpeg")
                                                .headers(headersUC25_1),
                                        http("request_21")
                                                .get(uri2 + "/cache/e/7/f/c/6/e7fc68be33f56dc99294de4b67e244046df252ad.jpeg")
                                                .headers(headersUC25_1),
                                        http("request_22")
                                                .get(uri2 + "/build/images/opmoscow/loading.svg")
                                                .headers(headersUC25_1),
                                        http("request_23")
                                                .get(uri2 + "/uploads/media/default/0002/08/844891c0cb823bbd1be67eaef729f65abf6cb8cd.png")
                                                .headers(headersUC25_1),
                                        http("request_24")
                                                .get(uri2 + "/build/images/shtadopm/archive1.png")
                                                .headers(headersUC25_1),
                                        http("request_25")
                                                .get(uri2 + "/uploads/media/default/0001/16/d8be626d1edbeeeae3a7f853cbc2b6114695d91e.png")
                                                .headers(headersUC25_1),
                                        http("request_26")
                                                .get(uri2 + "/build/images/shtadopm/archive2.png")
                                                .headers(headersUC25_1),
                                        http("request_27")
                                                .get(uri2 + "/build/images/shtadopm/archive3.png")
                                                .headers(headersUC25_1),
                                        http("request_28")
                                                .get(uri2 + "/build/images/shtadopm/archive4.png")
                                                .headers(headersUC25_1),
                                        http("request_29")
                                                .get(uri2 + "/build/images/shtadopm/archive5.png")
                                                .headers(headersUC25_1),
                                        http("request_30")
                                                .get(uri2 + "/uploads/media/default/0001/14/8e41f9787e36e8029d3c6170de36347f0ca54c05.png")
                                                .headers(headersUC25_1),
                                        http("request_31")
                                                .get(uri2 + "/uploads/media/slides/0001/13/4ec801b9e1775a9059c90458ed5764228c943142.jpeg")
                                                .headers(headersUC25_1),
                                        http("request_32")
                                                .get("/metrika/tag.js")
                                                .headers(headersUC25_1),
                                        http("request_33")
                                                .get(uri2 + "/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
                                        http("request_34")
                                                .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                        http("request_35")
                                                .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                        http("request_36")
                                                .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                        http("request_37")
                                                .get(uri2 + "/obshchestvennyy-shtab-po-vyboram-2023")
                                                .headers(headersUC25_37),
                                        http("request_38")
                                                .get(uri2 + "/build/7255.871eb160.js")
                                                .headers(headersUC25_1),
                                        http("request_39")
                                                .get(uri2 + "/build/6889.3f713c69.js")
                                                .headers(headersUC25_1),
                                        http("request_40")
                                                .get(uri2 + "/build/7729.67d87565.js")
                                                .headers(headersUC25_1),
                                        http("request_41")
                                                .get(uri2 + "/build/8981.bc50772a.js")
                                                .headers(headersUC25_1),
                                        http("request_42")
                                                .get(uri2 + "/build/3734.2c5e1582.js")
                                                .headers(headersUC25_1),
                                        http("request_43")
                                                .get(uri2 + "/build/9154.f1370752.js")
                                                .headers(headersUC25_1),
                                        http("request_44")
                                                .get(uri2 + "/build/1676.2634f191.js")
                                                .headers(headersUC25_1),
                                        http("request_45")
                                                .get(uri2 + "/build/shtadopm_app_footer.9745ecad.js")
                                                .headers(headersUC25_1),
                                        http("request_46")
                                                .get(uri2 + "/build/images/shtadopm/favicon/favicon.ico")
                                                .headers(headersUC25_1),
                                        http("request_47")
                                                .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
                                                .headers(headersUC25_1),
                                        http("request_48")
                                                .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A8824332%3Az%3A300%3Ai%3A20240824114136%3Aet%3A1724481696%3Ac%3A1%3Arn%3A733529838%3Arqn%3A133%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C488%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724481695859%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724481697%3At%3A%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1%20%D0%BF%D0%BE%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B7%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D0%BC%D0%B8%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5%20%D0%B2%202023%20%D0%B3%D0%BE%D0%B4%D1%83&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                                .headers(headersUC25_48),
                                        http("request_49")
                                                .get("/metrika/metrika_match.html")
                                                .headers(headersUC25_49)
                                )
                );

        HttpProtocolBuilder httpProtocol_MainPage2022 = http
                .baseUrl("https://mc.yandex.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersUC29_0 = new HashMap<>();
        headersUC29_0.put("accept", "*/*");
        headersUC29_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC29_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC29_0.put("content-type", "text/plain");
        headersUC29_0.put("origin", "https://shtab.opmoscow.ru");
        headersUC29_0.put("priority", "u=1, i");
        headersUC29_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC29_0.put("sec-ch-ua-mobile", "?0");
        headersUC29_0.put("sec-ch-ua-platform", "Linux");
        headersUC29_0.put("sec-fetch-dest", "empty");
        headersUC29_0.put("sec-fetch-mode", "cors");
        headersUC29_0.put("sec-fetch-site", "cross-site");
        headersUC29_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC29_2 = new HashMap<>();
        headersUC29_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC29_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC29_2.put("sec-ch-ua-mobile", "?0");
        headersUC29_2.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC29_17 = new HashMap<>();
        headersUC29_17.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC29_17.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC29_17.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC29_17.put("priority", "u=0, i");
        headersUC29_17.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC29_17.put("sec-ch-ua-mobile", "?0");
        headersUC29_17.put("sec-ch-ua-platform", "Linux");
        headersUC29_17.put("sec-fetch-dest", "document");
        headersUC29_17.put("sec-fetch-mode", "navigate");
        headersUC29_17.put("sec-fetch-site", "same-origin");
        headersUC29_17.put("sec-fetch-user", "?1");
        headersUC29_17.put("upgrade-insecure-requests", "1");
        headersUC29_17.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC29_45 = new HashMap<>();
        headersUC29_45.put("accept", "*/*");
        headersUC29_45.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC29_45.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC29_45.put("origin", "https://shtab.opmoscow.ru");
        headersUC29_45.put("priority", "u=1, i");
        headersUC29_45.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC29_45.put("sec-ch-ua-mobile", "?0");
        headersUC29_45.put("sec-ch-ua-platform", "Linux");
        headersUC29_45.put("sec-fetch-dest", "empty");
        headersUC29_45.put("sec-fetch-mode", "cors");
        headersUC29_45.put("sec-fetch-site", "cross-site");
        headersUC29_45.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC29_46 = new HashMap<>();
        headersUC29_46.put("Upgrade-Insecure-Requests", "1");
        headersUC29_46.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC29_46.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC29_46.put("sec-ch-ua-mobile", "?0");
        headersUC29_46.put("sec-ch-ua-platform", "Linux");

        String UC29_uri2 = "https://shtab.opmoscow.ru";

        ScenarioBuilder scnUC29 = scenario("Archive.MainPage2022")
                .exec(
                        http("request_0")
                                .post("/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=623331497&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2022&rn=648428412&browser-info=we%3A1%3Aet%3A1724483490%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824121129%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724483490&t=gdpr(14)ti(1)")
                                .headers(headersUC29_0)
//                                .body(RawFileBody("mainpage2022/0000_request.gif"))
                                .resources(
                                        http("request_1")
                                                .post("/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=623331497&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2022&rn=352877609&browser-info=bt%3A1%3Awe%3A1%3Aet%3A1724483489%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824121129%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724483489&t=gdpr(14)ti(1)")
                                                .headers(headersUC29_0),
                                        http("request_2")
                                                .get(UC29_uri2 + "/build/5758.f38a32ed.css")
                                                .headers(headersUC29_2),
                                        http("request_3")
                                                .get(UC29_uri2 + "/build/6395.76430bbc.css")
                                                .headers(headersUC29_2),
                                        http("request_4")
                                                .get(UC29_uri2 + "/build/8886.31d6cfe0.css")
                                                .headers(headersUC29_2),
                                        http("request_5")
                                                .get(UC29_uri2 + "/build/shtadopm_css_head.dfe3f750.css")
                                                .headers(headersUC29_2),
                                        http("request_6")
                                                .get(UC29_uri2 + "/build/runtime.aaa04269.js")
                                                .headers(headersUC29_2),
                                        http("request_7")
                                                .get(UC29_uri2 + "/build/9755.89d0240d.js")
                                                .headers(headersUC29_2),
                                        http("request_8")
                                                .get(UC29_uri2 + "/build/shtadopm_app_head.a800bb8d.js")
                                                .headers(headersUC29_2),
                                        http("request_9")
                                                .get(UC29_uri2 + "/uploads/media/default/0001/12/81f47d7cf5158a496131d62bdf6b34571fb9d723.png")
                                                .headers(headersUC29_2),
                                        http("request_10")
                                                .get(UC29_uri2 + "/build/images/shtadopm/menu-arrow.svg")
                                                .headers(headersUC29_2),
                                        http("request_11")
                                                .get("/metrika/tag.js")
                                                .headers(headersUC29_2),
                                        http("request_12")
                                                .get(UC29_uri2 + "/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
                                        http("request_13")
                                                .get(UC29_uri2 + "/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
                                        http("request_14")
                                                .get(UC29_uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                        http("request_15")
                                                .get(UC29_uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                        http("request_16")
                                                .get(UC29_uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                        http("request_17")
                                                .get(UC29_uri2 + "/obshchestvennyy-shtab-po-vyboram-2022")
                                                .headers(headersUC29_17),
                                        http("request_18")
                                                .get(UC29_uri2 + "/cache/c/0/e/8/e/c0e8e6e74dc69b3706ccc519bd2e0cae360403a5.jpeg")
                                                .headers(headersUC29_2),
                                        http("request_19")
                                                .get(UC29_uri2 + "/cache/b/e/6/c/0/be6c0c0599be356d9e6d5b566a9bf3f96380b6f9.jpeg")
                                                .headers(headersUC29_2),
                                        http("request_20")
                                                .get(UC29_uri2 + "/cache/5/2/2/7/a/5227a9907fb3976350c71e29af65c32b76390918.jpeg")
                                                .headers(headersUC29_2),
                                        http("request_21")
                                                .get(UC29_uri2 + "/cache/b/0/1/8/1/b01813f0e98cd4c5e5175089c5618cbe8691fb6f.jpeg")
                                                .headers(headersUC29_2),
                                        http("request_22")
                                                .get(UC29_uri2 + "/cache/3/d/3/1/7/3d3174931f6629bc2a40ef2602b5f587ae482ec3.jpeg")
                                                .headers(headersUC29_2),
                                        http("request_23")
                                                .get(UC29_uri2 + "/cache/d/0/7/3/0/d073016a513dc0e189bd798f6e4883ca4c16f3cf.jpeg")
                                                .headers(headersUC29_2),
                                        http("request_24")
                                                .get(UC29_uri2 + "/cache/2/c/0/3/0/2c030d5011c1d602add8e88c6424409de6d9a762.jpeg")
                                                .headers(headersUC29_2),
                                        http("request_25")
                                                .get(UC29_uri2 + "/cache/4/0/e/e/6/40ee6cbe8c32d15c4e9060730c3db27536379d9e.jpeg")
                                                .headers(headersUC29_2),
                                        http("request_26")
                                                .get(UC29_uri2 + "/build/images/opmoscow/loading.svg")
                                                .headers(headersUC29_2),
                                        http("request_27")
                                                .get(UC29_uri2 + "/build/images/shtadopm/archive1.png")
                                                .headers(headersUC29_2),
                                        http("request_28")
                                                .get(UC29_uri2 + "/uploads/media/default/0001/16/d8be626d1edbeeeae3a7f853cbc2b6114695d91e.png")
                                                .headers(headersUC29_2),
                                        http("request_29")
                                                .get(UC29_uri2 + "/build/images/shtadopm/archive2.png")
                                                .headers(headersUC29_2),
                                        http("request_30")
                                                .get(UC29_uri2 + "/build/images/shtadopm/archive3.png")
                                                .headers(headersUC29_2),
                                        http("request_31")
                                                .get(UC29_uri2 + "/build/images/shtadopm/archive4.png")
                                                .headers(headersUC29_2),
                                        http("request_32")
                                                .get(UC29_uri2 + "/build/images/shtadopm/archive5.png")
                                                .headers(headersUC29_2),
                                        http("request_33")
                                                .get(UC29_uri2 + "/uploads/media/default/0001/14/8e41f9787e36e8029d3c6170de36347f0ca54c05.png")
                                                .headers(headersUC29_2),
                                        http("request_34")
                                                .get(UC29_uri2 + "/uploads/media/slides/0001/13/4ec801b9e1775a9059c90458ed5764228c943142.jpeg")
                                                .headers(headersUC29_2),
                                        http("request_35")
                                                .get(UC29_uri2 + "/build/7255.871eb160.js")
                                                .headers(headersUC29_2),
                                        http("request_36")
                                                .get(UC29_uri2 + "/build/6889.3f713c69.js")
                                                .headers(headersUC29_2),
                                        http("request_37")
                                                .get(UC29_uri2 + "/build/7729.67d87565.js")
                                                .headers(headersUC29_2),
                                        http("request_38")
                                                .get(UC29_uri2 + "/build/8981.bc50772a.js")
                                                .headers(headersUC29_2),
                                        http("request_39")
                                                .get(UC29_uri2 + "/build/3734.2c5e1582.js")
                                                .headers(headersUC29_2),
                                        http("request_40")
                                                .get(UC29_uri2 + "/build/9154.f1370752.js")
                                                .headers(headersUC29_2),
                                        http("request_41")
                                                .get(UC29_uri2 + "/build/1676.2634f191.js")
                                                .headers(headersUC29_2),
                                        http("request_42")
                                                .get(UC29_uri2 + "/build/shtadopm_app_footer.9745ecad.js")
                                                .headers(headersUC29_2),
                                        http("request_43")
                                                .get(UC29_uri2 + "/build/images/shtadopm/favicon/favicon.ico")
                                                .headers(headersUC29_2),
                                        http("request_44")
                                                .get(UC29_uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
                                                .headers(headersUC29_2),
                                        http("request_45")
                                                .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2022&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A624561450%3Az%3A300%3Ai%3A20240824121131%3Aet%3A1724483491%3Ac%3A1%3Arn%3A917629662%3Arqn%3A194%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C534%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483490666%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483491%3At%3A%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1%20%D0%BF%D0%BE%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B7%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D0%BC%D0%B8%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5%20%D0%B2%202022%20%D0%B3%D0%BE%D0%B4%D1%83&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                                .headers(headersUC29_45),
                                        http("request_46")
                                                .get("/metrika/metrika_match.html")
                                                .headers(headersUC29_46)
                                )
                );

        HttpProtocolBuilder httpProtocol_MainPage2021 = http
                .baseUrl("https://mc.yandex.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersUC30_0 = new HashMap<>();
        headersUC30_0.put("accept", "*/*");
        headersUC30_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC30_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC30_0.put("content-type", "text/plain");
        headersUC30_0.put("origin", "https://shtab.opmoscow.ru");
        headersUC30_0.put("priority", "u=1, i");
        headersUC30_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC30_0.put("sec-ch-ua-mobile", "?0");
        headersUC30_0.put("sec-ch-ua-platform", "Linux");
        headersUC30_0.put("sec-fetch-dest", "empty");
        headersUC30_0.put("sec-fetch-mode", "cors");
        headersUC30_0.put("sec-fetch-site", "cross-site");
        headersUC30_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC30_3 = new HashMap<>();
        headersUC30_3.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC30_3.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC30_3.put("sec-ch-ua-mobile", "?0");
        headersUC30_3.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC30_44 = new HashMap<>();
        headersUC30_44.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC30_44.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC30_44.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC30_44.put("priority", "u=0, i");
        headersUC30_44.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC30_44.put("sec-ch-ua-mobile", "?0");
        headersUC30_44.put("sec-ch-ua-platform", "Linux");
        headersUC30_44.put("sec-fetch-dest", "document");
        headersUC30_44.put("sec-fetch-mode", "navigate");
        headersUC30_44.put("sec-fetch-site", "same-origin");
        headersUC30_44.put("sec-fetch-user", "?1");
        headersUC30_44.put("upgrade-insecure-requests", "1");
        headersUC30_44.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC30_63 = new HashMap<>();
        headersUC30_63.put("accept", "*/*");
        headersUC30_63.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC30_63.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC30_63.put("origin", "https://shtab.opmoscow.ru");
        headersUC30_63.put("priority", "u=1, i");
        headersUC30_63.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC30_63.put("sec-ch-ua-mobile", "?0");
        headersUC30_63.put("sec-ch-ua-platform", "Linux");
        headersUC30_63.put("sec-fetch-dest", "empty");
        headersUC30_63.put("sec-fetch-mode", "cors");
        headersUC30_63.put("sec-fetch-site", "cross-site");
        headersUC30_63.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC30_67 = new HashMap<>();
        headersUC30_67.put("Upgrade-Insecure-Requests", "1");
        headersUC30_67.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC30_67.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC30_67.put("sec-ch-ua-mobile", "?0");
        headersUC30_67.put("sec-ch-ua-platform", "Linux");

        String UC30_uri2 = "https://shtab.opmoscow.ru";

        String uri3 = "https://i.ytimg.com/vi";

        ScenarioBuilder scnUC30 = scenario("Archive.MainPage2021")
                .exec(
                        http("request_0")
                                .post("/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=512483129&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2021&rn=41669544&browser-info=bt%3A1%3Awe%3A1%3Aet%3A1724483523%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824121202%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724483523&t=gdpr(14)ti(1)")
                                .headers(headersUC30_0)
                                .resources(
                                        http("request_1")
                                                .post("/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=512483129&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2021&rn=240001421&browser-info=we%3A1%3Aet%3A1724483523%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824121203%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724483523&t=gdpr(14)ti(1)")
                                                .headers(headersUC30_0),
//                                                .body(RawFileBody("mainpage2021/0001_request.gif")),
                                        http("request_2")
                                                .post("/webvisor/89667203?wv-part=2&wv-type=7&wmode=0&wv-hit=512483129&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2021&rn=993347388&browser-info=we%3A1%3Aet%3A1724483524%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824121204%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724483524&t=gdpr(14)ti(1)")
                                                .headers(headersUC30_0),
//                                                .body(RawFileBody("mainpage2021/0002_request.gif")),
                                        http("request_3")
                                                .get(UC30_uri2 + "/build/5758.f38a32ed.css")
                                                .headers(headersUC30_3),
                                        http("request_4")
                                                .get(UC30_uri2 + "/build/6395.76430bbc.css")
                                                .headers(headersUC30_3),
                                        http("request_5")
                                                .get(UC30_uri2 + "/build/8886.31d6cfe0.css")
                                                .headers(headersUC30_3),
                                        http("request_6")
                                                .get(UC30_uri2 + "/build/shtadopm_css_head.dfe3f750.css")
                                                .headers(headersUC30_3),
                                        http("request_7")
                                                .get(UC30_uri2 + "/build/runtime.aaa04269.js")
                                                .headers(headersUC30_3),
                                        http("request_8")
                                                .get(UC30_uri2 + "/build/9755.89d0240d.js")
                                                .headers(headersUC30_3),
                                        http("request_9")
                                                .get(UC30_uri2 + "/build/shtadopm_app_head.a800bb8d.js")
                                                .headers(headersUC30_3),
                                        http("request_10")
                                                .get(UC30_uri2 + "/build/images/shtadopm/logo.svg")
                                                .headers(headersUC30_3),
                                        http("request_11")
                                                .get(UC30_uri2 + "/build/images/shtadopm/menu-arrow.svg")
                                                .headers(headersUC30_3),
                                        http("request_12")
                                                .get("/metrika/tag.js")
                                                .headers(headersUC30_3),
                                        http("request_13")
                                                .get(UC30_uri2 + "/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
                                        http("request_14")
                                                .get(UC30_uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                        http("request_15")
                                                .get(UC30_uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                        http("request_16")
                                                .get(UC30_uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                        http("request_17")
                                                .get(UC30_uri2 + "/cache/5/1/0/6/0/51060261c73284ac34c3bf9d9cc5e36a222380fc.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_18")
                                                .get(UC30_uri2 + "/cache/b/0/1/8/1/b01813f0e98cd4c5e5175089c5618cbe8691fb6f.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_19")
                                                .get(UC30_uri2 + "/cache/b/1/e/6/3/b1e6349294a6faab03d90c7cd7cede2209ca3380.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_20")
                                                .get(UC30_uri2 + "/cache/d/6/9/5/6/d69561d2bda805561fe75f0708cae888cb5b2b8b.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_21")
                                                .get(UC30_uri2 + "/cache/6/d/e/6/4/6de6484b5ebc5f529d58e2f26ddf2104d91016cb.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_22")
                                                .get(UC30_uri2 + "/cache/2/f/9/0/2/2f902259b899255024f6d9bb30477f7f76529ba2.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_23")
                                                .get(UC30_uri2 + "/cache/a/e/e/f/e/aeefec5a2aa80990aa28f356dc93c2768b356a07.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_24")
                                                .get(UC30_uri2 + "/cache/e/7/f/4/8/e7f4857e99246f842891e456a21e31672b30de0e.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_25")
                                                .get(UC30_uri2 + "/cache/c/0/e/8/e/c0e8e6e74dc69b3706ccc519bd2e0cae360403a5.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_26")
                                                .get(UC30_uri2 + "/cache/b/b/6/8/e/bb68e30aba1a137325a7d61236a930cd6ccb0ba8.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_27")
                                                .get(UC30_uri2 + "/cache/4/3/f/9/3/43f9386301785d1ab836ea0c37e5c38fa81ce765.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_28")
                                                .get(UC30_uri2 + "/cache/b/b/8/5/4/bb854687ec663e4c19824c32d3f0f29c5dea9a81.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_29")
                                                .get(UC30_uri2 + "/cache/5/b/f/3/b/5bf3baa05ab9f7d33599f3f3d42f1ea8ba9deb88.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_30")
                                                .get(UC30_uri2 + "/cache/7/c/5/4/8/7c5487d4bcfa29837ee76f41f3573e90fc36321c.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_31")
                                                .get(UC30_uri2 + "/cache/b/e/6/c/0/be6c0c0599be356d9e6d5b566a9bf3f96380b6f9.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_32")
                                                .get(UC30_uri2 + "/cache/6/5/7/5/c/6575c4f5a00d4f6b7306a8bd6570320bcb50fbdd.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_33")
                                                .get(UC30_uri2 + "/cache/d/b/6/9/4/db69402f7bafef374dee1e606909edabf7e6ffaa.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_34")
                                                .get(UC30_uri2 + "/cache/2/8/3/7/7/283774b0b5f7b7d075e97ea311af5203629a406e.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_35")
                                                .get(UC30_uri2 + "/cache/9/7/7/8/b/9778b29cde67066d2e62211b378e6bb797b3040a.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_36")
                                                .get(UC30_uri2 + "/cache/a/a/4/9/b/aa49b0c3ad8491c296f37d510df2dbcf45b76d8c.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_37")
                                                .get(UC30_uri2 + "/cache/1/c/c/e/8/1cce894ffbcde9da2a48c815556491bc85ad1a24.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_38")
                                                .get(UC30_uri2 + "/cache/1/7/2/5/1/1725100e6a3f7292e0f7835462fc0d0a08b53462.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_39")
                                                .get(UC30_uri2 + "/cache/a/8/b/e/7/a8be77f4a7a1b28d9e60eb393f97343948effab9.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_40")
                                                .get(UC30_uri2 + "/cache/c/6/d/f/8/c6df89f4f9b41f2a7c4f8eec6d35d36e29db8540.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_41")
                                                .get(UC30_uri2 + "/cache/b/5/0/3/7/b5037ea095062afd1bc7c5faf6da034ce984ccdb.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_42")
                                                .get(UC30_uri2 + "/cache/f/8/3/5/8/f8358e4a8a1c1b12101d887f07e54f1e58152999.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_43")
                                                .get(UC30_uri2 + "/cache/e/c/f/7/c/ecf7cb2d9114fdb3e43613c2a592d110aaabef43.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_44")
                                                .get(UC30_uri2 + "/obshchestvennyy-shtab-po-vyboram-2021")
                                                .headers(headersUC30_44),
                                        http("request_45")
                                                .get(UC30_uri2 + "/cache/6/f/e/6/7/6fe67fb9e7ef037f6ca842eecd6bc75a9036ea90.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_46")
                                                .get(UC30_uri2 + "/cache/f/f/0/d/d/ff0dd5e6429bb8120d3d532568c710146b1d58dc.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_47")
                                                .get(UC30_uri2 + "/cache/d/5/a/2/3/d5a23df8dc58c019dae858363fe248ea47d52337.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_48")
                                                .get(UC30_uri2 + "/cache/c/a/8/f/b/ca8fb465b2a66fb47894e5cb94759996f08b80d7.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_49")
                                                .get(UC30_uri2 + "/cache/6/f/c/7/4/6fc7473cdd104126d64bb2a16889b448ed046506.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_50")
                                                .get(UC30_uri2 + "/cache/c/d/9/c/b/cd9cb94afef7ee5ef657483eab2625b1247b0742.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_51")
                                                .get(UC30_uri2 + "/cache/1/c/f/3/8/1cf3868c3b586f33254ef91143b9cdd474acb74e.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_52")
                                                .get(UC30_uri2 + "/cache/7/b/a/a/b/7baab105bea889c0d52ddd35cf67cba1629e4f91.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_53")
                                                .get(UC30_uri2 + "/cache/1/0/f/6/e/10f6e29a1b32dee42d5b554d0fc21da19935581c.jpeg")
                                                .headers(headersUC30_3),
                                        http("request_54")
                                                .get(UC30_uri2 + "/build/images/opmoscow/loading.svg")
                                                .headers(headersUC30_3),
                                        http("request_55")
                                                .get(UC30_uri2 + "/build/7255.871eb160.js")
                                                .headers(headersUC30_3),
                                        http("request_56")
                                                .get(UC30_uri2 + "/build/6889.3f713c69.js")
                                                .headers(headersUC30_3),
                                        http("request_57")
                                                .get(UC30_uri2 + "/build/7729.67d87565.js")
                                                .headers(headersUC30_3),
                                        http("request_58")
                                                .get(UC30_uri2 + "/build/8981.bc50772a.js")
                                                .headers(headersUC30_3),
                                        http("request_59")
                                                .get(UC30_uri2 + "/build/3734.2c5e1582.js")
                                                .headers(headersUC30_3),
                                        http("request_60")
                                                .get(UC30_uri2 + "/build/9154.f1370752.js")
                                                .headers(headersUC30_3),
                                        http("request_61")
                                                .get(UC30_uri2 + "/build/1676.2634f191.js")
                                                .headers(headersUC30_3),
                                        http("request_62")
                                                .get(UC30_uri2 + "/build/shtadopm_app_footer.9745ecad.js")
                                                .headers(headersUC30_3),
                                        http("request_63")
                                                .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2021&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A375205747%3Az%3A300%3Ai%3A20240824121206%3Aet%3A1724483526%3Ac%3A1%3Arn%3A948334995%3Arqn%3A197%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C1343%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483524696%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483526%3At%3A%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1%20%D0%BF%D0%BE%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B7%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D0%BC%D0%B8%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5%20%D0%B2%202021%20%D0%B3%D0%BE%D0%B4%D1%83&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                                .headers(headersUC30_63),
                                        http("request_64")
                                                .get(uri3 + "/GsneU_AyCFM/hqdefault.jpg")
                                                .headers(headersUC30_3),
                                        http("request_65")
                                                .get(uri3 + "/uPGcgn0U2kI/hqdefault.jpg")
                                                .headers(headersUC30_3),
                                        http("request_66")
                                                .get(uri3 + "/Ju8xliqHyAM/hqdefault.jpg")
                                                .headers(headersUC30_3),
                                        http("request_67")
                                                .get("/metrika/metrika_match.html")
                                                .headers(headersUC30_67),
                                        http("request_68")
                                                .get(UC30_uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
                                                .headers(headersUC30_3),
                                        http("request_69")
                                                .get(UC30_uri2 + "/build/images/shtadopm/favicon/favicon.ico")
                                                .headers(headersUC30_3)
                                )
                );

        HttpProtocolBuilder httpProtocol_MainPage2020 = http
                .baseUrl("https://shtab.opmoscow.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersUC31_0 = new HashMap<>();
        headersUC31_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC31_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC31_0.put("sec-ch-ua-mobile", "?0");
        headersUC31_0.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC31_22 = new HashMap<>();
        headersUC31_22.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC31_22.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC31_22.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC31_22.put("priority", "u=0, i");
        headersUC31_22.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC31_22.put("sec-ch-ua-mobile", "?0");
        headersUC31_22.put("sec-ch-ua-platform", "Linux");
        headersUC31_22.put("sec-fetch-dest", "document");
        headersUC31_22.put("sec-fetch-mode", "navigate");
        headersUC31_22.put("sec-fetch-site", "same-origin");
        headersUC31_22.put("sec-fetch-user", "?1");
        headersUC31_22.put("upgrade-insecure-requests", "1");
        headersUC31_22.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC31_23 = new HashMap<>();
        headersUC31_23.put("Upgrade-Insecure-Requests", "1");
        headersUC31_23.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC31_23.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC31_23.put("sec-ch-ua-mobile", "?0");
        headersUC31_23.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC31_36 = new HashMap<>();
        headersUC31_36.put("accept", "*/*");
        headersUC31_36.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC31_36.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC31_36.put("origin", "https://shtab.opmoscow.ru");
        headersUC31_36.put("priority", "u=1, i");
        headersUC31_36.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC31_36.put("sec-ch-ua-mobile", "?0");
        headersUC31_36.put("sec-ch-ua-platform", "Linux");
        headersUC31_36.put("sec-fetch-dest", "empty");
        headersUC31_36.put("sec-fetch-mode", "cors");
        headersUC31_36.put("sec-fetch-site", "cross-site");
        headersUC31_36.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        String uri1 = "https://mc.yandex.ru";

//        String uri3 = "https://i.ytimg.com/vi";

        ScenarioBuilder scnUC31 = scenario("Archive.MainPage2020")
                .exec(
                        http("request_0")
                                .get("/build/5758.f38a32ed.css")
                                .headers(headersUC31_0)
                                .resources(
                                        http("request_1")
                                                .get("/build/6395.76430bbc.css")
                                                .headers(headersUC31_0),
                                        http("request_2")
                                                .get("/build/8886.31d6cfe0.css")
                                                .headers(headersUC31_0),
                                        http("request_3")
                                                .get("/build/shtadopm_css_head.dfe3f750.css")
                                                .headers(headersUC31_0),
                                        http("request_4")
                                                .get("/build/runtime.aaa04269.js")
                                                .headers(headersUC31_0),
                                        http("request_5")
                                                .get("/build/9755.89d0240d.js")
                                                .headers(headersUC31_0),
                                        http("request_6")
                                                .get("/build/shtadopm_app_head.a800bb8d.js")
                                                .headers(headersUC31_0),
                                        http("request_7")
                                                .get("/uploads/media/default/0001/15/d8fd939e1bb28172b3676c657fb92b74a41518d4.png")
                                                .headers(headersUC31_0),
                                        http("request_8")
                                                .get("/build/images/shtadopm/menu-arrow.svg")
                                                .headers(headersUC31_0),
                                        http("request_9")
                                                .get("/cache/9/9/8/9/3/99893a39b66f9284a0e8fd26b648badd4c0318b5.png")
                                                .headers(headersUC31_0),
                                        http("request_10")
                                                .get("/cache/2/8/5/6/f/2856f2d1ebdccb8ba5412461c0eb8cb3f9ff9a4a.jpeg")
                                                .headers(headersUC31_0),
                                        http("request_11")
                                                .get("/cache/e/e/b/e/d/eebed9e7adf8d3de1e56e5726526fae84cad8ec5.png")
                                                .headers(headersUC31_0),
                                        http("request_12")
                                                .get("/cache/1/5/7/1/d/1571df28d12d91e60387cfd8933e068724d39113.jpeg")
                                                .headers(headersUC31_0),
                                        http("request_13")
                                                .get("/cache/b/d/3/e/a/bd3eaa644cb769c937543eb1bfb79e3c306cd7e7.jpeg")
                                                .headers(headersUC31_0),
                                        http("request_14")
                                                .get("/cache/f/7/8/8/9/f788969d6b72a6697516a6d7a4dcb1b5b77a2ebc.jpeg")
                                                .headers(headersUC31_0),
                                        http("request_15")
                                                .get("/build/images/opmoscow/loading.svg")
                                                .headers(headersUC31_0),
                                        http("request_16")
                                                .get(uri1 + "/metrika/tag.js")
                                                .headers(headersUC31_0),
                                        http("request_17")
                                                .get("/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
                                        http("request_18")
                                                .get("/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
                                        http("request_19")
                                                .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                        http("request_20")
                                                .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                        http("request_21")
                                                .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                        http("request_22")
                                                .get("/obshchestvennyy-shtab-po-vyboram-2020")
                                                .headers(headersUC31_22),
                                        http("request_23")
                                                .get(uri1 + "/metrika/metrika_match.html")
                                                .headers(headersUC31_23),
                                        http("request_24")
                                                .get("/cache/e/9/f/6/f/e9f6f8422307ed59ecf7d3f8199c47104705f895.jpeg")
                                                .headers(headersUC31_0),
                                        http("request_25")
                                                .get("/cache/f/8/4/f/e/f84feac61fc54a02c74141fb1e6e3eaa306f55a8.jpeg")
                                                .headers(headersUC31_0),
                                        http("request_26")
                                                .get("/cache/7/2/f/9/c/72f9c13f4182f816425efed16acc8c45602b680e.jpeg")
                                                .headers(headersUC31_0),
                                        http("request_27")
                                                .get("/cache/d/a/e/3/5/dae35437407848b0cc930a879a120fe99e1dfb60.jpeg")
                                                .headers(headersUC31_0),
                                        http("request_28")
                                                .get("/cache/a/c/c/8/d/acc8d6cf4c6c3b524a575fc5411701653557cc91.jpeg")
                                                .headers(headersUC31_0),
                                        http("request_29")
                                                .get("/cache/2/9/a/c/6/29ac691aa6a8d331b94ca63dfbc691bffc66c22a.png")
                                                .headers(headersUC31_0),
                                        http("request_30")
                                                .get("/build/7255.871eb160.js")
                                                .headers(headersUC31_0),
                                        http("request_31")
                                                .get("/build/6889.3f713c69.js")
                                                .headers(headersUC31_0),
                                        http("request_32")
                                                .get("/build/7729.67d87565.js")
                                                .headers(headersUC31_0),
                                        http("request_33")
                                                .get("/build/8981.bc50772a.js")
                                                .headers(headersUC31_0),
                                        http("request_34")
                                                .get("/build/3734.2c5e1582.js")
                                                .headers(headersUC31_0),
                                        http("request_35")
                                                .get("/build/9154.f1370752.js")
                                                .headers(headersUC31_0),
                                        http("request_36")
                                                .get(uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2020&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A490738847%3Az%3A300%3Ai%3A20240824121233%3Aet%3A1724483554%3Ac%3A1%3Arn%3A1051478856%3Arqn%3A199%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C492%2C%2C2%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483553189%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483554%3At%3A%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1%20%D0%BF%D0%BE%20%D0%BA%D0%BE%D0%BD%D1%82%D1%80%D0%BE%D0%BB%D1%8E%20%D0%B8%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B7%D0%B0%20%D0%B3%D0%BE%D0%BB%D0%BE%D1%81%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5%D0%BC%20%D0%BF%D0%BE%20%D0%BF%D0%BE%D0%BF%D1%80%D0%B0%D0%B2%D0%BA%D0%B0%D0%BC%20%D0%B2%20%D0%9A%D0%BE%D0%BD%D1%81%D1%82%D0%B8%D1%82%D1%83%D1%86%D0%B8%D1%8E%20%D0%A0%D0%BE%D1%81%D1%81%D0%B8%D0%B9%D1%81%D0%BA%D0%BE%D0%B9%20%D0%A4%D0%B5%D0%B4%D0%B5%D1%80%D0%B0%D1%86%D0%B8%D0%B8&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                                .headers(headersUC31_36),
                                        http("request_37")
                                                .get("/build/1676.2634f191.js")
                                                .headers(headersUC31_0),
                                        http("request_38")
                                                .get("/build/images/shtadopm/favicon/site.webmanifest")
                                                .headers(headersUC31_0),
                                        http("request_39")
                                                .get("/build/shtadopm_app_footer.9745ecad.js")
                                                .headers(headersUC31_0),
                                        http("request_40")
                                                .get(uri3 + "/gUerbOs0ZHc/hqdefault.jpg")
                                                .headers(headersUC31_0),
                                        http("request_41")
                                                .get(uri3 + "/aJj5lLy4e3w/hqdefault.jpg")
                                                .headers(headersUC31_0),
                                        http("request_42")
                                                .get(uri3 + "/GRLRqEK_6q4/hqdefault.jpg")
                                                .headers(headersUC31_0),
                                        http("request_43")
                                                .get("/build/images/shtadopm/favicon/favicon.ico")
                                                .headers(headersUC31_0)
                                )
                );

        HttpProtocolBuilder httpProtocol_MainPage2019 = http
                .baseUrl("https://mc.yandex.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersUC35_0 = new HashMap<>();
        headersUC35_0.put("accept", "*/*");
        headersUC35_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC35_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC35_0.put("content-type", "text/plain");
        headersUC35_0.put("origin", "https://shtab.opmoscow.ru");
        headersUC35_0.put("priority", "u=1, i");
        headersUC35_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC35_0.put("sec-ch-ua-mobile", "?0");
        headersUC35_0.put("sec-ch-ua-platform", "Linux");
        headersUC35_0.put("sec-fetch-dest", "empty");
        headersUC35_0.put("sec-fetch-mode", "cors");
        headersUC35_0.put("sec-fetch-site", "cross-site");
        headersUC35_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC35_2 = new HashMap<>();
        headersUC35_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC35_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC35_2.put("sec-ch-ua-mobile", "?0");
        headersUC35_2.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC35_59 = new HashMap<>();
        headersUC35_59.put("Upgrade-Insecure-Requests", "1");
        headersUC35_59.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC35_59.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC35_59.put("sec-ch-ua-mobile", "?0");
        headersUC35_59.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC35_60 = new HashMap<>();
        headersUC35_60.put("accept", "*/*");
        headersUC35_60.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC35_60.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC35_60.put("origin", "https://shtab.opmoscow.ru");
        headersUC35_60.put("priority", "u=1, i");
        headersUC35_60.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC35_60.put("sec-ch-ua-mobile", "?0");
        headersUC35_60.put("sec-ch-ua-platform", "Linux");
        headersUC35_60.put("sec-fetch-dest", "empty");
        headersUC35_60.put("sec-fetch-mode", "cors");
        headersUC35_60.put("sec-fetch-site", "cross-site");
        headersUC35_60.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC35_62 = new HashMap<>();
        headersUC35_62.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC35_62.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC35_62.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC35_62.put("priority", "u=0, i");
        headersUC35_62.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC35_62.put("sec-ch-ua-mobile", "?0");
        headersUC35_62.put("sec-ch-ua-platform", "Linux");
        headersUC35_62.put("sec-fetch-dest", "document");
        headersUC35_62.put("sec-fetch-mode", "navigate");
        headersUC35_62.put("sec-fetch-site", "same-origin");
        headersUC35_62.put("sec-fetch-user", "?1");
        headersUC35_62.put("upgrade-insecure-requests", "1");
        headersUC35_62.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC35_63 = new HashMap<>();
        headersUC35_63.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
        headersUC35_63.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC35_63.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC35_63.put("priority", "i");
        headersUC35_63.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC35_63.put("sec-ch-ua-mobile", "?0");
        headersUC35_63.put("sec-ch-ua-platform", "Linux");
        headersUC35_63.put("sec-fetch-dest", "image");
        headersUC35_63.put("sec-fetch-mode", "no-cors");
        headersUC35_63.put("sec-fetch-site", "same-origin");
        headersUC35_63.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        String UC35_uri2 = "https://shtab.opmoscow.ru";

//        String uri3 = "https://i.ytimg.com/vi";

        ScenarioBuilder scnUC35 = scenario("Archive.MainPage2019")
                .exec(
                        http("request_0")
                                .post("/webvisor/89667203?wv-part=12&wv-type=7&wmode=0&wv-hit=19143757&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2019&rn=27055517&browser-info=we%3A1%3Aet%3A1724483890%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824121810%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724483890&t=gdpr(14)ti(1)")
                                .headers(headersUC35_0)
//                                .body(RawFileBody("mainpage2019/0000_request.gif"))
                                .resources(
                                        http("request_1")
                                                .post("/webvisor/89667203?wv-part=13&wv-type=7&wmode=0&wv-hit=19143757&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2019&rn=709908498&browser-info=we%3A1%3Aet%3A1724483892%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824121812%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724483892&t=gdpr(14)ti(1)")
                                                .headers(headersUC35_0),
//                                                .body(RawFileBody("mainpage2019/0001_request.gif")),
                                        http("request_2")
                                                .get(UC35_uri2 + "/build/5758.f38a32ed.css")
                                                .headers(headersUC35_2),
                                        http("request_3")
                                                .get(UC35_uri2 + "/build/6395.76430bbc.css")
                                                .headers(headersUC35_2),
                                        http("request_4")
                                                .get(UC35_uri2 + "/build/8886.31d6cfe0.css")
                                                .headers(headersUC35_2),
                                        http("request_5")
                                                .get(UC35_uri2 + "/build/shtadopm_css_head.dfe3f750.css")
                                                .headers(headersUC35_2),
                                        http("request_6")
                                                .get(UC35_uri2 + "/build/runtime.aaa04269.js")
                                                .headers(headersUC35_2),
                                        http("request_7")
                                                .get(UC35_uri2 + "/build/9755.89d0240d.js")
                                                .headers(headersUC35_2),
                                        http("request_8")
                                                .get(UC35_uri2 + "/build/shtadopm_app_head.a800bb8d.js")
                                                .headers(headersUC35_2),
                                        http("request_9")
                                                .get(UC35_uri2 + "/uploads/media/default/0001/17/a9f08740e44e723c62455552ad70d5a29736033a.png")
                                                .headers(headersUC35_2),
                                        http("request_10")
                                                .get(UC35_uri2 + "/build/images/shtadopm/menu-arrow.svg")
                                                .headers(headersUC35_2),
                                        http("request_11")
                                                .get("/metrika/tag.js")
                                                .headers(headersUC35_2),
                                        http("request_12")
                                                .get(UC35_uri2 + "/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
                                        http("request_13")
                                                .get(UC35_uri2 + "/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
                                        http("request_14")
                                                .get(UC35_uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                        http("request_15")
                                                .get(UC35_uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                        http("request_16")
                                                .get(UC35_uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                        http("request_17")
                                                .get(UC35_uri2 + "/build/fonts/subset-Montserrat-SemiBoldItalic.89c710ac.woff2"),
                                        http("request_18")
                                                .get(UC35_uri2 + "/cache/b/1/e/6/3/b1e6349294a6faab03d90c7cd7cede2209ca3380.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_19")
                                                .get(UC35_uri2 + "/cache/c/0/e/8/e/c0e8e6e74dc69b3706ccc519bd2e0cae360403a5.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_20")
                                                .get(UC35_uri2 + "/cache/b/e/6/c/0/be6c0c0599be356d9e6d5b566a9bf3f96380b6f9.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_21")
                                                .get(UC35_uri2 + "/cache/e/7/f/4/8/e7f4857e99246f842891e456a21e31672b30de0e.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_22")
                                                .get(UC35_uri2 + "/cache/2/a/e/d/7/2aed74619e97da0bdc2987954df66fdd80ac13ef.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_23")
                                                .get(UC35_uri2 + "/cache/f/8/3/5/8/f8358e4a8a1c1b12101d887f07e54f1e58152999.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_24")
                                                .get(UC35_uri2 + "/cache/6/c/f/b/5/6cfb5516545927d800cd05e651adccfd335565c6.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_25")
                                                .get(UC35_uri2 + "/cache/9/7/9/9/5/97995a1ebdd93576d5e9394884a4402bf9718fb0.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_26")
                                                .get(UC35_uri2 + "/cache/4/f/c/7/3/4fc735b98fb78401dc1cbb07e5e70ff2ea027cf1.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_27")
                                                .get(UC35_uri2 + "/cache/b/d/a/8/d/bda8db27002e2f48a7139ee5393136409c3b6449.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_28")
                                                .get(UC35_uri2 + "/cache/c/1/1/2/4/c11246b14a31b8b15c8b90ab8aa40c655a1f0120.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_29")
                                                .get(UC35_uri2 + "/cache/5/b/f/3/b/5bf3baa05ab9f7d33599f3f3d42f1ea8ba9deb88.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_30")
                                                .get(UC35_uri2 + "/cache/5/d/8/b/4/5d8b459c957892049aea3f9cd74bb67735866f14.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_31")
                                                .get(UC35_uri2 + "/cache/b/a/a/4/4/baa4453821a5b1193a55ce7e2a52a67aaa7cdcfd.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_32")
                                                .get(UC35_uri2 + "/cache/6/a/1/2/e/6a12e845c5d7568c00fb3a919ec66a4cfcb72b4a.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_33")
                                                .get(UC35_uri2 + "/cache/e/6/b/0/f/e6b0faa07d42e00e2d6ade0fa3ef47a2b4740556.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_34")
                                                .get(UC35_uri2 + "/cache/6/0/5/9/1/605919dba069b49985cfd9e7c10246c0dc5f7a64.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_35")
                                                .get(UC35_uri2 + "/cache/7/e/a/4/1/7ea41dd2b53562254228313797f5083d044c4fc2.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_36")
                                                .get(UC35_uri2 + "/cache/c/3/8/d/5/c38d546474ab2ee1fbfcc0434b77a6b9350c2842.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_37")
                                                .get(UC35_uri2 + "/cache/3/5/0/8/6/350862a929899f1abe85690ec1affdd014a3493d.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_38")
                                                .get(UC35_uri2 + "/cache/4/2/5/0/6/425067c3f4e28f05f1b944d87b93e7e2b65eb1ae.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_39")
                                                .get(UC35_uri2 + "/cache/9/c/2/9/4/9c29432ea84ecacf44c09ee325ecd616327cec6b.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_40")
                                                .get(UC35_uri2 + "/cache/e/f/9/9/a/ef99afe299deb5cb5dcacd1071ebabd56b789390.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_41")
                                                .get(UC35_uri2 + "/cache/b/0/1/8/1/b01813f0e98cd4c5e5175089c5618cbe8691fb6f.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_42")
                                                .get(UC35_uri2 + "/cache/2/1/b/c/7/21bc7f4be7745598d6d7c2dbb1589386a573b241.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_43")
                                                .get(UC35_uri2 + "/cache/b/b/8/5/4/bb854687ec663e4c19824c32d3f0f29c5dea9a81.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_44")
                                                .get(UC35_uri2 + "/cache/2/a/0/0/9/2a0099db1c558badd213779d6fe5507c2af4ae80.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_45")
                                                .get(UC35_uri2 + "/cache/9/7/7/8/b/9778b29cde67066d2e62211b378e6bb797b3040a.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_46")
                                                .get(UC35_uri2 + "/cache/7/c/5/4/8/7c5487d4bcfa29837ee76f41f3573e90fc36321c.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_47")
                                                .get(UC35_uri2 + "/cache/1/7/2/5/1/1725100e6a3f7292e0f7835462fc0d0a08b53462.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_48")
                                                .get(UC35_uri2 + "/cache/6/5/7/5/c/6575c4f5a00d4f6b7306a8bd6570320bcb50fbdd.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_49")
                                                .get(UC35_uri2 + "/cache/c/6/d/f/8/c6df89f4f9b41f2a7c4f8eec6d35d36e29db8540.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_50")
                                                .get(UC35_uri2 + "/cache/1/e/2/1/a/1e21a13fa715a9bbbb4069acebd178273b386276.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_51")
                                                .get(UC35_uri2 + "/cache/b/1/9/9/9/b1999d41fe4cd17dbba5b652fe3d476b5162b4e5.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_52")
                                                .get(UC35_uri2 + "/cache/a/8/b/e/7/a8be77f4a7a1b28d9e60eb393f97343948effab9.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_53")
                                                .get(UC35_uri2 + "/cache/e/f/e/8/f/efe8f5d05e03bc3df56113b06d2dda3910202015.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_54")
                                                .get(UC35_uri2 + "/cache/4/9/3/2/4/49324bfceca6ae1ed91f00cf2075cdda2e114ca8.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_55")
                                                .get(UC35_uri2 + "/cache/b/2/b/0/3/b2b0383b79563430710b777196362df59cc3b153.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_56")
                                                .get(UC35_uri2 + "/build/images/opmoscow/loading.svg")
                                                .headers(headersUC35_2),
                                        http("request_57")
                                                .get(UC35_uri2 + "/cache/3/4/3/9/2/343929eb5d18293f9c8a63c64702d07f047810d9.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_58")
                                                .get(UC35_uri2 + "/cache/1/3/4/7/6/134762c8ed10eaa6379e484131c5e3ea7c6c27d0.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_59")
                                                .get("/metrika/metrika_match.html")
                                                .headers(headersUC35_59),
                                        http("request_60")
                                                .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2019&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A243537739%3Az%3A300%3Ai%3A20240824121812%3Aet%3A1724483893%3Ac%3A1%3Arn%3A159766152%3Arqn%3A207%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C1013%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483891777%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483893%3At%3A%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1%20%D0%BF%D0%BE%20%D0%BA%D0%BE%D0%BD%D1%82%D1%80%D0%BE%D0%BB%D1%8E%20%D0%B8%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B7%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D0%BC%D0%B8%20%D0%B4%D0%B5%D0%BF%D1%83%D1%82%D0%B0%D1%82%D0%BE%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%BE%D0%B2%D1%81%D0%BA%D0%BE%D0%B9%20%D0%B3%D0%BE%D1%80%D0%BE%D0%B4%D1%81%D0%BA%D0%BE%D0%B9%20%D0%94%D1%83%D0%BC%D1%8B%20VII%20%D1%81%D0%BE%D0%B7%D1%8B%D0%B2%D0%B0&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                                .headers(headersUC35_60),
                                        http("request_61")
                                                .get(UC35_uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
                                                .headers(headersUC35_2),
                                        http("request_62")
                                                .get(UC35_uri2 + "/obshchestvennyy-shtab-po-vyboram-2019")
                                                .headers(headersUC35_62),
                                        http("request_63")
                                                .get(UC35_uri2 + "/cache/c/7/a/b/8/c7ab8abe318324bff599bd9eaf8263e7cca55403.jpeg")
                                                .headers(headersUC35_63),
                                        http("request_64")
                                                .get(UC35_uri2 + "/cache/9/a/b/d/2/9abd2ad313a8ef79d7a111471ff686d290efc9a4.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_65")
                                                .get(UC35_uri2 + "/cache/7/f/8/1/4/7f8143fd077f8f63d71d128ba65b9dafd1007171.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_66")
                                                .get(UC35_uri2 + "/cache/f/1/3/b/a/f13bae185e369c0ef79fb92b02a07deba2830c0d.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_67")
                                                .get(UC35_uri2 + "/cache/1/9/4/6/f/1946fd1fe760357a5707221a3b575cfe9cd27c54.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_68")
                                                .get(UC35_uri2 + "/build/7255.871eb160.js")
                                                .headers(headersUC35_2),
                                        http("request_69")
                                                .get(UC35_uri2 + "/build/6889.3f713c69.js")
                                                .headers(headersUC35_2),
                                        http("request_70")
                                                .get(UC35_uri2 + "/build/7729.67d87565.js")
                                                .headers(headersUC35_2),
                                        http("request_71")
                                                .get(UC35_uri2 + "/build/8981.bc50772a.js")
                                                .headers(headersUC35_2),
                                        http("request_72")
                                                .get(UC35_uri2 + "/build/3734.2c5e1582.js")
                                                .headers(headersUC35_2),
                                        http("request_73")
                                                .get(UC35_uri2 + "/build/9154.f1370752.js")
                                                .headers(headersUC35_2),
                                        http("request_74")
                                                .get(UC35_uri2 + "/build/1676.2634f191.js")
                                                .headers(headersUC35_2),
                                        http("request_75")
                                                .get(UC35_uri2 + "/build/shtadopm_app_footer.9745ecad.js")
                                                .headers(headersUC35_2),
                                        http("request_76")
                                                .get(uri3 + "/x7PnBBEfkU4/hqdefault.jpg")
                                                .headers(headersUC35_2),
                                        http("request_77")
                                                .get(uri3 + "/bQ2MGfmeE4g/hqdefault.jpg")
                                                .headers(headersUC35_2),
                                        http("request_78")
                                                .get(uri3 + "/1Ah5en_cV_k/hqdefault.jpg")
                                                .headers(headersUC35_2),
                                        http("request_79")
                                                .get(UC35_uri2 + "/cache/e/2/9/d/3/e29d3cd8c44804e216a35c556eecf2f6a8c1c04a.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_80")
                                                .get(UC35_uri2 + "/cache/f/f/8/c/d/ff8cdeaecbb4ad6ae0992e744056e2a9a519c704.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_81")
                                                .get(UC35_uri2 + "/cache/8/1/a/9/2/81a92e728b8ce56ae74f04ed04ffbfd12394946f.jpeg")
                                                .headers(headersUC35_2),
                                        http("request_82")
                                                .get(UC35_uri2 + "/build/images/shtadopm/favicon/favicon.ico")
                                                .headers(headersUC35_2)
                                )
                );

        HttpProtocolBuilder httpProtocol_MainPage2018Prez = http
                .baseUrl("https://www.youtube.com")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersUC36_0 = new HashMap<>();
        headersUC36_0.put("accept", "*/*");
        headersUC36_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC36_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC36_0.put("authorization", "SAPISIDHASH 1724482966_159afe35fce66c22df9393f38795f5fdefce2cc3");
        headersUC36_0.put("content-type", "application/json");
        headersUC36_0.put("origin", "https://www.youtube.com");
        headersUC36_0.put("priority", "u=1, i");
        headersUC36_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC36_0.put("sec-ch-ua-mobile", "?0");
        headersUC36_0.put("sec-ch-ua-platform", "Linux");
        headersUC36_0.put("sec-fetch-dest", "empty");
        headersUC36_0.put("sec-fetch-mode", "cors");
        headersUC36_0.put("sec-fetch-site", "same-origin");
        headersUC36_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC36_0.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
        headersUC36_0.put("x-goog-authuser", "1");
        headersUC36_0.put("x-goog-event-time", "1724482966292");
        headersUC36_0.put("x-goog-request-time", "1724482966292");
        headersUC36_0.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSjziqa2BjIKCgJSVRIEGgAgVQ%3D%3D");
        headersUC36_0.put("x-origin", "https://www.youtube.com");
        headersUC36_0.put("x-youtube-ad-signals", "dt=1724482940479&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C893%2C500&vis=1&wgl=true&ca_type=image&bid=ANyPxKpQ6ePoo7N-CM-ZUEiuFNd6cQwUNiOS9ZBLuibWuJFRX_XUBbWlWjnpwJjB5dlwtO7CC_5j51Js2M1WC0vSwbEK0O7wZQ");
        headersUC36_0.put("x-youtube-client-name", "56");
        headersUC36_0.put("x-youtube-client-version", "1.20240820.01.00");
        headersUC36_0.put("x-youtube-time-zone", "Asia/Tashkent");
        headersUC36_0.put("x-youtube-utc-offset", "300");

        Map<CharSequence, String> headersUC36_1 = new HashMap<>();
        headersUC36_1.put("accept", "*/*");
        headersUC36_1.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC36_1.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC36_1.put("content-type", "text/plain");
        headersUC36_1.put("origin", "https://shtab.opmoscow.ru");
        headersUC36_1.put("priority", "u=1, i");
        headersUC36_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC36_1.put("sec-ch-ua-mobile", "?0");
        headersUC36_1.put("sec-ch-ua-platform", "Linux");
        headersUC36_1.put("sec-fetch-dest", "empty");
        headersUC36_1.put("sec-fetch-mode", "cors");
        headersUC36_1.put("sec-fetch-site", "cross-site");
        headersUC36_1.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC36_2 = new HashMap<>();
        headersUC36_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC36_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC36_2.put("sec-ch-ua-mobile", "?0");
        headersUC36_2.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC36_56 = new HashMap<>();
        headersUC36_56.put("Upgrade-Insecure-Requests", "1");
        headersUC36_56.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC36_56.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC36_56.put("sec-ch-ua-mobile", "?0");
        headersUC36_56.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC36_57 = new HashMap<>();
        headersUC36_57.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC36_57.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC36_57.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC36_57.put("priority", "u=0, i");
        headersUC36_57.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC36_57.put("sec-ch-ua-mobile", "?0");
        headersUC36_57.put("sec-ch-ua-platform", "Linux");
        headersUC36_57.put("sec-fetch-dest", "document");
        headersUC36_57.put("sec-fetch-mode", "navigate");
        headersUC36_57.put("sec-fetch-site", "same-origin");
        headersUC36_57.put("sec-fetch-user", "?1");
        headersUC36_57.put("upgrade-insecure-requests", "1");
        headersUC36_57.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC36_58 = new HashMap<>();
        headersUC36_58.put("accept", "*/*");
        headersUC36_58.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC36_58.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC36_58.put("origin", "https://shtab.opmoscow.ru");
        headersUC36_58.put("priority", "u=1, i");
        headersUC36_58.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC36_58.put("sec-ch-ua-mobile", "?0");
        headersUC36_58.put("sec-ch-ua-platform", "Linux");
        headersUC36_58.put("sec-fetch-dest", "empty");
        headersUC36_58.put("sec-fetch-mode", "cors");
        headersUC36_58.put("sec-fetch-site", "cross-site");
        headersUC36_58.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC36_71 = new HashMap<>();
        headersUC36_71.put("Origin", "https://www.youtube.com");
        headersUC36_71.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC36_71.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC36_71.put("sec-ch-ua-mobile", "?0");
        headersUC36_71.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC36_80 = new HashMap<>();
        headersUC36_80.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC36_80.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC36_80.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC36_80.put("priority", "u=0, i");
        headersUC36_80.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC36_80.put("sec-ch-ua-mobile", "?0");
        headersUC36_80.put("sec-ch-ua-platform", "Linux");
        headersUC36_80.put("sec-fetch-dest", "iframe");
        headersUC36_80.put("sec-fetch-mode", "navigate");
        headersUC36_80.put("sec-fetch-site", "cross-site");
        headersUC36_80.put("upgrade-insecure-requests", "1");
        headersUC36_80.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC36_80.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");

        Map<CharSequence, String> headersUC36_91 = new HashMap<>();
        headersUC36_91.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
        headersUC36_91.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC36_91.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC36_91.put("priority", "i");
        headersUC36_91.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC36_91.put("sec-ch-ua-mobile", "?0");
        headersUC36_91.put("sec-ch-ua-platform", "Linux");
        headersUC36_91.put("sec-fetch-dest", "image");
        headersUC36_91.put("sec-fetch-mode", "no-cors");
        headersUC36_91.put("sec-fetch-site", "same-origin");
        headersUC36_91.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC36_91.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");

        Map<CharSequence, String> headersUC36_92 = new HashMap<>();
        headersUC36_92.put("accept", "*/*");
        headersUC36_92.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC36_92.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC36_92.put("authorization", "SAPISIDHASH 1d5b27c6a579a965f51cbd7d4693f8a3b7fc42cb");
        headersUC36_92.put("content-type", "application/x-www-form-urlencoded;charset=UTF-8");
        headersUC36_92.put("origin", "https://www.youtube.com");
        headersUC36_92.put("priority", "u=1, i");
        headersUC36_92.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC36_92.put("sec-ch-ua-mobile", "?0");
        headersUC36_92.put("sec-ch-ua-platform", "Linux");
        headersUC36_92.put("sec-fetch-dest", "empty");
        headersUC36_92.put("sec-fetch-mode", "cors");
        headersUC36_92.put("sec-fetch-site", "cross-site");
        headersUC36_92.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC36_92.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
        headersUC36_92.put("x-goog-authuser", "0");

        Map<CharSequence, String> headersUC36_94 = new HashMap<>();
        headersUC36_94.put("accept", "*/*");
        headersUC36_94.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC36_94.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC36_94.put("origin", "https://www.youtube.com");
        headersUC36_94.put("priority", "u=1, i");
        headersUC36_94.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC36_94.put("sec-ch-ua-mobile", "?0");
        headersUC36_94.put("sec-ch-ua-platform", "Linux");
        headersUC36_94.put("sec-fetch-dest", "empty");
        headersUC36_94.put("sec-fetch-mode", "cors");
        headersUC36_94.put("sec-fetch-site", "cross-site");
        headersUC36_94.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC36_94.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");

        Map<CharSequence, String> headersUC36_95 = new HashMap<>();
        headersUC36_95.put("accept", "*/*");
        headersUC36_95.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC36_95.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC36_95.put("content-type", "application/json+protobuf");
        headersUC36_95.put("origin", "https://www.youtube.com");
        headersUC36_95.put("priority", "u=1, i");
        headersUC36_95.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC36_95.put("sec-ch-ua-mobile", "?0");
        headersUC36_95.put("sec-ch-ua-platform", "Linux");
        headersUC36_95.put("sec-fetch-dest", "empty");
        headersUC36_95.put("sec-fetch-mode", "cors");
        headersUC36_95.put("sec-fetch-site", "cross-site");
        headersUC36_95.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC36_95.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
        headersUC36_95.put("x-goog-api-key", "AIzaSyDyT5W0Jh49F30Pqqtyfdf7pDLFKLJoAnw");
        headersUC36_95.put("x-user-agent", "grpc-web-javascript/0.1");

        Map<CharSequence, String> headersUC36_99 = new HashMap<>();
        headersUC36_99.put("accept", "*/*");
        headersUC36_99.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC36_99.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC36_99.put("authorization", "SAPISIDHASH 1724482971_7c3b3f0ebe324b94b67cfdcdf41e4df5a8aa0c31");
        headersUC36_99.put("content-type", "application/json");
        headersUC36_99.put("origin", "https://www.youtube.com");
        headersUC36_99.put("priority", "u=1, i");
        headersUC36_99.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC36_99.put("sec-ch-ua-mobile", "?0");
        headersUC36_99.put("sec-ch-ua-platform", "Linux");
        headersUC36_99.put("sec-fetch-dest", "empty");
        headersUC36_99.put("sec-fetch-mode", "cors");
        headersUC36_99.put("sec-fetch-site", "same-origin");
        headersUC36_99.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC36_99.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
        headersUC36_99.put("x-goog-authuser", "1");
        headersUC36_99.put("x-goog-event-time", "1724482971515");
        headersUC36_99.put("x-goog-request-time", "1724482971515");
        headersUC36_99.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSiYi6a2BjIKCgJSVRIEGgAgVQ%3D%3D");
        headersUC36_99.put("x-origin", "https://www.youtube.com");
        headersUC36_99.put("x-youtube-ad-signals", "dt=1724482968848&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C893%2C500&vis=1&wgl=true&ca_type=image&bid=ANyPxKqfm0NkexZiQRD6NmPeKbbcHeY4iJ8PiiqYAG4UcvKS2sk8_sbiAYVgA6M0RMnGd0z2a2GDR7IEj6QqAshLnnExOGXoPw");
        headersUC36_99.put("x-youtube-client-name", "56");
        headersUC36_99.put("x-youtube-client-version", "1.20240820.01.00");
        headersUC36_99.put("x-youtube-time-zone", "Asia/Tashkent");
        headersUC36_99.put("x-youtube-utc-offset", "300");

        Map<CharSequence, String> headersUC36_100 = new HashMap<>();
        headersUC36_100.put("accept", "*/*");
        headersUC36_100.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC36_100.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC36_100.put("authorization", "SAPISIDHASH 1724482978_9cf3de13047b33660550de427c51465f43cbf3a9");
        headersUC36_100.put("content-type", "application/json");
        headersUC36_100.put("origin", "https://www.youtube.com");
        headersUC36_100.put("priority", "u=1, i");
        headersUC36_100.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC36_100.put("sec-ch-ua-mobile", "?0");
        headersUC36_100.put("sec-ch-ua-platform", "Linux");
        headersUC36_100.put("sec-fetch-dest", "empty");
        headersUC36_100.put("sec-fetch-mode", "cors");
        headersUC36_100.put("sec-fetch-site", "same-origin");
        headersUC36_100.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC36_100.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
        headersUC36_100.put("x-goog-authuser", "1");
        headersUC36_100.put("x-goog-event-time", "1724482978519");
        headersUC36_100.put("x-goog-request-time", "1724482978519");
        headersUC36_100.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSiYi6a2BjIKCgJSVRIEGgAgVQ%3D%3D");
        headersUC36_100.put("x-origin", "https://www.youtube.com");
        headersUC36_100.put("x-youtube-ad-signals", "dt=1724482968848&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C893%2C500&vis=1&wgl=true&ca_type=image&bid=ANyPxKqfm0NkexZiQRD6NmPeKbbcHeY4iJ8PiiqYAG4UcvKS2sk8_sbiAYVgA6M0RMnGd0z2a2GDR7IEj6QqAshLnnExOGXoPw");
        headersUC36_100.put("x-youtube-client-name", "56");
        headersUC36_100.put("x-youtube-client-version", "1.20240820.01.00");
        headersUC36_100.put("x-youtube-time-zone", "Asia/Tashkent");
        headersUC36_100.put("x-youtube-utc-offset", "300");

        String uri01 = "https://jnn-pa.googleapis.com/$rpc/google.internal.waa.v1.Waa";

        String uri03 = "https://googleads.g.doubleclick.net/pagead/id";

        String uri04 = "https://www.google.com/js/th/JNHVvl2kSR9fjdF95zymQ6dEkKki6kBWa3TewZmiOS4.js";

        String uri05 = "https://fonts.gstatic.com/s/roboto/v18";

        String uri06 = "https://www.gstatic.com";

        String uri07 = "https://i.ytimg.com";

        String uri08 = "https://play.google.com/log";

        String uri09 = "https://static.doubleclick.net/instream/ad_status.js";

        String uri10 = "https://mc.yandex.ru";

        String uri11 = "https://yt3.ggpht.com/ytc/AIdro_mzDihl2M5HeRapUkSW3tlJi2s6Am-nkOGUOh2_A1mDcck=s68-c-k-c0x00ffffff-no-rj";

        String uri12 = "https://shtab.opmoscow.ru";

        ScenarioBuilder scnUC36 = scenario("Archive.MainPage2018Prez")
                .exec(
                        http("request_0")
                                .post("/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
                                .headers(headersUC36_0)
//                                .body(RawFileBody("mainpage2018prez/0000_request.json"))
                                .resources(
                                        http("request_1")
                                                .post(uri10 + "/webvisor/89667203?wv-part=10&wv-type=7&wmode=0&wv-hit=275090560&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018&rn=426694675&browser-info=we%3A1%3Aet%3A1724482966%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824120245%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724482966&t=gdpr(14)ti(1)")
                                                .headers(headersUC36_1),
//                                                .body(RawFileBody("mainpage2018prez/0001_request.gif")),
                                        http("request_2")
                                                .get(uri12 + "/build/5758.f38a32ed.css")
                                                .headers(headersUC36_2),
                                        http("request_3")
                                                .get(uri12 + "/build/6395.76430bbc.css")
                                                .headers(headersUC36_2),
                                        http("request_4")
                                                .get(uri12 + "/build/8886.31d6cfe0.css")
                                                .headers(headersUC36_2),
                                        http("request_5")
                                                .get(uri12 + "/build/shtadopm_css_head.dfe3f750.css")
                                                .headers(headersUC36_2),
                                        http("request_6")
                                                .get(uri12 + "/build/runtime.aaa04269.js")
                                                .headers(headersUC36_2),
                                        http("request_7")
                                                .get(uri12 + "/build/9755.89d0240d.js")
                                                .headers(headersUC36_2),
                                        http("request_8")
                                                .get(uri12 + "/build/shtadopm_app_head.a800bb8d.js")
                                                .headers(headersUC36_2),
                                        http("request_9")
                                                .get(uri12 + "/uploads/media/default/0001/17/4bd9b9fe185a7be5441247e5d48c32d33bbd3e7e.png")
                                                .headers(headersUC36_2),
                                        http("request_10")
                                                .get(uri12 + "/build/images/shtadopm/menu-arrow.svg")
                                                .headers(headersUC36_2),
                                        http("request_11")
                                                .get(uri12 + "/cache/b/1/e/6/3/b1e6349294a6faab03d90c7cd7cede2209ca3380.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_12")
                                                .get(uri12 + "/cache/0/6/7/4/c/0674cb551940a2b3517fed859062de9f80a85eb4.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_13")
                                                .get(uri12 + "/cache/2/a/e/d/7/2aed74619e97da0bdc2987954df66fdd80ac13ef.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_14")
                                                .get(uri12 + "/cache/4/f/c/7/3/4fc735b98fb78401dc1cbb07e5e70ff2ea027cf1.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_15")
                                                .get(uri12 + "/cache/9/7/9/9/5/97995a1ebdd93576d5e9394884a4402bf9718fb0.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_16")
                                                .get(uri12 + "/cache/c/0/e/8/e/c0e8e6e74dc69b3706ccc519bd2e0cae360403a5.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_17")
                                                .get(uri12 + "/cache/a/6/9/6/b/a696b7677997432e1e0c350f8c7d5f9549529fe2.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_18")
                                                .get(uri12 + "/cache/b/5/0/3/7/b5037ea095062afd1bc7c5faf6da034ce984ccdb.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_19")
                                                .get(uri10 + "/metrika/tag.js")
                                                .headers(headersUC36_2),
                                        http("request_20")
                                                .get(uri12 + "/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
                                        http("request_21")
                                                .get(uri12 + "/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
                                        http("request_22")
                                                .get(uri12 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                        http("request_23")
                                                .get(uri12 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                        http("request_24")
                                                .get(uri12 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                        http("request_25")
                                                .get(uri12 + "/build/fonts/subset-Montserrat-SemiBoldItalic.89c710ac.woff2"),
                                        http("request_26")
                                                .get(uri12 + "/cache/f/b/6/c/3/fb6c37537dc66818fbbb5c705f7f4aaf2cdba3b7.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_27")
                                                .get(uri12 + "/cache/a/a/3/3/1/aa331ba8755f7d011b952620065e69a56ec20e0c.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_28")
                                                .get(uri12 + "/cache/f/1/4/5/0/f145041afcbb34b843d7f7f42ff87f0c58280eb6.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_29")
                                                .get(uri12 + "/cache/e/a/0/d/f/ea0dff986d38d4fde789c16e7ccc9f5d784f570f.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_30")
                                                .get(uri12 + "/cache/7/8/f/0/c/78f0c431a34bf4e5e98f264bf9359ac396a448ae.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_31")
                                                .get(uri12 + "/cache/9/b/8/6/d/9b86d1ee2466c2b69eeb342b1752da9e7395deee.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_32")
                                                .get(uri12 + "/cache/4/2/5/0/6/425067c3f4e28f05f1b944d87b93e7e2b65eb1ae.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_33")
                                                .get(uri12 + "/cache/f/5/d/7/8/f5d785fd3394e0a8a9166c8b3f39cc0507f20164.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_34")
                                                .get(uri12 + "/cache/9/5/8/1/7/95817fa6b1940a5fab53928aec1843be45b375f0.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_35")
                                                .get(uri12 + "/cache/a/b/c/9/2/abc921120827ecd9a884bc67c9c7fbfc6ef23fa3.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_36")
                                                .get(uri12 + "/cache/9/c/0/5/7/9c0579092da48f670e8f09bb2464a2adca4f016c.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_37")
                                                .get(uri12 + "/cache/c/4/d/8/c/c4d8c812ccc352c2c7de68eb2549ab042a5bdfef.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_38")
                                                .get(uri12 + "/cache/1/0/f/7/4/10f74876981740667fe60f2413c7e098cac25fb7.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_39")
                                                .get(uri12 + "/cache/4/3/f/9/3/43f9386301785d1ab836ea0c37e5c38fa81ce765.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_40")
                                                .get(uri12 + "/cache/a/e/e/f/e/aeefec5a2aa80990aa28f356dc93c2768b356a07.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_41")
                                                .get(uri12 + "/cache/c/7/3/8/5/c7385bb8b930c02f3a75e3107cc8d875a8b91c27.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_42")
                                                .get(uri12 + "/cache/9/6/9/2/2/9692280782531aef8b8ba418c90ec4f0effc5be5.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_43")
                                                .get(uri12 + "/cache/8/f/c/c/d/8fccda61015f10d9898e6fe5eb2cba0fbdbafccc.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_44")
                                                .get(uri12 + "/cache/7/c/5/4/8/7c5487d4bcfa29837ee76f41f3573e90fc36321c.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_45")
                                                .get(uri12 + "/cache/5/b/f/3/b/5bf3baa05ab9f7d33599f3f3d42f1ea8ba9deb88.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_46")
                                                .get(uri12 + "/cache/0/4/7/d/9/047d974f2f6138b0ec36f9c7bbc9a7dd931e79fb.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_47")
                                                .get(uri12 + "/cache/1/7/2/5/1/1725100e6a3f7292e0f7835462fc0d0a08b53462.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_48")
                                                .get(uri12 + "/cache/f/5/0/3/d/f503d7b102f1ee1d9e694778aaae68ab85b2324a.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_49")
                                                .get(uri12 + "/cache/2/4/f/c/0/24fc09261c2c4668f11de439398982e46e850269.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_50")
                                                .get(uri12 + "/cache/e/f/7/b/0/ef7b04dd45af93e32e85e1702ac91319d71d30d8.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_51")
                                                .get(uri12 + "/cache/e/c/f/7/c/ecf7cb2d9114fdb3e43613c2a592d110aaabef43.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_52")
                                                .get(uri12 + "/cache/b/9/6/3/b/b963bd84b8cc25ec24ad67f94ae8abde3d10a32c.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_53")
                                                .get(uri12 + "/cache/8/4/3/a/e/843aed61e6bfcb25ecd0f2f066a38d57e4913fcc.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_54")
                                                .get(uri12 + "/cache/d/a/3/c/8/da3c8e2ced05f7b2a29858743cbaf1818657b87c.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_55")
                                                .get(uri12 + "/build/images/opmoscow/loading.svg")
                                                .headers(headersUC36_2),
                                        http("request_56")
                                                .get(uri10 + "/metrika/metrika_match.html")
                                                .headers(headersUC36_56),
                                        http("request_57")
                                                .get(uri12 + "/obshchestvennyy-shtab-po-vyboram-2018")
                                                .headers(headersUC36_57),
                                        http("request_58")
                                                .get(uri10 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A828850156%3Az%3A300%3Ai%3A20240824120247%3Aet%3A1724482967%3Ac%3A1%3Arn%3A613962669%3Arqn%3A174%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C903%2C%2C3%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482966294%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482967%3At%3A%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1%20%D0%BF%D0%BE%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B7%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D0%BC%D0%B8%20%D0%9F%D1%80%D0%B5%D0%B7%D0%B8%D0%B4%D0%B5%D1%82%D0%B0%20%D0%A0%D0%A4%20%D0%B2%202018%20%D0%B3%D0%BE%D0%B4%D1%83&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                                .headers(headersUC36_58),
                                        http("request_59")
                                                .get(uri12 + "/build/images/shtadopm/favicon/site.webmanifest")
                                                .headers(headersUC36_2),
                                        http("request_60")
                                                .get(uri12 + "/uploads/media/default/0001/13/d7bd5a946caf86665e8f343780c7ae8d5e26f341.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_61")
                                                .get(uri12 + "/build/7255.871eb160.js")
                                                .headers(headersUC36_2),
                                        http("request_62")
                                                .get(uri12 + "/build/6889.3f713c69.js")
                                                .headers(headersUC36_2),
                                        http("request_63")
                                                .get(uri12 + "/cache/0/4/4/7/7/04477960fdc8cde2b446420b88998e9542b6b56c.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_64")
                                                .get(uri12 + "/build/7729.67d87565.js")
                                                .headers(headersUC36_2),
                                        http("request_65")
                                                .get(uri12 + "/build/8981.bc50772a.js")
                                                .headers(headersUC36_2),
                                        http("request_66")
                                                .get(uri12 + "/build/3734.2c5e1582.js")
                                                .headers(headersUC36_2),
                                        http("request_67")
                                                .get(uri12 + "/build/9154.f1370752.js")
                                                .headers(headersUC36_2),
                                        http("request_68")
                                                .get(uri12 + "/build/1676.2634f191.js")
                                                .headers(headersUC36_2),
                                        http("request_69")
                                                .get(uri12 + "/build/shtadopm_app_footer.9745ecad.js")
                                                .headers(headersUC36_2),
                                        http("request_70")
                                                .get("/s/player/a87a9450/www-player.css")
                                                .headers(headersUC36_2),
                                        http("request_71")
                                                .get(uri05 + "/KFOmCnqEu92Fr1Mu5mxKOzY.woff2")
                                                .headers(headersUC36_71),
                                        http("request_72")
                                                .get(uri05 + "/KFOmCnqEu92Fr1Mu4mxK.woff2")
                                                .headers(headersUC36_71),
                                        http("request_73")
                                                .get(uri05 + "/KFOlCnqEu92Fr1MmEU9fBBc4.woff2")
                                                .headers(headersUC36_71),
                                        http("request_74")
                                                .get(uri07 + "/vi/oEFFIVweZvk/hqdefault.jpg")
                                                .headers(headersUC36_2),
                                        http("request_75")
                                                .get(uri07 + "/vi/jDgy34SkfOE/hqdefault.jpg")
                                                .headers(headersUC36_2),
                                        http("request_76")
                                                .get(uri07 + "/vi/TC3ZW-jsydo/hqdefault.jpg")
                                                .headers(headersUC36_2),
                                        http("request_77")
                                                .get(uri12 + "/cache/5/f/7/8/d/5f78d414dd5af19950318e79a22f5eb5bcce3a80.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_78")
                                                .get(uri12 + "/cache/5/a/1/1/3/5a113ac912dcc012e8ada2f6250d4641d83b5275.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_79")
                                                .get(uri12 + "/cache/6/f/d/9/3/6fd93f3e8f1fbb4e1a036159eba4e63340d23366.jpeg")
                                                .headers(headersUC36_2),
                                        http("request_80")
                                                .get("/embed/7AlrV7ujopg")
                                                .headers(headersUC36_80),
                                        http("request_81")
                                                .get("/s/player/a87a9450/player_ias.vflset/en_US/embed.js")
                                                .headers(headersUC36_2),
                                        http("request_82")
                                                .get("/s/player/a87a9450/www-embed-player.vflset/www-embed-player.js")
                                                .headers(headersUC36_2),
                                        http("request_83")
                                                .get("/s/player/a87a9450/player_ias.vflset/en_US/base.js")
                                                .headers(headersUC36_2),
                                        http("request_84")
                                                .get(uri09)
                                                .headers(headersUC36_2),
                                        http("request_85")
                                                .get("/s/player/a87a9450/player_ias.vflset/en_US/remote.js")
                                                .headers(headersUC36_2),
                                        http("request_86")
                                                .get(uri04)
                                                .headers(headersUC36_2),
                                        http("request_87")
                                                .get(uri07 + "/vi_webp/7AlrV7ujopg/sddefault.webp")
                                                .headers(headersUC36_2),
                                        http("request_88")
                                                .get(uri11)
                                                .headers(headersUC36_2),
                                        http("request_89")
                                                .get(uri06 + "/cv/js/sender/v1/cast_sender.js")
                                                .headers(headersUC36_2),
                                        http("request_90")
                                                .get(uri06 + "/eureka/clank/128/cast_sender.js")
                                                .headers(headersUC36_2),
                                        http("request_91")
                                                .get("/generate_204?snOtmw")
                                                .headers(headersUC36_91),
                                        http("request_92")
                                                .post(uri08 + "?format=json&hasfast=true&authuser=0")
                                                .headers(headersUC36_92)
                                                .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,null,[1,0,0,0,0]]],1828,[[\"1724482969213\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"aGIf\\\"]],[null,71]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"aGIf\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724482969214\"]", ""),
                                        http("request_93")
                                                .get(uri12 + "/build/images/shtadopm/favicon/favicon.ico")
                                                .headers(headersUC36_2),
                                        http("request_94")
                                                .get(uri03)
                                                .headers(headersUC36_94),
                                        http("request_95")
                                                .post(uri01 + "/Create")
                                                .headers(headersUC36_95)
                                                .body(RawFileBody("mainpage2018prez/0095_request.dat")),
                                        http("request_96")
                                                .post(uri08 + "?format=json&hasfast=true&authuser=0")
                                                .headers(headersUC36_92)
                                                .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,[[[\"Chromium\",\"128\"],[\"Not;A", "Brand\",\"24\"],[\"Google Chrome\",\"128\"]],0,\"Linux\",\"6.5.0\",\"x86\",\"\",\"128.0.6613.84\"],[1,0,0,0,0]]],1828,[[\"1724482971165\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[null,41.700000000186265]]]],[\\\"/client_streamz/bg/el\\\",null,[\\\"en\\\",\\\"bk\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.10000000009313226]],[[[\\\"q\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.10000000009313226]],[[[\\\"S\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.599999999627471]]]],[\\\"/client_streamz/bg/wrl\\\",null,[\\\"mn\\\",\\\"ac\\\",\\\"sc\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[null,1],[null,0],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,2091.899999999907]]]],[\\\"/client_streamz/bg/po/csc\\\",null,[\\\"cs\\\",\\\"rk\\\",\\\"mk\\\"],[[[[null,3],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724482971165\"]"),
                                        http("request_97")
                                                .post(uri08 + "?format=json&hasfast=true&authuser=0")
                                                .headers(headersUC36_92)
                                                .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,[[[\"Chromium\",\"128\"],[\"Not;A", "Brand\",\"24\"],[\"Google Chrome\",\"128\"]],0,\"Linux\",\"6.5.0\",\"x86\",\"\",\"128.0.6613.84\"],[1,0,0,0,0]]],1828,[[\"1724482971169\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fsc\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fsl\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[null,2.6000000000931323]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,2]],\"1724482971169\"]"),
                                        http("request_98")
                                                .post(uri01 + "/GenerateIT")
                                                .headers(headersUC36_95)
                                                .body(RawFileBody("mainpage2018prez/0098_request.dat")),
                                        http("request_99")
                                                .post("/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
                                                .headers(headersUC36_99)
                                                .body(RawFileBody("mainpage2018prez/0099_request.json"))
                                )
                );

        HttpProtocolBuilder httpProtocol_MainPage2018Mer = http
                .baseUrl("https://www.youtube.com")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersUC40_0 = new HashMap<>();
        headersUC40_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC40_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC40_0.put("sec-ch-ua-mobile", "?0");
        headersUC40_0.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC40_7 = new HashMap<>();
        headersUC40_7.put("Origin", "https://www.youtube.com");
        headersUC40_7.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC40_7.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC40_7.put("sec-ch-ua-mobile", "?0");
        headersUC40_7.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC40_9 = new HashMap<>();
        headersUC40_9.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
        headersUC40_9.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC40_9.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC40_9.put("priority", "i");
        headersUC40_9.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC40_9.put("sec-ch-ua-mobile", "?0");
        headersUC40_9.put("sec-ch-ua-platform", "Linux");
        headersUC40_9.put("sec-fetch-dest", "image");
        headersUC40_9.put("sec-fetch-mode", "no-cors");
        headersUC40_9.put("sec-fetch-site", "same-origin");
        headersUC40_9.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC40_9.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");

        Map<CharSequence, String> headersUC40_10 = new HashMap<>();
        headersUC40_10.put("accept", "*/*");
        headersUC40_10.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC40_10.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC40_10.put("authorization", "SAPISIDHASH 1724484017_2aec38c3f076105bb86377da0db126e013203ba6");
        headersUC40_10.put("content-type", "application/json");
        headersUC40_10.put("origin", "https://www.youtube.com");
        headersUC40_10.put("priority", "u=1, i");
        headersUC40_10.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC40_10.put("sec-ch-ua-mobile", "?0");
        headersUC40_10.put("sec-ch-ua-platform", "Linux");
        headersUC40_10.put("sec-fetch-dest", "empty");
        headersUC40_10.put("sec-fetch-mode", "cors");
        headersUC40_10.put("sec-fetch-site", "same-origin");
        headersUC40_10.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC40_10.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
        headersUC40_10.put("x-goog-authuser", "1");
        headersUC40_10.put("x-goog-event-time", "1724484017184");
        headersUC40_10.put("x-goog-request-time", "1724484017184");
        headersUC40_10.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSiuk6a2BjIKCgJSVRIEGgAgVQ%3D%3D");
        headersUC40_10.put("x-origin", "https://www.youtube.com");
        headersUC40_10.put("x-youtube-ad-signals", "dt=1724484016024&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C1017%2C600&vis=1&wgl=true&ca_type=image");
        headersUC40_10.put("x-youtube-client-name", "56");
        headersUC40_10.put("x-youtube-client-version", "1.20240820.01.00");
        headersUC40_10.put("x-youtube-time-zone", "Asia/Tashkent");
        headersUC40_10.put("x-youtube-utc-offset", "300");

        Map<CharSequence, String> headersUC40_11 = new HashMap<>();
        headersUC40_11.put("accept", "*/*");
        headersUC40_11.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC40_11.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC40_11.put("origin", "https://www.youtube.com");
        headersUC40_11.put("priority", "u=1, i");
        headersUC40_11.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC40_11.put("sec-ch-ua-mobile", "?0");
        headersUC40_11.put("sec-ch-ua-platform", "Linux");
        headersUC40_11.put("sec-fetch-dest", "empty");
        headersUC40_11.put("sec-fetch-mode", "cors");
        headersUC40_11.put("sec-fetch-site", "cross-site");
        headersUC40_11.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC40_11.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");

        Map<CharSequence, String> headersUC40_12 = new HashMap<>();
        headersUC40_12.put("accept", "*/*");
        headersUC40_12.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC40_12.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC40_12.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC40_12.put("sec-ch-ua-mobile", "?0");
        headersUC40_12.put("sec-ch-ua-platform", "Linux");
        headersUC40_12.put("sec-fetch-dest", "script");
        headersUC40_12.put("sec-fetch-mode", "no-cors");
        headersUC40_12.put("sec-fetch-site", "cross-site");
        headersUC40_12.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC40_12.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");

        Map<CharSequence, String> headersUC40_14 = new HashMap<>();
        headersUC40_14.put("accept", "*/*");
        headersUC40_14.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC40_14.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC40_14.put("content-type", "application/json+protobuf");
        headersUC40_14.put("origin", "https://www.youtube.com");
        headersUC40_14.put("priority", "u=1, i");
        headersUC40_14.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC40_14.put("sec-ch-ua-mobile", "?0");
        headersUC40_14.put("sec-ch-ua-platform", "Linux");
        headersUC40_14.put("sec-fetch-dest", "empty");
        headersUC40_14.put("sec-fetch-mode", "cors");
        headersUC40_14.put("sec-fetch-site", "cross-site");
        headersUC40_14.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC40_14.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
        headersUC40_14.put("x-goog-api-key", "AIzaSyDyT5W0Jh49F30Pqqtyfdf7pDLFKLJoAnw");
        headersUC40_14.put("x-user-agent", "grpc-web-javascript/0.1");

        Map<CharSequence, String> headersUC40_15 = new HashMap<>();
        headersUC40_15.put("accept", "*/*");
        headersUC40_15.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC40_15.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC40_15.put("authorization", "SAPISIDHASH 1d5b27c6a579a965f51cbd7d4693f8a3b7fc42cb");
        headersUC40_15.put("content-type", "application/x-www-form-urlencoded;charset=UTF-8");
        headersUC40_15.put("origin", "https://www.youtube.com");
        headersUC40_15.put("priority", "u=1, i");
        headersUC40_15.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC40_15.put("sec-ch-ua-mobile", "?0");
        headersUC40_15.put("sec-ch-ua-platform", "Linux");
        headersUC40_15.put("sec-fetch-dest", "empty");
        headersUC40_15.put("sec-fetch-mode", "cors");
        headersUC40_15.put("sec-fetch-site", "cross-site");
        headersUC40_15.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC40_15.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
        headersUC40_15.put("x-goog-authuser", "0");

        Map<CharSequence, String> headersUC40_66 = new HashMap<>();
        headersUC40_66.put("accept", "*/*");
        headersUC40_66.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC40_66.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC40_66.put("origin", "https://shtab.opmoscow.ru");
        headersUC40_66.put("priority", "u=1, i");
        headersUC40_66.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC40_66.put("sec-ch-ua-mobile", "?0");
        headersUC40_66.put("sec-ch-ua-platform", "Linux");
        headersUC40_66.put("sec-fetch-dest", "empty");
        headersUC40_66.put("sec-fetch-mode", "cors");
        headersUC40_66.put("sec-fetch-site", "cross-site");
        headersUC40_66.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC40_67 = new HashMap<>();
        headersUC40_67.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC40_67.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC40_67.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC40_67.put("priority", "u=0, i");
        headersUC40_67.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC40_67.put("sec-ch-ua-mobile", "?0");
        headersUC40_67.put("sec-ch-ua-platform", "Linux");
        headersUC40_67.put("sec-fetch-dest", "document");
        headersUC40_67.put("sec-fetch-mode", "navigate");
        headersUC40_67.put("sec-fetch-site", "same-origin");
        headersUC40_67.put("sec-fetch-user", "?1");
        headersUC40_67.put("upgrade-insecure-requests", "1");
        headersUC40_67.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC40_79 = new HashMap<>();
        headersUC40_79.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC40_79.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC40_79.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC40_79.put("priority", "u=0, i");
        headersUC40_79.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC40_79.put("sec-ch-ua-mobile", "?0");
        headersUC40_79.put("sec-ch-ua-platform", "Linux");
        headersUC40_79.put("sec-fetch-dest", "iframe");
        headersUC40_79.put("sec-fetch-mode", "navigate");
        headersUC40_79.put("sec-fetch-site", "cross-site");
        headersUC40_79.put("upgrade-insecure-requests", "1");
        headersUC40_79.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC40_79.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");

        Map<CharSequence, String> headersUC40_88 = new HashMap<>();
        headersUC40_88.put("Upgrade-Insecure-Requests", "1");
        headersUC40_88.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC40_88.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC40_88.put("sec-ch-ua-mobile", "?0");
        headersUC40_88.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC40_110 = new HashMap<>();
        headersUC40_110.put("accept", "*/*");
        headersUC40_110.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC40_110.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC40_110.put("authorization", "SAPISIDHASH 1724484024_b56251584bc3e2280bd883e351de69378093c633");
        headersUC40_110.put("content-type", "application/json");
        headersUC40_110.put("origin", "https://www.youtube.com");
        headersUC40_110.put("priority", "u=1, i");
        headersUC40_110.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC40_110.put("sec-ch-ua-mobile", "?0");
        headersUC40_110.put("sec-ch-ua-platform", "Linux");
        headersUC40_110.put("sec-fetch-dest", "empty");
        headersUC40_110.put("sec-fetch-mode", "cors");
        headersUC40_110.put("sec-fetch-site", "same-origin");
        headersUC40_110.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC40_110.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
        headersUC40_110.put("x-goog-authuser", "1");
        headersUC40_110.put("x-goog-event-time", "1724484024520");
        headersUC40_110.put("x-goog-request-time", "1724484024521");
        headersUC40_110.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSizk6a2BjIKCgJSVRIEGgAgVQ%3D%3D");
        headersUC40_110.put("x-origin", "https://www.youtube.com");
        headersUC40_110.put("x-youtube-ad-signals", "dt=1724484022053&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C1017%2C600&vis=1&wgl=true&ca_type=image&bid=ANyPxKqBl-n-sEYhQnPr4cS8QkxI5YbewRFY7NwRnNucNBARQ4QBtQL-_q902pDIPZsYCD3_hh3NPhaWOgQtId1lKt4spzyrzA");
        headersUC40_110.put("x-youtube-client-name", "56");
        headersUC40_110.put("x-youtube-client-version", "1.20240820.01.00");
        headersUC40_110.put("x-youtube-time-zone", "Asia/Tashkent");
        headersUC40_110.put("x-youtube-utc-offset", "300");

//        String uri01 = "https://jnn-pa.googleapis.com/$rpc/google.internal.waa.v1.Waa";
//
//        String uri03 = "https://googleads.g.doubleclick.net/pagead/id";
//
//        String uri04 = "https://www.google.com/js/th/JNHVvl2kSR9fjdF95zymQ6dEkKki6kBWa3TewZmiOS4.js";
//
//        String uri05 = "https://fonts.gstatic.com/s/roboto/v18";

//        String uri06 = "https://www.gstatic.com";
//
//        String uri07 = "https://i.ytimg.com";

//        String uri08 = "https://play.google.com/log";

//        String uri09 = "https://static.doubleclick.net/instream/ad_status.js";

        String UC40_uri10 = "https://mc.yandex.ru";

//        String uri11 = "https://yt3.ggpht.com/ytc/AIdro_mzDihl2M5HeRapUkSW3tlJi2s6Am-nkOGUOh2_A1mDcck=s68-c-k-c0x00ffffff-no-rj";

        String UC40_uri12 = "https://shtab.opmoscow.ru";

        ScenarioBuilder scnUC40 = scenario("Archive.MainPage2018Mer")
                .exec(
                        http("request_0")
                                .get("/s/player/a87a9450/player_ias.vflset/en_US/embed.js")
                                .headers(headersUC40_0)
                                .resources(
                                        http("request_1")
                                                .get("/s/player/a87a9450/www-embed-player.vflset/www-embed-player.js")
                                                .headers(headersUC40_0),
                                        http("request_2")
                                                .get("/s/player/a87a9450/player_ias.vflset/en_US/base.js")
                                                .headers(headersUC40_0),
                                        http("request_3")
                                                .get("/s/player/a87a9450/player_ias.vflset/en_US/remote.js")
                                                .headers(headersUC40_0),
                                        http("request_4")
                                                .get(uri04)
                                                .headers(headersUC40_0),
                                        http("request_5")
                                                .get(uri07 + "/vi_webp/21AT1HgApBk/maxresdefault.webp")
                                                .headers(headersUC40_0),
                                        http("request_6")
                                                .get(uri11)
                                                .headers(headersUC40_0),
                                        http("request_7")
                                                .get(uri05 + "/KFOmCnqEu92Fr1Mu5mxKOzY.woff2")
                                                .headers(headersUC40_7),
                                        http("request_8")
                                                .get(uri06 + "/cv/js/sender/v1/cast_sender.js")
                                                .headers(headersUC40_0),
                                        http("request_9")
                                                .get("/generate_204?WE44dA")
                                                .headers(headersUC40_9),
                                        http("request_10")
                                                .post("/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
                                                .headers(headersUC40_10)
                                                .body(RawFileBody("mainpage2018mer/0010_request.json")),
                                        http("request_11")
                                                .get(uri03)
                                                .headers(headersUC40_11),
                                        http("request_12")
                                                .get(uri09)
                                                .headers(headersUC40_12),
                                        http("request_13")
                                                .get(uri06 + "/eureka/clank/128/cast_sender.js")
                                                .headers(headersUC40_0),
                                        http("request_14")
                                                .post(uri01 + "/Create")
                                                .headers(headersUC40_14)
                                                .body(RawFileBody("mainpage2018mer/0014_request.dat")),
                                        http("request_15")
                                                .post(uri08 + "?format=json&hasfast=true&authuser=0")
                                                .headers(headersUC40_15)
                                                .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,null,[1,0,0,0,0]]],1828,[[\"1724484016313\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"aGIf\\\"]],[null,72.70000000018626]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"aGIf\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724484016314\"]", ""),
                                        http("request_16")
                                                .get(UC40_uri12 + "/build/5758.f38a32ed.css")
                                                .headers(headersUC40_0),
                                        http("request_17")
                                                .get(UC40_uri12 + "/build/6395.76430bbc.css")
                                                .headers(headersUC40_0),
                                        http("request_18")
                                                .get(UC40_uri12 + "/build/8886.31d6cfe0.css")
                                                .headers(headersUC40_0),
                                        http("request_19")
                                                .get(UC40_uri12 + "/build/shtadopm_css_head.dfe3f750.css")
                                                .headers(headersUC40_0),
                                        http("request_20")
                                                .get(UC40_uri12 + "/build/runtime.aaa04269.js")
                                                .headers(headersUC40_0),
                                        http("request_21")
                                                .get(UC40_uri12 + "/build/9755.89d0240d.js")
                                                .headers(headersUC40_0),
                                        http("request_22")
                                                .get(UC40_uri12 + "/build/shtadopm_app_head.a800bb8d.js")
                                                .headers(headersUC40_0),
                                        http("request_23")
                                                .get(UC40_uri12 + "/uploads/media/default/0001/17/b4bb9395f1924fb2c4b47fb0e516d838a8dc086b.png")
                                                .headers(headersUC40_0),
                                        http("request_24")
                                                .get(UC40_uri12 + "/build/images/shtadopm/menu-arrow.svg")
                                                .headers(headersUC40_0),
                                        http("request_25")
                                                .get(UC40_uri12 + "/cache/b/1/e/6/3/b1e6349294a6faab03d90c7cd7cede2209ca3380.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_26")
                                                .get(UC40_uri12 + "/cache/0/6/7/4/c/0674cb551940a2b3517fed859062de9f80a85eb4.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_27")
                                                .get(UC40_uri12 + "/cache/c/0/e/8/e/c0e8e6e74dc69b3706ccc519bd2e0cae360403a5.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_28")
                                                .get(UC40_uri12 + "/cache/4/f/c/7/3/4fc735b98fb78401dc1cbb07e5e70ff2ea027cf1.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_29")
                                                .get(UC40_uri12 + "/cache/a/a/3/3/1/aa331ba8755f7d011b952620065e69a56ec20e0c.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_30")
                                                .get(UC40_uri12 + "/cache/a/6/9/6/b/a696b7677997432e1e0c350f8c7d5f9549529fe2.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_31")
                                                .get(UC40_uri12 + "/cache/8/f/c/c/d/8fccda61015f10d9898e6fe5eb2cba0fbdbafccc.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_32")
                                                .get(UC40_uri12 + "/cache/6/f/0/c/6/6f0c640c9572d46b3ddb5c0610e26a1c2b4cb77d.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_33")
                                                .get(UC40_uri12 + "/cache/4/3/f/9/3/43f9386301785d1ab836ea0c37e5c38fa81ce765.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_34")
                                                .get(UC40_uri12 + "/cache/9/6/9/2/2/9692280782531aef8b8ba418c90ec4f0effc5be5.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_35")
                                                .get(UC40_uri12 + "/cache/5/b/f/3/b/5bf3baa05ab9f7d33599f3f3d42f1ea8ba9deb88.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_36")
                                                .get(UC40_uri12 + "/cache/7/c/5/4/8/7c5487d4bcfa29837ee76f41f3573e90fc36321c.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_37")
                                                .get(UC40_uri12 + "/cache/c/a/1/7/a/ca17a3d8815252f537d41a317ad81102a0081518.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_38")
                                                .get(UC40_uri12 + "/cache/0/4/a/d/7/04ad7ba00f7a80b08fa793e351e94f370c72e5d9.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_39")
                                                .get(UC40_uri12 + "/cache/f/5/0/3/d/f503d7b102f1ee1d9e694778aaae68ab85b2324a.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_40")
                                                .get(UC40_uri12 + "/cache/a/e/e/f/e/aeefec5a2aa80990aa28f356dc93c2768b356a07.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_41")
                                                .get(UC40_uri12 + "/cache/1/7/2/5/1/1725100e6a3f7292e0f7835462fc0d0a08b53462.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_42")
                                                .get(UC40_uri12 + "/cache/c/7/3/8/5/c7385bb8b930c02f3a75e3107cc8d875a8b91c27.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_43")
                                                .get(UC40_uri12 + "/cache/9/c/0/5/7/9c0579092da48f670e8f09bb2464a2adca4f016c.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_44")
                                                .get(UC40_uri12 + "/cache/c/5/9/0/4/c59041baa92f4935415e61382a354b9ecb07bf83.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_45")
                                                .get(UC40_uri12 + "/cache/c/7/a/3/6/c7a36b11e9fd210cdff720d448059d5df598bb87.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_46")
                                                .get(UC40_uri12 + "/cache/4/2/5/0/6/425067c3f4e28f05f1b944d87b93e7e2b65eb1ae.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_47")
                                                .get(UC40_uri12 + "/cache/7/8/f/0/c/78f0c431a34bf4e5e98f264bf9359ac396a448ae.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_48")
                                                .get(UC40_uri12 + "/cache/8/c/f/9/9/8cf993f7e150ebdfd19c7e26f11eb012d530689d.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_49")
                                                .get(UC40_uri12 + "/cache/9/2/2/6/b/9226bff5420be71ca305cb4ebd93d5fbd6b8909a.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_50")
                                                .get(UC40_uri12 + "/cache/2/4/3/e/2/243e253954e118d1e6e6371e4c5ef754ca265ec1.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_51")
                                                .get(UC40_uri12 + "/cache/b/1/9/9/9/b1999d41fe4cd17dbba5b652fe3d476b5162b4e5.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_52")
                                                .get(UC40_uri12 + "/cache/8/6/0/a/d/860ad484d9f5bb88f824c57a130aa5efe93896bb.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_53")
                                                .get(UC40_uri12 + "/cache/0/e/9/e/3/0e9e3a739aab97aaf354fd744daa9be680b54f6d.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_54")
                                                .get(UC40_uri12 + "/cache/4/4/1/f/d/441fda08275c6de8d8203e1bed195fe6fcd93dce.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_55")
                                                .get(UC40_uri12 + "/cache/e/7/6/5/e/e765ec02ee3aeab13e5105f360f9bfe9a1ea9300.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_56")
                                                .get(UC40_uri12 + "/cache/7/2/1/f/e/721fe0e34b916ae9f6a6f95dd6d472e47a33e541.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_57")
                                                .get(UC40_uri12 + "/cache/3/c/5/4/0/3c5408b78843e8e80f2b8a0cf96fe06a5c722485.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_58")
                                                .get(UC40_uri12 + "/build/images/opmoscow/loading.svg")
                                                .headers(headersUC40_0),
                                        http("request_59")
                                                .get(UC40_uri10 + "/metrika/tag.js")
                                                .headers(headersUC40_0),
                                        http("request_60")
                                                .get(UC40_uri12 + "/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
                                        http("request_61")
                                                .get(UC40_uri12 + "/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
                                        http("request_62")
                                                .get(UC40_uri12 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                        http("request_63")
                                                .get(UC40_uri12 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                        http("request_64")
                                                .get(UC40_uri12 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                        http("request_65")
                                                .get(UC40_uri12 + "/build/fonts/subset-Montserrat-SemiBoldItalic.89c710ac.woff2"),
                                        http("request_66")
                                                .get(UC40_uri10 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-mera-2018&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A834535538%3Az%3A300%3Ai%3A20240824122018%3Aet%3A1724484019%3Ac%3A1%3Arn%3A984234994%3Arqn%3A210%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C1288%2C%2C2%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724484017189%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724484019%3At%3A%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1%20%D0%BF%D0%BE%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B7%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D0%BC%D0%B8%20%D0%9C%D1%8D%D1%80%D0%B0%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D1%8B%20%D0%B2%202018%20%D0%B3%D0%BE%D0%B4%D1%83&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                                .headers(headersUC40_66),
                                        http("request_67")
                                                .get(UC40_uri12 + "/obshchestvennyy-shtab-po-vyboram-mera-2018")
                                                .headers(headersUC40_67),
                                        http("request_68")
                                                .get(UC40_uri12 + "/cache/0/4/4/7/7/04477960fdc8cde2b446420b88998e9542b6b56c.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_69")
                                                .get(UC40_uri12 + "/cache/6/c/f/b/5/6cfb5516545927d800cd05e651adccfd335565c6.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_70")
                                                .get(UC40_uri12 + "/cache/2/8/5/8/f/2858f3590f8324ec11e08f67bb1b7cb7cb1cd2d1.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_71")
                                                .get(UC40_uri12 + "/build/7255.871eb160.js")
                                                .headers(headersUC40_0),
                                        http("request_72")
                                                .get(UC40_uri12 + "/build/6889.3f713c69.js")
                                                .headers(headersUC40_0),
                                        http("request_73")
                                                .get(UC40_uri12 + "/build/7729.67d87565.js")
                                                .headers(headersUC40_0),
                                        http("request_74")
                                                .get(UC40_uri12 + "/build/8981.bc50772a.js")
                                                .headers(headersUC40_0),
                                        http("request_75")
                                                .get(UC40_uri12 + "/build/3734.2c5e1582.js")
                                                .headers(headersUC40_0),
                                        http("request_76")
                                                .get(UC40_uri12 + "/build/9154.f1370752.js")
                                                .headers(headersUC40_0),
                                        http("request_77")
                                                .get(UC40_uri12 + "/build/1676.2634f191.js")
                                                .headers(headersUC40_0),
                                        http("request_78")
                                                .get(UC40_uri12 + "/build/shtadopm_app_footer.9745ecad.js")
                                                .headers(headersUC40_0),
                                        http("request_79")
                                                .get("/embed/21AT1HgApBk")
                                                .headers(headersUC40_79),
                                        http("request_80")
                                                .get(uri07 + "/vi/adznB-7qAx0/hqdefault.jpg")
                                                .headers(headersUC40_0),
                                        http("request_81")
                                                .get(uri07 + "/vi/7DLtdWD8bUc/hqdefault.jpg")
                                                .headers(headersUC40_0),
                                        http("request_82")
                                                .get(uri07 + "/vi/4YOqYa-dOPI/hqdefault.jpg")
                                                .headers(headersUC40_0),
                                        http("request_83")
                                                .get(UC40_uri12 + "/cache/5/f/7/8/d/5f78d414dd5af19950318e79a22f5eb5bcce3a80.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_84")
                                                .get(UC40_uri12 + "/cache/5/a/1/1/3/5a113ac912dcc012e8ada2f6250d4641d83b5275.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_85")
                                                .get(UC40_uri12 + "/cache/6/f/d/9/3/6fd93f3e8f1fbb4e1a036159eba4e63340d23366.jpeg")
                                                .headers(headersUC40_0),
                                        http("request_86")
                                                .get(uri05 + "/KFOmCnqEu92Fr1Mu4mxK.woff2")
                                                .headers(headersUC40_7),
                                        http("request_87")
                                                .get("/s/player/a87a9450/www-player.css")
                                                .headers(headersUC40_0),
                                        http("request_88")
                                                .get(UC40_uri10 + "/metrika/metrika_match.html")
                                                .headers(headersUC40_88),
                                        http("request_89")
                                                .get("/s/player/a87a9450/player_ias.vflset/en_US/embed.js")
                                                .headers(headersUC40_0),
                                        http("request_90")
                                                .get("/s/player/a87a9450/www-embed-player.vflset/www-embed-player.js")
                                                .headers(headersUC40_0),
                                        http("request_91")
                                                .get("/s/player/a87a9450/player_ias.vflset/en_US/base.js")
                                                .headers(headersUC40_0),
                                        http("request_92")
                                                .get(uri05 + "/KFOlCnqEu92Fr1MmEU9fBBc4.woff2")
                                                .headers(headersUC40_7),
                                        http("request_93")
                                                .get(UC40_uri12 + "/build/images/shtadopm/favicon/site.webmanifest")
                                                .headers(headersUC40_0),
                                        http("request_94")
                                                .get(uri09)
                                                .headers(headersUC40_0),
                                        http("request_95")
                                                .get("/s/player/a87a9450/player_ias.vflset/en_US/remote.js")
                                                .headers(headersUC40_0),
                                        http("request_96")
                                                .get(uri04)
                                                .headers(headersUC40_0),
                                        http("request_97")
                                                .get(uri07 + "/vi_webp/21AT1HgApBk/maxresdefault.webp")
                                                .headers(headersUC40_0),
                                        http("request_98")
                                                .get(uri11)
                                                .headers(headersUC40_0),
                                        http("request_99")
                                                .get(uri05 + "/KFOmCnqEu92Fr1Mu5mxKOzY.woff2")
                                                .headers(headersUC40_7),
                                        http("request_100")
                                                .get(uri06 + "/cv/js/sender/v1/cast_sender.js")
                                                .headers(headersUC40_0),
                                        http("request_101")
                                                .get(uri03)
                                                .headers(headersUC40_11),
                                        http("request_102")
                                                .get(uri06 + "/eureka/clank/128/cast_sender.js")
                                                .headers(headersUC40_0),
                                        http("request_103")
                                                .get("/generate_204?6iVn9g")
                                                .headers(headersUC40_9),
                                        http("request_104")
                                                .post(uri08 + "?format=json&hasfast=true&authuser=0")
                                                .headers(headersUC40_15)
                                                .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,null,[1,0,0,0,0]]],1828,[[\"1724484022350\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"aGIf\\\"]],[null,83]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"aGIf\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724484022350\"]", ""),
                                        http("request_105")
                                                .get(UC40_uri12 + "/build/images/shtadopm/favicon/favicon.ico")
                                                .headers(headersUC40_0),
                                        http("request_106")
                                                .post(uri01 + "/Create")
                                                .headers(headersUC40_14)
                                                .body(RawFileBody("mainpage2018mer/0106_request.dat")),
                                        http("request_107")
                                                .post(uri08 + "?format=json&hasfast=true&authuser=0")
                                                .headers(headersUC40_15)
                                                .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,[[[\"Chromium\",\"128\"],[\"Not;A", "Brand\",\"24\"],[\"Google Chrome\",\"128\"]],0,\"Linux\",\"6.5.0\",\"x86\",\"\",\"128.0.6613.84\"],[1,0,0,0,0]]],1828,[[\"1724484023084\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[null,44.299999999813735]]]],[\\\"/client_streamz/bg/el\\\",null,[\\\"en\\\",\\\"bk\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.10000000055879354]],[[[\\\"q\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.30000000074505806]],[[[\\\"S\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.900000000372529]]]],[\\\"/client_streamz/bg/wrl\\\",null,[\\\"mn\\\",\\\"ac\\\",\\\"sc\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[null,1],[null,0],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,910.0999999996275]]]],[\\\"/client_streamz/bg/po/csc\\\",null,[\\\"cs\\\",\\\"rk\\\",\\\"mk\\\"],[[[[null,3],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724484023084\"]"),
                                        http("request_108")
                                                .post(uri08 + "?format=json&hasfast=true&authuser=0")
                                                .headers(headersUC40_15)
                                                .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,[[[\"Chromium\",\"128\"],[\"Not;A", "Brand\",\"24\"],[\"Google Chrome\",\"128\"]],0,\"Linux\",\"6.5.0\",\"x86\",\"\",\"128.0.6613.84\"],[1,0,0,0,0]]],1828,[[\"1724484023088\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fsc\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fsl\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[null,2.599999999627471]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,2]],\"1724484023088\"]"),
                                        http("request_109")
                                                .post(uri01 + "/GenerateIT")
                                                .headers(headersUC40_14)
                                                .body(RawFileBody("mainpage2018mer/0109_request.dat"))
                                )
                );
        HttpProtocolBuilder httpProtocol_MainPage2017 = http
                .baseUrl("https://www.youtube.com")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersUC41_0 = new HashMap<>();
        headersUC41_0.put("accept", "*/*");
        headersUC41_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC41_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC41_0.put("authorization", "SAPISIDHASH 1724484197_a02b56160a713046d9a3820f1f69c70018f5d60e");
        headersUC41_0.put("content-type", "application/json");
        headersUC41_0.put("origin", "https://www.youtube.com");
        headersUC41_0.put("priority", "u=1, i");
        headersUC41_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC41_0.put("sec-ch-ua-mobile", "?0");
        headersUC41_0.put("sec-ch-ua-platform", "Linux");
        headersUC41_0.put("sec-fetch-dest", "empty");
        headersUC41_0.put("sec-fetch-mode", "cors");
        headersUC41_0.put("sec-fetch-site", "same-origin");
        headersUC41_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC41_0.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
        headersUC41_0.put("x-goog-authuser", "1");
        headersUC41_0.put("x-goog-event-time", "1724484197324");
        headersUC41_0.put("x-goog-request-time", "1724484197324");
        headersUC41_0.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSj9k6a2BjIKCgJSVRIEGgAgVQ%3D%3D");
        headersUC41_0.put("x-origin", "https://www.youtube.com");
        headersUC41_0.put("x-youtube-ad-signals", "dt=1724484101211&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C370%2C230&vis=1&wgl=true&ca_type=image&bid=ANyPxKoEtvHyUSQH2Ey_SVMg1XpqTpgMfQznbKQB9ABTiTTbGFMAJgBNsP5Fp1Nw3wAhNPxtuNhY4pVbVXVhruePkG1Xa6NWuw");
        headersUC41_0.put("x-youtube-client-name", "56");
        headersUC41_0.put("x-youtube-client-version", "1.20240820.01.00");
        headersUC41_0.put("x-youtube-time-zone", "Asia/Tashkent");
        headersUC41_0.put("x-youtube-utc-offset", "300");

        Map<CharSequence, String> headersUC41_1 = new HashMap<>();
        headersUC41_1.put("accept", "*/*");
        headersUC41_1.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC41_1.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC41_1.put("authorization", "SAPISIDHASH 1724484197_a02b56160a713046d9a3820f1f69c70018f5d60e");
        headersUC41_1.put("content-type", "application/json");
        headersUC41_1.put("origin", "https://www.youtube.com");
        headersUC41_1.put("priority", "u=1, i");
        headersUC41_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC41_1.put("sec-ch-ua-mobile", "?0");
        headersUC41_1.put("sec-ch-ua-platform", "Linux");
        headersUC41_1.put("sec-fetch-dest", "empty");
        headersUC41_1.put("sec-fetch-mode", "cors");
        headersUC41_1.put("sec-fetch-site", "same-origin");
        headersUC41_1.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC41_1.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
        headersUC41_1.put("x-goog-authuser", "1");
        headersUC41_1.put("x-goog-event-time", "1724484197329");
        headersUC41_1.put("x-goog-request-time", "1724484197329");
        headersUC41_1.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSj9k6a2BjIKCgJSVRIEGgAgVQ%3D%3D");
        headersUC41_1.put("x-origin", "https://www.youtube.com");
        headersUC41_1.put("x-youtube-ad-signals", "dt=1724484098412&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C370%2C220&vis=1&wgl=true&ca_type=image&bid=ANyPxKoMy4ZZtHAg2pQqTbTwrE2PFQLB9mQz-aBomjWtfUyzmhozsMRLXe7MJFxjqw2H84l-3MHIydLhGB9wvhIu46CZBLBkJA");
        headersUC41_1.put("x-youtube-client-name", "56");
        headersUC41_1.put("x-youtube-client-version", "1.20240820.01.00");
        headersUC41_1.put("x-youtube-time-zone", "Asia/Tashkent");
        headersUC41_1.put("x-youtube-utc-offset", "300");

        Map<CharSequence, String> headersUC41_2 = new HashMap<>();
        headersUC41_2.put("accept", "*/*");
        headersUC41_2.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC41_2.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC41_2.put("authorization", "SAPISIDHASH 1724484197_a02b56160a713046d9a3820f1f69c70018f5d60e");
        headersUC41_2.put("content-type", "application/json");
        headersUC41_2.put("origin", "https://www.youtube.com");
        headersUC41_2.put("priority", "u=1, i");
        headersUC41_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC41_2.put("sec-ch-ua-mobile", "?0");
        headersUC41_2.put("sec-ch-ua-platform", "Linux");
        headersUC41_2.put("sec-fetch-dest", "empty");
        headersUC41_2.put("sec-fetch-mode", "cors");
        headersUC41_2.put("sec-fetch-site", "same-origin");
        headersUC41_2.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC41_2.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
        headersUC41_2.put("x-goog-authuser", "1");
        headersUC41_2.put("x-goog-event-time", "1724484197331");
        headersUC41_2.put("x-goog-request-time", "1724484197331");
        headersUC41_2.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSj9k6a2BjIKCgJSVRIEGgAgVQ%3D%3D");
        headersUC41_2.put("x-origin", "https://www.youtube.com");
        headersUC41_2.put("x-youtube-ad-signals", "dt=1724484101160&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C370%2C230&vis=1&wgl=true&ca_type=image&bid=ANyPxKrkTa42P47ONLCL-e0kaDX60KNg4y8hvabfMEzoT2EkridKZaSaXcLzb4R_9d9x-ekOOusjEP310D_maQ-Dm-26ohQPag");
        headersUC41_2.put("x-youtube-client-name", "56");
        headersUC41_2.put("x-youtube-client-version", "1.20240820.01.00");
        headersUC41_2.put("x-youtube-time-zone", "Asia/Tashkent");
        headersUC41_2.put("x-youtube-utc-offset", "300");

        Map<CharSequence, String> headersUC41_3 = new HashMap<>();
        headersUC41_3.put("accept", "*/*");
        headersUC41_3.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC41_3.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC41_3.put("content-type", "text/plain");
        headersUC41_3.put("origin", "https://shtab.opmoscow.ru");
        headersUC41_3.put("priority", "u=1, i");
        headersUC41_3.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC41_3.put("sec-ch-ua-mobile", "?0");
        headersUC41_3.put("sec-ch-ua-platform", "Linux");
        headersUC41_3.put("sec-fetch-dest", "empty");
        headersUC41_3.put("sec-fetch-mode", "cors");
        headersUC41_3.put("sec-fetch-site", "cross-site");
        headersUC41_3.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC41_4 = new HashMap<>();
        headersUC41_4.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC41_4.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC41_4.put("sec-ch-ua-mobile", "?0");
        headersUC41_4.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC41_70 = new HashMap<>();
        headersUC41_70.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC41_70.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC41_70.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC41_70.put("priority", "u=0, i");
        headersUC41_70.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC41_70.put("sec-ch-ua-mobile", "?0");
        headersUC41_70.put("sec-ch-ua-platform", "Linux");
        headersUC41_70.put("sec-fetch-dest", "document");
        headersUC41_70.put("sec-fetch-mode", "navigate");
        headersUC41_70.put("sec-fetch-site", "same-origin");
        headersUC41_70.put("sec-fetch-user", "?1");
        headersUC41_70.put("upgrade-insecure-requests", "1");
        headersUC41_70.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC41_72 = new HashMap<>();
        headersUC41_72.put("Origin", "https://www.youtube.com");
        headersUC41_72.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC41_72.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC41_72.put("sec-ch-ua-mobile", "?0");
        headersUC41_72.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC41_89 = new HashMap<>();
        headersUC41_89.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
        headersUC41_89.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC41_89.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC41_89.put("priority", "i");
        headersUC41_89.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC41_89.put("sec-ch-ua-mobile", "?0");
        headersUC41_89.put("sec-ch-ua-platform", "Linux");
        headersUC41_89.put("sec-fetch-dest", "image");
        headersUC41_89.put("sec-fetch-mode", "no-cors");
        headersUC41_89.put("sec-fetch-site", "same-origin");
        headersUC41_89.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC41_100 = new HashMap<>();
        headersUC41_100.put("Upgrade-Insecure-Requests", "1");
        headersUC41_100.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC41_100.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC41_100.put("sec-ch-ua-mobile", "?0");
        headersUC41_100.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC41_102 = new HashMap<>();
        headersUC41_102.put("accept", "*/*");
        headersUC41_102.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC41_102.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC41_102.put("origin", "https://shtab.opmoscow.ru");
        headersUC41_102.put("priority", "u=1, i");
        headersUC41_102.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC41_102.put("sec-ch-ua-mobile", "?0");
        headersUC41_102.put("sec-ch-ua-platform", "Linux");
        headersUC41_102.put("sec-fetch-dest", "empty");
        headersUC41_102.put("sec-fetch-mode", "cors");
        headersUC41_102.put("sec-fetch-site", "cross-site");
        headersUC41_102.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC41_114 = new HashMap<>();
        headersUC41_114.put("accept", "*/*");
        headersUC41_114.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC41_114.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC41_114.put("origin", "https://www.youtube.com");
        headersUC41_114.put("priority", "u=1, i");
        headersUC41_114.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC41_114.put("sec-ch-ua-mobile", "?0");
        headersUC41_114.put("sec-ch-ua-platform", "Linux");
        headersUC41_114.put("sec-fetch-dest", "empty");
        headersUC41_114.put("sec-fetch-mode", "cors");
        headersUC41_114.put("sec-fetch-site", "cross-site");
        headersUC41_114.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC41_114.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");

        Map<CharSequence, String> headersUC41_115 = new HashMap<>();
        headersUC41_115.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC41_115.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC41_115.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC41_115.put("priority", "u=0, i");
        headersUC41_115.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC41_115.put("sec-ch-ua-mobile", "?0");
        headersUC41_115.put("sec-ch-ua-platform", "Linux");
        headersUC41_115.put("sec-fetch-dest", "iframe");
        headersUC41_115.put("sec-fetch-mode", "navigate");
        headersUC41_115.put("sec-fetch-site", "cross-site");
        headersUC41_115.put("upgrade-insecure-requests", "1");
        headersUC41_115.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC41_115.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");

        Map<CharSequence, String> headersUC41_123 = new HashMap<>();
        headersUC41_123.put("accept", "*/*");
        headersUC41_123.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC41_123.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC41_123.put("content-type", "application/json+protobuf");
        headersUC41_123.put("origin", "https://www.youtube.com");
        headersUC41_123.put("priority", "u=1, i");
        headersUC41_123.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC41_123.put("sec-ch-ua-mobile", "?0");
        headersUC41_123.put("sec-ch-ua-platform", "Linux");
        headersUC41_123.put("sec-fetch-dest", "empty");
        headersUC41_123.put("sec-fetch-mode", "cors");
        headersUC41_123.put("sec-fetch-site", "cross-site");
        headersUC41_123.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC41_123.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
        headersUC41_123.put("x-goog-api-key", "AIzaSyDyT5W0Jh49F30Pqqtyfdf7pDLFKLJoAnw");
        headersUC41_123.put("x-user-agent", "grpc-web-javascript/0.1");

        Map<CharSequence, String> headersUC41_124 = new HashMap<>();
        headersUC41_124.put("accept", "*/*");
        headersUC41_124.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC41_124.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC41_124.put("authorization", "SAPISIDHASH 1d5b27c6a579a965f51cbd7d4693f8a3b7fc42cb");
        headersUC41_124.put("content-type", "application/x-www-form-urlencoded;charset=UTF-8");
        headersUC41_124.put("origin", "https://www.youtube.com");
        headersUC41_124.put("priority", "u=1, i");
        headersUC41_124.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC41_124.put("sec-ch-ua-mobile", "?0");
        headersUC41_124.put("sec-ch-ua-platform", "Linux");
        headersUC41_124.put("sec-fetch-dest", "empty");
        headersUC41_124.put("sec-fetch-mode", "cors");
        headersUC41_124.put("sec-fetch-site", "cross-site");
        headersUC41_124.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC41_124.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
        headersUC41_124.put("x-goog-authuser", "0");

        Map<CharSequence, String> headersUC41_150 = new HashMap<>();
        headersUC41_150.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
        headersUC41_150.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC41_150.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC41_150.put("priority", "i");
        headersUC41_150.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC41_150.put("sec-ch-ua-mobile", "?0");
        headersUC41_150.put("sec-ch-ua-platform", "Linux");
        headersUC41_150.put("sec-fetch-dest", "image");
        headersUC41_150.put("sec-fetch-mode", "no-cors");
        headersUC41_150.put("sec-fetch-site", "same-origin");
        headersUC41_150.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC41_150.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");

        Map<CharSequence, String> headersUC41_170 = new HashMap<>();
        headersUC41_170.put("accept", "*/*");
        headersUC41_170.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC41_170.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC41_170.put("authorization", "SAPISIDHASH 1724484209_d7722aa2b4750b2f1195725aef4dea8f8294c442");
        headersUC41_170.put("content-type", "application/json");
        headersUC41_170.put("origin", "https://www.youtube.com");
        headersUC41_170.put("priority", "u=1, i");
        headersUC41_170.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC41_170.put("sec-ch-ua-mobile", "?0");
        headersUC41_170.put("sec-ch-ua-platform", "Linux");
        headersUC41_170.put("sec-fetch-dest", "empty");
        headersUC41_170.put("sec-fetch-mode", "cors");
        headersUC41_170.put("sec-fetch-site", "same-origin");
        headersUC41_170.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC41_170.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
        headersUC41_170.put("x-goog-authuser", "1");
        headersUC41_170.put("x-goog-event-time", "1724484209524");
        headersUC41_170.put("x-goog-request-time", "1724484209524");
        headersUC41_170.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSjolKa2BjIKCgJSVRIEGgAgVQ%3D%3D");
        headersUC41_170.put("x-origin", "https://www.youtube.com");
        headersUC41_170.put("x-youtube-ad-signals", "dt=1724484206591&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C370%2C230&vis=1&wgl=true&ca_type=image&bid=ANyPxKqUV6ROjJJ2I952DAejwbgOz_iNiTNPpVCye95aELDHG52XKInr42h3RgHlvImdAEvDzPwSpLppXF_FnJiv17PJJVXVmw");
        headersUC41_170.put("x-youtube-client-name", "56");
        headersUC41_170.put("x-youtube-client-version", "1.20240820.01.00");
        headersUC41_170.put("x-youtube-time-zone", "Asia/Tashkent");
        headersUC41_170.put("x-youtube-utc-offset", "300");

        Map<CharSequence, String> headersUC41_171 = new HashMap<>();
        headersUC41_171.put("accept", "*/*");
        headersUC41_171.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC41_171.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC41_171.put("authorization", "SAPISIDHASH 1724484210_e9b8cd15b6e289409ff51ddccf17ddac6202a39d");
        headersUC41_171.put("content-type", "application/json");
        headersUC41_171.put("origin", "https://www.youtube.com");
        headersUC41_171.put("priority", "u=1, i");
        headersUC41_171.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC41_171.put("sec-ch-ua-mobile", "?0");
        headersUC41_171.put("sec-ch-ua-platform", "Linux");
        headersUC41_171.put("sec-fetch-dest", "empty");
        headersUC41_171.put("sec-fetch-mode", "cors");
        headersUC41_171.put("sec-fetch-site", "same-origin");
        headersUC41_171.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC41_171.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
        headersUC41_171.put("x-goog-authuser", "1");
        headersUC41_171.put("x-goog-event-time", "1724484210521");
        headersUC41_171.put("x-goog-request-time", "1724484210522");
        headersUC41_171.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSjolKa2BjIKCgJSVRIEGgAgVQ%3D%3D");
        headersUC41_171.put("x-origin", "https://www.youtube.com");
        headersUC41_171.put("x-youtube-ad-signals", "dt=1724484207872&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C370%2C230&vis=1&wgl=true&ca_type=image&bid=ANyPxKprT68nKQbhT1tguclCe0JH_0ZExp2KsY4IHd1Wh4XhrtDP-uVCeo1gzA5opbXSeIv8zskkeVnOXJLA6uOiB0uH6UAOeQ");
        headersUC41_171.put("x-youtube-client-name", "56");
        headersUC41_171.put("x-youtube-client-version", "1.20240820.01.00");
        headersUC41_171.put("x-youtube-time-zone", "Asia/Tashkent");
        headersUC41_171.put("x-youtube-utc-offset", "300");

        Map<CharSequence, String> headersUC41_172 = new HashMap<>();
        headersUC41_172.put("accept", "*/*");
        headersUC41_172.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC41_172.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC41_172.put("authorization", "SAPISIDHASH 1724484211_f4de6ef71d754836e41a65a5a71a05cee0e5176f");
        headersUC41_172.put("content-type", "application/json");
        headersUC41_172.put("origin", "https://www.youtube.com");
        headersUC41_172.put("priority", "u=1, i");
        headersUC41_172.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC41_172.put("sec-ch-ua-mobile", "?0");
        headersUC41_172.put("sec-ch-ua-platform", "Linux");
        headersUC41_172.put("sec-fetch-dest", "empty");
        headersUC41_172.put("sec-fetch-mode", "cors");
        headersUC41_172.put("sec-fetch-site", "same-origin");
        headersUC41_172.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC41_172.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
        headersUC41_172.put("x-goog-authuser", "1");
        headersUC41_172.put("x-goog-event-time", "1724484211523");
        headersUC41_172.put("x-goog-request-time", "1724484211524");
        headersUC41_172.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSjolKa2BjIKCgJSVRIEGgAgVQ%3D%3D");
        headersUC41_172.put("x-origin", "https://www.youtube.com");
        headersUC41_172.put("x-youtube-ad-signals", "dt=1724484208855&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C370%2C220&vis=1&wgl=true&ca_type=image&bid=ANyPxKpqUreNLtqTLMI5tRP8e8LvUcep1jc68InGJxBqisIb6krAAiXiG-uN0XAfUzhVS6o9O5ZBXeiZz58_Hlue2IFikJ1N8g");
        headersUC41_172.put("x-youtube-client-name", "56");
        headersUC41_172.put("x-youtube-client-version", "1.20240820.01.00");
        headersUC41_172.put("x-youtube-time-zone", "Asia/Tashkent");
        headersUC41_172.put("x-youtube-utc-offset", "300");

        Map<CharSequence, String> headersUC41_173 = new HashMap<>();
        headersUC41_173.put("accept", "*/*");
        headersUC41_173.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC41_173.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC41_173.put("origin", "https://shtab.opmoscow.ru");
        headersUC41_173.put("priority", "u=4, i");
        headersUC41_173.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC41_173.put("sec-ch-ua-mobile", "?0");
        headersUC41_173.put("sec-ch-ua-platform", "Linux");
        headersUC41_173.put("sec-fetch-dest", "empty");
        headersUC41_173.put("sec-fetch-mode", "no-cors");
        headersUC41_173.put("sec-fetch-site", "cross-site");
        headersUC41_173.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
//
//        String uri01 = "https://jnn-pa.googleapis.com/$rpc/google.internal.waa.v1.Waa";
//
//        String uri03 = "https://googleads.g.doubleclick.net/pagead/id";
//
//        String uri04 = "https://www.google.com/js/th/JNHVvl2kSR9fjdF95zymQ6dEkKki6kBWa3TewZmiOS4.js";
//
//        String uri05 = "https://fonts.gstatic.com/s/roboto/v18";
//
//        String uri06 = "https://www.gstatic.com";

//        String uri07 = "https://i.ytimg.com";
//
//        String uri08 = "https://play.google.com/log";
//
//        String uri09 = "https://static.doubleclick.net/instream/ad_status.js";

        String UC41_uri10 = "https://mc.yandex.ru";

//        String uri11 = "https://yt3.ggpht.com/ytc/AIdro_mktnPA9QixCMMgHNNhLp7f-hVaD1rhcMEb01OjEmg=s68-c-k-c0x00ffffff-no-rj";

        String UC41_uri12 = "https://shtab.opmoscow.ru";

        ScenarioBuilder scnUC41 = scenario("Archive.MainPage2017")
                .exec(
                        http("request_0")
                                .post("/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
                                .headers(headersUC41_0)
//                                .body(RawFileBody("mainpage2017/0000_request.json"))
                                .resources(
                                        http("request_1")
                                                .post("/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
                                                .headers(headersUC41_1)
                                                .body(RawFileBody("mainpage2017/0001_request.json")),
                                        http("request_2")
                                                .post("/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
                                                .headers(headersUC41_2)
                                                .body(RawFileBody("mainpage2017/0002_request.json")),
                                        http("request_3")
                                                .post(UC41_uri10 + "/webvisor/89667203?wv-part=3&wv-type=7&wmode=0&wv-hit=958389606&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2017&rn=828124826&browser-info=we%3A1%3Aet%3A1724484196%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824122315%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724484196&t=gdpr(14)ti(1)")
                                                .headers(headersUC41_3),
//                                                .body(RawFileBody("mainpage2017/0003_request.gif")),
                                        http("request_4")
                                                .get(UC41_uri12 + "/build/5758.f38a32ed.css")
                                                .headers(headersUC41_4),
                                        http("request_5")
                                                .get(UC41_uri12 + "/build/6395.76430bbc.css")
                                                .headers(headersUC41_4),
                                        http("request_6")
                                                .get(UC41_uri12 + "/build/8886.31d6cfe0.css")
                                                .headers(headersUC41_4),
                                        http("request_7")
                                                .get(UC41_uri12 + "/build/shtadopm_css_head.dfe3f750.css")
                                                .headers(headersUC41_4),
                                        http("request_8")
                                                .get(UC41_uri12 + "/build/runtime.aaa04269.js")
                                                .headers(headersUC41_4),
                                        http("request_9")
                                                .get(UC41_uri12 + "/build/9755.89d0240d.js")
                                                .headers(headersUC41_4),
                                        http("request_10")
                                                .get(UC41_uri12 + "/build/shtadopm_app_head.a800bb8d.js")
                                                .headers(headersUC41_4),
                                        http("request_11")
                                                .get(UC41_uri12 + "/uploads/media/default/0001/17/58c05bb485337c784f3cc6cac17428e948213050.png")
                                                .headers(headersUC41_4),
                                        http("request_12")
                                                .get(UC41_uri12 + "/build/images/shtadopm/menu-arrow.svg")
                                                .headers(headersUC41_4),
                                        http("request_13")
                                                .get(UC41_uri12 + "/cache/b/1/9/9/9/b1999d41fe4cd17dbba5b652fe3d476b5162b4e5.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_14")
                                                .get(UC41_uri12 + "/cache/0/6/7/4/c/0674cb551940a2b3517fed859062de9f80a85eb4.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_15")
                                                .get(UC41_uri12 + "/cache/1/0/f/7/4/10f74876981740667fe60f2413c7e098cac25fb7.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_16")
                                                .get(UC41_uri12 + "/cache/9/c/0/5/7/9c0579092da48f670e8f09bb2464a2adca4f016c.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_17")
                                                .get(UC41_uri12 + "/cache/6/b/c/6/5/6bc65df092650e751f4df776d31593b6b1a06379.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_18")
                                                .get(UC41_uri12 + "/cache/e/a/0/d/f/ea0dff986d38d4fde789c16e7ccc9f5d784f570f.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_19")
                                                .get(UC41_uri12 + "/cache/c/0/b/4/2/c0b42ed564857d29771776adfe9f5004c366890f.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_20")
                                                .get(UC41_uri12 + "/cache/7/8/f/0/c/78f0c431a34bf4e5e98f264bf9359ac396a448ae.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_21")
                                                .get(UC41_uri12 + "/cache/6/4/f/8/7/64f873aeec3fe8f808a39164cd36029c2e8cbd11.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_22")
                                                .get(UC41_uri12 + "/cache/3/8/b/b/2/38bb2de8f5b15ce44eb2b67abd07a8d8320b8a4c.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_23")
                                                .get(UC41_uri12 + "/cache/4/9/f/d/5/49fd588d87ca2f2994daaac19972f96b3cddd67f.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_24")
                                                .get(UC41_uri12 + "/cache/c/1/1/2/4/c11246b14a31b8b15c8b90ab8aa40c655a1f0120.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_25")
                                                .get(UC41_uri12 + "/cache/1/c/0/5/6/1c056c291a0ab490787ab146c21287346281f94e.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_26")
                                                .get(UC41_uri12 + "/cache/9/6/9/2/2/9692280782531aef8b8ba418c90ec4f0effc5be5.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_27")
                                                .get(UC41_uri12 + "/cache/b/1/e/6/3/b1e6349294a6faab03d90c7cd7cede2209ca3380.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_28")
                                                .get(UC41_uri12 + "/cache/a/6/9/6/b/a696b7677997432e1e0c350f8c7d5f9549529fe2.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_29")
                                                .get(UC41_uri12 + "/cache/b/5/0/3/7/b5037ea095062afd1bc7c5faf6da034ce984ccdb.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_30")
                                                .get(UC41_uri12 + "/cache/a/a/3/3/1/aa331ba8755f7d011b952620065e69a56ec20e0c.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_31")
                                                .get(UC41_uri12 + "/cache/a/b/f/3/5/abf353b22fb0332ceb5341bbaa7227e7c878b322.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_32")
                                                .get(UC41_uri12 + "/cache/a/e/e/f/e/aeefec5a2aa80990aa28f356dc93c2768b356a07.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_33")
                                                .get(UC41_uri12 + "/cache/3/0/1/b/f/301bfbb39d892f988da0750604e4dd499619c1c8.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_34")
                                                .get(UC41_uri12 + "/cache/c/7/3/8/5/c7385bb8b930c02f3a75e3107cc8d875a8b91c27.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_35")
                                                .get(UC41_uri12 + "/cache/6/f/0/c/6/6f0c640c9572d46b3ddb5c0610e26a1c2b4cb77d.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_36")
                                                .get(UC41_uri12 + "/cache/0/c/5/2/2/0c52299a070cd5fab2900506283a573d0dae70a6.png")
                                                .headers(headersUC41_4),
                                        http("request_37")
                                                .get(UC41_uri12 + "/cache/5/b/f/3/b/5bf3baa05ab9f7d33599f3f3d42f1ea8ba9deb88.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_38")
                                                .get(UC41_uri12 + "/cache/7/c/5/4/8/7c5487d4bcfa29837ee76f41f3573e90fc36321c.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_39")
                                                .get(UC41_uri12 + "/cache/b/e/f/4/e/bef4e5a4f9f141432439b79a592c702c9089c3f1.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_40")
                                                .get(UC41_uri12 + "/cache/9/7/7/8/b/9778b29cde67066d2e62211b378e6bb797b3040a.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_41")
                                                .get(UC41_uri12 + "/cache/f/b/6/c/3/fb6c37537dc66818fbbb5c705f7f4aaf2cdba3b7.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_42")
                                                .get(UC41_uri12 + "/cache/c/3/a/0/d/c3a0d5f69c55eeee80cae83bf86d6555ae928aaa.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_43")
                                                .get(UC41_uri12 + "/cache/8/7/b/d/9/87bd9b31f80769cb48c7464bfbb84044913e68be.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_44")
                                                .get(UC41_uri12 + "/cache/e/f/7/b/0/ef7b04dd45af93e32e85e1702ac91319d71d30d8.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_45")
                                                .get(UC41_uri12 + "/cache/0/4/7/d/9/047d974f2f6138b0ec36f9c7bbc9a7dd931e79fb.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_46")
                                                .get(UC41_uri12 + "/cache/4/f/c/7/3/4fc735b98fb78401dc1cbb07e5e70ff2ea027cf1.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_47")
                                                .get(UC41_uri12 + "/cache/c/1/e/d/b/c1edbf7c533474477f7bdb0404e7189ddf7863f4.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_48")
                                                .get(UC41_uri12 + "/cache/1/7/0/f/8/170f8dc8d8dd475268b102c275842ac0633828f5.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_49")
                                                .get(UC41_uri12 + "/cache/2/d/a/9/c/2da9c27ba9e010d49523ad885b8952974e6e459c.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_50")
                                                .get(UC41_uri12 + "/cache/0/f/9/5/1/0f951f83e542f5eae9a7351dba0fdb2cdce46bfd.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_51")
                                                .get(UC41_uri12 + "/build/images/opmoscow/loading.svg")
                                                .headers(headersUC41_4),
                                        http("request_52")
                                                .get(UC41_uri12 + "/cache/a/3/0/8/c/a308c3fa596749a380b134a0073537cfe7d28956.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_53")
                                                .get(UC41_uri10 + "/metrika/tag.js")
                                                .headers(headersUC41_4),
                                        http("request_54")
                                                .get(UC41_uri12 + "/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
                                        http("request_55")
                                                .get(UC41_uri12 + "/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
                                        http("request_56")
                                                .get(UC41_uri12 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                        http("request_57")
                                                .get(UC41_uri12 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                        http("request_58")
                                                .get(UC41_uri12 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                        http("request_59")
                                                .get(UC41_uri12 + "/uploads/media/default/0001/14/21a0648e5571656f7ed6e535085406fd062ad43e.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_60")
                                                .get(UC41_uri12 + "/uploads/media/default/0001/14/12cce32e0c81de5b61a9be20e18be65a39c5319f.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_61")
                                                .get(UC41_uri12 + "/uploads/media/default/0001/14/13b9c97ed6df8c329a58f7dba34c6d55d1657f21.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_62")
                                                .get(UC41_uri12 + "/uploads/media/default/0001/14/3a67ff645b14b2520c5c6cbb52a2c39feb582ab1.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_63")
                                                .get(UC41_uri12 + "/uploads/media/default/0001/14/38f5de17a7547e36480e4c7ecac2a890923cd164.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_64")
                                                .get(UC41_uri12 + "/uploads/media/default/0001/14/a79023d36337aaf23a2daaf7aed618b750183a57.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_65")
                                                .get(UC41_uri12 + "/uploads/media/default/0001/14/8410850754971c6f40ca52d62fbb7c81462ef02a.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_66")
                                                .get(UC41_uri12 + "/uploads/media/default/0001/14/a4b610d71b701917f7df9a27eac5d47003008951.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_67")
                                                .get(UC41_uri12 + "/uploads/media/default/0001/14/afc1488d6483d302d3022d24a3040f4c301b941c.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_68")
                                                .get(UC41_uri12 + "/uploads/media/default/0001/14/eaecacc2e3514469430bce8a5df2315ce58c04fb.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_69")
                                                .get(UC41_uri12 + "/uploads/media/default/0001/14/85da895e062e1fa2d56deb19ff4479b1a24f44de.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_70")
                                                .get(UC41_uri12 + "/obshchestvennyy-shtab-po-vyboram-2017")
                                                .headers(headersUC41_70),
                                        http("request_71")
                                                .get("/s/player/a87a9450/www-player.css")
                                                .headers(headersUC41_4),
                                        http("request_72")
                                                .get(uri05 + "/KFOmCnqEu92Fr1Mu5mxKOzY.woff2")
                                                .headers(headersUC41_72),
                                        http("request_73")
                                                .get(uri05 + "/KFOmCnqEu92Fr1Mu4mxK.woff2")
                                                .headers(headersUC41_72),
                                        http("request_74")
                                                .get(uri05 + "/KFOlCnqEu92Fr1MmEU9fBBc4.woff2")
                                                .headers(headersUC41_72),
                                        http("request_75")
                                                .get(UC41_uri12 + "/cache/e/3/6/9/b/e369b498b60e0754cd536681ebf3938471f78592.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_76")
                                                .get(UC41_uri12 + "/cache/2/2/3/8/3/223835c7242fa6462739b1306045c617fa66ea93.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_77")
                                                .get(UC41_uri12 + "/cache/1/9/0/a/a/190aa09ba5213dd2154126951a9b50154ecac036.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_78")
                                                .get(UC41_uri12 + "/build/7255.871eb160.js")
                                                .headers(headersUC41_4),
                                        http("request_79")
                                                .get(UC41_uri12 + "/build/6889.3f713c69.js")
                                                .headers(headersUC41_4),
                                        http("request_80")
                                                .get(UC41_uri12 + "/build/7729.67d87565.js")
                                                .headers(headersUC41_4),
                                        http("request_81")
                                                .get(UC41_uri12 + "/build/8981.bc50772a.js")
                                                .headers(headersUC41_4),
                                        http("request_82")
                                                .get(UC41_uri12 + "/build/3734.2c5e1582.js")
                                                .headers(headersUC41_4),
                                        http("request_83")
                                                .get(UC41_uri12 + "/build/9154.f1370752.js")
                                                .headers(headersUC41_4),
                                        http("request_84")
                                                .get(UC41_uri12 + "/build/1676.2634f191.js")
                                                .headers(headersUC41_4),
                                        http("request_85")
                                                .get(UC41_uri12 + "/build/shtadopm_app_footer.9745ecad.js")
                                                .headers(headersUC41_4),
                                        http("request_86")
                                                .get(UC41_uri12 + "/cache/b/6/0/c/5/b60c5db16ff89da5e31b0ab4881264fae089c101.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_87")
                                                .get(UC41_uri12 + "/cache/3/a/5/9/d/3a59da649d92efc49cd8b6b6e8c2d0be6c711095.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_88")
                                                .get(UC41_uri12 + "/cache/b/c/a/d/b/bcadbd1620342ccff834407886a34248ca57c756.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_89")
                                                .get(UC41_uri12 + "/cache/e/d/8/c/3/ed8c32c3902c9bfc46659f76a5cb7bd2f4052fd8.jpeg")
                                                .headers(headersUC41_89),
                                        http("request_90")
                                                .get(uri07 + "/vi/xEW8LUxNzhA/hqdefault.jpg")
                                                .headers(headersUC41_4),
                                        http("request_91")
                                                .get(uri07 + "/vi/zU2JDBTKEKQ/hqdefault.jpg")
                                                .headers(headersUC41_4),
                                        http("request_92")
                                                .get(uri07 + "/vi/ZEusk9cwc9M/hqdefault.jpg")
                                                .headers(headersUC41_4),
                                        http("request_93")
                                                .get(UC41_uri12 + "/build/images/mCSB_buttons.5b35a39c.png"),
                                        http("request_94")
                                                .get(uri07 + "/vi/xEW8LUxNzhA/hqdefault.jpg")
                                                .headers(headersUC41_4),
                                        http("request_95")
                                                .get(uri07 + "/vi/zU2JDBTKEKQ/hqdefault.jpg")
                                                .headers(headersUC41_4),
                                        http("request_96")
                                                .get(UC41_uri12 + "/cache/b/6/0/c/5/b60c5db16ff89da5e31b0ab4881264fae089c101.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_97")
                                                .get(UC41_uri12 + "/cache/3/a/5/9/d/3a59da649d92efc49cd8b6b6e8c2d0be6c711095.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_98")
                                                .get(UC41_uri12 + "/cache/b/c/a/d/b/bcadbd1620342ccff834407886a34248ca57c756.jpeg")
                                                .headers(headersUC41_4),
                                        http("request_99")
                                                .get(uri07 + "/vi/ZEusk9cwc9M/hqdefault.jpg")
                                                .headers(headersUC41_4),
                                        http("request_100")
                                                .get(UC41_uri10 + "/metrika/metrika_match.html")
                                                .headers(headersUC41_100),
                                        http("request_101")
                                                .get(UC41_uri12 + "/build/images/shtadopm/favicon/site.webmanifest")
                                                .headers(headersUC41_4),
                                        http("request_102")
                                                .get(UC41_uri10 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2017&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A596516084%3Az%3A300%3Ai%3A20240824122319%3Aet%3A1724484199%3Ac%3A1%3Arn%3A849751862%3Arqn%3A215%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C1024%2C831%2C%2C11%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724484197323%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724484199%3At%3A%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1%20%D0%BF%D0%BE%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B7%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D0%BC%D0%B8%20%D0%BC%D1%83%D0%BD%D0%B8%D1%86%D0%B8%D0%BF%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D1%85%20%D0%B4%D0%B5%D0%BF%D1%83%D1%82%D0%B0%D1%82%D0%BE%D0%B2%202017&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                                .headers(headersUC41_102)
                                )
                )
                .pause(4)
                .exec(
                        http("request_103")
                                .get("/s/player/a87a9450/www-player.css")
                                .headers(headersUC41_4)
                                .resources(
                                        http("request_104")
                                                .get(uri05 + "/KFOmCnqEu92Fr1Mu5mxKOzY.woff2")
                                                .headers(headersUC41_72),
                                        http("request_105")
                                                .get(uri05 + "/KFOmCnqEu92Fr1Mu4mxK.woff2")
                                                .headers(headersUC41_72),
                                        http("request_106")
                                                .get(uri05 + "/KFOlCnqEu92Fr1MmEU9fBBc4.woff2")
                                                .headers(headersUC41_72)
                                )
                )
                .pause(1)
                .exec(
                        http("request_107")
                                .get("/s/player/a87a9450/player_ias.vflset/en_US/embed.js")
                                .headers(headersUC41_4)
                                .resources(
                                        http("request_108")
                                                .get("/s/player/a87a9450/www-embed-player.vflset/www-embed-player.js")
                                                .headers(headersUC41_4),
                                        http("request_109")
                                                .get("/s/player/a87a9450/player_ias.vflset/en_US/base.js")
                                                .headers(headersUC41_4),
                                        http("request_110")
                                                .get(uri09)
                                                .headers(headersUC41_4),
                                        http("request_111")
                                                .get("/s/player/a87a9450/player_ias.vflset/en_US/remote.js")
                                                .headers(headersUC41_4),
                                        http("request_112")
                                                .get(uri04)
                                                .headers(headersUC41_4),
                                        http("request_113")
                                                .get(uri07 + "/vi_webp/L48ky9hkFcc/hqdefault.webp")
                                                .headers(headersUC41_4),
                                        http("request_114")
                                                .get(uri03)
                                                .headers(headersUC41_114),
                                        http("request_115")
                                                .get("/embed/L48ky9hkFcc")
                                                .headers(headersUC41_115),
                                        http("request_116")
                                                .get(uri11)
                                                .headers(headersUC41_4),
                                        http("request_117")
                                                .get("/s/player/a87a9450/www-player.css")
                                                .headers(headersUC41_4),
                                        http("request_118")
                                                .get(uri06 + "/cv/js/sender/v1/cast_sender.js")
                                                .headers(headersUC41_4),
                                        http("request_119")
                                                .get(uri05 + "/KFOmCnqEu92Fr1Mu5mxKOzY.woff2")
                                                .headers(headersUC41_72),
                                        http("request_120")
                                                .get(uri05 + "/KFOmCnqEu92Fr1Mu4mxK.woff2")
                                                .headers(headersUC41_72),
                                        http("request_121")
                                                .get(uri05 + "/KFOlCnqEu92Fr1MmEU9fBBc4.woff2")
                                                .headers(headersUC41_72),
                                        http("request_122")
                                                .get(uri06 + "/eureka/clank/128/cast_sender.js")
                                                .headers(headersUC41_4),
                                        http("request_123")
                                                .post(uri01 + "/Create")
                                                .headers(headersUC41_123)
                                                .body(RawFileBody("mainpage2017/0123_request.dat")),
                                        http("request_124")
                                                .post(uri08 + "?format=json&hasfast=true&authuser=0")
                                                .headers(headersUC41_124)
                                                .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,null,[1,0,0,0,0]]],1828,[[\"1724484207231\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"aGIf\\\"]],[null,68.59999999962747]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"aGIf\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724484207232\"]", ""),
                                        http("request_125")
                                                .post(uri08 + "?format=json&hasfast=true&authuser=0")
                                                .headers(headersUC41_124)
                                                .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,[[[\"Chromium\",\"128\"],[\"Not;A", "Brand\",\"24\"],[\"Google Chrome\",\"128\"]],0,\"Linux\",\"6.5.0\",\"x86\",\"\",\"128.0.6613.84\"],[1,0,0,0,0]]],1828,[[\"1724484207414\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[null,47.80000000074506]]]],[\\\"/client_streamz/bg/el\\\",null,[\\\"en\\\",\\\"bk\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0]],[[[\\\"q\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.20000000018626451]],[[[\\\"S\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.40000000037252903]]]],[\\\"/client_streamz/bg/wrl\\\",null,[\\\"mn\\\",\\\"ac\\\",\\\"sc\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[null,1],[null,0],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,724.8999999994412]]]],[\\\"/client_streamz/bg/po/csc\\\",null,[\\\"cs\\\",\\\"rk\\\",\\\"mk\\\"],[[[[null,3],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724484207414\"]"),
                                        http("request_126")
                                                .post(uri08 + "?format=json&hasfast=true&authuser=0")
                                                .headers(headersUC41_124)
                                                .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,[[[\"Chromium\",\"128\"],[\"Not;A", "Brand\",\"24\"],[\"Google Chrome\",\"128\"]],0,\"Linux\",\"6.5.0\",\"x86\",\"\",\"128.0.6613.84\"],[1,0,0,0,0]]],1828,[[\"1724484207418\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fsc\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fsl\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[null,2.300000000745058]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,2]],\"1724484207418\"]"),
                                        http("request_127")
                                                .post(uri01 + "/GenerateIT")
                                                .headers(headersUC41_123)
                                                .body(RawFileBody("mainpage2017/0127_request.dat")),
                                        http("request_128")
                                                .get("/embed/BI07axwX9Qg")
                                                .headers(headersUC41_115),
                                        http("request_129")
                                                .get("/s/player/a87a9450/player_ias.vflset/en_US/embed.js")
                                                .headers(headersUC41_4),
                                        http("request_130")
                                                .get("/s/player/a87a9450/www-embed-player.vflset/www-embed-player.js")
                                                .headers(headersUC41_4),
                                        http("request_131")
                                                .get("/s/player/a87a9450/www-player.css")
                                                .headers(headersUC41_4),
                                        http("request_132")
                                                .get("/s/player/a87a9450/player_ias.vflset/en_US/base.js")
                                                .headers(headersUC41_4),
                                        http("request_133")
                                                .get(uri05 + "/KFOmCnqEu92Fr1Mu5mxKOzY.woff2")
                                                .headers(headersUC41_72),
                                        http("request_134")
                                                .get(uri05 + "/KFOmCnqEu92Fr1Mu4mxK.woff2")
                                                .headers(headersUC41_72),
                                        http("request_135")
                                                .get(uri05 + "/KFOlCnqEu92Fr1MmEU9fBBc4.woff2")
                                                .headers(headersUC41_72),
                                        http("request_136")
                                                .get(uri09)
                                                .headers(headersUC41_4),
                                        http("request_137")
                                                .get("/s/player/a87a9450/player_ias.vflset/en_US/remote.js")
                                                .headers(headersUC41_4),
                                        http("request_138")
                                                .get(uri04)
                                                .headers(headersUC41_4),
                                        http("request_139")
                                                .get(uri07 + "/vi_webp/BI07axwX9Qg/hqdefault.webp")
                                                .headers(headersUC41_4),
                                        http("request_140")
                                                .get(uri11)
                                                .headers(headersUC41_4),
                                        http("request_141")
                                                .get(uri06 + "/cv/js/sender/v1/cast_sender.js")
                                                .headers(headersUC41_4),
                                        http("request_142")
                                                .get(uri06 + "/eureka/clank/128/cast_sender.js")
                                                .headers(headersUC41_4),
                                        http("request_143")
                                                .post(uri08 + "?format=json&hasfast=true&authuser=0")
                                                .headers(headersUC41_124)
                                                .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,null,[1,0,0,0,0]]],1828,[[\"1724484208134\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"aGIf\\\"]],[null,76]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"aGIf\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724484208135\"]", ""),
                                        http("request_144")
                                                .post(uri01 + "/Create")
                                                .headers(headersUC41_123)
                                                .body(RawFileBody("mainpage2017/0144_request.dat")),
                                        http("request_145")
                                                .get(uri03)
                                                .headers(headersUC41_114),
                                        http("request_146")
                                                .post(uri08 + "?format=json&hasfast=true&authuser=0")
                                                .headers(headersUC41_124)
                                                .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,[[[\"Chromium\",\"128\"],[\"Not;A", "Brand\",\"24\"],[\"Google Chrome\",\"128\"]],0,\"Linux\",\"6.5.0\",\"x86\",\"\",\"128.0.6613.84\"],[1,0,0,0,0]]],1828,[[\"1724484208551\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[null,50.89999999944121]]]],[\\\"/client_streamz/bg/el\\\",null,[\\\"en\\\",\\\"bk\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0]],[[[\\\"q\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.19999999925494194]],[[[\\\"S\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.7000000001862645]]]],[\\\"/client_streamz/bg/wrl\\\",null,[\\\"mn\\\",\\\"ac\\\",\\\"sc\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[null,1],[null,0],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,520.2000000001863]]]],[\\\"/client_streamz/bg/po/csc\\\",null,[\\\"cs\\\",\\\"rk\\\",\\\"mk\\\"],[[[[null,3],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724484208551\"]"),
                                        http("request_147")
                                                .post(uri01 + "/GenerateIT")
                                                .headers(headersUC41_123)
                                                .body(RawFileBody("mainpage2017/0147_request.dat")),
                                        http("request_148")
                                                .post(uri08 + "?format=json&hasfast=true&authuser=0")
                                                .headers(headersUC41_124)
                                                .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,[[[\"Chromium\",\"128\"],[\"Not;A", "Brand\",\"24\"],[\"Google Chrome\",\"128\"]],0,\"Linux\",\"6.5.0\",\"x86\",\"\",\"128.0.6613.84\"],[1,0,0,0,0]]],1828,[[\"1724484208554\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fsc\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fsl\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[null,2.099999999627471]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,2]],\"1724484208555\"]"),
                                        http("request_149")
                                                .get("/embed/OrNbE-V9hKU")
                                                .headers(headersUC41_115),
                                        http("request_150")
                                                .get("/generate_204?v_792A")
                                                .headers(headersUC41_150),
                                        http("request_151")
                                                .get("/generate_204?fsrU9Q")
                                                .headers(headersUC41_150),
                                        http("request_152")
                                                .get("/s/player/a87a9450/player_ias.vflset/en_US/embed.js")
                                                .headers(headersUC41_4),
                                        http("request_153")
                                                .get("/s/player/a87a9450/www-embed-player.vflset/www-embed-player.js")
                                                .headers(headersUC41_4),
                                        http("request_154")
                                                .get("/s/player/a87a9450/player_ias.vflset/en_US/base.js")
                                                .headers(headersUC41_4),
                                        http("request_155")
                                                .get(uri09)
                                                .headers(headersUC41_4),
                                        http("request_156")
                                                .get("/s/player/a87a9450/player_ias.vflset/en_US/remote.js")
                                                .headers(headersUC41_4),
                                        http("request_157")
                                                .get(uri04)
                                                .headers(headersUC41_4),
                                        http("request_158")
                                                .get(uri07 + "/vi_webp/OrNbE-V9hKU/hqdefault.webp")
                                                .headers(headersUC41_4),
                                        http("request_159")
                                                .get(uri11)
                                                .headers(headersUC41_4),
                                        http("request_160")
                                                .get(uri06 + "/cv/js/sender/v1/cast_sender.js")
                                                .headers(headersUC41_4),
                                        http("request_161")
                                                .get(uri06 + "/eureka/clank/128/cast_sender.js")
                                                .headers(headersUC41_4),
                                        http("request_162")
                                                .get(UC41_uri12 + "/build/images/shtadopm/favicon/favicon.ico")
                                                .headers(headersUC41_4),
                                        http("request_163")
                                                .get(uri03)
                                                .headers(headersUC41_114),
                                        http("request_164")
                                                .post(uri01 + "/Create")
                                                .headers(headersUC41_123)
                                                .body(RawFileBody("mainpage2017/0164_request.dat")),
                                        http("request_165")
                                                .get("/generate_204?Y10t3g")
                                                .headers(headersUC41_150),
                                        http("request_166")
                                                .post(uri08 + "?format=json&hasfast=true&authuser=0")
                                                .headers(headersUC41_124)
                                                .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,null,[1,0,0,0,0]]],1828,[[\"1724484209099\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"aGIf\\\"]],[null,87.5]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"aGIf\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724484209100\"]", ""),
                                        http("request_167")
                                                .post(uri08 + "?format=json&hasfast=true&authuser=0")
                                                .headers(headersUC41_124)
                                                .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,[[[\"Chromium\",\"128\"],[\"Not;A", "Brand\",\"24\"],[\"Google Chrome\",\"128\"]],0,\"Linux\",\"6.5.0\",\"x86\",\"\",\"128.0.6613.84\"],[1,0,0,0,0]]],1828,[[\"1724484209293\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[null,43.59999999962747]]]],[\\\"/client_streamz/bg/el\\\",null,[\\\"en\\\",\\\"bk\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0]],[[[\\\"q\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.09999999962747097]],[[[\\\"S\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.7000000001862645]]]],[\\\"/client_streamz/bg/wrl\\\",null,[\\\"mn\\\",\\\"ac\\\",\\\"sc\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[null,1],[null,0],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,319.30000000074506]]]],[\\\"/client_streamz/bg/po/csc\\\",null,[\\\"cs\\\",\\\"rk\\\",\\\"mk\\\"],[[[[null,3],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724484209293\"]"),
                                        http("request_168")
                                                .post(uri08 + "?format=json&hasfast=true&authuser=0")
                                                .headers(headersUC41_124)
                                                .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,[[[\"Chromium\",\"128\"],[\"Not;A", "Brand\",\"24\"],[\"Google Chrome\",\"128\"]],0,\"Linux\",\"6.5.0\",\"x86\",\"\",\"128.0.6613.84\"],[1,0,0,0,0]]],1828,[[\"1724484209296\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fsc\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fsl\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[null,2.5]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,2]],\"1724484209297\"]"),
                                        http("request_169")
                                                .post(uri01 + "/GenerateIT")
                                                .headers(headersUC41_123)
                                                .body(RawFileBody("mainpage2017/0169_request.dat")),
                                        http("request_170")
                                                .post("/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
                                                .headers(headersUC41_170)
                                                .body(RawFileBody("mainpage2017/0170_request.json")),
                                        http("request_171")
                                                .post("/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
                                                .headers(headersUC41_171)
                                                .body(RawFileBody("mainpage2017/0171_request.json")),
                                        http("request_172")
                                                .post("/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
                                                .headers(headersUC41_172)
                                                .body(RawFileBody("mainpage2017/0172_request.json"))
                                )
                );
        HttpProtocolBuilder httpProtocol_MainPage2016 = http
                .baseUrl("https://mc.yandex.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersUC42_0 = new HashMap<>();
        headersUC42_0.put("accept", "*/*");
        headersUC42_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC42_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC42_0.put("content-type", "text/plain");
        headersUC42_0.put("origin", "https://shtab.opmoscow.ru");
        headersUC42_0.put("priority", "u=1, i");
        headersUC42_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC42_0.put("sec-ch-ua-mobile", "?0");
        headersUC42_0.put("sec-ch-ua-platform", "Linux");
        headersUC42_0.put("sec-fetch-dest", "empty");
        headersUC42_0.put("sec-fetch-mode", "cors");
        headersUC42_0.put("sec-fetch-site", "cross-site");
        headersUC42_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headerUC42s_2 = new HashMap<>();
        headerUC42s_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headerUC42s_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headerUC42s_2.put("sec-ch-ua-mobile", "?0");
        headerUC42s_2.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC42_33 = new HashMap<>();
        headersUC42_33.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC42_33.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC42_33.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC42_33.put("priority", "u=0, i");
        headersUC42_33.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC42_33.put("sec-ch-ua-mobile", "?0");
        headersUC42_33.put("sec-ch-ua-platform", "Linux");
        headersUC42_33.put("sec-fetch-dest", "document");
        headersUC42_33.put("sec-fetch-mode", "navigate");
        headersUC42_33.put("sec-fetch-site", "same-origin");
        headersUC42_33.put("sec-fetch-user", "?1");
        headersUC42_33.put("upgrade-insecure-requests", "1");
        headersUC42_33.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC42_42 = new HashMap<>();
        headersUC42_42.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
        headersUC42_42.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC42_42.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC42_42.put("priority", "i");
        headersUC42_42.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC42_42.put("sec-ch-ua-mobile", "?0");
        headersUC42_42.put("sec-ch-ua-platform", "Linux");
        headersUC42_42.put("sec-fetch-dest", "image");
        headersUC42_42.put("sec-fetch-mode", "no-cors");
        headersUC42_42.put("sec-fetch-site", "same-origin");
        headersUC42_42.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC42_43 = new HashMap<>();
        headersUC42_43.put("accept", "*/*");
        headersUC42_43.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC42_43.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC42_43.put("origin", "https://shtab.opmoscow.ru");
        headersUC42_43.put("priority", "u=1, i");
        headersUC42_43.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC42_43.put("sec-ch-ua-mobile", "?0");
        headersUC42_43.put("sec-ch-ua-platform", "Linux");
        headersUC42_43.put("sec-fetch-dest", "empty");
        headersUC42_43.put("sec-fetch-mode", "cors");
        headersUC42_43.put("sec-fetch-site", "cross-site");
        headersUC42_43.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC42_46 = new HashMap<>();
        headersUC42_46.put("Upgrade-Insecure-Requests", "1");
        headersUC42_46.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC42_46.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC42_46.put("sec-ch-ua-mobile", "?0");
        headersUC42_46.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC42_55 = new HashMap<>();
        headersUC42_55.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
        headersUC42_55.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC42_55.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC42_55.put("priority", "i");
        headersUC42_55.put("range", "bytes=11624-11624");
        headersUC42_55.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC42_55.put("sec-ch-ua-mobile", "?0");
        headersUC42_55.put("sec-ch-ua-platform", "Linux");
        headersUC42_55.put("sec-fetch-dest", "image");
        headersUC42_55.put("sec-fetch-mode", "no-cors");
        headersUC42_55.put("sec-fetch-site", "same-origin");
        headersUC42_55.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC42_60 = new HashMap<>();
        headersUC42_60.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
        headersUC42_60.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC42_60.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC42_60.put("priority", "i");
        headersUC42_60.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC42_60.put("sec-ch-ua-mobile", "?0");
        headersUC42_60.put("sec-ch-ua-platform", "Linux");
        headersUC42_60.put("sec-fetch-dest", "image");
        headersUC42_60.put("sec-fetch-mode", "no-cors");
        headersUC42_60.put("sec-fetch-site", "cross-site");
        headersUC42_60.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC42_60.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");

        String UC42_uri2 = "https://shtab.opmoscow.ru";

//        String uri3 = "https://i.ytimg.com/vi";

        ScenarioBuilder scnUC42 = scenario("Archive.MainPage2016")
                .exec(
                        http("request_0")
                                .post("/webvisor/89667203?wv-part=2&wv-type=7&wmode=0&wv-hit=741423605&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2016&rn=620942567&browser-info=we%3A1%3Aet%3A1724484253%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824122412%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724484253&t=gdpr(14)ti(1)")
                                .headers(headersUC42_0)
//                                .body(RawFileBody("mainpage2016/0000_request.gif"))
                                .resources(
                                        http("request_1")
                                                .post("/webvisor/89667203?wv-part=3&wv-type=7&wmode=0&wv-hit=741423605&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2016&rn=890537736&browser-info=we%3A1%3Aet%3A1724484255%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824122414%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724484255&t=gdpr(14)ti(1)")
                                                .headers(headersUC42_0),
//                                                .body(RawFileBody("mainpage2016/0001_request.gif")),
                                        http("request_2")
                                                .get(UC42_uri2 + "/build/5758.f38a32ed.css")
                                                .headers(headerUC42s_2),
                                        http("request_3")
                                                .get(UC42_uri2 + "/build/6395.76430bbc.css")
                                                .headers(headerUC42s_2),
                                        http("request_4")
                                                .get(UC42_uri2 + "/build/8886.31d6cfe0.css")
                                                .headers(headerUC42s_2),
                                        http("request_5")
                                                .get(UC42_uri2 + "/build/shtadopm_css_head.dfe3f750.css")
                                                .headers(headerUC42s_2),
                                        http("request_6")
                                                .get(UC42_uri2 + "/build/runtime.aaa04269.js")
                                                .headers(headerUC42s_2),
                                        http("request_7")
                                                .get(UC42_uri2 + "/build/9755.89d0240d.js")
                                                .headers(headerUC42s_2),
                                        http("request_8")
                                                .get(UC42_uri2 + "/build/shtadopm_app_head.a800bb8d.js")
                                                .headers(headerUC42s_2),
                                        http("request_9")
                                                .get(UC42_uri2 + "/uploads/media/default/0001/17/3510b056520b45843a72c71d35ea5d69f2149caf.png")
                                                .headers(headerUC42s_2),
                                        http("request_10")
                                                .get(UC42_uri2 + "/build/images/shtadopm/menu-arrow.svg")
                                                .headers(headerUC42s_2),
                                        http("request_11")
                                                .get(UC42_uri2 + "/cache/b/1/e/6/3/b1e6349294a6faab03d90c7cd7cede2209ca3380.jpeg")
                                                .headers(headerUC42s_2),
                                        http("request_12")
                                                .get(UC42_uri2 + "/cache/0/6/7/4/c/0674cb551940a2b3517fed859062de9f80a85eb4.jpeg")
                                                .headers(headerUC42s_2),
                                        http("request_13")
                                                .get(UC42_uri2 + "/cache/2/a/e/d/7/2aed74619e97da0bdc2987954df66fdd80ac13ef.jpeg")
                                                .headers(headerUC42s_2),
                                        http("request_14")
                                                .get(UC42_uri2 + "/cache/c/0/e/8/e/c0e8e6e74dc69b3706ccc519bd2e0cae360403a5.jpeg")
                                                .headers(headerUC42s_2),
                                        http("request_15")
                                                .get(UC42_uri2 + "/cache/9/c/0/5/7/9c0579092da48f670e8f09bb2464a2adca4f016c.jpeg")
                                                .headers(headerUC42s_2),
                                        http("request_16")
                                                .get(UC42_uri2 + "/cache/c/4/d/8/c/c4d8c812ccc352c2c7de68eb2549ab042a5bdfef.jpeg")
                                                .headers(headerUC42s_2),
                                        http("request_17")
                                                .get(UC42_uri2 + "/cache/f/1/4/5/0/f145041afcbb34b843d7f7f42ff87f0c58280eb6.jpeg")
                                                .headers(headerUC42s_2),
                                        http("request_18")
                                                .get(UC42_uri2 + "/cache/e/a/0/d/f/ea0dff986d38d4fde789c16e7ccc9f5d784f570f.jpeg")
                                                .headers(headerUC42s_2),
                                        http("request_19")
                                                .get(UC42_uri2 + "/cache/c/0/b/4/2/c0b42ed564857d29771776adfe9f5004c366890f.jpeg")
                                                .headers(headerUC42s_2),
                                        http("request_20")
                                                .get(UC42_uri2 + "/cache/6/4/f/8/7/64f873aeec3fe8f808a39164cd36029c2e8cbd11.jpeg")
                                                .headers(headerUC42s_2),
                                        http("request_21")
                                                .get(UC42_uri2 + "/cache/4/9/f/d/5/49fd588d87ca2f2994daaac19972f96b3cddd67f.jpeg")
                                                .headers(headerUC42s_2),
                                        http("request_22")
                                                .get(UC42_uri2 + "/cache/e/c/f/7/c/ecf7cb2d9114fdb3e43613c2a592d110aaabef43.jpeg")
                                                .headers(headerUC42s_2),
                                        http("request_23")
                                                .get(UC42_uri2 + "/cache/7/a/2/3/e/7a23e7d8fb04202a4c5a14b19d5e2fea9322415b.jpeg")
                                                .headers(headerUC42s_2),
                                        http("request_24")
                                                .get(UC42_uri2 + "/cache/1/c/0/5/6/1c056c291a0ab490787ab146c21287346281f94e.jpeg")
                                                .headers(headerUC42s_2),
                                        http("request_25")
                                                .get(UC42_uri2 + "/cache/c/1/1/2/4/c11246b14a31b8b15c8b90ab8aa40c655a1f0120.jpeg")
                                                .headers(headerUC42s_2),
                                        http("request_26")
                                                .get("/metrika/tag.js")
                                                .headers(headerUC42s_2),
                                        http("request_27")
                                                .get(UC42_uri2 + "/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
                                        http("request_28")
                                                .get(UC42_uri2 + "/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
                                        http("request_29")
                                                .get(UC42_uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                        http("request_30")
                                                .get(UC42_uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                        http("request_31")
                                                .get(UC42_uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                        http("request_32")
                                                .get(UC42_uri2 + "/build/images/opmoscow/loading.svg")
                                                .headers(headerUC42s_2),
                                        http("request_33")
                                                .get(UC42_uri2 + "/obshchestvennyy-shtab-po-vyboram-2016")
                                                .headers(headersUC42_33),
                                        http("request_34")
                                                .get(UC42_uri2 + "/build/7255.871eb160.js")
                                                .headers(headerUC42s_2),
                                        http("request_35")
                                                .get(UC42_uri2 + "/build/6889.3f713c69.js")
                                                .headers(headerUC42s_2),
                                        http("request_36")
                                                .get(UC42_uri2 + "/build/7729.67d87565.js")
                                                .headers(headerUC42s_2),
                                        http("request_37")
                                                .get(UC42_uri2 + "/build/8981.bc50772a.js")
                                                .headers(headerUC42s_2),
                                        http("request_38")
                                                .get(UC42_uri2 + "/build/3734.2c5e1582.js")
                                                .headers(headerUC42s_2),
                                        http("request_39")
                                                .get(UC42_uri2 + "/build/9154.f1370752.js")
                                                .headers(headerUC42s_2),
                                        http("request_40")
                                                .get(UC42_uri2 + "/build/1676.2634f191.js")
                                                .headers(headerUC42s_2),
                                        http("request_41")
                                                .get(UC42_uri2 + "/build/shtadopm_app_footer.9745ecad.js")
                                                .headers(headerUC42s_2),
                                        http("request_42")
                                                .get(UC42_uri2 + "/cache/9/0/b/7/c/90b7c62588fb350aa8d13df3d61a9d8ef266e0d2.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_43")
                                                .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2016&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A950311731%3Az%3A300%3Ai%3A20240824122415%3Aet%3A1724484256%3Ac%3A1%3Arn%3A702785325%3Arqn%3A218%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C2020%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724484253648%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724484256%3At%3A%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1%20%D0%BF%D0%BE%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B7%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D0%BC%D0%B8%20%D0%B2%20%D0%93%D0%BE%D1%81%D0%B4%D1%83%D0%BC%D1%83%20%D0%A0%D0%A4%202016&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                                .headers(headersUC42_43),
                                        http("request_44")
                                                .get(UC42_uri2 + "/cache/3/7/4/a/d/374ad4fd6559461481a108ff4080464297c23d50.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_45")
                                                .get(UC42_uri2 + "/cache/4/8/6/e/4/486e4d0b0f2ecf1f92ea5f32aff5504fe9829367.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_46")
                                                .get("/metrika/metrika_match.html")
                                                .headers(headersUC42_46),
                                        http("request_47")
                                                .get(UC42_uri2 + "/cache/7/9/a/8/5/79a851bb3cc30c1ad9a9204942669478a9b1c7ea.png")
                                                .headers(headersUC42_42),
                                        http("request_48")
                                                .get(UC42_uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
                                                .headers(headerUC42s_2),
                                        http("request_49")
                                                .get(UC42_uri2 + "/cache/0/3/6/0/4/036047f59276be6b96849ed11654f27ada5da54d.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_50")
                                                .get(UC42_uri2 + "/cache/5/7/c/5/d/57c5d31a814d6945f9ae1bc4394a6d3588ed8523.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_51")
                                                .get(UC42_uri2 + "/cache/0/0/f/e/d/00fed00a44f36809c1da566305558cb71cbd122a.png")
                                                .headers(headersUC42_42),
                                        http("request_52")
                                                .get(UC42_uri2 + "/uploads/media/default/0001/13/b71863ce68434497eaf42267cb42ea4e7323a1c1.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_53")
                                                .get(UC42_uri2 + "/uploads/media/default/0001/13/6db4e06eb15dcc2d9b0ecc49d30b3290c7440435.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_54")
                                                .get(UC42_uri2 + "/uploads/media/default/0001/13/9d143a45c7f7452e73e86f63efbf4c7c9baf21b9.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_55")
                                                .get(UC42_uri2 + "/cache/9/8/6/e/0/986e0c8582208d863f451702742137856a17d926.png")
                                                .headers(headersUC42_55),
                                        http("request_56")
                                                .get(UC42_uri2 + "/uploads/media/default/0001/13/51bfcee3449abc5babf9aec5e255561bd3514e24.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_57")
                                                .get(UC42_uri2 + "/uploads/media/default/0001/13/308c060f2d6f539d9c91edcbb0663dce593250fd.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_58")
                                                .get(UC42_uri2 + "/build/images/mCSB_buttons.5b35a39c.png")
                                                .headers(headerUC42s_2),
                                        http("request_59")
                                                .get(UC42_uri2 + "/cache/9/c/3/5/3/9c353c3c73246b96f023763eff17093ee68ca743.jpeg")
                                                .headers(headerUC42s_2),
                                        http("request_60")
                                                .get(uri3 + "/9tiSt3UyJiQ/hqdefault.jpg")
                                                .headers(headersUC42_60),
                                        http("request_61")
                                                .get(uri3 + "/303yE9iTkrs/hqdefault.jpg")
                                                .headers(headersUC42_60),
                                        http("request_62")
                                                .get(UC42_uri2 + "/uploads/media/default/0001/13/d19267b1cea82b4fad45123dd7fb4b279ee57d9c.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_63")
                                                .get(uri3 + "/Fxm5Rj6zbdI/hqdefault.jpg")
                                                .headers(headersUC42_60),
                                        http("request_64")
                                                .get(UC42_uri2 + "/uploads/media/default/0001/13/1c875ba756c2b3f86f8b98e3231adc89f50d1180.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_65")
                                                .get(UC42_uri2 + "/uploads/media/default/0001/13/32e75c49b4a2890e94b6a429beaedb9e4d322801.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_66")
                                                .get(UC42_uri2 + "/uploads/media/default/0001/13/16ba0d2452bc9176cdb2b259bed63bdff126b285.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_67")
                                                .get(UC42_uri2 + "/uploads/media/default/0001/13/ecf51ac6707a4c9df091bc9221036668e04fbda8.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_68")
                                                .get(UC42_uri2 + "/uploads/media/default/0001/13/ebde767c205a0e55d05aaa648f8fd15d0fcfa1ad.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_69")
                                                .get(UC42_uri2 + "/uploads/media/default/0001/13/6ed721e42001b5871803ca4386318a4bf0274028.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_70")
                                                .get(UC42_uri2 + "/cache/e/a/1/4/c/ea14c3bc147e0dadc90d664fb9549b43f27c2674.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_71")
                                                .get(UC42_uri2 + "/cache/5/2/f/e/e/52fee56cfe58e85620164a2eac9a81020c4460e7.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_72")
                                                .get(UC42_uri2 + "/cache/0/a/6/e/4/0a6e4c396f7e5e63c8188464426abc6d9834a851.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_73")
                                                .get(UC42_uri2 + "/cache/a/a/e/c/c/aaeccd5e5e21b35c8a855dc4b36651c93ef28307.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_74")
                                                .get(UC42_uri2 + "/cache/8/e/b/5/3/8eb53d13ec7e472095f5d5a34bc3a586ba220fbd.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_75")
                                                .get(UC42_uri2 + "/cache/8/e/1/5/9/8e15936ebad540c0ac6d5053476f9b3aca9a20e0.jpeg")
                                                .headers(headersUC42_42),
                                        http("request_76")
                                                .get(UC42_uri2 + "/build/images/shtadopm/favicon/favicon.ico")
                                                .headers(headersUC42_42)
                                )
                );

//        Установки

        setUp(
                scnUC25.injectClosed(
                        constantConcurrentUsers(users_flood_UC25).during(40000)
                ).protocols(httpProtocol_MainPage2023)
                ,
                scnUC29.injectClosed(
                        constantConcurrentUsers(users_flood_UC29).during(40000)
                ).protocols(httpProtocol_MainPage2022)
                ,
                scnUC30.injectClosed(
                        constantConcurrentUsers(users_flood_UC30).during(40000)
                ).protocols(httpProtocol_MainPage2021)
                ,
                scnUC31.injectClosed(
                        constantConcurrentUsers(users_flood_UC31).during(40000)
                ).protocols(httpProtocol_MainPage2020)
                ,
                scnUC35.injectClosed(
                        constantConcurrentUsers(users_flood_UC35).during(40000)
                ).protocols(httpProtocol_MainPage2019)
                ,
                scnUC36.injectClosed(
                        constantConcurrentUsers(users_flood_UC36).during(40000)
                ).protocols(httpProtocol_MainPage2018Prez)
                ,
                scnUC40.injectClosed(
                        constantConcurrentUsers(users_flood_UC40).during(40000)
                ).protocols(httpProtocol_MainPage2018Mer)
                ,
                scnUC41.injectClosed(
                        constantConcurrentUsers(users_flood_UC41).during(40000)
                ).protocols(httpProtocol_MainPage2017)
                ,
                scnUC42.injectClosed(
                        constantConcurrentUsers(users_flood_UC42).during(40000)
                ).protocols(httpProtocol_MainPage2016)


        );
    }
}

