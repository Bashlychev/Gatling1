package Simulations.shtabOpMoscow;

import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import java.util.HashMap;
import java.util.Map;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.http;

public class SC01 extends Simulation {
{

int users_flood_UC01 = Integer.getInteger("users_flood_UC01", 1);
int users_flood_UC02 = Integer.getInteger("users_flood_UC02", 1);
int users_flood_UC03 = Integer.getInteger("users_flood_UC03", 1);
int users_flood_UC04 = Integer.getInteger("users_flood_UC04", 1);
int users_flood_UC05 = Integer.getInteger("users_flood_UC05", 1);
int users_flood_UC06 = Integer.getInteger("users_flood_UC06", 1);
int users_flood_UC07 = Integer.getInteger("users_flood_UC07", 1);
int users_flood_UC08 = Integer.getInteger("users_flood_UC08", 1);
int users_flood_UC09 = Integer.getInteger("users_flood_UC09", 1);
int users_flood_UC10 = Integer.getInteger("users_flood_UC10", 1);

// Scenarious


HttpProtocolBuilder httpProtocol_MainPage = http
.baseUrl("https://mc.yandex.ru")
.inferHtmlResources();

Map<CharSequence, String> headersUC01_0 = new HashMap<>();
headersUC01_0.put("accept", "*/*");
headersUC01_0.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC01_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC01_0.put("content-type", "text/plain");
headersUC01_0.put("origin", "https://shtab.opmoscow.ru");
headersUC01_0.put("priority", "u=1, i");
headersUC01_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC01_0.put("sec-ch-ua-mobile", "?0");
headersUC01_0.put("sec-ch-ua-platform", "Linux");
headersUC01_0.put("sec-fetch-dest", "empty");
headersUC01_0.put("sec-fetch-mode", "cors");
headersUC01_0.put("sec-fetch-site", "cross-site");
headersUC01_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC01_3 = new HashMap<>();
headersUC01_3.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC01_3.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC01_3.put("sec-ch-ua-mobile", "?0");
headersUC01_3.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC01_34 = new HashMap<>();
headersUC01_34.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headersUC01_34.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC01_34.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC01_34.put("priority", "u=0, i");
headersUC01_34.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC01_34.put("sec-ch-ua-mobile", "?0");
headersUC01_34.put("sec-ch-ua-platform", "Linux");
headersUC01_34.put("sec-fetch-dest", "document");
headersUC01_34.put("sec-fetch-mode", "navigate");
headersUC01_34.put("sec-fetch-site", "none");
headersUC01_34.put("sec-fetch-user", "?1");
headersUC01_34.put("upgrade-insecure-requests", "1");
headersUC01_34.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC01_56 = new HashMap<>();
headersUC01_56.put("accept", "*/*");
headersUC01_56.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC01_56.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC01_56.put("origin", "https://shtab.opmoscow.ru");
headersUC01_56.put("priority", "u=1, i");
headersUC01_56.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC01_56.put("sec-ch-ua-mobile", "?0");
headersUC01_56.put("sec-ch-ua-platform", "Linux");
headersUC01_56.put("sec-fetch-dest", "empty");
headersUC01_56.put("sec-fetch-mode", "cors");
headersUC01_56.put("sec-fetch-site", "cross-site");
headersUC01_56.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC01_57 = new HashMap<>();
headersUC01_57.put("accept", "*/*");
headersUC01_57.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC01_57.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC01_57.put("origin", "https://shtab.opmoscow.ru");
headersUC01_57.put("priority", "u=4, i");
headersUC01_57.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC01_57.put("sec-ch-ua-mobile", "?0");
headersUC01_57.put("sec-ch-ua-platform", "Linux");
headersUC01_57.put("sec-fetch-dest", "empty");
headersUC01_57.put("sec-fetch-mode", "no-cors");
headersUC01_57.put("sec-fetch-site", "cross-site");
headersUC01_57.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

String UC01_uri2 = "https://shtab.opmoscow.ru";

ScenarioBuilder scnUC01 = scenario("Projects.asafov.Projects.voteGD.com.MainPage")
.exec(
http("request_0")
.post("/webvisor/89667203?wv-part=8&wv-type=7&wmode=0&wv-hit=509986764&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2F&rn=34938740&browser-info=we%3A1%3Aet%3A1724416880%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823174119%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724416880&t=gdpr(14)ti(1)")
.headers(headersUC01_0)
//                                    .body(RawFileBody("mainpage/0000_request.gif"))
.resources(
//                                            http("request_1")
//                                                    .post("/webvisor/89667203?wv-part=9&wv-type=7&wmode=0&wv-hit=509986764&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2F&rn=532300266&browser-info=we%3A1%3Aet%3A1724416882%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823174121%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724416882&t=gdpr(14)ti(1)")
//                                                    .headers(headersUC01_0)
//                                                    .body(RawFileBody("mainpage/0001_request.gif")),
//                                            http("request_2")
//                                                    .post("/webvisor/89667203?wv-part=10&wv-type=7&wmode=0&wv-hit=509986764&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2F&rn=851844975&browser-info=we%3A1%3Aet%3A1724416884%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823174123%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724416884&t=gdpr(14)ti(1)")
//                                                    .headers(headersUC01_0)
//                                                    .body(RawFileBody("mainpage/0002_request.gif")),
    http("request_3")
            .get(UC01_uri2 + "/build/5758.f38a32ed.css")
            .headers(headersUC01_3),
    http("request_4")
            .get(UC01_uri2 + "/build/6395.76430bbc.css")
            .headers(headersUC01_3),
    http("request_5")
            .get(UC01_uri2 + "/build/8886.31d6cfe0.css")
            .headers(headersUC01_3),
    http("request_6")
            .get(UC01_uri2 + "/build/shtadopm_css_head.dfe3f750.css")
            .headers(headersUC01_3),
    http("request_7")
            .get(UC01_uri2 + "/build/runtime.aaa04269.js")
            .headers(headersUC01_3),
    http("request_8")
            .get(UC01_uri2 + "/build/9755.89d0240d.js")
            .headers(headersUC01_3),
    http("request_9")
            .get(UC01_uri2 + "/build/shtadopm_app_head.a800bb8d.js")
            .headers(headersUC01_3),
    http("request_10")
            .get(UC01_uri2 + "/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
            .headers(headersUC01_3),
    http("request_11")
            .get(UC01_uri2 + "/build/images/shtadopm/menu-arrow.svg")
            .headers(headersUC01_3),
    http("request_12")
            .get("/metrika/tag.js")
            .headers(headersUC01_3),
    http("request_13")
            .get(UC01_uri2 + "/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
    http("request_14")
            .get(UC01_uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
    http("request_15")
            .get(UC01_uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
    http("request_16")
            .get(UC01_uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
    http("request_17")
            .get(UC01_uri2 + "/build/images/bg-head.cf798976.jpg"),
    http("request_18")
            .get(UC01_uri2 + "/uploads/media/default/0003/16/cf9e611c594d3ba6b924011379c5451f83bf40e2.jpeg")
            .headers(headersUC01_3),
    http("request_19")
            .get(UC01_uri2 + "/uploads/media/default/0003/16/260d39bf6af65ce5a7b5f5a4ebdbc110315450b9.jpeg")
            .headers(headersUC01_3),
    http("request_20")
            .get(UC01_uri2 + "/uploads/media/default/0003/16/791f218f33a4ddffa36707482296b056a626e788.jpeg")
            .headers(headersUC01_3),
    http("request_21")
            .get(UC01_uri2 + "/cache/4/e/4/b/c/4e4bce3ff9353a38a8cf548abd48c406354a014c.jpeg")
            .headers(headersUC01_3),
    http("request_22")
            .get(UC01_uri2 + "/cache/3/9/f/1/5/39f15709c006290e19dd68a664d2f3bea1beafcf.jpeg")
            .headers(headersUC01_3),
    http("request_23")
            .get(UC01_uri2 + "/cache/4/2/d/4/2/42d42c8d0e90edb4524715cf885ac23da58ee495.png")
            .headers(headersUC01_3),
    http("request_24")
            .get(UC01_uri2 + "/uploads/media/default/0001/28/8381d6d787f039276e071d762399a29444faa61d.jpeg")
            .headers(headersUC01_3),
    http("request_25")
            .get(UC01_uri2 + "/uploads/media/default/0003/16/a7a974a3ac969ff7baf1794fdb13f9828c13df73.jpeg")
            .headers(headersUC01_3),
    http("request_26")
            .get(UC01_uri2 + "/build/images/shtadopm/structure6.jpg")
            .headers(headersUC01_3),
    http("request_27")
            .get(UC01_uri2 + "/build/images/shtadopm/structure4.jpg")
            .headers(headersUC01_3),
    http("request_28")
            .get(UC01_uri2 + "/build/images/shtadopm/structure1.jpg")
            .headers(headersUC01_3),
    http("request_29")
            .get(UC01_uri2 + "/build/images/shtadopm/structure3.jpg")
            .headers(headersUC01_3),
    http("request_30")
            .get(UC01_uri2 + "/cache/a/1/0/a/b/a10ab468d377f9630539b270bf1e250d1b4bee43.jpeg")
            .headers(headersUC01_3),
    http("request_31")
            .get(UC01_uri2 + "/cache/7/d/1/7/9/7d1793ae7e8a3cac5579a4ceec20109e0cc718f1.jpeg")
            .headers(headersUC01_3),
    http("request_32")
            .get(UC01_uri2 + "/cache/5/b/6/6/4/5b6646e617b2738d774256ff66a5d3bfe3121345.jpeg")
            .headers(headersUC01_3),
    http("request_33")
            .get(UC01_uri2 + "/build/images/opmoscow/loading.svg")
            .headers(headersUC01_3),
    http("request_34")
            .get(UC01_uri2 + "/")
            .headers(headersUC01_34),
    http("request_35")
            .get(UC01_uri2 + "/uploads/media/default/0003/17/44256649d458f6f414c48f441d9e3c1e7d95511a.jpeg")
            .headers(headersUC01_3),
    http("request_36")
            .get(UC01_uri2 + "/uploads/media/default/0002/72/e59e831de49cd957c2c913d225579cac72ba95fa.png")
            .headers(headersUC01_3),
    http("request_37")
            .get(UC01_uri2 + "/uploads/media/default/0002/08/844891c0cb823bbd1be67eaef729f65abf6cb8cd.png")
            .headers(headersUC01_3),
    http("request_38")
            .get(UC01_uri2 + "/build/images/shtadopm/archive1.png")
            .headers(headersUC01_3),
    http("request_39")
            .get(UC01_uri2 + "/uploads/media/default/0001/16/d8be626d1edbeeeae3a7f853cbc2b6114695d91e.png")
            .headers(headersUC01_3),
    http("request_40")
            .get(UC01_uri2 + "/build/images/shtadopm/archive2.png")
            .headers(headersUC01_3),
    http("request_41")
            .get(UC01_uri2 + "/build/images/shtadopm/archive3.png")
            .headers(headersUC01_3),
    http("request_42")
            .get(UC01_uri2 + "/build/images/shtadopm/archive4.png")
            .headers(headersUC01_3),
    http("request_43")
            .get(UC01_uri2 + "/build/images/shtadopm/archive5.png")
            .headers(headersUC01_3),
    http("request_44")
            .get(UC01_uri2 + "/uploads/media/default/0001/14/8e41f9787e36e8029d3c6170de36347f0ca54c05.png")
            .headers(headersUC01_3),
    http("request_45")
            .get(UC01_uri2 + "/uploads/media/slides/0001/13/4ec801b9e1775a9059c90458ed5764228c943142.jpeg")
            .headers(headersUC01_3),
    http("request_46")
            .get(UC01_uri2 + "/build/7255.871eb160.js")
            .headers(headersUC01_3),
    http("request_47")
            .get(UC01_uri2 + "/build/6889.3f713c69.js")
            .headers(headersUC01_3),
    http("request_48")
            .get(UC01_uri2 + "/build/7729.67d87565.js")
            .headers(headersUC01_3),
    http("request_49")
            .get(UC01_uri2 + "/build/8981.bc50772a.js")
            .headers(headersUC01_3),
    http("request_50")
            .get(UC01_uri2 + "/build/3734.2c5e1582.js")
            .headers(headersUC01_3),
    http("request_51")
            .get(UC01_uri2 + "/build/9154.f1370752.js")
            .headers(headersUC01_3),
    http("request_52")
            .get(UC01_uri2 + "/build/1676.2634f191.js")
            .headers(headersUC01_3),
    http("request_53")
            .get(UC01_uri2 + "/build/shtadopm_app_footer.9745ecad.js")
            .headers(headersUC01_3),
    http("request_54")
            .get(UC01_uri2 + "/build/images/shtadopm/favicon/favicon.ico")
            .headers(headersUC01_3),
    http("request_55")
            .get(UC01_uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
            .headers(headersUC01_3),
    http("request_56")
            .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A674541449%3Az%3A300%3Ai%3A20240823174124%3Aet%3A1724416884%3Ac%3A1%3Arn%3A980195938%3Arqn%3A5%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C2316%2C477%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724416881398%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724416884%3At%3A%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1%20%D0%BF%D0%BE%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B7%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D0%BC%D0%B8%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%B3%D0%BE%D1%80%D0%B4%D1%83%D0%BC%D1%83%20(%D0%9C%D0%93%D0%94)%2C%20%D0%BC%D1%83%D0%BD%D0%B8%D1%86%D0%B8%D0%BF%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D0%B5%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D1%8B%20%D0%A2%D0%B8%D0%9D%D0%90%D0%9E%20%D0%B8%20%D1%80%D0%B0%D0%B9%D0%BE%D0%BD%D0%B0%20%D0%9A%D1%83%D1%80%D0%BA%D0%B8%D0%BD%D0%BE%202024&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
            .headers(headersUC01_56)
)
);


HttpProtocolBuilder httpProtocol_DistanceVoting = http
.baseUrl("https://shtab.opmoscow.ru")
.inferHtmlResources();

Map<CharSequence, String> headersUC02_0 = new HashMap<>();
headersUC02_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC02_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC02_0.put("sec-ch-ua-mobile", "?0");
headersUC02_0.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC02_15 = new HashMap<>();
headersUC02_15.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headersUC02_15.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC02_15.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC02_15.put("priority", "u=0, i");
headersUC02_15.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC02_15.put("sec-ch-ua-mobile", "?0");
headersUC02_15.put("sec-ch-ua-platform", "Linux");
headersUC02_15.put("sec-fetch-dest", "document");
headersUC02_15.put("sec-fetch-mode", "navigate");
headersUC02_15.put("sec-fetch-site", "same-origin");
headersUC02_15.put("sec-fetch-user", "?1");
headersUC02_15.put("upgrade-insecure-requests", "1");
headersUC02_15.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC02_26 = new HashMap<>();
headersUC02_26.put("Upgrade-Insecure-Requests", "1");
headersUC02_26.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC02_26.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC02_26.put("sec-ch-ua-mobile", "?0");
headersUC02_26.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC02_27 = new HashMap<>();
headersUC02_27.put("accept", "*/*");
headersUC02_27.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC02_27.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC02_27.put("origin", "https://shtab.opmoscow.ru");
headersUC02_27.put("priority", "u=1, i");
headersUC02_27.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC02_27.put("sec-ch-ua-mobile", "?0");
headersUC02_27.put("sec-ch-ua-platform", "Linux");
headersUC02_27.put("sec-fetch-dest", "empty");
headersUC02_27.put("sec-fetch-mode", "cors");
headersUC02_27.put("sec-fetch-site", "cross-site");
headersUC02_27.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

String uri1 = "https://mc.yandex.ru";

ScenarioBuilder scnUC02 = scenario("DistanceVoting")
.exec(
http("request_0")
.get("/build/5758.f38a32ed.css")
.headers(headersUC02_0)
.resources(
        http("request_1")
                .get("/build/6395.76430bbc.css")
                .headers(headersUC02_0),
        http("request_2")
                .get("/build/8886.31d6cfe0.css")
                .headers(headersUC02_0),
        http("request_3")
                .get("/build/shtadopm_css_head.dfe3f750.css")
                .headers(headersUC02_0),
        http("request_4")
                .get("/build/runtime.aaa04269.js")
                .headers(headersUC02_0),
        http("request_5")
                .get("/build/9755.89d0240d.js")
                .headers(headersUC02_0),
        http("request_6")
                .get("/build/shtadopm_app_head.a800bb8d.js")
                .headers(headersUC02_0),
        http("request_7")
                .get("/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
                .headers(headersUC02_0),
        http("request_8")
                .get("/build/images/shtadopm/menu-arrow.svg")
                .headers(headersUC02_0),
        http("request_9")
                .get(uri1 + "/metrika/tag.js")
                .headers(headersUC02_0),
        http("request_10")
                .get("/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
        http("request_11")
                .get("/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
        http("request_12")
                .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
        http("request_13")
                .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
        http("request_14")
                .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
        http("request_15")
                .get("/distancionnoe-golosovanie")
                .headers(headersUC02_15),
        http("request_16")
                .get("/build/7255.871eb160.js")
                .headers(headersUC02_0),
        http("request_17")
                .get("/build/6889.3f713c69.js")
                .headers(headersUC02_0),
        http("request_18")
                .get("/build/7729.67d87565.js")
                .headers(headersUC02_0),
        http("request_19")
                .get("/build/8981.bc50772a.js")
                .headers(headersUC02_0),
        http("request_20")
                .get("/build/3734.2c5e1582.js")
                .headers(headersUC02_0),
        http("request_21")
                .get("/build/9154.f1370752.js")
                .headers(headersUC02_0),
        http("request_22")
                .get("/build/1676.2634f191.js")
                .headers(headersUC02_0),
        http("request_23")
                .get("/build/shtadopm_app_footer.9745ecad.js")
                .headers(headersUC02_0),
        http("request_24")
                .get("/build/images/shtadopm/favicon/site.webmanifest")
                .headers(headersUC02_0),
        http("request_25")
                .get("/build/images/shtadopm/favicon/favicon.ico")
                .headers(headersUC02_0),
        http("request_26")
                .get(uri1 + "/metrika/metrika_match.html")
                .headers(headersUC02_26),
        http("request_27")
                .get(uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fdistancionnoe-golosovanie&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A737553638%3Az%3A300%3Ai%3A20240823174758%3Aet%3A1724417278%3Ac%3A1%3Arn%3A541838194%3Arqn%3A18%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C342%2C%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724417277933%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724417278%3At%3A%D0%94%D0%B8%D1%81%D1%82%D0%B0%D0%BD%D1%86%D0%B8%D0%BE%D0%BD%D0%BD%D0%BE%D0%B5%20%D1%8D%D0%BB%D0%B5%D0%BA%D1%82%D1%80%D0%BE%D0%BD%D0%BD%D0%BE%D0%B5%20%D0%B3%D0%BE%D0%BB%D0%BE%D1%81%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5%20(%D0%94%D0%AD%D0%93)%20%D0%BD%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D1%85%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%B3%D0%BE%D1%80%D0%B4%D1%83%D0%BC%D1%83%20%D0%B8%20%D0%A2%D0%B8%D0%9D%D0%90%D0%9E%202024%20%E2%80%94%20%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                .headers(headersUC02_27)
)
);


HttpProtocolBuilder httpProtocol_IzbiratUchastki = http
.baseUrl("https://shtab.opmoscow.ru")
.inferHtmlResources();

Map<CharSequence, String> headersUC03_0 = new HashMap<>();
headersUC03_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headersUC03_0.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC03_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC03_0.put("priority", "u=0, i");
headersUC03_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC03_0.put("sec-ch-ua-mobile", "?0");
headersUC03_0.put("sec-ch-ua-platform", "Linux");
headersUC03_0.put("sec-fetch-dest", "document");
headersUC03_0.put("sec-fetch-mode", "navigate");
headersUC03_0.put("sec-fetch-site", "same-origin");
headersUC03_0.put("sec-fetch-user", "?1");
headersUC03_0.put("upgrade-insecure-requests", "1");
headersUC03_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC03_1 = new HashMap<>();
headersUC03_1.put("accept", "*/*");
headersUC03_1.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC03_1.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC03_1.put("content-type", "text/plain");
headersUC03_1.put("origin", "https://shtab.opmoscow.ru");
headersUC03_1.put("priority", "u=1, i");
headersUC03_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC03_1.put("sec-ch-ua-mobile", "?0");
headersUC03_1.put("sec-ch-ua-platform", "Linux");
headersUC03_1.put("sec-fetch-dest", "empty");
headersUC03_1.put("sec-fetch-mode", "cors");
headersUC03_1.put("sec-fetch-site", "cross-site");
headersUC03_1.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC03_2 = new HashMap<>();
headersUC03_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC03_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC03_2.put("sec-ch-ua-mobile", "?0");
headersUC03_2.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC03_9 = new HashMap<>();
headersUC03_9.put("Upgrade-Insecure-Requests", "1");
headersUC03_9.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC03_9.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC03_9.put("sec-ch-ua-mobile", "?0");
headersUC03_9.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC03_10 = new HashMap<>();
headersUC03_10.put("accept", "*/*");
headersUC03_10.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC03_10.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC03_10.put("origin", "https://shtab.opmoscow.ru");
headersUC03_10.put("priority", "u=1, i");
headersUC03_10.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC03_10.put("sec-ch-ua-mobile", "?0");
headersUC03_10.put("sec-ch-ua-platform", "Linux");
headersUC03_10.put("sec-fetch-dest", "empty");
headersUC03_10.put("sec-fetch-mode", "cors");
headersUC03_10.put("sec-fetch-site", "cross-site");
headersUC03_10.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

String UC02_uri1 = "https://mc.yandex.ru";

ScenarioBuilder scnUC03 = scenario("IzbiratUchastki")
.exec(
http("request_0")
    .get("/izbiratelnye-uchastki")
    .headers(headersUC03_0)
    .resources(
//                                                    http("request_1")
//                                                            .post(UC02_uri1 + "/webvisor/89667203?wv-part=2&wv-type=7&wmode=0&wv-hit=871326288&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fizbiratelnye-uchastki&rn=108890365&browser-info=we%3A1%3Aet%3A1724417323%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823174842%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724417323&t=gdpr(14)ti(1)")
//                                                            .headers(headersUC03_1)
//                                                            .body(RawFileBody("izbiratuchastki/0001_request.gif")),
            http("request_2")
                    .get(UC02_uri1 + "/metrika/tag.js")
                    .headers(headersUC03_2),
            http("request_3")
                    .get("/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
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
                    .headers(headersUC03_2),
            http("request_9")
                    .get(UC02_uri1 + "/metrika/metrika_match.html")
                    .headers(headersUC03_9),
            http("request_10")
                    .get(UC02_uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fizbiratelnye-uchastki&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fdistancionnoe-golosovanie&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A961089704%3Az%3A300%3Ai%3A20240823174843%3Aet%3A1724417324%3Ac%3A1%3Arn%3A363647287%3Arqn%3A20%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C398%2C9%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724417323226%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724417324%3At%3A%D0%98%D0%B7%D0%B1%D0%B8%D1%80%D0%B0%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D1%8B%D0%B5%20%D1%83%D1%87%D0%B0%D1%81%D1%82%D0%BA%D0%B8%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%B3%D0%BE%D1%80%D0%B4%D1%83%D0%BC%D1%83%20%D0%B8%20%D0%A2%D0%B8%D0%9D%D0%90%D0%9E%202024%20%E2%80%94%20%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                    .headers(headersUC03_10)
    )
);


HttpProtocolBuilder httpProtocol_Nabludateli = http
.baseUrl("https://mc.yandex.ru")
.inferHtmlResources()
.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC04_0 = new HashMap<>();
headersUC04_0.put("accept", "*/*");
headersUC04_0.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC04_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC04_0.put("content-type", "text/plain");
headersUC04_0.put("origin", "https://shtab.opmoscow.ru");
headersUC04_0.put("priority", "u=1, i");
headersUC04_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC04_0.put("sec-ch-ua-mobile", "?0");
headersUC04_0.put("sec-ch-ua-platform", "Linux");
headersUC04_0.put("sec-fetch-dest", "empty");
headersUC04_0.put("sec-fetch-mode", "cors");
headersUC04_0.put("sec-fetch-site", "cross-site");

Map<CharSequence, String> headersUC04_1 = new HashMap<>();
headersUC04_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC04_1.put("sec-ch-ua-mobile", "?0");
headersUC04_1.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC04_6 = new HashMap<>();
headersUC04_6.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headersUC04_6.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC04_6.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC04_6.put("priority", "u=0, i");
headersUC04_6.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC04_6.put("sec-ch-ua-mobile", "?0");
headersUC04_6.put("sec-ch-ua-platform", "Linux");
headersUC04_6.put("sec-fetch-dest", "document");
headersUC04_6.put("sec-fetch-mode", "navigate");
headersUC04_6.put("sec-fetch-site", "same-origin");
headersUC04_6.put("sec-fetch-user", "?1");
headersUC04_6.put("upgrade-insecure-requests", "1");

Map<CharSequence, String> headersUC04_16 = new HashMap<>();
headersUC04_16.put("Origin", "https://shtab.opmoscow.ru");
headersUC04_16.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC04_16.put("sec-ch-ua-mobile", "?0");
headersUC04_16.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC04_23 = new HashMap<>();
headersUC04_23.put("Upgrade-Insecure-Requests", "1");
headersUC04_23.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC04_23.put("sec-ch-ua-mobile", "?0");
headersUC04_23.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC04_24 = new HashMap<>();
headersUC04_24.put("accept", "*/*");
headersUC04_24.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC04_24.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC04_24.put("origin", "https://shtab.opmoscow.ru");
headersUC04_24.put("priority", "u=1, i");
headersUC04_24.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC04_24.put("sec-ch-ua-mobile", "?0");
headersUC04_24.put("sec-ch-ua-platform", "Linux");
headersUC04_24.put("sec-fetch-dest", "empty");
headersUC04_24.put("sec-fetch-mode", "cors");
headersUC04_24.put("sec-fetch-site", "cross-site");

String uri2 = "https://shtab.opmoscow.ru";

ScenarioBuilder scnUC04 = scenario("Nabludateli")
.exec(
http("request_0")
        .post("/webvisor/89667203?wv-part=6&wv-type=7&wmode=0&wv-hit=427998683&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnablyudateli&rn=774490361&browser-info=we%3A1%3Aet%3A1724417650%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823175410%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724417650&t=gdpr(14)ti(1)")
        .headers(headersUC04_0)
//                                                .body(RawFileBody("nabludateli/0000_request.gif"))
        .resources(
                http("request_1")
                        .get(uri2 + "/build/runtime.aaa04269.js")
                        .headers(headersUC04_1),
                http("request_2")
                        .get(uri2 + "/build/shtadopm_app_head.a800bb8d.js")
                        .headers(headersUC04_1),
                http("request_3")
                        .get(uri2 + "/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
                        .headers(headersUC04_1),
                http("request_4")
                        .get(uri2 + "/build/images/shtadopm/menu-arrow.svg")
                        .headers(headersUC04_1),
                http("request_5")
                        .get(uri2 + "/build/9755.89d0240d.js")
                        .headers(headersUC04_1),
                http("request_6")
                        .get(uri2 + "/nablyudateli")
                        .headers(headersUC04_6),
                http("request_7")
                        .get("/metrika/tag.js")
                        .headers(headersUC04_1),
                http("request_8")
                        .get(uri2 + "/build/7255.871eb160.js")
                        .headers(headersUC04_1),
                http("request_9")
                        .get(uri2 + "/build/6889.3f713c69.js")
                        .headers(headersUC04_1),
                http("request_10")
                        .get(uri2 + "/build/7729.67d87565.js")
                        .headers(headersUC04_1),
                http("request_11")
                        .get(uri2 + "/build/8981.bc50772a.js")
                        .headers(headersUC04_1),
                http("request_12")
                        .get(uri2 + "/build/3734.2c5e1582.js")
                        .headers(headersUC04_1),
                http("request_13")
                        .get(uri2 + "/build/9154.f1370752.js")
                        .headers(headersUC04_1),
                http("request_14")
                        .get(uri2 + "/build/1676.2634f191.js")
                        .headers(headersUC04_1),
                http("request_15")
                        .get(uri2 + "/build/shtadopm_app_footer.9745ecad.js")
                        .headers(headersUC04_1),
                http("request_16")
                        .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2")
                        .headers(headersUC04_16),
                http("request_17")
                        .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2")
                        .headers(headersUC04_16),
                http("request_18")
                        .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2")
                        .headers(headersUC04_16),
                http("request_19")
                        .get(uri2 + "/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2")
                        .headers(headersUC04_16),
                http("request_20")
                        .get(uri2 + "/uploads/media/default/0001/28/630bf9fe2fb35ec7b3ec6066e1b744274b11bb01.jpeg")
                        .headers(headersUC04_1),
                http("request_21")
                        .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
                        .headers(headersUC04_1),
                http("request_22")
                        .get(uri2 + "/build/images/shtadopm/favicon/favicon.ico")
                        .headers(headersUC04_1),
                http("request_23")
                        .get("/metrika/metrika_match.html")
                        .headers(headersUC04_23),
                http("request_24")
                        .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnablyudateli&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A903453296%3Az%3A300%3Ai%3A20240823175412%3Aet%3A1724417652%3Ac%3A1%3Arn%3A299597295%3Arqn%3A33%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C807%2C36%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724417651436%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724417652%3At%3A%D0%9D%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B0%D0%B5%D0%BC%20%D0%BD%D0%B0%20%D1%83%D1%87%D0%B0%D1%81%D1%82%D0%BA%D0%B5&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                        .headers(headersUC04_24)
        )
);

HttpProtocolBuilder httpProtocol_Operatori = http
.baseUrl("https://mc.yandex.ru")
.inferHtmlResources();

Map<CharSequence, String> headersUC05_0 = new HashMap<>();
headersUC05_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headersUC05_0.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC05_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC05_0.put("priority", "u=0, i");
headersUC05_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC05_0.put("sec-ch-ua-mobile", "?0");
headersUC05_0.put("sec-ch-ua-platform", "Linux");
headersUC05_0.put("sec-fetch-dest", "document");
headersUC05_0.put("sec-fetch-mode", "navigate");
headersUC05_0.put("sec-fetch-site", "cross-site");
headersUC05_0.put("sec-fetch-user", "?1");
headersUC05_0.put("upgrade-insecure-requests", "1");
headersUC05_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC05_1 = new HashMap<>();
headersUC05_1.put("accept", "*/*");
headersUC05_1.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC05_1.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC05_1.put("content-type", "text/plain");
headersUC05_1.put("origin", "https://shtab.opmoscow.ru");
headersUC05_1.put("priority", "u=1, i");
headersUC05_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC05_1.put("sec-ch-ua-mobile", "?0");
headersUC05_1.put("sec-ch-ua-platform", "Linux");
headersUC05_1.put("sec-fetch-dest", "empty");
headersUC05_1.put("sec-fetch-mode", "cors");
headersUC05_1.put("sec-fetch-site", "cross-site");
headersUC05_1.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC05_4 = new HashMap<>();
headersUC05_4.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC05_4.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC05_4.put("sec-ch-ua-mobile", "?0");
headersUC05_4.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC05_9 = new HashMap<>();
headersUC05_9.put("accept", "*/*");
headersUC05_9.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC05_9.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC05_9.put("origin", "https://shtab.opmoscow.ru");
headersUC05_9.put("priority", "u=1, i");
headersUC05_9.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC05_9.put("sec-ch-ua-mobile", "?0");
headersUC05_9.put("sec-ch-ua-platform", "Linux");
headersUC05_9.put("sec-fetch-dest", "empty");
headersUC05_9.put("sec-fetch-mode", "cors");
headersUC05_9.put("sec-fetch-site", "cross-site");
headersUC05_9.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC05_10 = new HashMap<>();
headersUC05_10.put("Upgrade-Insecure-Requests", "1");
headersUC05_10.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC05_10.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC05_10.put("sec-ch-ua-mobile", "?0");
headersUC05_10.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC05_11 = new HashMap<>();
headersUC05_11.put("accept", "*/*");
headersUC05_11.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC05_11.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC05_11.put("origin", "https://shtab.opmoscow.ru");
headersUC05_11.put("priority", "u=4, i");
headersUC05_11.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC05_11.put("sec-ch-ua-mobile", "?0");
headersUC05_11.put("sec-ch-ua-platform", "Linux");
headersUC05_11.put("sec-fetch-dest", "empty");
headersUC05_11.put("sec-fetch-mode", "no-cors");
headersUC05_11.put("sec-fetch-site", "cross-site");
headersUC05_11.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

String UC05_uri2 = "https://shtab.opmoscow.ru";

ScenarioBuilder scnUC05 = scenario("Operatori")
.exec(
    http("request_0")
            .get(UC05_uri2 + "/operatory-videocentra")
            .headers(headersUC05_0)
            .resources(
//                                                            http("request_1")
//                                                                    .post("/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=1066330092&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Foperatory-videocentra&rn=607946703&browser-info=we%3A1%3Aet%3A1724486220%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824125659%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724486220&t=gdpr(14)ti(1)")
//                                                                    .headers(headersUC05_1)
//                                                                    .body(RawFileBody("operatori/0001_request.gif")),
//                                                            http("request_2")
//                                                                    .post("/webvisor/89667203?wv-part=2&wv-type=7&wmode=0&wv-hit=1066330092&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Foperatory-videocentra&rn=227017096&browser-info=we%3A1%3Aet%3A1724486221%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824125701%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724486221&t=gdpr(14)ti(1)")
//                                                                    .headers(headersUC05_1)
//                                                                    .body(RawFileBody("operatori/0002_request.gif")),
//                                                            http("request_3")
//                                                                    .post("/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=1066330092&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Foperatory-videocentra&rn=694761994&browser-info=bt%3A1%3Awe%3A1%3Aet%3A1724486219%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824125659%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724486219&t=gdpr(14)ti(1)")
//                                                                    .headers(headersUC05_1)
//                                                                    .body(RawFileBody("operatori/0003_request.gif")),
                    http("request_4")
                            .get("/metrika/tag.js")
                            .headers(headersUC05_4),
                    http("request_5")
                            .get(UC05_uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                    http("request_6")
                            .get(UC05_uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                    http("request_7")
                            .get(UC05_uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                    http("request_8")
                            .get(UC05_uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
                            .headers(headersUC05_4),
                    http("request_9")
                            .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Foperatory-videocentra&page-ref=https%3A%2F%2Fwww.google.com%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A605080385%3Az%3A300%3Ai%3A20240824125702%3Aet%3A1724486222%3Ac%3A1%3Arn%3A858699657%3Arqn%3A234%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C583%2C2%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724486221692%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724486222%3At%3A%D0%A1%D0%BB%D0%B5%D0%B4%D0%B8%D0%BC%20%D0%B7%D0%B0%20%D1%83%D1%87%D0%B0%D1%81%D1%82%D0%BA%D0%B0%D0%BC%D0%B8%20%D1%87%D0%B5%D1%80%D0%B5%D0%B7%20%D0%BC%D0%BE%D0%BD%D0%B8%D1%82%D0%BE%D1%80%D1%8B&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                            .headers(headersUC05_9),
                    http("request_10")
                            .get("/metrika/metrika_match.html")
                            .headers(headersUC05_10)
            )
);

HttpProtocolBuilder httpProtocol_CallCenter = http
.baseUrl("https://shtab.opmoscow.ru")
.inferHtmlResources();

Map<CharSequence, String> headersUC06_0 = new HashMap<>();
headersUC06_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headersUC06_0.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC06_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC06_0.put("priority", "u=0, i");
headersUC06_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC06_0.put("sec-ch-ua-mobile", "?0");
headersUC06_0.put("sec-ch-ua-platform", "Linux");
headersUC06_0.put("sec-fetch-dest", "document");
headersUC06_0.put("sec-fetch-mode", "navigate");
headersUC06_0.put("sec-fetch-site", "same-origin");
headersUC06_0.put("sec-fetch-user", "?1");
headersUC06_0.put("upgrade-insecure-requests", "1");
headersUC06_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC06_1 = new HashMap<>();
headersUC06_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC06_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC06_1.put("sec-ch-ua-mobile", "?0");
headersUC06_1.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC06_6 = new HashMap<>();
headersUC06_6.put("Upgrade-Insecure-Requests", "1");
headersUC06_6.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC06_6.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC06_6.put("sec-ch-ua-mobile", "?0");
headersUC06_6.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC06_7 = new HashMap<>();
headersUC06_7.put("accept", "*/*");
headersUC06_7.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC06_7.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC06_7.put("origin", "https://shtab.opmoscow.ru");
headersUC06_7.put("priority", "u=1, i");
headersUC06_7.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC06_7.put("sec-ch-ua-mobile", "?0");
headersUC06_7.put("sec-ch-ua-platform", "Linux");
headersUC06_7.put("sec-fetch-dest", "empty");
headersUC06_7.put("sec-fetch-mode", "cors");
headersUC06_7.put("sec-fetch-site", "cross-site");
headersUC06_7.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

String UC06_uri1 = "https://mc.yandex.ru";

ScenarioBuilder scnUC06 = scenario("CallCenter")
.exec(
        http("request_0")
                .get("/call-center")
                .headers(headersUC06_0)
                .resources(
                        http("request_1")
                                .get(UC06_uri1 + "/metrika/tag.js")
                                .headers(headersUC06_1),
                        http("request_2")
                                .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                        http("request_3")
                                .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                        http("request_4")
                                .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                        http("request_5")
                                .get("/build/images/shtadopm/favicon/site.webmanifest")
                                .headers(headersUC06_1),
                        http("request_6")
                                .get(UC06_uri1 + "/metrika/metrika_match.html")
                                .headers(headersUC06_6),
                        http("request_7")
                                .get(UC06_uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fcall-center&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A836395905%3Az%3A300%3Ai%3A20240823175521%3Aet%3A1724417722%3Ac%3A1%3Arn%3A848645887%3Arqn%3A37%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C407%2C6%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724417721269%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724417722%3At%3A%D0%9E%D1%82%D0%B2%D0%B5%D1%87%D0%B0%D0%B5%D0%BC%20%D0%BD%D0%B0%20%D0%B2%D0%BE%D0%BF%D1%80%D0%BE%D1%81%D1%8B%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B0%D1%82%D0%B5%D0%BB%D0%B5%D0%B9&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                .headers(headersUC06_7)
                )
);

HttpProtocolBuilder httpProtocol_GBR = http
    .baseUrl("https://mc.yandex.ru")
    .inferHtmlResources();

Map<CharSequence, String> headersUC07_0 = new HashMap<>();
headersUC07_0.put("accept", "*/*");
headersUC07_0.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC07_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC07_0.put("content-type", "text/plain");
headersUC07_0.put("origin", "https://shtab.opmoscow.ru");
headersUC07_0.put("priority", "u=1, i");
headersUC07_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC07_0.put("sec-ch-ua-mobile", "?0");
headersUC07_0.put("sec-ch-ua-platform", "Linux");
headersUC07_0.put("sec-fetch-dest", "empty");
headersUC07_0.put("sec-fetch-mode", "cors");
headersUC07_0.put("sec-fetch-site", "cross-site");
headersUC07_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC07_2 = new HashMap<>();
headersUC07_2.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headersUC07_2.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC07_2.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC07_2.put("priority", "u=0, i");
headersUC07_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC07_2.put("sec-ch-ua-mobile", "?0");
headersUC07_2.put("sec-ch-ua-platform", "Linux");
headersUC07_2.put("sec-fetch-dest", "document");
headersUC07_2.put("sec-fetch-mode", "navigate");
headersUC07_2.put("sec-fetch-site", "cross-site");
headersUC07_2.put("sec-fetch-user", "?1");
headersUC07_2.put("upgrade-insecure-requests", "1");
headersUC07_2.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC07_3 = new HashMap<>();
headersUC07_3.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC07_3.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC07_3.put("sec-ch-ua-mobile", "?0");
headersUC07_3.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC07_26 = new HashMap<>();
headersUC07_26.put("accept", "*/*");
headersUC07_26.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC07_26.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC07_26.put("origin", "https://shtab.opmoscow.ru");
headersUC07_26.put("priority", "u=1, i");
headersUC07_26.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC07_26.put("sec-ch-ua-mobile", "?0");
headersUC07_26.put("sec-ch-ua-platform", "Linux");
headersUC07_26.put("sec-fetch-dest", "empty");
headersUC07_26.put("sec-fetch-mode", "cors");
headersUC07_26.put("sec-fetch-site", "cross-site");
headersUC07_26.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC07_27 = new HashMap<>();
headersUC07_27.put("Upgrade-Insecure-Requests", "1");
headersUC07_27.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC07_27.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC07_27.put("sec-ch-ua-mobile", "?0");
headersUC07_27.put("sec-ch-ua-platform", "Linux");

String UC07_uri2 = "https://shtab.opmoscow.ru";

ScenarioBuilder scnUC07 = scenario("GBR")
    .exec(
            http("request_0")
                    .post("/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=879073726&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fgruppy-mobilnogo-reagirovaniya&rn=888142060&browser-info=bt%3A1%3Awe%3A1%3Aet%3A1724486285%3Aw%3A1920x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824125805%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724486285&t=gdpr(14)ti(1)")
                    .headers(headersUC07_0)
//                                                            .body(RawFileBody("gbr/0000_request.gif"))
                    .resources(
//                                                                    http("request_1")
//                                                                            .post("/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=879073726&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fgruppy-mobilnogo-reagirovaniya&rn=938840773&browser-info=we%3A1%3Aet%3A1724486286%3Aw%3A1920x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824125805%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724486286&t=gdpr(14)ti(1)")
//                                                                            .headers(headersUC07_0)
//                                                                            .body(RawFileBody("gbr/0001_request.gif")),
                            http("request_2")
                                    .get(UC07_uri2 + "/gruppy-mobilnogo-reagirovaniya")
                                    .headers(headersUC07_2),
                            http("request_3")
                                    .get(UC07_uri2 + "/build/5758.f38a32ed.css")
                                    .headers(headersUC07_3),
                            http("request_4")
                                    .get(UC07_uri2 + "/build/6395.76430bbc.css")
                                    .headers(headersUC07_3),
                            http("request_5")
                                    .get(UC07_uri2 + "/build/8886.31d6cfe0.css")
                                    .headers(headersUC07_3),
                            http("request_6")
                                    .get(UC07_uri2 + "/build/shtadopm_css_head.dfe3f750.css")
                                    .headers(headersUC07_3),
                            http("request_7")
                                    .get(UC07_uri2 + "/build/runtime.aaa04269.js")
                                    .headers(headersUC07_3),
                            http("request_8")
                                    .get(UC07_uri2 + "/build/9755.89d0240d.js")
                                    .headers(headersUC07_3),
                            http("request_9")
                                    .get(UC07_uri2 + "/build/shtadopm_app_head.a800bb8d.js")
                                    .headers(headersUC07_3),
                            http("request_10")
                                    .get(UC07_uri2 + "/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
                                    .headers(headersUC07_3),
                            http("request_11")
                                    .get(UC07_uri2 + "/build/images/shtadopm/menu-arrow.svg")
                                    .headers(headersUC07_3),
                            http("request_12")
                                    .get("/metrika/tag.js")
                                    .headers(headersUC07_3),
                            http("request_13")
                                    .get(UC07_uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                            http("request_14")
                                    .get(UC07_uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                            http("request_15")
                                    .get(UC07_uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                            http("request_16")
                                    .get(UC07_uri2 + "/build/7255.871eb160.js")
                                    .headers(headersUC07_3),
                            http("request_17")
                                    .get(UC07_uri2 + "/build/6889.3f713c69.js")
                                    .headers(headersUC07_3),
                            http("request_18")
                                    .get(UC07_uri2 + "/build/7729.67d87565.js")
                                    .headers(headersUC07_3),
                            http("request_19")
                                    .get(UC07_uri2 + "/build/8981.bc50772a.js")
                                    .headers(headersUC07_3),
                            http("request_20")
                                    .get(UC07_uri2 + "/build/3734.2c5e1582.js")
                                    .headers(headersUC07_3),
                            http("request_21")
                                    .get(UC07_uri2 + "/build/9154.f1370752.js")
                                    .headers(headersUC07_3),
                            http("request_22")
                                    .get(UC07_uri2 + "/build/1676.2634f191.js")
                                    .headers(headersUC07_3),
                            http("request_23")
                                    .get(UC07_uri2 + "/build/shtadopm_app_footer.9745ecad.js")
                                    .headers(headersUC07_3),
                            http("request_24")
                                    .get(UC07_uri2 + "/build/images/shtadopm/favicon/favicon.ico")
                                    .headers(headersUC07_3),
                            http("request_25")
                                    .get(UC07_uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
                                    .headers(headersUC07_3),
                            http("request_26")
                                    .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fgruppy-mobilnogo-reagirovaniya&page-ref=https%3A%2F%2Fwww.google.com%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A160071934%3Az%3A300%3Ai%3A20240824125807%3Aet%3A1724486287%3Ac%3A1%3Arn%3A475473496%3Arqn%3A237%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C413%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724486286858%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724486287%3At%3A%D0%92%D1%8B%D0%B5%D0%B7%D0%B6%D0%B0%D0%B5%D0%BC%20%D0%BD%D0%B0%20%D1%83%D1%87%D0%B0%D1%81%D1%82%D0%BA%D0%B8%C2%A0%D0%B4%D0%BB%D1%8F%20%D0%BF%D1%80%D0%B5%D0%B4%D0%BE%D1%82%D0%B2%D1%80%D0%B0%D1%89%D0%B5%D0%BD%D0%B8%D1%8F%20%D0%B8%D0%BB%D0%B8%20%D1%80%D0%B0%D0%B7%D0%B1%D0%BE%D1%80%D0%B0%20%D0%BD%D0%B0%D1%80%D1%83%D1%88%D0%B5%D0%BD%D0%B8%D1%8F&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                    .headers(headersUC07_26),
                            http("request_27")
                                    .get("/metrika/metrika_match.html")
                                    .headers(headersUC07_27)
                    )
    );

HttpProtocolBuilder httpProtocol_RazborNarusheniy = http
        .baseUrl("https://shtab.opmoscow.ru")
        .inferHtmlResources();

Map<CharSequence, String> headersUC08_0 = new HashMap<>();
headersUC08_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
headersUC08_0.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC08_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC08_0.put("priority", "u=0, i");
headersUC08_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC08_0.put("sec-ch-ua-mobile", "?0");
headersUC08_0.put("sec-ch-ua-platform", "Linux");
headersUC08_0.put("sec-fetch-dest", "document");
headersUC08_0.put("sec-fetch-mode", "navigate");
headersUC08_0.put("sec-fetch-site", "cross-site");
headersUC08_0.put("sec-fetch-user", "?1");
headersUC08_0.put("upgrade-insecure-requests", "1");
headersUC08_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC08_1 = new HashMap<>();
headersUC08_1.put("accept", "*/*");
headersUC08_1.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC08_1.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC08_1.put("content-type", "text/plain");
headersUC08_1.put("origin", "https://shtab.opmoscow.ru");
headersUC08_1.put("priority", "u=1, i");
headersUC08_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC08_1.put("sec-ch-ua-mobile", "?0");
headersUC08_1.put("sec-ch-ua-platform", "Linux");
headersUC08_1.put("sec-fetch-dest", "empty");
headersUC08_1.put("sec-fetch-mode", "cors");
headersUC08_1.put("sec-fetch-site", "cross-site");
headersUC08_1.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC08_3 = new HashMap<>();
headersUC08_3.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC08_3.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC08_3.put("sec-ch-ua-mobile", "?0");
headersUC08_3.put("sec-ch-ua-platform", "Linux");

Map<CharSequence, String> headersUC08_8 = new HashMap<>();
headersUC08_8.put("accept", "*/*");
headersUC08_8.put("accept-encoding", "gzip, deflate, br, zstd");
headersUC08_8.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
headersUC08_8.put("origin", "https://shtab.opmoscow.ru");
headersUC08_8.put("priority", "u=1, i");
headersUC08_8.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC08_8.put("sec-ch-ua-mobile", "?0");
headersUC08_8.put("sec-ch-ua-platform", "Linux");
headersUC08_8.put("sec-fetch-dest", "empty");
headersUC08_8.put("sec-fetch-mode", "cors");
headersUC08_8.put("sec-fetch-site", "cross-site");
headersUC08_8.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

Map<CharSequence, String> headersUC08_9 = new HashMap<>();
headersUC08_9.put("Upgrade-Insecure-Requests", "1");
headersUC08_9.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
headersUC08_9.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
headersUC08_9.put("sec-ch-ua-mobile", "?0");
headersUC08_9.put("sec-ch-ua-platform", "Linux");

String UC08_uri1 = "https://mc.yandex.ru";

ScenarioBuilder scnUC08 = scenario("RazborNarusheniy")
        .exec(
                http("request_0")
                        .get("/razbor-narushenij")
                        .headers(headersUC08_0)
                        .resources(
//                                                                        http("request_1")
//                                                                                .post(UC08_uri1 + "/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=805872216&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Frazbor-narushenij&rn=841479143&browser-info=bt%3A1%3Awe%3A1%3Aet%3A1724486328%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824125847%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724486328&t=gdpr(14)ti(1)")
//                                                                                .headers(headersUC08_1)
//                                                                                .body(RawFileBody("razbornarusheniy/0001_request.gif")),
//                                                                        http("request_2")
//                                                                                .post(UC08_uri1 + "/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=805872216&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Frazbor-narushenij&rn=793250707&browser-info=we%3A1%3Aet%3A1724486328%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824125848%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724486328&t=gdpr(14)ti(1)")
//                                                                                .headers(headersUC08_1)
//                                                                                .body(RawFileBody("razbornarusheniy/0002_request.gif")),
                                http("request_3")
                                        .get(UC08_uri1 + "/metrika/tag.js")
                                        .headers(headersUC08_3),
                                http("request_4")
                                        .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                http("request_5")
                                        .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                http("request_6")
                                        .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                http("request_7")
                                        .get("/build/images/shtadopm/favicon/site.webmanifest")
                                        .headers(headersUC08_3),
                                http("request_8")
                                        .get(UC08_uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Frazbor-narushenij&page-ref=https%3A%2F%2Fwww.google.com%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A892286489%3Az%3A300%3Ai%3A20240824125849%3Aet%3A1724486329%3Ac%3A1%3Arn%3A685310649%3Arqn%3A240%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C410%2C3%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724486328595%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724486329%3At%3A%D0%90%D0%BD%D0%B0%D0%BB%D0%B8%D0%B7%D0%B8%D1%80%D1%83%D0%B5%D0%BC%20%D1%81%D0%BE%D0%BE%D0%B1%D1%89%D0%B5%D0%BD%D0%B8%D1%8F%20%D0%BE%20%D0%B2%D0%BE%D0%B7%D0%BC%D0%BE%D0%B6%D0%BD%D1%8B%D1%85%20%D0%BD%D0%B0%D1%80%D1%83%D1%88%D0%B5%D0%BD%D0%B8%D1%8F%D1%85&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                        .headers(headersUC08_8),
                                http("request_9")
                                        .get(UC08_uri1 + "/metrika/metrika_match.html")
                                        .headers(headersUC08_9)
                        )
        );

    HttpProtocolBuilder httpProtocol_Press = http
            .baseUrl("https://mc.yandex.ru")
            .inferHtmlResources();

    Map<CharSequence, String> headersUC09_0 = new HashMap<>();
    headersUC09_0.put("accept", "*/*");
    headersUC09_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC09_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC09_0.put("content-type", "text/plain");
    headersUC09_0.put("origin", "https://shtab.opmoscow.ru");
    headersUC09_0.put("priority", "u=1, i");
    headersUC09_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC09_0.put("sec-ch-ua-mobile", "?0");
    headersUC09_0.put("sec-ch-ua-platform", "Linux");
    headersUC09_0.put("sec-fetch-dest", "empty");
    headersUC09_0.put("sec-fetch-mode", "cors");
    headersUC09_0.put("sec-fetch-site", "cross-site");
    headersUC09_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

    Map<CharSequence, String> headersUC09_2 = new HashMap<>();
    headersUC09_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC09_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC09_2.put("sec-ch-ua-mobile", "?0");
    headersUC09_2.put("sec-ch-ua-platform", "Linux");

    Map<CharSequence, String> headersUC09_12 = new HashMap<>();
    headersUC09_12.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC09_12.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC09_12.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC09_12.put("priority", "u=0, i");
    headersUC09_12.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC09_12.put("sec-ch-ua-mobile", "?0");
    headersUC09_12.put("sec-ch-ua-platform", "Linux");
    headersUC09_12.put("sec-fetch-dest", "document");
    headersUC09_12.put("sec-fetch-mode", "navigate");
    headersUC09_12.put("sec-fetch-site", "cross-site");
    headersUC09_12.put("sec-fetch-user", "?1");
    headersUC09_12.put("upgrade-insecure-requests", "1");
    headersUC09_12.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

    Map<CharSequence, String> headersUC09_26 = new HashMap<>();
    headersUC09_26.put("accept", "*/*");
    headersUC09_26.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC09_26.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC09_26.put("origin", "https://shtab.opmoscow.ru");
    headersUC09_26.put("priority", "u=1, i");
    headersUC09_26.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC09_26.put("sec-ch-ua-mobile", "?0");
    headersUC09_26.put("sec-ch-ua-platform", "Linux");
    headersUC09_26.put("sec-fetch-dest", "empty");
    headersUC09_26.put("sec-fetch-mode", "cors");
    headersUC09_26.put("sec-fetch-site", "cross-site");
    headersUC09_26.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

    Map<CharSequence, String> headersUC09_27 = new HashMap<>();
    headersUC09_27.put("Upgrade-Insecure-Requests", "1");
    headersUC09_27.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC09_27.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC09_27.put("sec-ch-ua-mobile", "?0");
    headersUC09_27.put("sec-ch-ua-platform", "Linux");

    String UC09_uri2 = "https://shtab.opmoscow.ru";

    ScenarioBuilder scnUC09 = scenario("Press")
            .exec(
                    http("request_0")
                            .post("/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=631142777&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fpress&rn=483912631&browser-info=bt%3A1%3Awe%3A1%3Aet%3A1724486377%3Aw%3A1920x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824125937%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724486377&t=gdpr(14)ti(1)")
                            .headers(headersUC09_0)
//                                                                    .body(RawFileBody("press/0000_request.gif"))
                            .resources(
//                                                                            http("request_1")
//                                                                                    .post("/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=631142777&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fpress&rn=235699728&browser-info=we%3A1%3Aet%3A1724486378%3Aw%3A1920x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824125937%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724486378&t=gdpr(14)ti(1)")
//                                                                                    .headers(headersUC09_0)
//                                                                                    .body(RawFileBody("press/0001_request.gif")),
                                    http("request_2")
                                            .get(UC09_uri2 + "/build/5758.f38a32ed.css")
                                            .headers(headersUC09_2),
                                    http("request_3")
                                            .get(UC09_uri2 + "/build/6395.76430bbc.css")
                                            .headers(headersUC09_2),
                                    http("request_4")
                                            .get(UC09_uri2 + "/build/8886.31d6cfe0.css")
                                            .headers(headersUC09_2),
                                    http("request_5")
                                            .get(UC09_uri2 + "/build/shtadopm_css_head.dfe3f750.css")
                                            .headers(headersUC09_2),
                                    http("request_6")
                                            .get(UC09_uri2 + "/build/runtime.aaa04269.js")
                                            .headers(headersUC09_2),
                                    http("request_7")
                                            .get(UC09_uri2 + "/build/9755.89d0240d.js")
                                            .headers(headersUC09_2),
                                    http("request_8")
                                            .get(UC09_uri2 + "/build/shtadopm_app_head.a800bb8d.js")
                                            .headers(headersUC09_2),
                                    http("request_9")
                                            .get(UC09_uri2 + "/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
                                            .headers(headersUC09_2),
                                    http("request_10")
                                            .get(UC09_uri2 + "/build/images/shtadopm/menu-arrow.svg")
                                            .headers(headersUC09_2),
                                    http("request_11")
                                            .get("/metrika/tag.js")
                                            .headers(headersUC09_2),
                                    http("request_12")
                                            .get(UC09_uri2 + "/press")
                                            .headers(headersUC09_12),
                                    http("request_13")
                                            .get(UC09_uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                    http("request_14")
                                            .get(UC09_uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                    http("request_15")
                                            .get(UC09_uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                    http("request_16")
                                            .get(UC09_uri2 + "/build/7255.871eb160.js")
                                            .headers(headersUC09_2),
                                    http("request_17")
                                            .get(UC09_uri2 + "/build/6889.3f713c69.js")
                                            .headers(headersUC09_2),
                                    http("request_18")
                                            .get(UC09_uri2 + "/build/7729.67d87565.js")
                                            .headers(headersUC09_2),
                                    http("request_19")
                                            .get(UC09_uri2 + "/build/8981.bc50772a.js")
                                            .headers(headersUC09_2),
                                    http("request_20")
                                            .get(UC09_uri2 + "/build/3734.2c5e1582.js")
                                            .headers(headersUC09_2),
                                    http("request_21")
                                            .get(UC09_uri2 + "/build/9154.f1370752.js")
                                            .headers(headersUC09_2),
                                    http("request_22")
                                            .get(UC09_uri2 + "/build/1676.2634f191.js")
                                            .headers(headersUC09_2),
                                    http("request_23")
                                            .get(UC09_uri2 + "/build/shtadopm_app_footer.9745ecad.js")
                                            .headers(headersUC09_2),
                                    http("request_24")
                                            .get(UC09_uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
                                            .headers(headersUC09_2),
                                    http("request_25")
                                            .get(UC09_uri2 + "/build/images/shtadopm/favicon/favicon.ico")
                                            .headers(headersUC09_2),
                                    http("request_26")
                                            .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fpress&page-ref=https%3A%2F%2Fwww.google.com%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A252178634%3Az%3A300%3Ai%3A20240824125939%3Aet%3A1724486379%3Ac%3A1%3Arn%3A655465797%3Arqn%3A243%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C418%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724486378506%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724486379%3At%3A%D0%9E%D1%82%D0%BA%D1%80%D1%8B%D1%82%D1%8B%20%D0%B4%D0%BB%D1%8F%20%D0%A1%D0%9C%D0%98&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                            .headers(headersUC09_26),
                                    http("request_27")
                                            .get("/metrika/metrika_match.html")
                                            .headers(headersUC09_27)
                            )
            );

        HttpProtocolBuilder httpProtocol_Vybory = http
                .baseUrl("https://mc.yandex.ru")
                .inferHtmlResources();

        Map<CharSequence, String> headersUC10_0 = new HashMap<>();
        headersUC10_0.put("accept", "*/*");
        headersUC10_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC10_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC10_0.put("content-type", "text/plain");
        headersUC10_0.put("origin", "https://shtab.opmoscow.ru");
        headersUC10_0.put("priority", "u=1, i");
        headersUC10_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC10_0.put("sec-ch-ua-mobile", "?0");
        headersUC10_0.put("sec-ch-ua-platform", "Linux");
        headersUC10_0.put("sec-fetch-dest", "empty");
        headersUC10_0.put("sec-fetch-mode", "cors");
        headersUC10_0.put("sec-fetch-site", "cross-site");
        headersUC10_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC10_1 = new HashMap<>();
        headersUC10_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC10_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC10_1.put("sec-ch-ua-mobile", "?0");
        headersUC10_1.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC10_15 = new HashMap<>();
        headersUC10_15.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersUC10_15.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC10_15.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC10_15.put("priority", "u=0, i");
        headersUC10_15.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC10_15.put("sec-ch-ua-mobile", "?0");
        headersUC10_15.put("sec-ch-ua-platform", "Linux");
        headersUC10_15.put("sec-fetch-dest", "document");
        headersUC10_15.put("sec-fetch-mode", "navigate");
        headersUC10_15.put("sec-fetch-site", "same-origin");
        headersUC10_15.put("sec-fetch-user", "?1");
        headersUC10_15.put("upgrade-insecure-requests", "1");
        headersUC10_15.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersUC10_26 = new HashMap<>();
        headersUC10_26.put("Upgrade-Insecure-Requests", "1");
        headersUC10_26.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersUC10_26.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC10_26.put("sec-ch-ua-mobile", "?0");
        headersUC10_26.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersUC10_27 = new HashMap<>();
        headersUC10_27.put("accept", "*/*");
        headersUC10_27.put("accept-encoding", "gzip, deflate, br, zstd");
        headersUC10_27.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersUC10_27.put("origin", "https://shtab.opmoscow.ru");
        headersUC10_27.put("priority", "u=1, i");
        headersUC10_27.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersUC10_27.put("sec-ch-ua-mobile", "?0");
        headersUC10_27.put("sec-ch-ua-platform", "Linux");
        headersUC10_27.put("sec-fetch-dest", "empty");
        headersUC10_27.put("sec-fetch-mode", "cors");
        headersUC10_27.put("sec-fetch-site", "cross-site");
        headersUC10_27.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        String UC10_uri2 = "https://shtab.opmoscow.ru";

        ScenarioBuilder scnUC10 = scenario("Vybory")
                .exec(
                        http("request_0")
                                .post("/webvisor/89667203?wv-part=8&wv-type=7&wmode=0&wv-hit=902557682&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fvybory&rn=215986820&browser-info=we%3A1%3Aet%3A1724422468%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823191428%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724422468&t=gdpr(14)ti(1)")
                                .headers(headersUC10_0)
//                                                                        .body(RawFileBody("vybory/0000_request.gif"))
                                .resources(
                                        http("request_1")
                                                .get(UC10_uri2 + "/build/5758.f38a32ed.css")
                                                .headers(headersUC10_1),
                                        http("request_2")
                                                .get(UC10_uri2 + "/build/6395.76430bbc.css")
                                                .headers(headersUC10_1),
                                        http("request_3")
                                                .get(UC10_uri2 + "/build/8886.31d6cfe0.css")
                                                .headers(headersUC10_1),
                                        http("request_4")
                                                .get(UC10_uri2 + "/build/shtadopm_css_head.dfe3f750.css")
                                                .headers(headersUC10_1),
                                        http("request_5")
                                                .get(UC10_uri2 + "/build/runtime.aaa04269.js")
                                                .headers(headersUC10_1),
                                        http("request_6")
                                                .get(UC10_uri2 + "/build/9755.89d0240d.js")
                                                .headers(headersUC10_1),
                                        http("request_7")
                                                .get(UC10_uri2 + "/build/shtadopm_app_head.a800bb8d.js")
                                                .headers(headersUC10_1),
                                        http("request_8")
                                                .get(UC10_uri2 + "/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
                                                .headers(headersUC10_1),
                                        http("request_9")
                                                .get(UC10_uri2 + "/build/images/shtadopm/menu-arrow.svg")
                                                .headers(headersUC10_1),
                                        http("request_10")
                                                .get("/metrika/tag.js")
                                                .headers(headersUC10_1),
                                        http("request_11")
                                                .get(UC10_uri2 + "/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
                                        http("request_12")
                                                .get(UC10_uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
                                        http("request_13")
                                                .get(UC10_uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
                                        http("request_14")
                                                .get(UC10_uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
                                        http("request_15")
                                                .get(UC10_uri2 + "/vybory")
                                                .headers(headersUC10_15),
                                        http("request_16")
                                                .get(UC10_uri2 + "/build/7255.871eb160.js")
                                                .headers(headersUC10_1),
                                        http("request_17")
                                                .get(UC10_uri2 + "/build/6889.3f713c69.js")
                                                .headers(headersUC10_1),
                                        http("request_18")
                                                .get(UC10_uri2 + "/build/7729.67d87565.js")
                                                .headers(headersUC10_1),
                                        http("request_19")
                                                .get(UC10_uri2 + "/build/8981.bc50772a.js")
                                                .headers(headersUC10_1),
                                        http("request_20")
                                                .get(UC10_uri2 + "/build/3734.2c5e1582.js")
                                                .headers(headersUC10_1),
                                        http("request_21")
                                                .get(UC10_uri2 + "/build/9154.f1370752.js")
                                                .headers(headersUC10_1),
                                        http("request_22")
                                                .get(UC10_uri2 + "/build/1676.2634f191.js")
                                                .headers(headersUC10_1),
                                        http("request_23")
                                                .get(UC10_uri2 + "/build/shtadopm_app_footer.9745ecad.js")
                                                .headers(headersUC10_1),
                                        http("request_24")
                                                .get(UC10_uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
                                                .headers(headersUC10_1),
                                        http("request_25")
                                                .get(UC10_uri2 + "/build/images/shtadopm/favicon/favicon.ico")
                                                .headers(headersUC10_1),
                                        http("request_26")
                                                .get("/metrika/metrika_match.html")
                                                .headers(headersUC10_26),
                                        http("request_27")
                                                .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fvybory&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Fv-stolice-startovalo-testovoe-golosovanie&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A698479786%3Az%3A300%3Ai%3A20240823191428%3Aet%3A1724422469%3Ac%3A1%3Arn%3A708141308%3Arqn%3A105%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C331%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724422468406%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422469%3At%3A%D0%92%D1%8B%D0%B1%D0%BE%D1%80%D1%8B%20%D0%B4%D0%B5%D0%BF%D1%83%D1%82%D0%B0%D1%82%D0%BE%D0%B2%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%B3%D0%BE%D1%80%D0%B4%D1%83%D0%BC%D1%83%20(%D0%9C%D0%93%D0%94)%2C%20%D0%A2%D0%B8%D0%9D%D0%90%D0%9E%20%D0%B8%20%D1%80%D0%B0%D0%B9%D0%BE%D0%BD%D0%B5%20%D0%9A%D1%83%D1%80%D0%BA%D0%B8%D0%BD%D0%BE%20%D0%B2%202024%20%D0%B3%D0%BE%D0%B4%D1%83&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                                .headers(headersUC10_27)
                                )
                );

//        Установки

        setUp(
                scnUC01.injectClosed(
                        constantConcurrentUsers(users_flood_UC01).during(40000)
                ).protocols(httpProtocol_MainPage)
                ,
                scnUC02.injectClosed(
                        constantConcurrentUsers(users_flood_UC02).during(40000)
                ).protocols(httpProtocol_DistanceVoting)
                ,
                scnUC03.injectClosed(
                        constantConcurrentUsers(users_flood_UC03).during(40000)
                ).protocols(httpProtocol_IzbiratUchastki)
                ,
                scnUC04.injectClosed(
                        constantConcurrentUsers(users_flood_UC04).during(40000)
                ).protocols(httpProtocol_Nabludateli)
                ,
                scnUC05.injectClosed(
                        constantConcurrentUsers(users_flood_UC05).during(40000)
                ).protocols(httpProtocol_Operatori)
                ,
                scnUC06.injectClosed(
                        constantConcurrentUsers(users_flood_UC06).during(40000)
                ).protocols(httpProtocol_CallCenter)
                ,
                scnUC07.injectClosed(
                        constantConcurrentUsers(users_flood_UC07).during(40000)
                ).protocols(httpProtocol_GBR)
                ,
                scnUC08.injectClosed(
                        constantConcurrentUsers(users_flood_UC08).during(40000)
                ).protocols(httpProtocol_RazborNarusheniy)
                ,
                scnUC09.injectClosed(
                        constantConcurrentUsers(users_flood_UC09).during(40000)
                ).protocols(httpProtocol_Press)
                ,
                scnUC10.injectClosed(
                        constantConcurrentUsers(users_flood_UC10).during(40000)
                ).protocols(httpProtocol_Vybory)
        );
    }
}