package Simulations.shtabOpMoscow;

import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import java.util.HashMap;
import java.util.Map;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.http;

public class SC02 extends Simulation {
{

int users_flood_UC20 = Integer.getInteger("users_flood_UC20", 1);
int users_flood_UC21 = Integer.getInteger("users_flood_UC21", 1);
int users_flood_UC22 = Integer.getInteger("users_flood_UC22", 1);
int users_flood_UC23 = Integer.getInteger("users_flood_UC23", 1);
int users_flood_UC24 = Integer.getInteger("users_flood_UC24", 1);
int users_flood_UC26 = Integer.getInteger("users_flood_UC26", 1);
int users_flood_UC27 = Integer.getInteger("users_flood_UC27", 1);
int users_flood_UC28 = Integer.getInteger("users_flood_UC28", 1);
int users_flood_UC32 = Integer.getInteger("users_flood_UC32", 1);
int users_flood_UC33 = Integer.getInteger("users_flood_UC33", 1);
int users_flood_UC34 = Integer.getInteger("users_flood_UC34", 1);
int users_flood_UC37 = Integer.getInteger("users_flood_UC37", 1);
int users_flood_UC38 = Integer.getInteger("users_flood_UC38", 1);
int users_flood_UC39 = Integer.getInteger("users_flood_UC39", 1);

// Scenarious

HttpProtocolBuilder httpProtocol_News1 = http
        .baseUrl("https://shtab.opmoscow.ru")
        .inferHtmlResources()
        ;

Map<CharSequence, String> headersUC20_0 = new HashMap<>();
headersUC20_0.put("accept", "*/*");
headersUC20_0.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC20_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC20_0.put("content-type", "text/plain");
headersUC20_0.put("origin", "https://shtab.opmoscow.ru");
headersUC20_0.put("priority", "u=1, i");
headersUC20_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC20_0.put("sec-ch-ua-mobile", "?0");
headersUC20_0.put("sec-ch-ua-platform", "Linux");
headersUC20_0.put("sec-fetch-dest", "empty");
headersUC20_0.put("sec-fetch-mode", "cors");
headersUC20_0.put("sec-fetch-site", "cross-site");
headersUC20_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC20_2 = new HashMap<>();
headersUC20_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC20_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC20_2.put("sec-ch-ua-mobile", "?0");
headersUC20_2.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC20_26 = new HashMap<>();
headersUC20_26.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headersUC20_26.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC20_26.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC20_26.put("priority", "u=0, i");
headersUC20_26.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC20_26.put("sec-ch-ua-mobile", "?0");
headersUC20_26.put("sec-ch-ua-platform", "Linux");
headersUC20_26.put("sec-fetch-dest", "document");
headersUC20_26.put("sec-fetch-mode", "navigate");
headersUC20_26.put("sec-fetch-site", "same-origin");
headersUC20_26.put("sec-fetch-user", "?1");
headersUC20_26.put("upgrade-insecure-requests", "1");
headersUC20_26.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC20_29 = new HashMap<>();
headersUC20_29.put("accept", "*/*");
headersUC20_29.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC20_29.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC20_29.put("origin", "https://shtab.opmoscow.ru");
headersUC20_29.put("priority", "u=1, i");
headersUC20_29.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC20_29.put("sec-ch-ua-mobile", "?0");
headersUC20_29.put("sec-ch-ua-platform", "Linux");
headersUC20_29.put("sec-fetch-dest", "empty");
headersUC20_29.put("sec-fetch-mode", "cors");
headersUC20_29.put("sec-fetch-site", "cross-site");
headersUC20_29.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC20_30 = new HashMap<>();
headersUC20_30.put("Upgrade-Insecure-Requests", "1");
headersUC20_30.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC20_30.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC20_30.put("sec-ch-ua-mobile", "?0");
headersUC20_30.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC20_32 = new HashMap<>();
headersUC20_32.put("accept", "*/*");
headersUC20_32.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC20_32.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC20_32.put("origin", "https://shtab.opmoscow.ru");
headersUC20_32.put("priority", "u=4, i");
headersUC20_32.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC20_32.put("sec-ch-ua-mobile", "?0");
headersUC20_32.put("sec-ch-ua-platform", "Linux");
headersUC20_32.put("sec-fetch-dest", "empty");
headersUC20_32.put("sec-fetch-mode", "no-cors");
headersUC20_32.put("sec-fetch-site", "cross-site");
headersUC20_32.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

String uri2 = "https://shtab.opmoscow.ru";

String uri3 = "https://yastatic.net";

ScenarioBuilder scnUC20 = scenario("Projects.asafov.News1")
        .exec(
                http("request_0")
                        .post("/webvisor/89667203?wv-part=1&wv-check=10431&wv-type=0&wmode=0&wv-hit=302056641&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Ftestovoe-golosovanie-v-moskve-proshlo-v-shtatnom-rezhime&rn=699405502&browser-info=we%3A1%3Aet%3A1724422053%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823190732%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724422053&t=gdpr(14)ti(1)")
                        .headers(headersUC20_0)
//                        .body(RawFileBody("news1/0000_request.gif"))
                        .resources(
                                http("request_1")
                                        .post("/webvisor/89667203?wv-part=6&wv-type=7&wmode=0&wv-hit=302056641&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Ftestovoe-golosovanie-v-moskve-proshlo-v-shtatnom-rezhime&rn=498528486&browser-info=we%3A1%3Aet%3A1724422051%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823190730%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724422051&t=gdpr(14)ti(1)")
                                        .headers(headersUC20_0)
                                        .body(RawFileBody("news1/0001_request.gif")),
                                http("request_2")
                                        .get(uri2 + "/build/5758.f38a32ed.css")
                                        .headers(headersUC20_2),
                                http("request_3")
                                        .get(uri2 + "/build/6395.76430bbc.css")
                                        .headers(headersUC20_2),
                                http("request_4")
                                        .get(uri2 + "/build/8886.31d6cfe0.css")
                                        .headers(headersUC20_2),
                                http("request_5")
                                        .get(uri2 + "/build/shtadopm_css_head.dfe3f750.css")
                                        .headers(headersUC20_2),
                                http("request_6")
                                        .get(uri2 + "/build/runtime.aaa04269.js")
                                        .headers(headersUC20_2),
                                http("request_7")
                                        .get(uri2 + "/build/9755.89d0240d.js")
                                        .headers(headersUC20_2),
                                http("request_8")
                                        .get(uri2 + "/build/shtadopm_app_head.a800bb8d.js")
                                        .headers(headersUC20_2),
                                http("request_9")
                                        .get(uri2 + "/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
                                        .headers(headersUC20_2),
                                http("request_10")
                                        .get(uri2 + "/build/images/shtadopm/menu-arrow.svg")
                                        .headers(headersUC20_2),
                                http("request_11")
                                        .get(uri3 + "/es5-shims/0.0.2/es5-shims.min.js")
                                        .headers(headersUC20_2),
                                http("request_12")
                                        .get(uri3 + "/share2/share.js")
                                        .headers(headersUC20_2),
                                http("request_13")
                                        .get(uri2 + "/build/7255.871eb160.js")
                                        .headers(headersUC20_2),
                                http("request_14")
                                        .get(uri2 + "/build/6889.3f713c69.js")
                                        .headers(headersUC20_2),
                                http("request_15")
                                        .get(uri2 + "/build/7729.67d87565.js")
                                        .headers(headersUC20_2),
                                http("request_16")
                                        .get(uri2 + "/build/8981.bc50772a.js")
                                        .headers(headersUC20_2),
                                http("request_17")
                                        .get(uri2 + "/build/3734.2c5e1582.js")
                                        .headers(headersUC20_2),
                                http("request_18")
                                        .get(uri2 + "/build/9154.f1370752.js")
                                        .headers(headersUC20_2),
                                http("request_19")
                                        .get(uri2 + "/build/1676.2634f191.js")
                                        .headers(headersUC20_2),
                                http("request_20")
                                        .get(uri2 + "/build/shtadopm_app_footer.9745ecad.js")
                                        .headers(headersUC20_2),
                                http("request_21")
                                        .get("/metrika/tag.js")
                                        .headers(headersUC20_2),
                                http("request_22")
                                        .get(uri2 + "/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
                                http("request_23")
                                        .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                http("request_24")
                                        .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                http("request_25")
                                        .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                http("request_26")
                                        .get(uri2 + "/news/view/testovoe-golosovanie-v-moskve-proshlo-v-shtatnom-rezhime")
                                        .headers(headersUC20_26),
                                http("request_27")
                                        .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
                                        .headers(headersUC20_2),
                                http("request_28")
                                        .get(uri2 + "/build/images/shtadopm/favicon/favicon.ico")
                                        .headers(headersUC20_2),
                                http("request_29")
                                        .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Ftestovoe-golosovanie-v-moskve-proshlo-v-shtatnom-rezhime&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A435281084%3Az%3A300%3Ai%3A20240823190733%3Aet%3A1724422053%3Ac%3A1%3Arn%3A831517926%3Arqn%3A98%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C492%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724422052534%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422053%3At%3A%D0%A2%D0%B5%D1%81%D1%82%D0%BE%D0%B2%D0%BE%D0%B5%20%D0%B3%D0%BE%D0%BB%D0%BE%D1%81%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5%20%D0%BF%D1%80%D0%BE%D1%88%D0%BB%D0%BE%20%D0%B2%20%D1%88%D1%82%D0%B0%D1%82%D0%BD%D0%BE%D0%BC%20%D1%80%D0%B5%D0%B6%D0%B8%D0%BC%D0%B5&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                        .headers(headersUC20_29),
                                http("request_30")
                                        .get("/metrika/metrika_match.html")
                                        .headers(headersUC20_30),
                                http("request_31")
                                        .get("/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Ftestovoe-golosovanie-v-moskve-proshlo-v-shtatnom-rezhime&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A1%3Als%3A1333638796513%3Ahid%3A435281084%3Az%3A300%3Ai%3A20240823190733%3Aet%3A1724422053%3Ac%3A1%3Arn%3A741171057%3Arqn%3A9%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C492%2C58%2C1%2C0%2C%2C11%2C%2C%2C%2C%2C565%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724422052534%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422053%3At%3A%D0%A2%D0%B5%D1%81%D1%82%D0%BE%D0%B2%D0%BE%D0%B5%20%D0%B3%D0%BE%D0%BB%D0%BE%D1%81%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5%20%D0%BF%D1%80%D0%BE%D1%88%D0%BB%D0%BE%20%D0%B2%20%D1%88%D1%82%D0%B0%D1%82%D0%BD%D0%BE%D0%BC%20%D1%80%D0%B5%D0%B6%D0%B8%D0%BC%D0%B5&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
                                        .headers(headersUC20_29),
                                http("request_32")
                                        .post("/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Ftestovoe-golosovanie-v-moskve-proshlo-v-shtatnom-rezhime&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724422053_9d04215be791e105d3dcf42d14597b6e36fba213ea92126a73d70c312fefbcee&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A1%3Als%3A1333638796513%3Ahid%3A435281084%3Az%3A300%3Ai%3A20240823190733%3Aet%3A1724422054%3Ac%3A1%3Arn%3A41266524%3Arqn%3A10%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A568%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C7%2C578%2C578%2C1%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724422052534%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422054&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)aw(1)rcm(0)cdl(na)eco(16851712)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
                                        .headers(headersUC20_32)
                        )
        );
HttpProtocolBuilder httpProtocol_News2 = http
    .baseUrl("https://shtab.opmoscow.ru")
    .inferHtmlResources()
    ;

Map<CharSequence, String> headersUC21_0 = new HashMap<>();
headersUC21_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC21_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC21_0.put("sec-ch-ua-mobile", "?0");
headersUC21_0.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC21_9 = new HashMap<>();
headersUC21_9.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headersUC21_9.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC21_9.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC21_9.put("priority", "u=0, i");
headersUC21_9.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC21_9.put("sec-ch-ua-mobile", "?0");
headersUC21_9.put("sec-ch-ua-platform", "Linux");
headersUC21_9.put("sec-fetch-dest", "document");
headersUC21_9.put("sec-fetch-mode", "navigate");
headersUC21_9.put("sec-fetch-site", "same-origin");
headersUC21_9.put("sec-fetch-user", "?1");
headersUC21_9.put("upgrade-insecure-requests", "1");
headersUC21_9.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC21_27 = new HashMap<>();
headersUC21_27.put("Upgrade-Insecure-Requests", "1");
headersUC21_27.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC21_27.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC21_27.put("sec-ch-ua-mobile", "?0");
headersUC21_27.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC21_28 = new HashMap<>();
headersUC21_28.put("accept", "*/*");
headersUC21_28.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC21_28.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC21_28.put("origin", "https://shtab.opmoscow.ru");
headersUC21_28.put("priority", "u=1, i");
headersUC21_28.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC21_28.put("sec-ch-ua-mobile", "?0");
headersUC21_28.put("sec-ch-ua-platform", "Linux");
headersUC21_28.put("sec-fetch-dest", "empty");
headersUC21_28.put("sec-fetch-mode", "cors");
headersUC21_28.put("sec-fetch-site", "cross-site");
headersUC21_28.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC21_30 = new HashMap<>();
headersUC21_30.put("accept", "*/*");
headersUC21_30.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC21_30.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC21_30.put("origin", "https://shtab.opmoscow.ru");
headersUC21_30.put("priority", "u=4, i");
headersUC21_30.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC21_30.put("sec-ch-ua-mobile", "?0");
headersUC21_30.put("sec-ch-ua-platform", "Linux");
headersUC21_30.put("sec-fetch-dest", "empty");
headersUC21_30.put("sec-fetch-mode", "no-cors");
headersUC21_30.put("sec-fetch-site", "cross-site");
headersUC21_30.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

String uri1 = "https://mc.yandex.ru";

//String uri3 = "https://yastatic.net";

ScenarioBuilder scnUC21 = scenario("Projects.asafov.News2")
    .exec(
            http("request_0")
                    .get("/build/5758.f38a32ed.css")
                    .headers(headersUC21_0)
                    .resources(
                            http("request_1")
                                    .get("/build/6395.76430bbc.css")
                                    .headers(headersUC21_0),
                            http("request_2")
                                    .get("/build/8886.31d6cfe0.css")
                                    .headers(headersUC21_0),
                            http("request_3")
                                    .get("/build/shtadopm_css_head.dfe3f750.css")
                                    .headers(headersUC21_0),
                            http("request_4")
                                    .get("/build/runtime.aaa04269.js")
                                    .headers(headersUC21_0),
                            http("request_5")
                                    .get("/build/9755.89d0240d.js")
                                    .headers(headersUC21_0),
                            http("request_6")
                                    .get("/build/shtadopm_app_head.a800bb8d.js")
                                    .headers(headersUC21_0),
                            http("request_7")
                                    .get("/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
                                    .headers(headersUC21_0),
                            http("request_8")
                                    .get("/build/images/shtadopm/menu-arrow.svg")
                                    .headers(headersUC21_0),
                            http("request_9")
                                    .get("/news/view/v-shtatnom-rezhime-prohodit-testovoe-golosovanie-v-moskve")
                                    .headers(headersUC21_9),
                            http("request_10")
                                    .get(uri1 + "/metrika/tag.js")
                                    .headers(headersUC21_0),
                            http("request_11")
                                    .get("/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
                            http("request_12")
                                    .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                            http("request_13")
                                    .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                            http("request_14")
                                    .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                            http("request_15")
                                    .get(uri3 + "/es5-shims/0.0.2/es5-shims.min.js")
                                    .headers(headersUC21_0),
                            http("request_16")
                                    .get(uri3 + "/share2/share.js")
                                    .headers(headersUC21_0),
                            http("request_17")
                                    .get("/build/7255.871eb160.js")
                                    .headers(headersUC21_0),
                            http("request_18")
                                    .get("/build/6889.3f713c69.js")
                                    .headers(headersUC21_0),
                            http("request_19")
                                    .get("/build/7729.67d87565.js")
                                    .headers(headersUC21_0),
                            http("request_20")
                                    .get("/build/8981.bc50772a.js")
                                    .headers(headersUC21_0),
                            http("request_21")
                                    .get("/build/3734.2c5e1582.js")
                                    .headers(headersUC21_0),
                            http("request_22")
                                    .get("/build/9154.f1370752.js")
                                    .headers(headersUC21_0),
                            http("request_23")
                                    .get("/build/1676.2634f191.js")
                                    .headers(headersUC21_0),
                            http("request_24")
                                    .get("/build/shtadopm_app_footer.9745ecad.js")
                                    .headers(headersUC21_0),
                            http("request_25")
                                    .get("/build/images/shtadopm/favicon/site.webmanifest")
                                    .headers(headersUC21_0),
                            http("request_26")
                                    .get("/build/images/shtadopm/favicon/favicon.ico")
                                    .headers(headersUC21_0),
                            http("request_27")
                                    .get(uri1 + "/metrika/metrika_match.html")
                                    .headers(headersUC21_27),
                            http("request_28")
                                    .get(uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Fv-shtatnom-rezhime-prohodit-testovoe-golosovanie-v-moskve&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A372307503%3Az%3A300%3Ai%3A20240823191236%3Aet%3A1724422356%3Ac%3A1%3Arn%3A907965397%3Arqn%3A100%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C493%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724422355726%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422356%3At%3A%D0%92%20%D1%88%D1%82%D0%B0%D1%82%D0%BD%D0%BE%D0%BC%20%D1%80%D0%B5%D0%B6%D0%B8%D0%BC%D0%B5%20%D0%BF%D1%80%D0%BE%D1%85%D0%BE%D0%B4%D0%B8%D1%82%20%D1%82%D0%B5%D1%81%D1%82%D0%BE%D0%B2%D0%BE%D0%B5%20%D0%B3%D0%BE%D0%BB%D0%BE%D1%81%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                    .headers(headersUC21_28),
                            http("request_29")
                                    .get(uri1 + "/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Fv-shtatnom-rezhime-prohodit-testovoe-golosovanie-v-moskve&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A1%3Als%3A1333638796513%3Ahid%3A372307503%3Az%3A300%3Ai%3A20240823191236%3Aet%3A1724422356%3Ac%3A1%3Arn%3A5263152%3Arqn%3A13%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C493%2C24%2C1%2C0%2C%2C38%2C1%2C%2C%2C%2C557%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724422355726%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422356%3At%3A%D0%92%20%D1%88%D1%82%D0%B0%D1%82%D0%BD%D0%BE%D0%BC%20%D1%80%D0%B5%D0%B6%D0%B8%D0%BC%D0%B5%20%D0%BF%D1%80%D0%BE%D1%85%D0%BE%D0%B4%D0%B8%D1%82%20%D1%82%D0%B5%D1%81%D1%82%D0%BE%D0%B2%D0%BE%D0%B5%20%D0%B3%D0%BE%D0%BB%D0%BE%D1%81%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
                                    .headers(headersUC21_28),
                            http("request_30")
                                    .post(uri1 + "/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Fv-shtatnom-rezhime-prohodit-testovoe-golosovanie-v-moskve&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724422356_8c9365581bef7910d48ab8bb5293a33a6930f611cb21eed6dd35e2877fffee95&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A1%3Als%3A1333638796513%3Ahid%3A372307503%3Az%3A300%3Ai%3A20240823191236%3Aet%3A1724422357%3Ac%3A1%3Arn%3A381155992%3Arqn%3A14%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A577%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C%2C588%2C588%2C0%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724422355726%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422357&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)aw(1)rcm(0)cdl(na)eco(16851712)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
                                    .headers(headersUC21_30)
                    )
    );

HttpProtocolBuilder httpProtocol_News3 = http
    .baseUrl("https://shtab.opmoscow.ru")
    .inferHtmlResources()
    ;

Map<CharSequence, String> headersUC22_0 = new HashMap<>();
headersUC22_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC22_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC22_0.put("sec-ch-ua-mobile", "?0");
headersUC22_0.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC22_14 = new HashMap<>();
headersUC22_14.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headersUC22_14.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC22_14.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC22_14.put("priority", "u=0, i");
headersUC22_14.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC22_14.put("sec-ch-ua-mobile", "?0");
headersUC22_14.put("sec-ch-ua-platform", "Linux");
headersUC22_14.put("sec-fetch-dest", "document");
headersUC22_14.put("sec-fetch-mode", "navigate");
headersUC22_14.put("sec-fetch-site", "same-origin");
headersUC22_14.put("sec-fetch-user", "?1");
headersUC22_14.put("upgrade-insecure-requests", "1");
headersUC22_14.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC22_27 = new HashMap<>();
headersUC22_27.put("Upgrade-Insecure-Requests", "1");
headersUC22_27.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC22_27.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC22_27.put("sec-ch-ua-mobile", "?0");
headersUC22_27.put("sec-ch-ua-platform", "Linux");

String UC22_uri1 = "https://mc.yandex.ru/metrika";

//String uri3 = "https://yastatic.net";

ScenarioBuilder scnUC22 = scenario("Projects.asafov.News3")
    .exec(
            http("request_0")
                    .get("/build/5758.f38a32ed.css")
                    .headers(headersUC22_0)
                    .resources(
                            http("request_1")
                                    .get("/build/6395.76430bbc.css")
                                    .headers(headersUC22_0),
                            http("request_2")
                                    .get("/build/8886.31d6cfe0.css")
                                    .headers(headersUC22_0),
                            http("request_3")
                                    .get("/build/shtadopm_css_head.dfe3f750.css")
                                    .headers(headersUC22_0),
                            http("request_4")
                                    .get("/build/runtime.aaa04269.js")
                                    .headers(headersUC22_0),
                            http("request_5")
                                    .get("/build/9755.89d0240d.js")
                                    .headers(headersUC22_0),
                            http("request_6")
                                    .get("/build/shtadopm_app_head.a800bb8d.js")
                                    .headers(headersUC22_0),
                            http("request_7")
                                    .get("/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
                                    .headers(headersUC22_0),
                            http("request_8")
                                    .get("/build/images/shtadopm/menu-arrow.svg")
                                    .headers(headersUC22_0),
                            http("request_9")
                                    .get(UC22_uri1 + "/tag.js")
                                    .headers(headersUC22_0),
                            http("request_10")
                                    .get("/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
                            http("request_11")
                                    .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                            http("request_12")
                                    .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                            http("request_13")
                                    .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                            http("request_14")
                                    .get("/news/view/v-stolice-startovalo-testovoe-golosovanie")
                                    .headers(headersUC22_14),
                            http("request_15")
                                    .get(uri3 + "/es5-shims/0.0.2/es5-shims.min.js")
                                    .headers(headersUC22_0),
                            http("request_16")
                                    .get(uri3 + "/share2/share.js")
                                    .headers(headersUC22_0),
                            http("request_17")
                                    .get("/build/7255.871eb160.js")
                                    .headers(headersUC22_0),
                            http("request_18")
                                    .get("/build/6889.3f713c69.js")
                                    .headers(headersUC22_0),
                            http("request_19")
                                    .get("/build/7729.67d87565.js")
                                    .headers(headersUC22_0),
                            http("request_20")
                                    .get("/build/8981.bc50772a.js")
                                    .headers(headersUC22_0),
                            http("request_21")
                                    .get("/build/3734.2c5e1582.js")
                                    .headers(headersUC22_0),
                            http("request_22")
                                    .get("/build/9154.f1370752.js")
                                    .headers(headersUC22_0),
                            http("request_23")
                                    .get("/build/1676.2634f191.js")
                                    .headers(headersUC22_0),
                            http("request_24")
                                    .get("/build/shtadopm_app_footer.9745ecad.js")
                                    .headers(headersUC22_0),
                            http("request_25")
                                    .get("/build/images/shtadopm/favicon/site.webmanifest")
                                    .headers(headersUC22_0),
                            http("request_26")
                                    .get("/build/images/shtadopm/favicon/favicon.ico")
                                    .headers(headersUC22_0),
                            http("request_27")
                                    .get(UC22_uri1 + "/metrika_match.html")
                                    .headers(headersUC22_27)
                    )
    );
HttpProtocolBuilder httpProtocol_News4 = http
    .baseUrl("https://shtab.opmoscow.ru")
    .inferHtmlResources()
    ;

Map<CharSequence, String> headersUC23_0 = new HashMap<>();
headersUC23_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC23_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC23_0.put("sec-ch-ua-mobile", "?0");
headersUC23_0.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC23_10 = new HashMap<>();
headersUC23_10.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headersUC23_10.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC23_10.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC23_10.put("priority", "u=0, i");
headersUC23_10.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC23_10.put("sec-ch-ua-mobile", "?0");
headersUC23_10.put("sec-ch-ua-platform", "Linux");
headersUC23_10.put("sec-fetch-dest", "document");
headersUC23_10.put("sec-fetch-mode", "navigate");
headersUC23_10.put("sec-fetch-site", "same-origin");
headersUC23_10.put("sec-fetch-user", "?1");
headersUC23_10.put("upgrade-insecure-requests", "1");
headersUC23_10.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC23_28 = new HashMap<>();
headersUC23_28.put("Upgrade-Insecure-Requests", "1");
headersUC23_28.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC23_28.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC23_28.put("sec-ch-ua-mobile", "?0");
headersUC23_28.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC23_29 = new HashMap<>();
headersUC23_29.put("accept", "*/*");
headersUC23_29.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC23_29.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC23_29.put("origin", "https://shtab.opmoscow.ru");
headersUC23_29.put("priority", "u=1, i");
headersUC23_29.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC23_29.put("sec-ch-ua-mobile", "?0");
headersUC23_29.put("sec-ch-ua-platform", "Linux");
headersUC23_29.put("sec-fetch-dest", "empty");
headersUC23_29.put("sec-fetch-mode", "cors");
headersUC23_29.put("sec-fetch-site", "cross-site");
headersUC23_29.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC23_31 = new HashMap<>();
headersUC23_31.put("accept", "*/*");
headersUC23_31.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC23_31.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC23_31.put("origin", "https://shtab.opmoscow.ru");
headersUC23_31.put("priority", "u=4, i");
headersUC23_31.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC23_31.put("sec-ch-ua-mobile", "?0");
headersUC23_31.put("sec-ch-ua-platform", "Linux");
headersUC23_31.put("sec-fetch-dest", "empty");
headersUC23_31.put("sec-fetch-mode", "no-cors");
headersUC23_31.put("sec-fetch-site", "cross-site");
headersUC23_31.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

String UC23_uri1 = "https://mc.yandex.ru";

//String uri3 = "https://yastatic.net";

ScenarioBuilder scnUC23 = scenario("News4")
    .exec(
            http("request_0")
                    .get("/build/5758.f38a32ed.css")
                    .headers(headersUC23_0)
                    .resources(
                            http("request_1")
                                    .get("/build/6395.76430bbc.css")
                                    .headers(headersUC23_0),
                            http("request_2")
                                    .get("/build/8886.31d6cfe0.css")
                                    .headers(headersUC23_0),
                            http("request_3")
                                    .get("/build/shtadopm_css_head.dfe3f750.css")
                                    .headers(headersUC23_0),
                            http("request_4")
                                    .get("/build/runtime.aaa04269.js")
                                    .headers(headersUC23_0),
                            http("request_5")
                                    .get("/build/9755.89d0240d.js")
                                    .headers(headersUC23_0),
                            http("request_6")
                                    .get("/build/shtadopm_app_head.a800bb8d.js")
                                    .headers(headersUC23_0),
                            http("request_7")
                                    .get("/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
                                    .headers(headersUC23_0),
                            http("request_8")
                                    .get("/build/images/shtadopm/menu-arrow.svg")
                                    .headers(headersUC23_0),
                            http("request_9")
                                    .get(UC23_uri1 + "/metrika/tag.js")
                                    .headers(headersUC23_0),
                            http("request_10")
                                    .get("/news/view/v-moskve-nachalsya-nabor-v-korpus-nablyudateley-na-sentyabrskie-vybory")
                                    .headers(headersUC23_10),
                            http("request_11")
                                    .get("/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
                            http("request_12")
                                    .get("/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
                            http("request_13")
                                    .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                            http("request_14")
                                    .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                            http("request_15")
                                    .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                            http("request_16")
                                    .get(uri3 + "/es5-shims/0.0.2/es5-shims.min.js")
                                    .headers(headersUC23_0),
                            http("request_17")
                                    .get(uri3 + "/share2/share.js")
                                    .headers(headersUC23_0),
                            http("request_18")
                                    .get("/build/7255.871eb160.js")
                                    .headers(headersUC23_0),
                            http("request_19")
                                    .get("/build/6889.3f713c69.js")
                                    .headers(headersUC23_0),
                            http("request_20")
                                    .get("/build/7729.67d87565.js")
                                    .headers(headersUC23_0),
                            http("request_21")
                                    .get("/build/8981.bc50772a.js")
                                    .headers(headersUC23_0),
                            http("request_22")
                                    .get("/build/3734.2c5e1582.js")
                                    .headers(headersUC23_0),
                            http("request_23")
                                    .get("/build/9154.f1370752.js")
                                    .headers(headersUC23_0),
                            http("request_24")
                                    .get("/build/1676.2634f191.js")
                                    .headers(headersUC23_0),
                            http("request_25")
                                    .get("/build/shtadopm_app_footer.9745ecad.js")
                                    .headers(headersUC23_0),
                            http("request_26")
                                    .get("/build/images/shtadopm/favicon/site.webmanifest")
                                    .headers(headersUC23_0),
                            http("request_27")
                                    .get("/build/images/shtadopm/favicon/favicon.ico")
                                    .headers(headersUC23_0),
                            http("request_28")
                                    .get(UC23_uri1 + "/metrika/metrika_match.html")
                                    .headers(headersUC23_28),
                            http("request_29")
                                    .get(UC23_uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Fv-moskve-nachalsya-nabor-v-korpus-nablyudateley-na-sentyabrskie-vybory&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A89968758%3Az%3A300%3Ai%3A20240823191656%3Aet%3A1724422617%3Ac%3A1%3Arn%3A191653744%3Arqn%3A113%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C541%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724422616388%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422617%3At%3A%D0%92%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5%20%D0%BD%D0%B0%D1%87%D0%B0%D0%BB%D1%81%D1%8F%20%D0%BD%D0%B0%D0%B1%D0%BE%D1%80%20%D0%B2%20%D0%9A%D0%BE%D1%80%D0%BF%D1%83%D1%81%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B0%D1%82%D0%B5%D0%BB%D0%B5%D0%B9%20%D0%BD%D0%B0%20%D1%81%D0%B5%D0%BD%D1%82%D1%8F%D0%B1%D1%80%D1%8C%D1%81%D0%BA%D0%B8%D0%B5%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D1%8B&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                    .headers(headersUC23_29),
                            http("request_30")
                                    .get(UC23_uri1 + "/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Fv-moskve-nachalsya-nabor-v-korpus-nablyudateley-na-sentyabrskie-vybory&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A1%3Als%3A1333638796513%3Ahid%3A89968758%3Az%3A300%3Ai%3A20240823191657%3Aet%3A1724422617%3Ac%3A1%3Arn%3A552777082%3Arqn%3A32%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A599%3Awv%3A2%3Ads%3A0%2C0%2C541%2C31%2C1%2C0%2C%2C55%2C%2C%2C%2C%2C629%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724422616388%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422617%3At%3A%D0%92%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5%20%D0%BD%D0%B0%D1%87%D0%B0%D0%BB%D1%81%D1%8F%20%D0%BD%D0%B0%D0%B1%D0%BE%D1%80%20%D0%B2%20%D0%9A%D0%BE%D1%80%D0%BF%D1%83%D1%81%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B0%D1%82%D0%B5%D0%BB%D0%B5%D0%B9%20%D0%BD%D0%B0%20%D1%81%D0%B5%D0%BD%D1%82%D1%8F%D0%B1%D1%80%D1%8C%D1%81%D0%BA%D0%B8%D0%B5%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D1%8B&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
                                    .headers(headersUC23_29),
                            http("request_31")
                                    .post(UC23_uri1 + "/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Fv-moskve-nachalsya-nabor-v-korpus-nablyudateley-na-sentyabrskie-vybory&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724422621_b8cdb7ff3ec74681ab83befb7409c60cc035d14988cbca71fd7e44b548e3dd86&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A1%3Als%3A1333638796513%3Ahid%3A89968758%3Az%3A300%3Ai%3A20240823191701%3Aet%3A1724422621%3Ac%3A1%3Arn%3A290535406%3Arqn%3A33%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C5%2C641%2C641%2C1%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724422616388%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422621&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)aw(0)rcm(0)cdl(na)eco(16851712)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
                                    .headers(headersUC23_31)
                    )
    );
HttpProtocolBuilder httpProtocol_News5 = http
    .baseUrl("https://shtab.opmoscow.ru")
    .inferHtmlResources()
    ;

Map<CharSequence, String> headersUC24_0 = new HashMap<>();
headersUC24_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC24_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC24_0.put("sec-ch-ua-mobile", "?0");
headersUC24_0.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC24_13 = new HashMap<>();
headersUC24_13.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headersUC24_13.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC24_13.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC24_13.put("priority", "u=0, i");
headersUC24_13.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC24_13.put("sec-ch-ua-mobile", "?0");
headersUC24_13.put("sec-ch-ua-platform", "Linux");
headersUC24_13.put("sec-fetch-dest", "document");
headersUC24_13.put("sec-fetch-mode", "navigate");
headersUC24_13.put("sec-fetch-site", "same-origin");
headersUC24_13.put("sec-fetch-user", "?1");
headersUC24_13.put("upgrade-insecure-requests", "1");
headersUC24_13.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC24_26 = new HashMap<>();
headersUC24_26.put("Upgrade-Insecure-Requests", "1");
headersUC24_26.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC24_26.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC24_26.put("sec-ch-ua-mobile", "?0");
headersUC24_26.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC24_27 = new HashMap<>();
headersUC24_27.put("accept", "*/*");
headersUC24_27.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC24_27.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC24_27.put("origin", "https://shtab.opmoscow.ru");
headersUC24_27.put("priority", "u=1, i");
headersUC24_27.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC24_27.put("sec-ch-ua-mobile", "?0");
headersUC24_27.put("sec-ch-ua-platform", "Linux");
headersUC24_27.put("sec-fetch-dest", "empty");
headersUC24_27.put("sec-fetch-mode", "cors");
headersUC24_27.put("sec-fetch-site", "cross-site");
headersUC24_27.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC24_29 = new HashMap<>();
headersUC24_29.put("accept", "*/*");
headersUC24_29.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC24_29.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC24_29.put("origin", "https://shtab.opmoscow.ru");
headersUC24_29.put("priority", "u=4, i");
headersUC24_29.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC24_29.put("sec-ch-ua-mobile", "?0");
headersUC24_29.put("sec-ch-ua-platform", "Linux");
headersUC24_29.put("sec-fetch-dest", "empty");
headersUC24_29.put("sec-fetch-mode", "no-cors");
headersUC24_29.put("sec-fetch-site", "cross-site");
headersUC24_29.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

String UC24_uri1 = "https://mc.yandex.ru";

//String uri3 = "https://yastatic.net";

ScenarioBuilder scnUC24 = scenario("News5")
    .exec(
            http("request_0")
                    .get("/build/5758.f38a32ed.css")
                    .headers(headersUC24_0)
                    .resources(
                            http("request_1")
                                    .get("/build/6395.76430bbc.css")
                                    .headers(headersUC24_0),
                            http("request_2")
                                    .get("/build/8886.31d6cfe0.css")
                                    .headers(headersUC24_0),
                            http("request_3")
                                    .get("/build/shtadopm_css_head.dfe3f750.css")
                                    .headers(headersUC24_0),
                            http("request_4")
                                    .get("/build/runtime.aaa04269.js")
                                    .headers(headersUC24_0),
                            http("request_5")
                                    .get("/build/9755.89d0240d.js")
                                    .headers(headersUC24_0),
                            http("request_6")
                                    .get("/build/shtadopm_app_head.a800bb8d.js")
                                    .headers(headersUC24_0),
                            http("request_7")
                                    .get("/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
                                    .headers(headersUC24_0),
                            http("request_8")
                                    .get("/build/images/shtadopm/menu-arrow.svg")
                                    .headers(headersUC24_0),
                            http("request_9")
                                    .get(UC24_uri1 + "/metrika/tag.js")
                                    .headers(headersUC24_0),
                            http("request_10")
                                    .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                            http("request_11")
                                    .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                            http("request_12")
                                    .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                            http("request_13")
                                    .get("/news/view/vse-o-vyborah--2024-moskvicham-rasskazali-o-proverennyh-informacionnyh-resursah")
                                    .headers(headersUC24_13),
                            http("request_14")
                                    .get(uri3 + "/es5-shims/0.0.2/es5-shims.min.js")
                                    .headers(headersUC24_0),
                            http("request_15")
                                    .get(uri3 + "/share2/share.js")
                                    .headers(headersUC24_0),
                            http("request_16")
                                    .get("/build/7255.871eb160.js")
                                    .headers(headersUC24_0),
                            http("request_17")
                                    .get("/build/6889.3f713c69.js")
                                    .headers(headersUC24_0),
                            http("request_18")
                                    .get("/build/7729.67d87565.js")
                                    .headers(headersUC24_0),
                            http("request_19")
                                    .get("/build/8981.bc50772a.js")
                                    .headers(headersUC24_0),
                            http("request_20")
                                    .get("/build/3734.2c5e1582.js")
                                    .headers(headersUC24_0),
                            http("request_21")
                                    .get("/build/9154.f1370752.js")
                                    .headers(headersUC24_0),
                            http("request_22")
                                    .get("/build/1676.2634f191.js")
                                    .headers(headersUC24_0),
                            http("request_23")
                                    .get("/build/shtadopm_app_footer.9745ecad.js")
                                    .headers(headersUC24_0),
                            http("request_24")
                                    .get("/build/images/shtadopm/favicon/site.webmanifest")
                                    .headers(headersUC24_0),
                            http("request_25")
                                    .get("/build/images/shtadopm/favicon/favicon.ico")
                                    .headers(headersUC24_0),
                            http("request_26")
                                    .get(UC24_uri1 + "/metrika/metrika_match.html")
                                    .headers(headersUC24_26),
                            http("request_27")
                                    .get(UC24_uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Fvse-o-vyborah--2024-moskvicham-rasskazali-o-proverennyh-informacionnyh-resursah&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A261492663%3Az%3A300%3Ai%3A20240823191616%3Aet%3A1724422577%3Ac%3A1%3Arn%3A533457641%3Arqn%3A111%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C474%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724422576391%3Anp%3ATGludXggeDg2XzY0%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422577%3At%3A%D0%92%D1%81%D0%B5%20%D0%BE%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D1%85%20%E2%80%93%202024%3A%20%D0%BC%D0%BE%D1%81%D0%BA%D0%B2%D0%B8%D1%87%D0%B0%D0%BC%20%D1%80%D0%B0%D1%81%D1%81%D0%BA%D0%B0%D0%B7%D0%B0%D0%BB%D0%B8%20%D0%BE%20%D0%BF%D1%80%D0%BE%D0%B2%D0%B5%D1%80%D0%B5%D0%BD%D0%BD%D1%8B%D1%85%20%D0%B8%D0%BD%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%86%D0%B8%D0%BE%D0%BD%D0%BD%D1%8B%D1%85%20%D1%80%D0%B5%D1%81%D1%83%D1%80%D1%81%D0%B0%D1%85&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                    .headers(headersUC24_27),
                            http("request_28")
                                    .get(UC24_uri1 + "/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Fvse-o-vyborah--2024-moskvicham-rasskazali-o-proverennyh-informacionnyh-resursah&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A1%3Als%3A1333638796513%3Ahid%3A261492663%3Az%3A300%3Ai%3A20240823191616%3Aet%3A1724422577%3Ac%3A1%3Arn%3A58762029%3Arqn%3A28%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C474%2C36%2C1%2C0%2C%2C34%2C%2C%2C%2C%2C546%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724422576391%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422577%3At%3A%D0%92%D1%81%D0%B5%20%D0%BE%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D1%85%20%E2%80%93%202024%3A%20%D0%BC%D0%BE%D1%81%D0%BA%D0%B2%D0%B8%D1%87%D0%B0%D0%BC%20%D1%80%D0%B0%D1%81%D1%81%D0%BA%D0%B0%D0%B7%D0%B0%D0%BB%D0%B8%20%D0%BE%20%D0%BF%D1%80%D0%BE%D0%B2%D0%B5%D1%80%D0%B5%D0%BD%D0%BD%D1%8B%D1%85%20%D0%B8%D0%BD%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%86%D0%B8%D0%BE%D0%BD%D0%BD%D1%8B%D1%85%20%D1%80%D0%B5%D1%81%D1%83%D1%80%D1%81%D0%B0%D1%85&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
                                    .headers(headersUC24_27),
                            http("request_29")
                                    .post(UC24_uri1 + "/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Fvse-o-vyborah--2024-moskvicham-rasskazali-o-proverennyh-informacionnyh-resursah&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724422586_92c007ab1bfead604c16ccf3f292a8f9a895665f8101bced5b9687a3b77d1cb3&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A1%3Als%3A1333638796513%3Ahid%3A261492663%3Az%3A300%3Ai%3A20240823191626%3Aet%3A1724422586%3Ac%3A1%3Arn%3A626502863%3Arqn%3A29%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A533%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C5%2C558%2C558%2C0%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724422576391%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422586&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)aw(1)rcm(0)cdl(na)eco(16851712)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
                                    .headers(headersUC24_29)
                    )
    );


HttpProtocolBuilder httpProtocol_News20231 = http
    .baseUrl("https://shtab.opmoscow.ru")
    .inferHtmlResources()
    ;

Map<CharSequence, String> headersUC26_0 = new HashMap<>();
headersUC26_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headersUC26_0.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC26_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC26_0.put("priority", "u=0, i");
headersUC26_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC26_0.put("sec-ch-ua-mobile", "?0");
headersUC26_0.put("sec-ch-ua-platform", "Linux");
headersUC26_0.put("sec-fetch-dest", "document");
headersUC26_0.put("sec-fetch-mode", "navigate");
headersUC26_0.put("sec-fetch-site", "same-origin");
headersUC26_0.put("sec-fetch-user", "?1");
headersUC26_0.put("upgrade-insecure-requests", "1");
headersUC26_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC26_1 = new HashMap<>();
headersUC26_1.put("accept", "*/*");
headersUC26_1.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC26_1.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC26_1.put("content-type", "text/plain");
headersUC26_1.put("origin", "https://shtab.opmoscow.ru");
headersUC26_1.put("priority", "u=1, i");
headersUC26_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC26_1.put("sec-ch-ua-mobile", "?0");
headersUC26_1.put("sec-ch-ua-platform", "Linux");
headersUC26_1.put("sec-fetch-dest", "empty");
headersUC26_1.put("sec-fetch-mode", "cors");
headersUC26_1.put("sec-fetch-site", "cross-site");
headersUC26_1.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC26_2 = new HashMap<>();
headersUC26_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC26_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC26_2.put("sec-ch-ua-mobile", "?0");
headersUC26_2.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC26_7 = new HashMap<>();
headersUC26_7.put("Upgrade-Insecure-Requests", "1");
headersUC26_7.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC26_7.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC26_7.put("sec-ch-ua-mobile", "?0");
headersUC26_7.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC26_8 = new HashMap<>();
headersUC26_8.put("accept", "*/*");
headersUC26_8.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC26_8.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC26_8.put("origin", "https://shtab.opmoscow.ru");
headersUC26_8.put("priority", "u=1, i");
headersUC26_8.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC26_8.put("sec-ch-ua-mobile", "?0");
headersUC26_8.put("sec-ch-ua-platform", "Linux");
headersUC26_8.put("sec-fetch-dest", "empty");
headersUC26_8.put("sec-fetch-mode", "cors");
headersUC26_8.put("sec-fetch-site", "cross-site");
headersUC26_8.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC26_10 = new HashMap<>();
headersUC26_10.put("accept", "*/*");
headersUC26_10.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC26_10.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC26_10.put("origin", "https://shtab.opmoscow.ru");
headersUC26_10.put("priority", "u=4, i");
headersUC26_10.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC26_10.put("sec-ch-ua-mobile", "?0");
headersUC26_10.put("sec-ch-ua-platform", "Linux");
headersUC26_10.put("sec-fetch-dest", "empty");
headersUC26_10.put("sec-fetch-mode", "no-cors");
headersUC26_10.put("sec-fetch-site", "cross-site");
headersUC26_10.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

String UC26_uri1 = "https://mc.yandex.ru";

ScenarioBuilder scnUC26 = scenario("Archive.News20231")
    .exec(
            http("request_0")
                    .get("/obshchestvennyy-shtab-po-vyboram-2023/news/view/zavershen-podschet-golosov-na-vyborah-mera-moskvy")
                    .headers(headersUC26_0)
                    .resources(
                            http("request_1")
                                    .post(UC26_uri1 + "/webvisor/89667203?wv-part=2&wv-type=7&wmode=0&wv-hit=596786393&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023%2Fnews%2Fview%2Fzavershen-podschet-golosov-na-vyborah-mera-moskvy&rn=289880447&browser-info=we%3A1%3Aet%3A1724482203%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824115002%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724482203&t=gdpr(14)ti(1)")
                                    .headers(headersUC26_1)
                                    .body(RawFileBody("news20231/0001_request.gif")),
                            http("request_2")
                                    .get(UC26_uri1 + "/metrika/tag.js")
                                    .headers(headersUC26_2),
                            http("request_3")
                                    .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                            http("request_4")
                                    .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                            http("request_5")
                                    .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                            http("request_6")
                                    .get("/build/images/shtadopm/favicon/site.webmanifest")
                                    .headers(headersUC26_2),
                            http("request_7")
                                    .get(UC26_uri1 + "/metrika/metrika_match.html")
                                    .headers(headersUC26_7),
                            http("request_8")
                                    .get(UC26_uri1 + "/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023%2Fnews%2Fview%2Fzavershen-podschet-golosov-na-vyborah-mera-moskvy&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A400210036%3Az%3A300%3Ai%3A20240824115005%3Aet%3A1724482205%3Ac%3A1%3Arn%3A499767618%3Arqn%3A49%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C650%2C2%2C1%2C0%2C%2C188%2C%2C%2C%2C%2C842%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482204528%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482205%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)lt(6300)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
                                    .headers(headersUC26_8),
                            http("request_9")
                                    .get(UC26_uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023%2Fnews%2Fview%2Fzavershen-podschet-golosov-na-vyborah-mera-moskvy&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A400210036%3Az%3A300%3Ai%3A20240824115005%3Aet%3A1724482205%3Ac%3A1%3Arn%3A297664445%3Arqn%3A139%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C650%2C2%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482204528%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482205%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                    .headers(headersUC26_8),
                            http("request_10")
                                    .post(UC26_uri1 + "/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023%2Fnews%2Fview%2Fzavershen-podschet-golosov-na-vyborah-mera-moskvy&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724482205_c4a778d1f73f202dbb3b0ba3aaa1b694cf9802d465b6f0f4980e99bb8f162fe0&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A400210036%3Az%3A300%3Ai%3A20240824115005%3Aet%3A1724482206%3Ac%3A1%3Arn%3A688148573%3Arqn%3A50%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A914%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C11%2C865%2C865%2C0%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482204528%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482206&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)lt(6300)aw(1)rcm(0)cdl(na)eco(16851712)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
                                    .headers(headersUC26_10)
                    )
    );
HttpProtocolBuilder httpProtocol_News20232 = http
    .baseUrl("https://mc.yandex.ru")
    .inferHtmlResources()
    ;

Map<CharSequence, String> headersUC27_0 = new HashMap<>();
headersUC27_0.put("accept", "*/*");
headersUC27_0.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC27_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC27_0.put("content-type", "text/plain");
headersUC27_0.put("origin", "https://shtab.opmoscow.ru");
headersUC27_0.put("priority", "u=1, i");
headersUC27_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC27_0.put("sec-ch-ua-mobile", "?0");
headersUC27_0.put("sec-ch-ua-platform", "Linux");
headersUC27_0.put("sec-fetch-dest", "empty");
headersUC27_0.put("sec-fetch-mode", "cors");
headersUC27_0.put("sec-fetch-site", "cross-site");
headersUC27_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC27_1 = new HashMap<>();
headersUC27_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC27_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC27_1.put("sec-ch-ua-mobile", "?0");
headersUC27_1.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC27_25 = new HashMap<>();
headersUC27_25.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headersUC27_25.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC27_25.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC27_25.put("priority", "u=0, i");
headersUC27_25.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC27_25.put("sec-ch-ua-mobile", "?0");
headersUC27_25.put("sec-ch-ua-platform", "Linux");
headersUC27_25.put("sec-fetch-dest", "document");
headersUC27_25.put("sec-fetch-mode", "navigate");
headersUC27_25.put("sec-fetch-site", "same-origin");
headersUC27_25.put("sec-fetch-user", "?1");
headersUC27_25.put("upgrade-insecure-requests", "1");
headersUC27_25.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC27_32 = new HashMap<>();
headersUC27_32.put("Upgrade-Insecure-Requests", "1");
headersUC27_32.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC27_32.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC27_32.put("sec-ch-ua-mobile", "?0");
headersUC27_32.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC27_33 = new HashMap<>();
headersUC27_33.put("accept", "*/*");
headersUC27_33.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC27_33.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC27_33.put("origin", "https://shtab.opmoscow.ru");
headersUC27_33.put("priority", "u=1, i");
headersUC27_33.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC27_33.put("sec-ch-ua-mobile", "?0");
headersUC27_33.put("sec-ch-ua-platform", "Linux");
headersUC27_33.put("sec-fetch-dest", "empty");
headersUC27_33.put("sec-fetch-mode", "cors");
headersUC27_33.put("sec-fetch-site", "cross-site");
headersUC27_33.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC27_35 = new HashMap<>();
headersUC27_35.put("accept", "*/*");
headersUC27_35.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC27_35.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC27_35.put("origin", "https://shtab.opmoscow.ru");
headersUC27_35.put("priority", "u=4, i");
headersUC27_35.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC27_35.put("sec-ch-ua-mobile", "?0");
headersUC27_35.put("sec-ch-ua-platform", "Linux");
headersUC27_35.put("sec-fetch-dest", "empty");
headersUC27_35.put("sec-fetch-mode", "no-cors");
headersUC27_35.put("sec-fetch-site", "cross-site");
headersUC27_35.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

String UC27_uri2 = "https://shtab.opmoscow.ru";

//String uri3 = "https://yastatic.net";

ScenarioBuilder scnUC27 = scenario("Archive.News20232")
    .exec(
            http("request_0")
                    .post("/webvisor/89667203?wv-part=4&wv-type=7&wmode=0&wv-hit=83869153&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023%2Fnews%2Fview%2Fv-moskve-obyavili-o-polnoy-gotovnosti-sistemy-elektronnogo-golosovaniya-k-vyboram&rn=89417915&browser-info=we%3A1%3Aet%3A1724482268%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824115108%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724482268&t=gdpr(14)ti(1)")
                    .headers(headersUC27_0)
//                    .body(RawFileBody("news20232/0000_request.gif"))
                    .resources(
                            http("request_1")
                                    .get(UC27_uri2 + "/build/5758.f38a32ed.css")
                                    .headers(headersUC27_1),
                            http("request_2")
                                    .get(UC27_uri2 + "/build/6395.76430bbc.css")
                                    .headers(headersUC27_1),
                            http("request_3")
                                    .get(UC27_uri2 + "/build/8886.31d6cfe0.css")
                                    .headers(headersUC27_1),
                            http("request_4")
                                    .get(UC27_uri2 + "/build/shtadopm_css_head.dfe3f750.css")
                                    .headers(headersUC27_1),
                            http("request_5")
                                    .get(UC27_uri2 + "/build/runtime.aaa04269.js")
                                    .headers(headersUC27_1),
                            http("request_6")
                                    .get(UC27_uri2 + "/build/9755.89d0240d.js")
                                    .headers(headersUC27_1),
                            http("request_7")
                                    .get(UC27_uri2 + "/build/shtadopm_app_head.a800bb8d.js")
                                    .headers(headersUC27_1),
                            http("request_8")
                                    .get(UC27_uri2 + "/uploads/media/default/0002/08/eaeb42854c5147ecd4db172ab7aa6a48cf0de830.png")
                                    .headers(headersUC27_1),
                            http("request_9")
                                    .get(UC27_uri2 + "/build/images/shtadopm/menu-arrow.svg")
                                    .headers(headersUC27_1),
                            http("request_10")
                                    .get(UC27_uri2 + "/cache/0/4/b/d/9/04bd967b220c4d7ba96a243fa3a2cd85dab12d47.jpeg")
                                    .headers(headersUC27_1),
                            http("request_11")
                                    .get(UC27_uri2 + "/cache/d/8/e/a/c/d8eac64df3da4a11551d3de1b44a7928f322ae4d.jpeg")
                                    .headers(headersUC27_1),
                            http("request_12")
                                    .get(UC27_uri2 + "/cache/b/b/4/5/d/bb45db0c4eecede8319a25ddc2ac0a30eba43315.jpeg")
                                    .headers(headersUC27_1),
                            http("request_13")
                                    .get(UC27_uri2 + "/cache/f/f/8/a/3/ff8a339e18525cf0bf96ee0234f8ae2e1de0600b.jpeg")
                                    .headers(headersUC27_1),
                            http("request_14")
                                    .get(uri3 + "/es5-shims/0.0.2/es5-shims.min.js")
                                    .headers(headersUC27_1),
                            http("request_15")
                                    .get(uri3 + "/share2/share.js")
                                    .headers(headersUC27_1),
                            http("request_16")
                                    .get(UC27_uri2 + "/build/7255.871eb160.js")
                                    .headers(headersUC27_1),
                            http("request_17")
                                    .get(UC27_uri2 + "/build/6889.3f713c69.js")
                                    .headers(headersUC27_1),
                            http("request_18")
                                    .get(UC27_uri2 + "/build/7729.67d87565.js")
                                    .headers(headersUC27_1),
                            http("request_19")
                                    .get(UC27_uri2 + "/build/8981.bc50772a.js")
                                    .headers(headersUC27_1),
                            http("request_20")
                                    .get(UC27_uri2 + "/build/3734.2c5e1582.js")
                                    .headers(headersUC27_1),
                            http("request_21")
                                    .get(UC27_uri2 + "/build/9154.f1370752.js")
                                    .headers(headersUC27_1),
                            http("request_22")
                                    .get(UC27_uri2 + "/build/1676.2634f191.js")
                                    .headers(headersUC27_1),
                            http("request_23")
                                    .get(UC27_uri2 + "/build/shtadopm_app_footer.9745ecad.js")
                                    .headers(headersUC27_1),
                            http("request_24")
                                    .get("/metrika/tag.js")
                                    .headers(headersUC27_1),
                            http("request_25")
                                    .get(UC27_uri2 + "/obshchestvennyy-shtab-po-vyboram-2023/news/view/v-moskve-obyavili-o-polnoy-gotovnosti-sistemy-elektronnogo-golosovaniya-k-vyboram")
                                    .headers(headersUC27_25),
                            http("request_26")
                                    .get(UC27_uri2 + "/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
                            http("request_27")
                                    .get(UC27_uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                            http("request_28")
                                    .get(UC27_uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                            http("request_29")
                                    .get(UC27_uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                            http("request_30")
                                    .get(UC27_uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
                                    .headers(headersUC27_1),
                            http("request_31")
                                    .get(UC27_uri2 + "/build/images/shtadopm/favicon/favicon.ico")
                                    .headers(headersUC27_1),
                            http("request_32")
                                    .get("/metrika/metrika_match.html")
                                    .headers(headersUC27_32),
                            http("request_33")
                                    .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023%2Fnews%2Fview%2Fv-moskve-obyavili-o-polnoy-gotovnosti-sistemy-elektronnogo-golosovaniya-k-vyboram&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A487408600%3Az%3A300%3Ai%3A20240824115110%3Aet%3A1724482270%3Ac%3A1%3Arn%3A852597922%3Arqn%3A145%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C426%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482269649%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482270%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                    .headers(headersUC27_33),
                            http("request_34")
                                    .get("/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023%2Fnews%2Fview%2Fv-moskve-obyavili-o-polnoy-gotovnosti-sistemy-elektronnogo-golosovaniya-k-vyboram&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A487408600%3Az%3A300%3Ai%3A20240824115110%3Aet%3A1724482270%3Ac%3A1%3Arn%3A462649981%3Arqn%3A61%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C426%2C101%2C1%2C0%2C%2C93%2C%2C%2C%2C%2C623%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482269649%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482270%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)lt(6100)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
                                    .headers(headersUC27_33),
                            http("request_35")
                                    .post("/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023%2Fnews%2Fview%2Fv-moskve-obyavili-o-polnoy-gotovnosti-sistemy-elektronnogo-golosovaniya-k-vyboram&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724482270_fa384098155bec186af50fe5fb91851dc2e9918a5ca23bd16b01ebb51f91f286&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A487408600%3Az%3A300%3Ai%3A20240824115110%3Aet%3A1724482271%3Ac%3A1%3Arn%3A1020860224%3Arqn%3A62%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A617%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C12%2C667%2C667%2C1%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724482269649%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482271&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)lt(6100)aw(1)rcm(0)cdl(na)eco(16851712)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
                                    .headers(headersUC27_35)
                    )
    );
HttpProtocolBuilder httpProtocol_News20233 = http
    .baseUrl("https://shtab.opmoscow.ru")
    .inferHtmlResources()
    ;

Map<CharSequence, String> headersUC28_0 = new HashMap<>();
headersUC28_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headersUC28_0.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC28_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC28_0.put("priority", "u=0, i");
headersUC28_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC28_0.put("sec-ch-ua-mobile", "?0");
headersUC28_0.put("sec-ch-ua-platform", "Linux");
headersUC28_0.put("sec-fetch-dest", "document");
headersUC28_0.put("sec-fetch-mode", "navigate");
headersUC28_0.put("sec-fetch-site", "same-origin");
headersUC28_0.put("sec-fetch-user", "?1");
headersUC28_0.put("upgrade-insecure-requests", "1");
headersUC28_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC28_1 = new HashMap<>();
headersUC28_1.put("accept", "*/*");
headersUC28_1.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC28_1.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC28_1.put("content-type", "text/plain");
headersUC28_1.put("origin", "https://shtab.opmoscow.ru");
headersUC28_1.put("priority", "u=1, i");
headersUC28_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC28_1.put("sec-ch-ua-mobile", "?0");
headersUC28_1.put("sec-ch-ua-platform", "Linux");
headersUC28_1.put("sec-fetch-dest", "empty");
headersUC28_1.put("sec-fetch-mode", "cors");
headersUC28_1.put("sec-fetch-site", "cross-site");
headersUC28_1.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC28_2 = new HashMap<>();
headersUC28_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC28_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC28_2.put("sec-ch-ua-mobile", "?0");
headersUC28_2.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC28_8 = new HashMap<>();
headersUC28_8.put("Upgrade-Insecure-Requests", "1");
headersUC28_8.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC28_8.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC28_8.put("sec-ch-ua-mobile", "?0");
headersUC28_8.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC28_9 = new HashMap<>();
headersUC28_9.put("accept", "*/*");
headersUC28_9.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC28_9.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC28_9.put("origin", "https://shtab.opmoscow.ru");
headersUC28_9.put("priority", "u=1, i");
headersUC28_9.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC28_9.put("sec-ch-ua-mobile", "?0");
headersUC28_9.put("sec-ch-ua-platform", "Linux");
headersUC28_9.put("sec-fetch-dest", "empty");
headersUC28_9.put("sec-fetch-mode", "cors");
headersUC28_9.put("sec-fetch-site", "cross-site");
headersUC28_9.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC28_11 = new HashMap<>();
headersUC28_11.put("accept", "*/*");
headersUC28_11.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC28_11.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC28_11.put("origin", "https://shtab.opmoscow.ru");
headersUC28_11.put("priority", "u=4, i");
headersUC28_11.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC28_11.put("sec-ch-ua-mobile", "?0");
headersUC28_11.put("sec-ch-ua-platform", "Linux");
headersUC28_11.put("sec-fetch-dest", "empty");
headersUC28_11.put("sec-fetch-mode", "no-cors");
headersUC28_11.put("sec-fetch-site", "cross-site");
headersUC28_11.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

String UC28_uri1 = "https://mc.yandex.ru";

ScenarioBuilder scnUC28 = scenario("Archive.News20233")
    .exec(
            http("request_0")
                    .get("/obshchestvennyy-shtab-po-vyboram-2023/news/view/korpus-nablyudateley-sformirovan-k-nemu-prisoedinilis-bolee-11-000-moskvichey-")
                    .headers(headersUC28_0)
                    .resources(
                            http("request_1")
                                    .post(UC28_uri1 + "/webvisor/89667203?wv-part=2&wv-type=7&wmode=0&wv-hit=413260420&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023%2Fnews%2Fview%2Fkorpus-nablyudateley-sformirovan-k-nemu-prisoedinilis-bolee-11-000-moskvichey-&rn=820307563&browser-info=we%3A1%3Aet%3A1724482328%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824115208%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724482328&t=gdpr(14)ti(1)")
                                    .headers(headersUC28_1)
                                    .body(RawFileBody("news20233/0001_request.gif")),
                            http("request_2")
                                    .get(UC28_uri1 + "/metrika/tag.js")
                                    .headers(headersUC28_2),
                            http("request_3")
                                    .get("/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
                            http("request_4")
                                    .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                            http("request_5")
                                    .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                            http("request_6")
                                    .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                            http("request_7")
                                    .get("/build/images/shtadopm/favicon/site.webmanifest")
                                    .headers(headersUC28_2),
                            http("request_8")
                                    .get(UC28_uri1 + "/metrika/metrika_match.html")
                                    .headers(headersUC28_8),
                            http("request_9")
                                    .get(UC28_uri1 + "/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023%2Fnews%2Fview%2Fkorpus-nablyudateley-sformirovan-k-nemu-prisoedinilis-bolee-11-000-moskvichey-&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A286918698%3Az%3A300%3Ai%3A20240824115209%3Aet%3A1724482330%3Ac%3A1%3Arn%3A407718939%3Arqn%3A69%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A593%3Awv%3A2%3Ads%3A0%2C0%2C405%2C2%2C1%2C0%2C%2C206%2C%2C%2C%2C%2C616%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482329087%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482330%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)lt(6800)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
                                    .headers(headersUC28_9),
                            http("request_10")
                                    .get(UC28_uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023%2Fnews%2Fview%2Fkorpus-nablyudateley-sformirovan-k-nemu-prisoedinilis-bolee-11-000-moskvichey-&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A286918698%3Az%3A300%3Ai%3A20240824115209%3Aet%3A1724482330%3Ac%3A1%3Arn%3A525986269%3Arqn%3A150%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C405%2C2%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482329087%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482330%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                    .headers(headersUC28_9),
                            http("request_11")
                                    .post(UC28_uri1 + "/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023%2Fnews%2Fview%2Fkorpus-nablyudateley-sformirovan-k-nemu-prisoedinilis-bolee-11-000-moskvichey-&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724482329_2e001568b850cbf6b237014c349ad619b667ab2b47ed53ef8097ec3e6dcddff0&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A286918698%3Az%3A300%3Ai%3A20240824115209%3Aet%3A1724482330%3Ac%3A1%3Arn%3A1005171146%3Arqn%3A70%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C15%2C644%2C644%2C0%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482329087%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482330&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)lt(6800)aw(1)rcm(0)cdl(na)eco(16851712)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
                                    .headers(headersUC28_11)
                    )
    );
HttpProtocolBuilder httpProtocol_News20201 = http
    .baseUrl("https://mc.yandex.ru")
    .inferHtmlResources()
    ;

Map<CharSequence, String> headersUC32_0 = new HashMap<>();
headersUC32_0.put("accept", "*/*");
headersUC32_0.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC32_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC32_0.put("content-type", "text/plain");
headersUC32_0.put("origin", "https://shtab.opmoscow.ru");
headersUC32_0.put("priority", "u=1, i");
headersUC32_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC32_0.put("sec-ch-ua-mobile", "?0");
headersUC32_0.put("sec-ch-ua-platform", "Linux");
headersUC32_0.put("sec-fetch-dest", "empty");
headersUC32_0.put("sec-fetch-mode", "cors");
headersUC32_0.put("sec-fetch-site", "cross-site");
headersUC32_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC32_1 = new HashMap<>();
headersUC32_1.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headersUC32_1.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC32_1.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC32_1.put("priority", "u=0, i");
headersUC32_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC32_1.put("sec-ch-ua-mobile", "?0");
headersUC32_1.put("sec-ch-ua-platform", "Linux");
headersUC32_1.put("sec-fetch-dest", "document");
headersUC32_1.put("sec-fetch-mode", "navigate");
headersUC32_1.put("sec-fetch-site", "same-origin");
headersUC32_1.put("sec-fetch-user", "?1");
headersUC32_1.put("upgrade-insecure-requests", "1");
headersUC32_1.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC32_2 = new HashMap<>();
headersUC32_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC32_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC32_2.put("sec-ch-ua-mobile", "?0");
headersUC32_2.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC32_45 = new HashMap<>();
headersUC32_45.put("Upgrade-Insecure-Requests", "1");
headersUC32_45.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC32_45.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC32_45.put("sec-ch-ua-mobile", "?0");
headersUC32_45.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC32_46 = new HashMap<>();
headersUC32_46.put("accept", "*/*");
headersUC32_46.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC32_46.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC32_46.put("origin", "https://shtab.opmoscow.ru");
headersUC32_46.put("priority", "u=1, i");
headersUC32_46.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC32_46.put("sec-ch-ua-mobile", "?0");
headersUC32_46.put("sec-ch-ua-platform", "Linux");
headersUC32_46.put("sec-fetch-dest", "empty");
headersUC32_46.put("sec-fetch-mode", "cors");
headersUC32_46.put("sec-fetch-site", "cross-site");
headersUC32_46.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC32_48 = new HashMap<>();
headersUC32_48.put("accept", "*/*");
headersUC32_48.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC32_48.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC32_48.put("origin", "https://shtab.opmoscow.ru");
headersUC32_48.put("priority", "u=4, i");
headersUC32_48.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC32_48.put("sec-ch-ua-mobile", "?0");
headersUC32_48.put("sec-ch-ua-platform", "Linux");
headersUC32_48.put("sec-fetch-dest", "empty");
headersUC32_48.put("sec-fetch-mode", "no-cors");
headersUC32_48.put("sec-fetch-site", "cross-site");
headersUC32_48.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

String UC32_uri2 = "https://shtab.opmoscow.ru";

//String uri3 = "https://yastatic.net";

ScenarioBuilder scnUC32 = scenario("Archive.News20201")
    .exec(
            http("request_0")
                    .post("/webvisor/89667203?wv-part=2&wv-type=7&wmode=0&wv-hit=451458334&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020%2Fnews%2Fview%2Fobshchestvennyy-shtab-rezultaty-tradicionnogo-golosovaniya-podtverdili-vybor-elektronnyh-izbirateley&rn=917482600&browser-info=we%3A1%3Aet%3A1724482602%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824115642%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724482602&t=gdpr(14)ti(1)")
                    .headers(headersUC32_0)
//                    .body(RawFileBody("news20201/0000_request.gif"))
                    .resources(
                            http("request_1")
                                    .get(UC32_uri2 + "/obshchestvennyy-shtab-po-vyboram-09-2020/news/view/obshchestvennyy-shtab-rezultaty-tradicionnogo-golosovaniya-podtverdili-vybor-elektronnyh-izbirateley")
                                    .headers(headersUC32_1),
                            http("request_2")
                                    .get(UC32_uri2 + "/build/5758.f38a32ed.css")
                                    .headers(headersUC32_2),
                            http("request_3")
                                    .get(UC32_uri2 + "/build/6395.76430bbc.css")
                                    .headers(headersUC32_2),
                            http("request_4")
                                    .get(UC32_uri2 + "/build/8886.31d6cfe0.css")
                                    .headers(headersUC32_2),
                            http("request_5")
                                    .get(UC32_uri2 + "/build/shtadopm_css_head.dfe3f750.css")
                                    .headers(headersUC32_2),
                            http("request_6")
                                    .get(UC32_uri2 + "/build/runtime.aaa04269.js")
                                    .headers(headersUC32_2),
                            http("request_7")
                                    .get(UC32_uri2 + "/build/9755.89d0240d.js")
                                    .headers(headersUC32_2),
                            http("request_8")
                                    .get(UC32_uri2 + "/build/shtadopm_app_head.a800bb8d.js")
                                    .headers(headersUC32_2),
                            http("request_9")
                                    .get(UC32_uri2 + "/uploads/media/default/0001/17/fd8989ee232a5bcc0b5e27147745db79c5a9a874.png")
                                    .headers(headersUC32_2),
                            http("request_10")
                                    .get(UC32_uri2 + "/build/images/shtadopm/menu-arrow.svg")
                                    .headers(headersUC32_2),
                            http("request_11")
                                    .get(UC32_uri2 + "/cache/6/3/0/b/9/630b99d3daf0a1a119530a0d31c92cde1fd5d47f.jpeg")
                                    .headers(headersUC32_2),
                            http("request_12")
                                    .get(UC32_uri2 + "/cache/a/8/9/0/6/a890650742d2a376e707f60bd15c61b46b6c7e5e.jpeg")
                                    .headers(headersUC32_2),
                            http("request_13")
                                    .get(UC32_uri2 + "/cache/7/5/d/c/d/75dcdaf47c5ec3bb491bdbe716a7a02652b47479.jpeg")
                                    .headers(headersUC32_2),
                            http("request_14")
                                    .get(UC32_uri2 + "/cache/1/d/1/5/7/1d1571cff098a9fcfdb7f42d131812d857d9aead.jpeg")
                                    .headers(headersUC32_2),
                            http("request_15")
                                    .get(UC32_uri2 + "/cache/8/7/8/a/2/878a23c8a034812650d046cc3931976788dcc9e0.jpeg")
                                    .headers(headersUC32_2),
                            http("request_16")
                                    .get(UC32_uri2 + "/cache/d/e/b/7/d/deb7dc8cf81bb714cb9978dd76b0b5292632cfb2.jpeg")
                                    .headers(headersUC32_2),
                            http("request_17")
                                    .get(UC32_uri2 + "/cache/9/8/d/6/a/98d6ad4ff3a904a3b61bcb0740a99445d2dd0f51.jpeg")
                                    .headers(headersUC32_2),
                            http("request_18")
                                    .get(UC32_uri2 + "/cache/1/6/0/b/2/160b206e8c9e9b5300e407d575a137423fd055ed.jpeg")
                                    .headers(headersUC32_2),
                            http("request_19")
                                    .get(UC32_uri2 + "/cache/2/b/d/f/5/2bdf5310207655a8519a4958327ff372034609aa.jpeg")
                                    .headers(headersUC32_2),
                            http("request_20")
                                    .get(UC32_uri2 + "/cache/b/8/7/b/7/b87b718ed133a2548a2721e7952af34a72d0be0d.jpeg")
                                    .headers(headersUC32_2),
                            http("request_21")
                                    .get(UC32_uri2 + "/cache/9/d/e/c/e/9dece5a5f4e8aef45d490c2a649f2ff959f02bb7.jpeg")
                                    .headers(headersUC32_2),
                            http("request_22")
                                    .get(UC32_uri2 + "/cache/d/5/2/d/1/d52d1eaa1e489a625a5a6ccfcd59de13a88c8829.jpeg")
                                    .headers(headersUC32_2),
                            http("request_23")
                                    .get(UC32_uri2 + "/cache/f/1/1/8/5/f11852c12ff92bc9e17621be16844a1b683dacf7.jpeg")
                                    .headers(headersUC32_2),
                            http("request_24")
                                    .get(UC32_uri2 + "/cache/3/1/0/b/6/310b624c75604b8b916f5a0484a951f4d91b4a61.jpeg")
                                    .headers(headersUC32_2),
                            http("request_25")
                                    .get(UC32_uri2 + "/cache/d/0/c/1/0/d0c10757dddbd00ba2f0023cacc6b24cddac7cbf.jpeg")
                                    .headers(headersUC32_2),
                            http("request_26")
                                    .get(UC32_uri2 + "/cache/4/9/f/9/e/49f9e2ef858135beda52fa28336cb3b07bf2305e.jpeg")
                                    .headers(headersUC32_2),
                            http("request_27")
                                    .get(uri3 + "/es5-shims/0.0.2/es5-shims.min.js")
                                    .headers(headersUC32_2),
                            http("request_28")
                                    .get(uri3 + "/share2/share.js")
                                    .headers(headersUC32_2),
                            http("request_29")
                                    .get(UC32_uri2 + "/build/7255.871eb160.js")
                                    .headers(headersUC32_2),
                            http("request_30")
                                    .get(UC32_uri2 + "/build/6889.3f713c69.js")
                                    .headers(headersUC32_2),
                            http("request_31")
                                    .get(UC32_uri2 + "/build/7729.67d87565.js")
                                    .headers(headersUC32_2),
                            http("request_32")
                                    .get(UC32_uri2 + "/build/8981.bc50772a.js")
                                    .headers(headersUC32_2),
                            http("request_33")
                                    .get(UC32_uri2 + "/build/3734.2c5e1582.js")
                                    .headers(headersUC32_2),
                            http("request_34")
                                    .get(UC32_uri2 + "/build/9154.f1370752.js")
                                    .headers(headersUC32_2),
                            http("request_35")
                                    .get(UC32_uri2 + "/build/1676.2634f191.js")
                                    .headers(headersUC32_2),
                            http("request_36")
                                    .get(UC32_uri2 + "/build/shtadopm_app_footer.9745ecad.js")
                                    .headers(headersUC32_2),
                            http("request_37")
                                    .get("/metrika/tag.js")
                                    .headers(headersUC32_2),
                            http("request_38")
                                    .get(UC32_uri2 + "/build/fonts/subset-Montserrat-BoldItalic.d7b1ec9e.woff2"),
                            http("request_39")
                                    .get(UC32_uri2 + "/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
                            http("request_40")
                                    .get(UC32_uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                            http("request_41")
                                    .get(UC32_uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                            http("request_42")
                                    .get(UC32_uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                            http("request_43")
                                    .get(UC32_uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
                                    .headers(headersUC32_2),
                            http("request_44")
                                    .get(UC32_uri2 + "/build/images/shtadopm/favicon/favicon.ico")
                                    .headers(headersUC32_2),
                            http("request_45")
                                    .get("/metrika/metrika_match.html")
                                    .headers(headersUC32_45),
                            http("request_46")
                                    .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020%2Fnews%2Fview%2Fobshchestvennyy-shtab-rezultaty-tradicionnogo-golosovaniya-podtverdili-vybor-elektronnyh-izbirateley&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A69111172%3Az%3A300%3Ai%3A20240824115644%3Aet%3A1724482605%3Ac%3A1%3Arn%3A330626482%3Arqn%3A161%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C464%2C20%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482604133%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482605%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                    .headers(headersUC32_46),
                            http("request_47")
                                    .get("/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020%2Fnews%2Fview%2Fobshchestvennyy-shtab-rezultaty-tradicionnogo-golosovaniya-podtverdili-vybor-elektronnyh-izbirateley&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A69111172%3Az%3A300%3Ai%3A20240824115644%3Aet%3A1724482605%3Ac%3A1%3Arn%3A333426535%3Arqn%3A79%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A643%3Awv%3A2%3Ads%3A0%2C0%2C464%2C20%2C1%2C0%2C%2C173%2C%2C%2C%2C%2C660%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482604133%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482605%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)lt(6000)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
                                    .headers(headersUC32_46),
                            http("request_48")
                                    .post("/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020%2Fnews%2Fview%2Fobshchestvennyy-shtab-rezultaty-tradicionnogo-golosovaniya-podtverdili-vybor-elektronnyh-izbirateley&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724482604_d55c9454fcaaacff85e6f85ce201bd0dbff283135257030cb025dfd28de0c09d&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A69111172%3Az%3A300%3Ai%3A20240824115645%3Aet%3A1724482605%3Ac%3A1%3Arn%3A1039128199%3Arqn%3A80%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C12%2C707%2C707%2C2%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724482604133%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482605&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)lt(6000)aw(1)rcm(0)cdl(na)eco(16851712)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
                                    .headers(headersUC32_48)
                    )
    );

HttpProtocolBuilder httpProtocol_News20202 = http
    .baseUrl("https://shtab.opmoscow.ru")
    .inferHtmlResources()
    ;

Map<CharSequence, String> headersUC33_0 = new HashMap<>();
headersUC33_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headersUC33_0.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC33_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC33_0.put("priority", "u=0, i");
headersUC33_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC33_0.put("sec-ch-ua-mobile", "?0");
headersUC33_0.put("sec-ch-ua-platform", "Linux");
headersUC33_0.put("sec-fetch-dest", "document");
headersUC33_0.put("sec-fetch-mode", "navigate");
headersUC33_0.put("sec-fetch-site", "same-origin");
headersUC33_0.put("sec-fetch-user", "?1");
headersUC33_0.put("upgrade-insecure-requests", "1");
headersUC33_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC33_1 = new HashMap<>();
headersUC33_1.put("accept", "*/*");
headersUC33_1.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC33_1.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC33_1.put("content-type", "text/plain");
headersUC33_1.put("origin", "https://shtab.opmoscow.ru");
headersUC33_1.put("priority", "u=1, i");
headersUC33_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC33_1.put("sec-ch-ua-mobile", "?0");
headersUC33_1.put("sec-ch-ua-platform", "Linux");
headersUC33_1.put("sec-fetch-dest", "empty");
headersUC33_1.put("sec-fetch-mode", "cors");
headersUC33_1.put("sec-fetch-site", "cross-site");
headersUC33_1.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC33_2 = new HashMap<>();
headersUC33_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC33_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC33_2.put("sec-ch-ua-mobile", "?0");
headersUC33_2.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC33_9 = new HashMap<>();
headersUC33_9.put("accept", "*/*");
headersUC33_9.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC33_9.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC33_9.put("origin", "https://shtab.opmoscow.ru");
headersUC33_9.put("priority", "u=1, i");
headersUC33_9.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC33_9.put("sec-ch-ua-mobile", "?0");
headersUC33_9.put("sec-ch-ua-platform", "Linux");
headersUC33_9.put("sec-fetch-dest", "empty");
headersUC33_9.put("sec-fetch-mode", "cors");
headersUC33_9.put("sec-fetch-site", "cross-site");
headersUC33_9.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC33_11 = new HashMap<>();
headersUC33_11.put("Upgrade-Insecure-Requests", "1");
headersUC33_11.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC33_11.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC33_11.put("sec-ch-ua-mobile", "?0");
headersUC33_11.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC33_12 = new HashMap<>();
headersUC33_12.put("accept", "*/*");
headersUC33_12.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC33_12.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC33_12.put("origin", "https://shtab.opmoscow.ru");
headersUC33_12.put("priority", "u=4, i");
headersUC33_12.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC33_12.put("sec-ch-ua-mobile", "?0");
headersUC33_12.put("sec-ch-ua-platform", "Linux");
headersUC33_12.put("sec-fetch-dest", "empty");
headersUC33_12.put("sec-fetch-mode", "no-cors");
headersUC33_12.put("sec-fetch-site", "cross-site");
headersUC33_12.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

String UC33_uri1 = "https://mc.yandex.ru";

ScenarioBuilder scnUC33 = scenario("Archive.News20202")
    .exec(
            http("request_0")
                    .get("/obshchestvennyy-shtab-po-vyboram-09-2020/news/view/v-stolice-zavershilos-elektronnoe-golosovanie-na-dovyborah-municipalnyh-deputatov")
                    .headers(headersUC33_0)
                    .resources(
                            http("request_1")
                                    .post(UC33_uri1 + "/webvisor/89667203?wv-part=2&wv-type=7&wmode=0&wv-hit=644420890&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020%2Fnews%2Fview%2Fv-stolice-zavershilos-elektronnoe-golosovanie-na-dovyborah-municipalnyh-deputatov&rn=983216524&browser-info=we%3A1%3Aet%3A1724482630%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824115709%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724482630&t=gdpr(14)ti(1)")
                                    .headers(headersUC33_1)
                                    .body(RawFileBody("news20202/0001_request.gif")),
                            http("request_2")
                                    .get(UC33_uri1 + "/metrika/tag.js")
                                    .headers(headersUC33_2),
                            http("request_3")
                                    .get("/build/fonts/subset-Montserrat-BoldItalic.d7b1ec9e.woff2"),
                            http("request_4")
                                    .get("/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
                            http("request_5")
                                    .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                            http("request_6")
                                    .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                            http("request_7")
                                    .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                            http("request_8")
                                    .get("/build/images/shtadopm/favicon/site.webmanifest")
                                    .headers(headersUC33_2),
                            http("request_9")
                                    .get(UC33_uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020%2Fnews%2Fview%2Fv-stolice-zavershilos-elektronnoe-golosovanie-na-dovyborah-municipalnyh-deputatov&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A657200468%3Az%3A300%3Ai%3A20240824115711%3Aet%3A1724482632%3Ac%3A1%3Arn%3A137646466%3Arqn%3A163%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C470%2C2%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482631369%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482632%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                    .headers(headersUC33_9),
                            http("request_10")
                                    .get(UC33_uri1 + "/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020%2Fnews%2Fview%2Fv-stolice-zavershilos-elektronnoe-golosovanie-na-dovyborah-municipalnyh-deputatov&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A657200468%3Az%3A300%3Ai%3A20240824115712%3Aet%3A1724482632%3Ac%3A1%3Arn%3A747846782%3Arqn%3A83%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A656%3Awv%3A2%3Ads%3A0%2C0%2C470%2C2%2C1%2C0%2C%2C208%2C%2C%2C%2C%2C682%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482631369%3Anp%3ATGludXggeDg2XzY0%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482632%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)lt(7400)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
                                    .headers(headersUC33_9),
                            http("request_11")
                                    .get(UC33_uri1 + "/metrika/metrika_match.html")
                                    .headers(headersUC33_11),
                            http("request_12")
                                    .post(UC33_uri1 + "/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020%2Fnews%2Fview%2Fv-stolice-zavershilos-elektronnoe-golosovanie-na-dovyborah-municipalnyh-deputatov&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724482632_d535f0a848ea5a28ff456e41318ba238e35051fa758554a870896f86fa901984&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A657200468%3Az%3A300%3Ai%3A20240824115712%3Aet%3A1724482632%3Ac%3A1%3Arn%3A25922425%3Arqn%3A84%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C14%2C726%2C726%2C1%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724482631369%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482632&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)lt(7400)aw(1)rcm(0)cdl(na)eco(16851712)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
                                    .headers(headersUC33_12)
                    )
    );

HttpProtocolBuilder httpProtocol_News20203 = http
    .baseUrl("https://shtab.opmoscow.ru")
    .inferHtmlResources()
    ;

Map<CharSequence, String> headersUC34_0 = new HashMap<>();
headersUC34_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headersUC34_0.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC34_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC34_0.put("priority", "u=0, i");
headersUC34_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC34_0.put("sec-ch-ua-mobile", "?0");
headersUC34_0.put("sec-ch-ua-platform", "Linux");
headersUC34_0.put("sec-fetch-dest", "document");
headersUC34_0.put("sec-fetch-mode", "navigate");
headersUC34_0.put("sec-fetch-site", "same-origin");
headersUC34_0.put("sec-fetch-user", "?1");
headersUC34_0.put("upgrade-insecure-requests", "1");
headersUC34_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC34_1 = new HashMap<>();
headersUC34_1.put("accept", "*/*");
headersUC34_1.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC34_1.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC34_1.put("content-type", "text/plain");
headersUC34_1.put("origin", "https://shtab.opmoscow.ru");
headersUC34_1.put("priority", "u=1, i");
headersUC34_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC34_1.put("sec-ch-ua-mobile", "?0");
headersUC34_1.put("sec-ch-ua-platform", "Linux");
headersUC34_1.put("sec-fetch-dest", "empty");
headersUC34_1.put("sec-fetch-mode", "cors");
headersUC34_1.put("sec-fetch-site", "cross-site");
headersUC34_1.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC34_2 = new HashMap<>();
headersUC34_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC34_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC34_2.put("sec-ch-ua-mobile", "?0");
headersUC34_2.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC34_9 = new HashMap<>();
headersUC34_9.put("accept", "*/*");
headersUC34_9.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC34_9.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC34_9.put("origin", "https://shtab.opmoscow.ru");
headersUC34_9.put("priority", "u=1, i");
headersUC34_9.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC34_9.put("sec-ch-ua-mobile", "?0");
headersUC34_9.put("sec-ch-ua-platform", "Linux");
headersUC34_9.put("sec-fetch-dest", "empty");
headersUC34_9.put("sec-fetch-mode", "cors");
headersUC34_9.put("sec-fetch-site", "cross-site");
headersUC34_9.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC34_11 = new HashMap<>();
headersUC34_11.put("Upgrade-Insecure-Requests", "1");
headersUC34_11.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC34_11.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC34_11.put("sec-ch-ua-mobile", "?0");
headersUC34_11.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC34_12 = new HashMap<>();
headersUC34_12.put("accept", "*/*");
headersUC34_12.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC34_12.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC34_12.put("origin", "https://shtab.opmoscow.ru");
headersUC34_12.put("priority", "u=4, i");
headersUC34_12.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC34_12.put("sec-ch-ua-mobile", "?0");
headersUC34_12.put("sec-ch-ua-platform", "Linux");
headersUC34_12.put("sec-fetch-dest", "empty");
headersUC34_12.put("sec-fetch-mode", "no-cors");
headersUC34_12.put("sec-fetch-site", "cross-site");
headersUC34_12.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

String UC34_uri1 = "https://mc.yandex.ru";

ScenarioBuilder scnUC34 = scenario("Archive.News20203")
    .exec(
            http("request_0")
                    .get("/obshchestvennyy-shtab-po-vyboram-09-2020/news/view/v-stolice-zavershilos-elektronnoe-golosovanie-na-dovyborah-municipalnyh-deputatov")
                    .headers(headersUC34_0)
                    .resources(
                            http("request_1")
                                    .post(UC34_uri1 + "/webvisor/89667203?wv-part=2&wv-type=7&wmode=0&wv-hit=644420890&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020%2Fnews%2Fview%2Fv-stolice-zavershilos-elektronnoe-golosovanie-na-dovyborah-municipalnyh-deputatov&rn=983216524&browser-info=we%3A1%3Aet%3A1724482630%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824115709%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724482630&t=gdpr(14)ti(1)")
                                    .headers(headersUC34_1)
                                    .body(RawFileBody("news20203/0001_request.gif")),
                            http("request_2")
                                    .get(UC34_uri1 + "/metrika/tag.js")
                                    .headers(headersUC34_2),
                            http("request_3")
                                    .get("/build/fonts/subset-Montserrat-BoldItalic.d7b1ec9e.woff2"),
                            http("request_4")
                                    .get("/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
                            http("request_5")
                                    .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                            http("request_6")
                                    .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                            http("request_7")
                                    .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                            http("request_8")
                                    .get("/build/images/shtadopm/favicon/site.webmanifest")
                                    .headers(headersUC34_2),
                            http("request_9")
                                    .get(UC34_uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020%2Fnews%2Fview%2Fv-stolice-zavershilos-elektronnoe-golosovanie-na-dovyborah-municipalnyh-deputatov&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A657200468%3Az%3A300%3Ai%3A20240824115711%3Aet%3A1724482632%3Ac%3A1%3Arn%3A137646466%3Arqn%3A163%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C470%2C2%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482631369%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482632%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                    .headers(headersUC34_9),
                            http("request_10")
                                    .get(UC34_uri1 + "/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020%2Fnews%2Fview%2Fv-stolice-zavershilos-elektronnoe-golosovanie-na-dovyborah-municipalnyh-deputatov&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A657200468%3Az%3A300%3Ai%3A20240824115712%3Aet%3A1724482632%3Ac%3A1%3Arn%3A747846782%3Arqn%3A83%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A656%3Awv%3A2%3Ads%3A0%2C0%2C470%2C2%2C1%2C0%2C%2C208%2C%2C%2C%2C%2C682%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482631369%3Anp%3ATGludXggeDg2XzY0%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482632%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)lt(7400)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
                                    .headers(headersUC34_9),
                            http("request_11")
                                    .get(UC34_uri1 + "/metrika/metrika_match.html")
                                    .headers(headersUC34_11),
                            http("request_12")
                                    .post(UC34_uri1 + "/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020%2Fnews%2Fview%2Fv-stolice-zavershilos-elektronnoe-golosovanie-na-dovyborah-municipalnyh-deputatov&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724482632_d535f0a848ea5a28ff456e41318ba238e35051fa758554a870896f86fa901984&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A657200468%3Az%3A300%3Ai%3A20240824115712%3Aet%3A1724482632%3Ac%3A1%3Arn%3A25922425%3Arqn%3A84%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C14%2C726%2C726%2C1%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724482631369%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482632&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)lt(7400)aw(1)rcm(0)cdl(na)eco(16851712)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
                                    .headers(headersUC34_12)
                    )
    );
HttpProtocolBuilder httpProtocol_News20181 = http
    .baseUrl("https://mc.yandex.ru")
    .inferHtmlResources()
    ;

Map<CharSequence, String> headersUC37_0 = new HashMap<>();
headersUC37_0.put("accept", "*/*");
headersUC37_0.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC37_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC37_0.put("content-type", "text/plain");
headersUC37_0.put("origin", "https://shtab.opmoscow.ru");
headersUC37_0.put("priority", "u=1, i");
headersUC37_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC37_0.put("sec-ch-ua-mobile", "?0");
headersUC37_0.put("sec-ch-ua-platform", "Linux");
headersUC37_0.put("sec-fetch-dest", "empty");
headersUC37_0.put("sec-fetch-mode", "cors");
headersUC37_0.put("sec-fetch-site", "cross-site");
headersUC37_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC37_1 = new HashMap<>();
headersUC37_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC37_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC37_1.put("sec-ch-ua-mobile", "?0");
headersUC37_1.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC37_14 = new HashMap<>();
headersUC37_14.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headersUC37_14.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC37_14.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC37_14.put("priority", "u=0, i");
headersUC37_14.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC37_14.put("sec-ch-ua-mobile", "?0");
headersUC37_14.put("sec-ch-ua-platform", "Linux");
headersUC37_14.put("sec-fetch-dest", "document");
headersUC37_14.put("sec-fetch-mode", "navigate");
headersUC37_14.put("sec-fetch-site", "same-origin");
headersUC37_14.put("sec-fetch-user", "?1");
headersUC37_14.put("upgrade-insecure-requests", "1");
headersUC37_14.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC37_29 = new HashMap<>();
headersUC37_29.put("Upgrade-Insecure-Requests", "1");
headersUC37_29.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC37_29.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC37_29.put("sec-ch-ua-mobile", "?0");
headersUC37_29.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC37_30 = new HashMap<>();
headersUC37_30.put("accept", "*/*");
headersUC37_30.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC37_30.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC37_30.put("origin", "https://shtab.opmoscow.ru");
headersUC37_30.put("priority", "u=1, i");
headersUC37_30.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC37_30.put("sec-ch-ua-mobile", "?0");
headersUC37_30.put("sec-ch-ua-platform", "Linux");
headersUC37_30.put("sec-fetch-dest", "empty");
headersUC37_30.put("sec-fetch-mode", "cors");
headersUC37_30.put("sec-fetch-site", "cross-site");
headersUC37_30.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC37_32 = new HashMap<>();
headersUC37_32.put("accept", "*/*");
headersUC37_32.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC37_32.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC37_32.put("origin", "https://shtab.opmoscow.ru");
headersUC37_32.put("priority", "u=4, i");
headersUC37_32.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC37_32.put("sec-ch-ua-mobile", "?0");
headersUC37_32.put("sec-ch-ua-platform", "Linux");
headersUC37_32.put("sec-fetch-dest", "empty");
headersUC37_32.put("sec-fetch-mode", "no-cors");
headersUC37_32.put("sec-fetch-site", "cross-site");
headersUC37_32.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

String UC37_uri2 = "https://shtab.opmoscow.ru";

//String uri3 = "https://yastatic.net";

ScenarioBuilder scnUC37 = scenario("Archive.News20181")
    .exec(
            http("request_0")
                    .post("/webvisor/89667203?wv-part=5&wv-type=7&wmode=0&wv-hit=823493627&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fkonstantin-remchukov-korpusu-nablyudateley-obshchestvennoy-palaty-goroda-moskvy-udalos-obespechit-monitoring-prakticheski-na-vseh-izbiratelnyh-uchastkah-stolicy-snachala-eto-kazalos-nevozmozhnym-&rn=670749817&browser-info=we%3A1%3Aet%3A1724483083%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824120443%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724483083&t=gdpr(14)ti(1)")
                    .headers(headersUC37_0)
//                    .body(RawFileBody("news20181/0000_request.gif"))
                    .resources(
                            http("request_1")
                                    .get(UC37_uri2 + "/build/5758.f38a32ed.css")
                                    .headers(headersUC37_1),
                            http("request_2")
                                    .get(UC37_uri2 + "/build/6395.76430bbc.css")
                                    .headers(headersUC37_1),
                            http("request_3")
                                    .get(UC37_uri2 + "/build/8886.31d6cfe0.css")
                                    .headers(headersUC37_1),
                            http("request_4")
                                    .get(UC37_uri2 + "/build/shtadopm_css_head.dfe3f750.css")
                                    .headers(headersUC37_1),
                            http("request_5")
                                    .get(UC37_uri2 + "/build/runtime.aaa04269.js")
                                    .headers(headersUC37_1),
                            http("request_6")
                                    .get(UC37_uri2 + "/build/9755.89d0240d.js")
                                    .headers(headersUC37_1),
                            http("request_7")
                                    .get(UC37_uri2 + "/build/shtadopm_app_head.a800bb8d.js")
                                    .headers(headersUC37_1),
                            http("request_8")
                                    .get(UC37_uri2 + "/uploads/media/default/0001/17/4bd9b9fe185a7be5441247e5d48c32d33bbd3e7e.png")
                                    .headers(headersUC37_1),
                            http("request_9")
                                    .get(UC37_uri2 + "/build/images/shtadopm/menu-arrow.svg")
                                    .headers(headersUC37_1),
                            http("request_10")
                                    .get("/metrika/tag.js")
                                    .headers(headersUC37_1),
                            http("request_11")
                                    .get(UC37_uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                            http("request_12")
                                    .get(UC37_uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                            http("request_13")
                                    .get(UC37_uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                            http("request_14")
                                    .get(UC37_uri2 + "/obshchestvennyy-shtab-po-vyboram-2018/news/view/konstantin-remchukov-korpusu-nablyudateley-obshchestvennoy-palaty-goroda-moskvy-udalos-obespechit-monitoring-prakticheski-na-vseh-izbiratelnyh-uchastkah-stolicy-snachala-eto-kazalos-nevozmozhnym-")
                                    .headers(headersUC37_14),
                            http("request_15")
                                    .get(UC37_uri2 + "/uploads/media/default/0001/13/12f5bc97bf8d9321e7c56cf24935c23f2d8d61eb.jpeg")
                                    .headers(headersUC37_1),
                            http("request_16")
                                    .get(UC37_uri2 + "/uploads/media/default/0001/13/714a0bbfdc6c523163eab4f8296fef1fa2d63b25.jpeg")
                                    .headers(headersUC37_1),
                            http("request_17")
                                    .get(uri3 + "/es5-shims/0.0.2/es5-shims.min.js")
                                    .headers(headersUC37_1),
                            http("request_18")
                                    .get(uri3 + "/share2/share.js")
                                    .headers(headersUC37_1),
                            http("request_19")
                                    .get(UC37_uri2 + "/build/7255.871eb160.js")
                                    .headers(headersUC37_1),
                            http("request_20")
                                    .get(UC37_uri2 + "/build/6889.3f713c69.js")
                                    .headers(headersUC37_1),
                            http("request_21")
                                    .get(UC37_uri2 + "/build/7729.67d87565.js")
                                    .headers(headersUC37_1),
                            http("request_22")
                                    .get(UC37_uri2 + "/build/8981.bc50772a.js")
                                    .headers(headersUC37_1),
                            http("request_23")
                                    .get(UC37_uri2 + "/build/3734.2c5e1582.js")
                                    .headers(headersUC37_1),
                            http("request_24")
                                    .get(UC37_uri2 + "/build/9154.f1370752.js")
                                    .headers(headersUC37_1),
                            http("request_25")
                                    .get(UC37_uri2 + "/build/1676.2634f191.js")
                                    .headers(headersUC37_1),
                            http("request_26")
                                    .get(UC37_uri2 + "/build/shtadopm_app_footer.9745ecad.js")
                                    .headers(headersUC37_1),
                            http("request_27")
                                    .get(UC37_uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
                                    .headers(headersUC37_1),
                            http("request_28")
                                    .get(UC37_uri2 + "/build/images/shtadopm/favicon/favicon.ico")
                                    .headers(headersUC37_1),
                            http("request_29")
                                    .get("/metrika/metrika_match.html")
                                    .headers(headersUC37_29),
                            http("request_30")
                                    .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fkonstantin-remchukov-korpusu-nablyudateley-obshchestvennoy-palaty-goroda-moskvy-udalos-obespechit-monitoring-prakticheski-na-vseh-izbiratelnyh-uchastkah-stolicy-snachala-eto-kazalos-nevozmozhnym-&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A313913233%3Az%3A300%3Ai%3A20240824120444%3Aet%3A1724483085%3Ac%3A1%3Arn%3A169391289%3Arqn%3A179%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C425%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483084081%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483085%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                    .headers(headersUC37_30),
                            http("request_31")
                                    .get("/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fkonstantin-remchukov-korpusu-nablyudateley-obshchestvennoy-palaty-goroda-moskvy-udalos-obespechit-monitoring-prakticheski-na-vseh-izbiratelnyh-uchastkah-stolicy-snachala-eto-kazalos-nevozmozhnym-&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A313913233%3Az%3A300%3Ai%3A20240824120444%3Aet%3A1724483085%3Ac%3A1%3Arn%3A366779033%3Arqn%3A99%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A580%3Awv%3A2%3Ads%3A0%2C0%2C425%2C242%2C1%2C0%2C%2C68%2C%2C%2C%2C%2C739%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483084081%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483085%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)lt(6400)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
                                    .headers(headersUC37_30),
                            http("request_32")
                                    .post("/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fkonstantin-remchukov-korpusu-nablyudateley-obshchestvennoy-palaty-goroda-moskvy-udalos-obespechit-monitoring-prakticheski-na-vseh-izbiratelnyh-uchastkah-stolicy-snachala-eto-kazalos-nevozmozhnym-&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724483085_e2990ecd18d694b43b5007da5ec7c902269258500983baeb82db231644b7a37d&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A313913233%3Az%3A300%3Ai%3A20240824120445%3Aet%3A1724483085%3Ac%3A1%3Arn%3A378978882%3Arqn%3A100%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C15%2C767%2C767%2C0%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724483084081%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483085&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)lt(6400)aw(1)rcm(0)cdl(na)eco(16851712)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
                                    .headers(headersUC37_32)
                    )
    );

HttpProtocolBuilder httpProtocol_News20182 = http
    .baseUrl("https://mc.yandex.ru")
    .inferHtmlResources()
    ;

Map<CharSequence, String> headerssUC380 = new HashMap<>();
headerssUC380.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headerssUC380.put("accept-encoding", "gzip, deflate, br, zstd");
headerssUC380.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headerssUC380.put("priority", "u=0, i");
headerssUC380.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headerssUC380.put("sec-ch-ua-mobile", "?0");
headerssUC380.put("sec-ch-ua-platform", "Linux");
headerssUC380.put("sec-fetch-dest", "document");
headerssUC380.put("sec-fetch-mode", "navigate");
headerssUC380.put("sec-fetch-site", "same-origin");
headerssUC380.put("sec-fetch-user", "?1");
headerssUC380.put("upgrade-insecure-requests", "1");
headerssUC380.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headerssUC381 = new HashMap<>();
headerssUC381.put("accept", "*/*");
headerssUC381.put("accept-encoding", "gzip, deflate, br, zstd");
headerssUC381.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headerssUC381.put("content-type", "text/plain");
headerssUC381.put("origin", "https://shtab.opmoscow.ru");
headerssUC381.put("priority", "u=1, i");
headerssUC381.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headerssUC381.put("sec-ch-ua-mobile", "?0");
headerssUC381.put("sec-ch-ua-platform", "Linux");
headerssUC381.put("sec-fetch-dest", "empty");
headerssUC381.put("sec-fetch-mode", "cors");
headerssUC381.put("sec-fetch-site", "cross-site");
headerssUC381.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headerssUC382 = new HashMap<>();
headerssUC382.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headerssUC382.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headerssUC382.put("sec-ch-ua-mobile", "?0");
headerssUC382.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headerssUC386 = new HashMap<>();
headerssUC386.put("Upgrade-Insecure-Requests", "1");
headerssUC386.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headerssUC386.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headerssUC386.put("sec-ch-ua-mobile", "?0");
headerssUC386.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headerssUC387 = new HashMap<>();
headerssUC387.put("accept", "*/*");
headerssUC387.put("accept-encoding", "gzip, deflate, br, zstd");
headerssUC387.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headerssUC387.put("origin", "https://shtab.opmoscow.ru");
headerssUC387.put("priority", "u=1, i");
headerssUC387.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headerssUC387.put("sec-ch-ua-mobile", "?0");
headerssUC387.put("sec-ch-ua-platform", "Linux");
headerssUC387.put("sec-fetch-dest", "empty");
headerssUC387.put("sec-fetch-mode", "cors");
headerssUC387.put("sec-fetch-site", "cross-site");
headerssUC387.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC38_10 = new HashMap<>();
headersUC38_10.put("accept", "*/*");
headersUC38_10.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC38_10.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC38_10.put("origin", "https://shtab.opmoscow.ru");
headersUC38_10.put("priority", "u=4, i");
headersUC38_10.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC38_10.put("sec-ch-ua-mobile", "?0");
headersUC38_10.put("sec-ch-ua-platform", "Linux");
headersUC38_10.put("sec-fetch-dest", "empty");
headersUC38_10.put("sec-fetch-mode", "no-cors");
headersUC38_10.put("sec-fetch-site", "cross-site");
headersUC38_10.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

String UC38_uri2 = "https://shtab.opmoscow.ru";

ScenarioBuilder scnUC38 = scenario("Archive.News20182")
    .exec(
            http("request_0")
                    .get(UC38_uri2 + "/obshchestvennyy-shtab-po-vyboram-2018/news/view/mobilnaya-gruppa-obshchestvennogo-shtaba-proverila-soobshchenie-o-prinuzhdenii-k-golosovaniyu-sotrudnikov-mosgortransa")
                    .headers(headerssUC380)
                    .resources(
                            http("request_1")
                                    .post("/webvisor/89667203?wv-part=6&wv-type=7&wmode=0&wv-hit=96065233&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fmobilnaya-gruppa-obshchestvennogo-shtaba-proverila-soobshchenie-o-prinuzhdenii-k-golosovaniyu-sotrudnikov-mosgortransa&rn=780355716&browser-info=we%3A1%3Aet%3A1724483171%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824120610%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724483171&t=gdpr(14)ti(1)")
                                    .headers(headerssUC381)
                                    .body(RawFileBody("news20182/0001_request.gif")),
                            http("request_2")
                                    .get("/metrika/tag.js")
                                    .headers(headerssUC382),
                            http("request_3")
                                    .get(UC38_uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                            http("request_4")
                                    .get(UC38_uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                            http("request_5")
                                    .get(UC38_uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                            http("request_6")
                                    .get("/metrika/metrika_match.html")
                                    .headers(headerssUC386),
                            http("request_7")
                                    .get("/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fmobilnaya-gruppa-obshchestvennogo-shtaba-proverila-soobshchenie-o-prinuzhdenii-k-golosovaniyu-sotrudnikov-mosgortransa&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A728613432%3Az%3A300%3Ai%3A20240824120611%3Aet%3A1724483172%3Ac%3A1%3Arn%3A710449737%3Arqn%3A103%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A639%3Awv%3A2%3Ads%3A0%2C0%2C444%2C3%2C2%2C0%2C%2C205%2C%2C%2C%2C%2C657%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483170850%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483172%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)lt(6400)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
                                    .headers(headerssUC387),
                            http("request_8")
                                    .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fmobilnaya-gruppa-obshchestvennogo-shtaba-proverila-soobshchenie-o-prinuzhdenii-k-golosovaniyu-sotrudnikov-mosgortransa&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A728613432%3Az%3A300%3Ai%3A20240824120611%3Aet%3A1724483171%3Ac%3A1%3Arn%3A994582280%3Arqn%3A182%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C444%2C3%2C2%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483170850%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483171%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                    .headers(headerssUC387),
                            http("request_9")
                                    .get(UC38_uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
                                    .headers(headerssUC382),
                            http("request_10")
                                    .post("/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fmobilnaya-gruppa-obshchestvennogo-shtaba-proverila-soobshchenie-o-prinuzhdenii-k-golosovaniyu-sotrudnikov-mosgortransa&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724483171_9550e802bc4901aecf7b94ad9a00071045209cca406733c9fcc2b951124f9561&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A728613432%3Az%3A300%3Ai%3A20240824120612%3Aet%3A1724483172%3Ac%3A1%3Arn%3A928848901%3Arqn%3A104%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C13%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483170850%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483172&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)lt(6400)aw(1)rcm(0)cdl(na)eco(16851712)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
                                    .headers(headersUC38_10)
                    )
    );

HttpProtocolBuilder httpProtocol_News20183 = http
    .baseUrl("https://shtab.opmoscow.ru")
    .inferHtmlResources()
    ;

Map<CharSequence, String> headersUC39_0 = new HashMap<>();
headersUC39_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC39_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC39_0.put("sec-ch-ua-mobile", "?0");
headersUC39_0.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC39_17 = new HashMap<>();
headersUC39_17.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headersUC39_17.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC39_17.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC39_17.put("priority", "u=0, i");
headersUC39_17.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC39_17.put("sec-ch-ua-mobile", "?0");
headersUC39_17.put("sec-ch-ua-platform", "Linux");
headersUC39_17.put("sec-fetch-dest", "document");
headersUC39_17.put("sec-fetch-mode", "navigate");
headersUC39_17.put("sec-fetch-site", "same-origin");
headersUC39_17.put("sec-fetch-user", "?1");
headersUC39_17.put("upgrade-insecure-requests", "1");
headersUC39_17.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC39_29 = new HashMap<>();
headersUC39_29.put("Upgrade-Insecure-Requests", "1");
headersUC39_29.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC39_29.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC39_29.put("sec-ch-ua-mobile", "?0");
headersUC39_29.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC39_30 = new HashMap<>();
headersUC39_30.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
headersUC39_30.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC39_30.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC39_30.put("priority", "i");
headersUC39_30.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC39_30.put("sec-ch-ua-mobile", "?0");
headersUC39_30.put("sec-ch-ua-platform", "Linux");
headersUC39_30.put("sec-fetch-dest", "image");
headersUC39_30.put("sec-fetch-mode", "no-cors");
headersUC39_30.put("sec-fetch-site", "same-origin");
headersUC39_30.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC39_36 = new HashMap<>();
headersUC39_36.put("accept", "*/*");
headersUC39_36.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC39_36.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC39_36.put("origin", "https://shtab.opmoscow.ru");
headersUC39_36.put("priority", "u=1, i");
headersUC39_36.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC39_36.put("sec-ch-ua-mobile", "?0");
headersUC39_36.put("sec-ch-ua-platform", "Linux");
headersUC39_36.put("sec-fetch-dest", "empty");
headersUC39_36.put("sec-fetch-mode", "cors");
headersUC39_36.put("sec-fetch-site", "cross-site");
headersUC39_36.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC39_40 = new HashMap<>();
headersUC39_40.put("accept", "*/*");
headersUC39_40.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC39_40.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC39_40.put("origin", "https://shtab.opmoscow.ru");
headersUC39_40.put("priority", "u=4, i");
headersUC39_40.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC39_40.put("sec-ch-ua-mobile", "?0");
headersUC39_40.put("sec-ch-ua-platform", "Linux");
headersUC39_40.put("sec-fetch-dest", "empty");
headersUC39_40.put("sec-fetch-mode", "no-cors");
headersUC39_40.put("sec-fetch-site", "cross-site");
headersUC39_40.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

String UC39_uri1 = "https://mc.yandex.ru";

//String uri3 = "https://yastatic.net";

ScenarioBuilder scnUC39 = scenario("Archive.News20183")
    .exec(
            http("request_0")
                    .get("/build/5758.f38a32ed.css")
                    .headers(headersUC39_0)
                    .resources(
                            http("request_1")
                                    .get("/build/6395.76430bbc.css")
                                    .headers(headersUC39_0),
                            http("request_2")
                                    .get("/build/8886.31d6cfe0.css")
                                    .headers(headersUC39_0),
                            http("request_3")
                                    .get("/build/shtadopm_css_head.dfe3f750.css")
                                    .headers(headersUC39_0),
                            http("request_4")
                                    .get("/build/runtime.aaa04269.js")
                                    .headers(headersUC39_0),
                            http("request_5")
                                    .get("/build/9755.89d0240d.js")
                                    .headers(headersUC39_0),
                            http("request_6")
                                    .get("/build/shtadopm_app_head.a800bb8d.js")
                                    .headers(headersUC39_0),
                            http("request_7")
                                    .get("/uploads/media/default/0001/17/4bd9b9fe185a7be5441247e5d48c32d33bbd3e7e.png")
                                    .headers(headersUC39_0),
                            http("request_8")
                                    .get("/build/images/shtadopm/menu-arrow.svg")
                                    .headers(headersUC39_0),
                            http("request_9")
                                    .get("/uploads/media/default/0001/13/389eb6cd8214f82e33d62b7e41a665cf76b28950.jpeg")
                                    .headers(headersUC39_0),
                            http("request_10")
                                    .get(UC39_uri1 + "/metrika/tag.js")
                                    .headers(headersUC39_0),
                            http("request_11")
                                    .get("/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
                            http("request_12")
                                    .get("/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
                            http("request_13")
                                    .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                            http("request_14")
                                    .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                            http("request_15")
                                    .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                            http("request_16")
                                    .get("/build/fonts/subset-Montserrat-SemiBoldItalic.89c710ac.woff2"),
                            http("request_17")
                                    .get("/obshchestvennyy-shtab-po-vyboram-2018/news/view/moskve-vazhen-chestnyy-rezultat-prezidentskih-vyborov")
                                    .headers(headersUC39_17),
                            http("request_18")
                                    .get("/uploads/media/default/0001/13/496992576aa979a7a1553aa91f8ec2b9f319dd94.jpeg")
                                    .headers(headersUC39_0),
                            http("request_19")
                                    .get(uri3 + "/es5-shims/0.0.2/es5-shims.min.js")
                                    .headers(headersUC39_0),
                            http("request_20")
                                    .get(uri3 + "/share2/share.js")
                                    .headers(headersUC39_0),
                            http("request_21")
                                    .get("/build/7255.871eb160.js")
                                    .headers(headersUC39_0),
                            http("request_22")
                                    .get("/build/6889.3f713c69.js")
                                    .headers(headersUC39_0),
                            http("request_23")
                                    .get("/build/7729.67d87565.js")
                                    .headers(headersUC39_0),
                            http("request_24")
                                    .get("/build/8981.bc50772a.js")
                                    .headers(headersUC39_0),
                            http("request_25")
                                    .get("/build/3734.2c5e1582.js")
                                    .headers(headersUC39_0),
                            http("request_26")
                                    .get("/build/9154.f1370752.js")
                                    .headers(headersUC39_0),
                            http("request_27")
                                    .get("/build/1676.2634f191.js")
                                    .headers(headersUC39_0),
                            http("request_28")
                                    .get("/build/shtadopm_app_footer.9745ecad.js")
                                    .headers(headersUC39_0),
                            http("request_29")
                                    .get(UC39_uri1 + "/metrika/metrika_match.html")
                                    .headers(headersUC39_29),
                            http("request_30")
                                    .get("/cache/c/7/c/4/b/c7c4b2eaf1091fa9e5de10cdacdd3877950cd464.jpeg")
                                    .headers(headersUC39_30),
                            http("request_31")
                                    .get("/cache/6/5/e/8/b/65e8b353289518328d62955193b8a2abb40dc2f4.jpeg")
                                    .headers(headersUC39_30),
                            http("request_32")
                                    .get("/cache/a/c/e/2/9/ace292356c5f6d7c559efa0ecdc72fea89b10242.jpeg")
                                    .headers(headersUC39_30),
                            http("request_33")
                                    .get("/cache/1/3/e/b/5/13eb5dc322ac1374a5fbed78d83af3ec79cab7c8.jpeg")
                                    .headers(headersUC39_30),
                            http("request_34")
                                    .get("/cache/c/e/2/3/7/ce23700e5e737b84dba12ee62e3bdf9faf3853d8.jpeg")
                                    .headers(headersUC39_30),
                            http("request_35")
                                    .get("/build/images/shtadopm/favicon/site.webmanifest")
                                    .headers(headersUC39_0),
                            http("request_36")
                                    .get(UC39_uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fmoskve-vazhen-chestnyy-rezultat-prezidentskih-vyborov&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A38282892%3Az%3A300%3Ai%3A20240824120930%3Aet%3A1724483370%3Ac%3A1%3Arn%3A918452872%3Arqn%3A190%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C464%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483369793%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483370%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                    .headers(headersUC39_36),
                            http("request_37")
                                    .get(UC39_uri1 + "/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fmoskve-vazhen-chestnyy-rezultat-prezidentskih-vyborov&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A38282892%3Az%3A300%3Ai%3A20240824120930%3Aet%3A1724483371%3Ac%3A1%3Arn%3A309435203%3Arqn%3A117%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A650%3Awv%3A2%3Ads%3A0%2C0%2C464%2C240%2C1%2C0%2C%2C59%2C%2C%2C%2C%2C767%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483369793%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483371%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)lt(6100)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
                                    .headers(headersUC39_36),
                            http("request_38")
                                    .get("/cache/c/8/f/c/8/c8fc846345814f8b6ab3e75a75533d3f26500930.jpeg")
                                    .headers(headersUC39_30),
                            http("request_39")
                                    .get("/build/images/shtadopm/favicon/favicon.ico")
                                    .headers(headersUC39_0),
                            http("request_40")
                                    .post(UC39_uri1 + "/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fmoskve-vazhen-chestnyy-rezultat-prezidentskih-vyborov&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724483370_55e69d83438e57a3c54f1946967190f3aee4592f07d7d5cdc701610f7f7883aa&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A38282892%3Az%3A300%3Ai%3A20240824120930%3Aet%3A1724483371%3Ac%3A1%3Arn%3A611013708%3Arqn%3A118%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C11%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724483369793%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483371&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)lt(6100)aw(1)rcm(0)cdl(na)eco(16851712)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
                                    .headers(headersUC39_40)
                    )
    );
//        Установки

setUp(
    scnUC20.injectClosed(
            constantConcurrentUsers(users_flood_UC20).during(40000)
    ).protocols(httpProtocol_News1)
    ,
    scnUC21.injectClosed(
            constantConcurrentUsers(users_flood_UC21).during(40000)
    ).protocols(httpProtocol_News2)
    ,
    scnUC22.injectClosed(
            constantConcurrentUsers(users_flood_UC22).during(40000)
    ).protocols(httpProtocol_News3)
    ,
    scnUC23.injectClosed(
            constantConcurrentUsers(users_flood_UC23).during(40000)
    ).protocols(httpProtocol_News4)
    ,
    scnUC24.injectClosed(
            constantConcurrentUsers(users_flood_UC24).during(40000)
    ).protocols(httpProtocol_News5)
    ,
    scnUC26.injectClosed(
            constantConcurrentUsers(users_flood_UC26).during(40000)
    ).protocols(httpProtocol_News20231)
    ,
    scnUC27.injectClosed(
            constantConcurrentUsers(users_flood_UC27).during(40000)
    ).protocols(httpProtocol_News20232)
    ,
    scnUC28.injectClosed(
            constantConcurrentUsers(users_flood_UC28).during(40000)
    ).protocols(httpProtocol_News20233)
    ,
    scnUC32.injectClosed(
            constantConcurrentUsers(users_flood_UC32).during(40000)
    ).protocols(httpProtocol_News20201)
    ,
    scnUC33.injectClosed(
            constantConcurrentUsers(users_flood_UC33).during(40000)
    ).protocols(httpProtocol_News20202)
    ,
    scnUC34.injectClosed(
            constantConcurrentUsers(users_flood_UC34).during(40000)
    ).protocols(httpProtocol_News20203)
    ,
    scnUC37.injectClosed(
            constantConcurrentUsers(users_flood_UC37).during(40000)
    ).protocols(httpProtocol_News20181)
    ,
    scnUC38.injectClosed(
            constantConcurrentUsers(users_flood_UC38).during(40000)
    ).protocols(httpProtocol_News20182)
    ,
    scnUC39.injectClosed(
            constantConcurrentUsers(users_flood_UC39).during(40000)
    ).protocols(httpProtocol_News20183)

);

}
}

