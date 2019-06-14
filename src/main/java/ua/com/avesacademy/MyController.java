package ua.com.avesacademy;


import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.method.P;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class MyController {

    @Autowired
    UserService userService;
    @Autowired
    PageTonirovkaService pageService;
    @Autowired
    PageWindowFilmService pageWindowFilmService;
    @Autowired
    PagePPFServise pagePPFServise;
    @Autowired
    PageDeteylingServece pageDeteylingServece;
    @Autowired
    PageSaleService pageSaleService;
    @Autowired
    PageMarketingService pageMarketingService;
    @Autowired
    PageManagementService pageManagementService;
    @Autowired
    PageOneCServise pageOneCServise;


    @RequestMapping("/")
    public String index(Model model){

        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String login = user.getUsername();
        model.addAttribute("login", login);


        return "index";
    }

    @RequestMapping("/unauthorized")
    public String unauthorized(Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login", user.getUsername());
        return "unauthorized";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }

    @RequestMapping("/pageSale")
    public String pageSale(Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login",user.getUsername());
        List<PageSale> pageSales = pageSaleService.findAllSale();
        model.addAttribute("pages", pageSales);

        return "pageSale";

    }

    @RequestMapping("/OneC")
    public String pageOneC(Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login",user.getUsername());
        List<PageOneC> pageOneCS = pageOneCServise.findAllOneC();
        model.addAttribute("pages",pageOneCS);

        return "pageOneC";
    }
    @RequestMapping("/pageDeteyling")
    public String pageDeteyling(Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login",user.getUsername());
        List<PageDeteyling> pageDeteylings = pageDeteylingServece.findAllDeteyling();
        model.addAttribute("pages", pageDeteylings);

        return "pageDeteyling";
    }
    @RequestMapping("/pageTonirovka")
    public String pageTonirovka(Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<PageTonirovka> pageTonirovkaList = pageService.findAllTonirovka();
        model.addAttribute("pages", pageTonirovkaList);
        model.addAttribute("login",user.getUsername());
        return "pageTonirovka";
    }
    @RequestMapping("/pageWindowFilm")
    public String pageWindowFilm(Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<PageWindowFilm> pageWindowFilmList = pageWindowFilmService.findAllWindowFilm();
        model.addAttribute("login",user.getUsername());
        model.addAttribute("pages",pageWindowFilmList);

        return "pageWindowFilm";
    }
    @RequestMapping("/pageMarketing")
    public String pageMarketing(Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login",user.getUsername());
        List<PageMarketing> pageMarketingList = pageMarketingService.findAllMarketing();
        model.addAttribute("pages", pageMarketingList);

        return "pageMarketing";
    }

    @RequestMapping("/pageManagement")
    public String pageManagement(Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login",user.getUsername());
        List<PageManagement> pageManagementList = pageManagementService.findAll();
        model.addAttribute("pages", pageManagementList);

        return "pageManagement";

    }
    @RequestMapping("/pagePPF")
    public String pagePPF(Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<PagePPF> PPFList = pagePPFServise.findAllPPF();
        model.addAttribute("login",user.getUsername());
        model.addAttribute("pages",PPFList);

        return "pagePPF";

    }
    @RequestMapping("/oneC/{page.name}")
    public String OneC(@PathVariable(value = "page.name") String name, Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login",user.getUsername());
        PageOneC Page = pageOneCServise.findByNameOneC(name);
        model.addAttribute("Page", Page);

        return "tempOneC";
    }

    @RequestMapping("/management/{page.name}")
    public String Management(@PathVariable(value ="page.name") String name, Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login",user.getUsername());
        PageManagement Page = pageManagementService.findByNameManagement(name);
        model.addAttribute("Page", Page);

        return "tempManagement";
    }
    @RequestMapping("/marketing/{page.name}")
    public String Marketing(@PathVariable(value = "page.name") String name, Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login",user.getUsername());
        PageMarketing Page = pageMarketingService.findByNameMarketing(name);
        model.addAttribute("Page", Page);

        return "tempMarketing";
    }

    @RequestMapping("/sale/{page.name}")
    public String Sale(@PathVariable(value = "page.name") String name, Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login",user.getUsername());
        PageSale Page = pageSaleService.findByNameSale(name);
        model.addAttribute("Page", Page);

        return "tempSale";
    }
    @RequestMapping("/deteyling/{page.name}")
    public String Deteyling(@PathVariable(value = "page.name") String name, Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login",user.getUsername());
        PageDeteyling Page = pageDeteylingServece.findByNameDeteyling(name);
        model.addAttribute("Page", Page);

        return "tempDeteyling";

    }
    @RequestMapping("/ppf/{page.name}")
    public String PPF(@PathVariable(value = "page.name") String name, Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login",user.getUsername());
        PagePPF Page = pagePPFServise.findByNamePPF(name);
        model.addAttribute("Page",Page);

        return "tempPPF";
    }
    @RequestMapping("/windowFilm/{page.name}")
    public String windowFilm(@PathVariable(value = "page.name") String name, Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login",user.getUsername());
        PageWindowFilm Page = pageWindowFilmService.findByNameWindowFilm(name);
        model.addAttribute("Page",Page);
        return "tempWindowFilm";
    }



    @RequestMapping("/tonirovka/{page.name}")
    public String tonirovka(@PathVariable(value = "page.name") String name, Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login",user.getUsername());
        PageTonirovka Page = pageService.findByName(name);
        model.addAttribute("Page", Page);
        return "tempTonirovka";
    }

    @RequestMapping("/OneCList")
    public String listOneC(Model model){
        List<PageOneC> pageOneCList = pageOneCServise.findAllOneC();
        model.addAttribute("pages", pageOneCList);

        return "OneCList";
    }
    @RequestMapping("/ManagementList")
    public String listManagement(Model model){
        List<PageManagement> pageManagementList = pageManagementService.findAll();
        model.addAttribute("pages", pageManagementList);

        return "ManagementList";
    }
    @RequestMapping("/MarketingList")
    public String listMarketing(Model model){

        List<PageMarketing> pageMarketingList = pageMarketingService.findAllMarketing();
        model.addAttribute("pages", pageMarketingList);

        return "MarketingList";
    }

    @RequestMapping("/SaleList")
    public String listSale(Model model){

        List<PageSale> pageSaleList = pageSaleService.findAllSale();
        model.addAttribute("pages", pageSaleList);

        return "SaleList";
    }
    @RequestMapping("/WindowFilmList")
    public String listWindowFilm(Model model){
        List<PageWindowFilm> pageWindowFilmList = pageWindowFilmService.findAllWindowFilm();
        model.addAttribute("pages",pageWindowFilmList);
        return "WindowFilmList";
    }
    @RequestMapping("/PPFList")
    public String listPPF(Model model){
        List<PagePPF> pagePPF = pagePPFServise.findAllPPF();
        model.addAttribute("pages", pagePPF);
        return "PPFList";
    }
    @RequestMapping("/DeteylingList")
    public String listDeteyling(Model model){
        List<PageDeteyling> pageDeteylingsList = pageDeteylingServece.findAllDeteyling();
        model.addAttribute("pages", pageDeteylingsList);
        return "DeteylingList";
    }

    @RequestMapping("/TonirovkaList")
    public String listTonirovka(Model model){
        List<PageTonirovka> pageTonirovkaList = pageService.findAllTonirovka();
        model.addAttribute("pages", pageTonirovkaList);
        return "TonirovkaList";
    }

    @RequestMapping("/createOneC")
    public String addOneC(){
        return "createOneC";
    }
    @RequestMapping("/createMarketing")
    public String addMarketing(){
        return "createMarketing";
    }
    @RequestMapping("/createManagement")
    public String addManagement(){
        return "createManagement";
    }
    @RequestMapping("/createPPF")
    public String addPPF(){
        return "createPPF";
    }
    @RequestMapping("/createSale")
    public String addSale(){
        return "createSale";
    }
    @RequestMapping("/createWindowFilm")
    public String addWindowFilm(){
        return "createWindowFilm";
    }

    @RequestMapping("/createDeteyling")
    public String addDeteyling(){
        return "createDeteyling";
    }

    @RequestMapping("/createTonirovka")
    public String addTonirovka(){
        return "createTonirovka";
    }

    @RequestMapping(value = "/oneC/add", method = RequestMethod.POST)
    public String addOnec(@RequestParam String name,
                          @RequestParam String title,
                          @RequestParam String text,
                          @RequestParam String video,
                          @RequestParam String wordFile,
                          @RequestParam String exelFile,
                          @RequestParam String pdfFile){
        PageOneC pageOneC = new PageOneC(name,title,text,video,wordFile,exelFile,pdfFile);
        pageOneC.setName(name);
        pageOneC.setTitle(title);
        pageOneC.setText(text);
        pageOneC.setVideo(video);
        pageOneC.setWordFile(wordFile);
        pageOneC.setExelFile(exelFile);
        pageOneC.setPdfFile(pdfFile);
        pageOneCServise.addPageOneC(pageOneC);

        return "redirect:/OneCList";
    }
    @RequestMapping(value = "/marketing/add", method = RequestMethod.POST)
    public String addMarketing(@RequestParam String name,
                               @RequestParam String title,
                               @RequestParam String text,
                               @RequestParam String video,
                               @RequestParam String wordFile,
                               @RequestParam String exelFile,
                               @RequestParam String pdfFile){

        PageMarketing pageMarketing = new PageMarketing(name,title,text,video,wordFile,exelFile,pdfFile);
        pageMarketingService.addPageMarketing(pageMarketing);

        return "redirect:/MarketingList";
    }

    @RequestMapping(value = "management/add", method = RequestMethod.POST)
    public String addManagement(@RequestParam String name,
                                @RequestParam String title,
                                @RequestParam String text,
                                @RequestParam String video,
                                @RequestParam String wordFile,
                                @RequestParam String exelFile,
                                @RequestParam String pdfFile){
        PageManagement pageManagement = new PageManagement(name,title,text,video,wordFile,exelFile,pdfFile);
        pageManagementService.addPageManagement(pageManagement);

        return "redirect:/ManagementList";
    }
    @RequestMapping(value = "/sale/add", method = RequestMethod.POST)
    public String addSale(@RequestParam String name,
                          @RequestParam String title,
                          @RequestParam String text,
                          @RequestParam String video,
                          @RequestParam String wordFile,
                          @RequestParam String exelFile,
                          @RequestParam String pdfFile){

        PageSale pageSale = new PageSale(name,title,text,video,wordFile,exelFile,pdfFile);
        pageSaleService.addPageSale(pageSale);

        return "redirect:/SaleList";
    }

    @RequestMapping(value = "/deteyling/add", method = RequestMethod.POST)
    public String addDeteyling(@RequestParam String name,
                               @RequestParam String title,
                               @RequestParam String text,
                               @RequestParam String video,
                               @RequestParam String wordFile,
                               @RequestParam String exelFile,
                               @RequestParam String pdfFile){
        PageDeteyling pageDeteyling = new PageDeteyling(name,title,text,video,wordFile,exelFile,pdfFile);
        pageDeteylingServece.addPageDeteyling(pageDeteyling);

        return "redirect:/DeteylingList";
    }

    @RequestMapping(value = "/windowFilm/add", method = RequestMethod.POST)
    public String WFAdd(@RequestParam String name,
                        @RequestParam String title,
                        @RequestParam String text,
                        @RequestParam String video,
                        @RequestParam String wordFile,
                        @RequestParam String exelFile,
                        @RequestParam String pdfFile){
        PageWindowFilm pageWindowFilm = new PageWindowFilm(name,title,text,video,wordFile,exelFile,pdfFile);
        pageWindowFilmService.addPageWindowFilm(pageWindowFilm);

        return "redirect:/WindowFilmList";
    }

    @RequestMapping(value = "/ppf/add", method = RequestMethod.POST)
    public String pageAddPPF(@RequestParam String name,
                             @RequestParam String title,
                             @RequestParam String text,
                             @RequestParam String video,
                             @RequestParam String wordFile,
                             @RequestParam String exelFile,
                             @RequestParam String pdfFile){
        PagePPF pagePPF = new PagePPF(name,title,text,video,wordFile,exelFile,pdfFile);
        pagePPFServise.addPage(pagePPF);

        return "redirect:/PPFList";
    }
    @RequestMapping(value = "/tonirovka/add", method = RequestMethod.POST)
    public String pageAdd(@RequestParam String name,
                            @RequestParam String title,
                          @RequestParam String text,
                          @RequestParam String video,
                          @RequestParam String wordFile,
                          @RequestParam String exelFile,
                          @RequestParam String pdfFile){

        PageTonirovka pageTonirovka = new PageTonirovka(name,title,text,video,wordFile,exelFile,pdfFile);
        pageService.addPage(pageTonirovka);

        return "redirect:/TonirovkaList";
    }
    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public String addUser(@RequestParam String login,
                          @RequestParam String password){
        CustomUser user = new CustomUser(login,password,UserRole.USER);
        userService.addUser(user);

        return "redirect:/userList";
    }

    @RequestMapping("/adminManagement/{page.id}")
    public String updateManagement(@PathVariable(value = "page.id" ) long id, Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login",user.getUsername());
        PageManagement Page = pageManagementService.findByIdManagement(id);
        model.addAttribute("Page", Page);

        return "updateManagement";
    }
    @RequestMapping("/adminMarketing/{page.id}")
    public String updateMarketing(@PathVariable(value = "page.id") long id, Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login",user.getUsername());
        PageMarketing Page = pageMarketingService.findByIdMarketing(id);
        model.addAttribute("Page", Page);

        return "updateMarketing";
    }
    @RequestMapping("/adminSale/{page.id}")
    public String updateSale(@PathVariable(value = "page.id") long id, Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login",user.getUsername());
        PageSale Page = pageSaleService.findByIdSale(id);
        model.addAttribute("Page", Page);

        return "updateSale";
    }

    @RequestMapping("/adminPPF/{page.id}")
    public String updatePPF(@PathVariable(value = "page.id") long id, Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login",user.getUsername());
        PagePPF Page = pagePPFServise.findByIdPPF(id);
        model.addAttribute("Page", Page);

        return "updatePPF";
    }
    @RequestMapping("/adminWindowFilm/{page.id}")
    public String updateWindowFilm(@PathVariable(value ="page.id") long id, Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login",user.getUsername());
        PageWindowFilm Page = pageWindowFilmService.findByIdWindowFilm(id);
        model.addAttribute("Page", Page);

        return "updateWindowFilm";
    }
    @RequestMapping("/adminDeteyling/{page.id}")
    public String updateDeteyling(@PathVariable(value = "page.id") long id, Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login",user.getUsername());
        PageDeteyling Page = pageDeteylingServece.findByIdDeteyling(id);
        model.addAttribute("Page", Page);

        return "updateDeteyling";
    }


    @RequestMapping("/adminTonirovka/{page.id}")
    public String updateTonirovka(@PathVariable(value ="page.id") long id, Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login",user.getUsername());
        PageTonirovka Page = pageService.findById(id);
        model.addAttribute("Page", Page);

        return "updateTonirovka";
    }
    @RequestMapping("/adminOneC/{page.id}")
    public String updateOneC(@PathVariable(value = "page.id") long id, Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login",user.getUsername());
        PageOneC Page = pageOneCServise.findByIdOneC(id);
        model.addAttribute("Page", Page);

        return "updateOneC";
    }

    @RequestMapping(value = "/oneC/update", method = RequestMethod.POST)
    public String pageUpdateOneC(@RequestParam String name,
                                 @RequestParam String title,
                                 @RequestParam String text,
                                 @RequestParam String video,
                                 @RequestParam String wordFile,
                                 @RequestParam String exelFile,
                                 @RequestParam String pdfFile){
        PageOneC pageOneC = pageOneCServise.findByNameOneC(name);
        pageOneC.setName(name);
        pageOneC.setTitle(title);
        pageOneC.setText(text);
        pageOneC.setVideo(video);
        pageOneC.setWordFile(wordFile);
        pageOneC.setExelFile(exelFile);
        pageOneC.setPdfFile(pdfFile);
        pageOneCServise.addPageOneC(pageOneC);

        return "redirect:/OneCList";
    }
    @RequestMapping(value = "/management/update", method = RequestMethod.POST)
    public String pageUpdateManagement(@RequestParam String name,
                                       @RequestParam String title,
                                       @RequestParam String text,
                                       @RequestParam String video,
                                       @RequestParam String wordFile,
                                       @RequestParam String exelFile,
                                       @RequestParam String pdfFile){
        PageManagement pageManagement = pageManagementService.findByNameManagement(name);
        pageManagement.setName(name);
        pageManagement.setTitle(title);
        pageManagement.setText(text);
        pageManagement.setVideo(video);
        pageManagement.setWordFile(wordFile);
        pageManagement.setExelFile(exelFile);
        pageManagement.setPdfFile(pdfFile);
        pageManagementService.addPageManagement(pageManagement);

        return "redirect:/ManagementList";
    }
    @RequestMapping(value = "/marketing/update", method = RequestMethod.POST)
    public String pageUpdateMarketing(@RequestParam String name,
                                      @RequestParam String title,
                                      @RequestParam String text,
                                      @RequestParam String video,
                                      @RequestParam String wordFile,
                                      @RequestParam String exelFile,
                                      @RequestParam String pdfFile){

        PageMarketing pageMarketing = pageMarketingService.findByNameMarketing(name);
        pageMarketing.setName(name);
        pageMarketing.setTitle(title);
        pageMarketing.setText(text);
        pageMarketing.setVideo(video);
        pageMarketing.setWordFile(wordFile);
        pageMarketing.setExelFile(exelFile);
        pageMarketing.setPdfFile(pdfFile);
        pageMarketingService.addPageMarketing(pageMarketing);

        return "redirect:/MarketingList";
    }
    @RequestMapping(value = "/sale/update", method = RequestMethod.POST)
    public String pageUpdateSales(@RequestParam String name,
                                 @RequestParam String title,
                                 @RequestParam String text,
                                 @RequestParam String video,
                                 @RequestParam String wordFile,
                                 @RequestParam String exelFile,
                                 @RequestParam String pdfFile){

        PageSale pageSale = pageSaleService.findByNameSale(name);
        pageSale.setName(name);
        pageSale.setTitle(title);
        pageSale.setText(text);
        pageSale.setVideo(video);
        pageSale.setWordFile(wordFile);
        pageSale.setExelFile(exelFile);
        pageSale.setPdfFile(pdfFile);
        pageSaleService.addPageSale(pageSale);

        return "redirect:/SaleList";
    }
    @RequestMapping(value = "/deteyling/update", method = RequestMethod.POST)
    public String pageUpdateDeteyling(@RequestParam String name,
                                      @RequestParam String title,
                                      @RequestParam String text,
                                      @RequestParam String video,
                                      @RequestParam String wordFile,
                                      @RequestParam String exelFile,
                                      @RequestParam String pdfFile){

        PageDeteyling pageDeteyling = pageDeteylingServece.findByNameDeteyling(name);
        pageDeteyling.setName(name);
        pageDeteyling.setTitle(title);
        pageDeteyling.setText(text);
        pageDeteyling.setVideo(video);
        pageDeteyling.setWordFile(wordFile);
        pageDeteyling.setExelFile(exelFile);
        pageDeteyling.setPdfFile(pdfFile);
        pageDeteylingServece.addPageDeteyling(pageDeteyling);

        return "redirect:/DeteylingList";
    }

    @RequestMapping(value = "/ppf/update", method = RequestMethod.POST)
    public String pageUpdatePPF(@RequestParam String name,
                                @RequestParam String title,
                                @RequestParam String text,
                                @RequestParam String video,
                                @RequestParam String wordFile,
                                @RequestParam String exelFile,
                                @RequestParam String pdfFile){
        PagePPF pagePPF = pagePPFServise.findByNamePPF(name);
        pagePPF.setName(name);
        pagePPF.setTitle(title);
        pagePPF.setText(text);
        pagePPF.setVideo(video);
        pagePPF.setWordFile(wordFile);
        pagePPF.setExelFile(exelFile);
        pagePPF.setPdfFile(pdfFile);
        pagePPFServise.addPage(pagePPF);

        return "redirect:/PPFList";
    }
    @RequestMapping(value = "/windowFilm/update", method = RequestMethod.POST)
    public String pageUpdateWF(@RequestParam String name,
                               @RequestParam String title,
                               @RequestParam String text,
                               @RequestParam String video,
                               @RequestParam String wordFile,
                               @RequestParam String exelFile,
                               @RequestParam String pdfFile){

        PageWindowFilm pageWindowFilm = pageWindowFilmService.findByNameWindowFilm(name);
        pageWindowFilm.setName(name);
        pageWindowFilm.setTitle(title);
        pageWindowFilm.setText(text);
        pageWindowFilm.setVideo(video);
        pageWindowFilm.setWordFile(wordFile);
        pageWindowFilm.setExelFile(exelFile);
        pageWindowFilm.setPdfFile(pdfFile);
        pageWindowFilmService.addPageWindowFilm(pageWindowFilm);

        return "redirect:/WindowFilmList";
    }

    @RequestMapping(value = "/tonirovka/update", method = RequestMethod.POST)
    public String pageUpdateTon(@RequestParam String name,
                             @RequestParam String title,
                             @RequestParam String text,
                             @RequestParam String video,
                             @RequestParam String wordFile,
                             @RequestParam String exelFile,
                             @RequestParam String pdfFile){

        PageTonirovka pageTonirovka = pageService.findByName(name);
        pageTonirovka.setName(name);
        pageTonirovka.setTitle(title);
        pageTonirovka.setText(text);
        pageTonirovka.setVideo(video);
        pageTonirovka.setWordFile(wordFile);
        pageTonirovka.setExelFile(exelFile);
        pageTonirovka.setPdfFile(pdfFile);

        pageService.addPage(pageTonirovka);

        return "redirect:/TonirovkaList";

    }
    @RequestMapping(value = "/adminOneC/delete", method = RequestMethod.POST)
    public ResponseEntity<Void> deleteOneC(@RequestParam(value = "toDelete[]", required = false) long[] toDelete){
        pageOneCServise.deleteOneC(toDelete);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/adminManagement/delete", method = RequestMethod.POST)
    public ResponseEntity<Void> deleteManagement(@RequestParam(value = "toDelete[]", required = false) long[] toDelete){
        pageManagementService.deleteManagement(toDelete);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    @RequestMapping(value = "/adminMarketing/delete", method = RequestMethod.POST)
    public ResponseEntity<Void> deleteMarketing(@RequestParam(value = "toDelete[]", required = false) long[] toDelete){
        pageMarketingService.deleteMarketing(toDelete);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/adminSale/delete", method = RequestMethod.POST)
    public ResponseEntity<Void> deleteSale(@RequestParam(value = "toDelete[]", required = false) long[] toDelete){
        pageSaleService.deletePageSale(toDelete);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    @RequestMapping(value = "/adminDeteyling/delete", method = RequestMethod.POST)
    public ResponseEntity<Void> deleteDeteyling(@RequestParam(value = "toDelete[]",required = false) long[] toDelete){
        pageDeteylingServece.deleteDeteyling(toDelete);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    @RequestMapping(value = "/adminPPF/delete", method = RequestMethod.POST)
    public ResponseEntity<Void> deletePPF(@RequestParam(value = "toDelete[]", required = false) long[] toDelete){

        pagePPFServise.deletePPF(toDelete);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/adminWindowFilm/delete", method = RequestMethod.POST)
    public ResponseEntity<Void> deleteWindowFilm(@RequestParam(value = "toDelete[]", required = false) long[] toDelete){

        pageWindowFilmService.deleteWindowFilm(toDelete);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    @RequestMapping(value = "/adminPage/delete", method = RequestMethod.POST)
    public ResponseEntity<Void> delete(@RequestParam(value = "toDelete[]", required = false) long[] toDelete){

            pageService.deletePage(toDelete);

        return new ResponseEntity<Void>(HttpStatus.OK);

    }
    @RequestMapping("/userList")
    public String userList(Model model){
        List<CustomUser> users= userService.findAll();
        model.addAttribute("users", users);
        return "userList";
    }
    @RequestMapping(value = "/adminUsers/delete", method = RequestMethod.POST)
    public ResponseEntity<Void> deleteUser(@RequestParam(value = "toDelete[]", required = false) long[] toDelete){

        userService.deleteUser(toDelete);

        return new ResponseEntity<Void>(HttpStatus.OK);

    }
    @RequestMapping("/createUser")
    public String createUser(){
        return "createUser";
    }




}
