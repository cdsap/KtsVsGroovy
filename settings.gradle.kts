pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("com.gradle.common-custom-user-data-gradle-plugin") version "1.8.1"
    id("com.gradle.enterprise") version "3.13.4"
}
gradleEnterprise {
    server = "http://ge.solutions-team.gradle.com"
    allowUntrustedServer = true
    buildScan {
        publishAlways()
    }
}
rootProject.name="project"
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}


include (":layer_0:module_0_1")
include (":layer_0:module_0_2")
include (":layer_0:module_0_3")
include (":layer_0:module_0_4")
include (":layer_0:module_0_5")
include (":layer_0:module_0_6")
include (":layer_0:module_0_7")
include (":layer_0:module_0_8")
include (":layer_0:module_0_9")
include (":layer_0:module_0_10")
include (":layer_0:module_0_11")
include (":layer_0:module_0_12")
include (":layer_0:module_0_13")
include (":layer_0:module_0_14")
include (":layer_0:module_0_15")
include (":layer_0:module_0_16")
include (":layer_0:module_0_17")
include (":layer_0:module_0_18")
include (":layer_0:module_0_19")
include (":layer_0:module_0_20")
include (":layer_0:module_0_21")
include (":layer_0:module_0_22")
include (":layer_0:module_0_23")
include (":layer_0:module_0_24")
include (":layer_0:module_0_25")
include (":layer_0:module_0_26")
include (":layer_0:module_0_27")
include (":layer_0:module_0_28")
include (":layer_0:module_0_29")
include (":layer_0:module_0_30")
include (":layer_0:module_0_31")
include (":layer_0:module_0_32")
include (":layer_0:module_0_33")
include (":layer_0:module_0_34")
include (":layer_0:module_0_35")
include (":layer_0:module_0_36")
include (":layer_0:module_0_37")
include (":layer_0:module_0_38")
include (":layer_0:module_0_39")
include (":layer_0:module_0_40")
include (":layer_0:module_0_41")
include (":layer_0:module_0_42")
include (":layer_0:module_0_43")
include (":layer_0:module_0_44")
include (":layer_0:module_0_45")
include (":layer_0:module_0_46")
include (":layer_0:module_0_47")
include (":layer_0:module_0_48")
include (":layer_0:module_0_49")
include (":layer_0:module_0_50")
include (":layer_0:module_0_51")
include (":layer_0:module_0_52")
include (":layer_0:module_0_53")
include (":layer_0:module_0_54")
include (":layer_0:module_0_55")
include (":layer_0:module_0_56")
include (":layer_0:module_0_57")
include (":layer_1:module_1_58")
include (":layer_1:module_1_59")
include (":layer_1:module_1_60")
include (":layer_1:module_1_61")
include (":layer_1:module_1_62")
include (":layer_1:module_1_63")
include (":layer_1:module_1_64")
include (":layer_1:module_1_65")
include (":layer_1:module_1_66")
include (":layer_1:module_1_67")
include (":layer_1:module_1_68")
include (":layer_1:module_1_69")
include (":layer_1:module_1_70")
include (":layer_1:module_1_71")
include (":layer_1:module_1_72")
include (":layer_1:module_1_73")
include (":layer_1:module_1_74")
include (":layer_1:module_1_75")
include (":layer_1:module_1_76")
include (":layer_1:module_1_77")
include (":layer_1:module_1_78")
include (":layer_1:module_1_79")
include (":layer_1:module_1_80")
include (":layer_1:module_1_81")
include (":layer_1:module_1_82")
include (":layer_1:module_1_83")
include (":layer_1:module_1_84")
include (":layer_1:module_1_85")
include (":layer_1:module_1_86")
include (":layer_1:module_1_87")
include (":layer_1:module_1_88")
include (":layer_1:module_1_89")
include (":layer_1:module_1_90")
include (":layer_1:module_1_91")
include (":layer_1:module_1_92")
include (":layer_1:module_1_93")
include (":layer_1:module_1_94")
include (":layer_1:module_1_95")
include (":layer_1:module_1_96")
include (":layer_1:module_1_97")
include (":layer_1:module_1_98")
include (":layer_1:module_1_99")
include (":layer_1:module_1_100")
include (":layer_1:module_1_101")
include (":layer_1:module_1_102")
include (":layer_1:module_1_103")
include (":layer_1:module_1_104")
include (":layer_1:module_1_105")
include (":layer_1:module_1_106")
include (":layer_1:module_1_107")
include (":layer_1:module_1_108")
include (":layer_1:module_1_109")
include (":layer_1:module_1_110")
include (":layer_1:module_1_111")
include (":layer_1:module_1_112")
include (":layer_1:module_1_113")
include (":layer_1:module_1_114")
include (":layer_1:module_1_115")
include (":layer_1:module_1_116")
include (":layer_1:module_1_117")
include (":layer_1:module_1_118")
include (":layer_1:module_1_119")
include (":layer_1:module_1_120")
include (":layer_1:module_1_121")
include (":layer_1:module_1_122")
include (":layer_1:module_1_123")
include (":layer_1:module_1_124")
include (":layer_1:module_1_125")
include (":layer_1:module_1_126")
include (":layer_1:module_1_127")
include (":layer_1:module_1_128")
include (":layer_1:module_1_129")
include (":layer_1:module_1_130")
include (":layer_1:module_1_131")
include (":layer_1:module_1_132")
include (":layer_1:module_1_133")
include (":layer_1:module_1_134")
include (":layer_1:module_1_135")
include (":layer_1:module_1_136")
include (":layer_1:module_1_137")
include (":layer_1:module_1_138")
include (":layer_1:module_1_139")
include (":layer_1:module_1_140")
include (":layer_1:module_1_141")
include (":layer_1:module_1_142")
include (":layer_1:module_1_143")
include (":layer_1:module_1_144")
include (":layer_1:module_1_145")
include (":layer_1:module_1_146")
include (":layer_1:module_1_147")
include (":layer_2:module_2_148")
include (":layer_2:module_2_149")
include (":layer_2:module_2_150")
include (":layer_2:module_2_151")
include (":layer_2:module_2_152")
include (":layer_2:module_2_153")
include (":layer_3:module_3_154")
include (":layer_3:module_3_155")
include (":layer_3:module_3_156")
include (":layer_3:module_3_157")
include (":layer_3:module_3_158")
include (":layer_3:module_3_159")
include (":layer_3:module_3_160")
include (":layer_3:module_3_161")
include (":layer_3:module_3_162")
include (":layer_3:module_3_163")
include (":layer_3:module_3_164")
include (":layer_3:module_3_165")
include (":layer_3:module_3_166")
include (":layer_3:module_3_167")
include (":layer_3:module_3_168")
include (":layer_3:module_3_169")
include (":layer_3:module_3_170")
include (":layer_3:module_3_171")
include (":layer_3:module_3_172")
include (":layer_3:module_3_173")
include (":layer_3:module_3_174")
include (":layer_3:module_3_175")
include (":layer_3:module_3_176")
include (":layer_3:module_3_177")
include (":layer_3:module_3_178")
include (":layer_3:module_3_179")
include (":layer_3:module_3_180")
include (":layer_3:module_3_181")
include (":layer_3:module_3_182")
include (":layer_3:module_3_183")
include (":layer_3:module_3_184")
include (":layer_3:module_3_185")
include (":layer_3:module_3_186")
include (":layer_3:module_3_187")
include (":layer_3:module_3_188")
include (":layer_3:module_3_189")
include (":layer_3:module_3_190")
include (":layer_3:module_3_191")
include (":layer_3:module_3_192")
include (":layer_3:module_3_193")
include (":layer_3:module_3_194")
include (":layer_3:module_3_195")
include (":layer_3:module_3_196")
include (":layer_3:module_3_197")
include (":layer_3:module_3_198")
include (":layer_3:module_3_199")
include (":layer_3:module_3_200")
include (":layer_3:module_3_201")
include (":layer_3:module_3_202")
include (":layer_3:module_3_203")
include (":layer_3:module_3_204")
include (":layer_3:module_3_205")
include (":layer_3:module_3_206")
include (":layer_3:module_3_207")
include (":layer_3:module_3_208")
include (":layer_3:module_3_209")
include (":layer_3:module_3_210")
include (":layer_3:module_3_211")
include (":layer_3:module_3_212")
include (":layer_3:module_3_213")
include (":layer_3:module_3_214")
include (":layer_3:module_3_215")
include (":layer_3:module_3_216")
include (":layer_3:module_3_217")
include (":layer_3:module_3_218")
include (":layer_3:module_3_219")
include (":layer_3:module_3_220")
include (":layer_3:module_3_221")
include (":layer_3:module_3_222")
include (":layer_3:module_3_223")
include (":layer_3:module_3_224")
include (":layer_3:module_3_225")
include (":layer_3:module_3_226")
include (":layer_3:module_3_227")
include (":layer_3:module_3_228")
include (":layer_3:module_3_229")
include (":layer_3:module_3_230")
include (":layer_3:module_3_231")
include (":layer_3:module_3_232")
include (":layer_3:module_3_233")
include (":layer_3:module_3_234")
include (":layer_3:module_3_235")
include (":layer_3:module_3_236")
include (":layer_3:module_3_237")
include (":layer_3:module_3_238")
include (":layer_3:module_3_239")
include (":layer_3:module_3_240")
include (":layer_3:module_3_241")
include (":layer_3:module_3_242")
include (":layer_3:module_3_243")
include (":layer_4:module_4_244")
include (":layer_4:module_4_245")
include (":layer_4:module_4_246")
include (":layer_4:module_4_247")
include (":layer_4:module_4_248")
include (":layer_4:module_4_249")
include (":layer_4:module_4_250")
include (":layer_4:module_4_251")
include (":layer_4:module_4_252")
include (":layer_4:module_4_253")
include (":layer_4:module_4_254")
include (":layer_4:module_4_255")
include (":layer_4:module_4_256")
include (":layer_4:module_4_257")
include (":layer_4:module_4_258")
include (":layer_4:module_4_259")
include (":layer_4:module_4_260")
include (":layer_4:module_4_261")
include (":layer_4:module_4_262")
include (":layer_4:module_4_263")
include (":layer_4:module_4_264")
include (":layer_4:module_4_265")
include (":layer_4:module_4_266")
include (":layer_4:module_4_267")
include (":layer_4:module_4_268")
include (":layer_4:module_4_269")
include (":layer_4:module_4_270")
include (":layer_4:module_4_271")
include (":layer_4:module_4_272")
include (":layer_4:module_4_273")
include (":layer_4:module_4_274")
include (":layer_4:module_4_275")
include (":layer_4:module_4_276")
include (":layer_4:module_4_277")
include (":layer_4:module_4_278")
include (":layer_4:module_4_279")
include (":layer_4:module_4_280")
include (":layer_4:module_4_281")
include (":layer_4:module_4_282")
include (":layer_4:module_4_283")
include (":layer_4:module_4_284")
include (":layer_4:module_4_285")
include (":layer_4:module_4_286")
include (":layer_4:module_4_287")
include (":layer_4:module_4_288")
include (":layer_4:module_4_289")
include (":layer_4:module_4_290")
include (":layer_4:module_4_291")
include (":layer_4:module_4_292")
include (":layer_4:module_4_293")
include (":layer_4:module_4_294")
include (":layer_4:module_4_295")
include (":layer_4:module_4_296")
include (":layer_4:module_4_297")
include (":layer_4:module_4_298")
include (":layer_4:module_4_299")
include (":layer_4:module_4_300")
include (":layer_4:module_4_301")
include (":layer_4:module_4_302")
include (":layer_4:module_4_303")
include (":layer_4:module_4_304")
include (":layer_4:module_4_305")
include (":layer_4:module_4_306")
include (":layer_4:module_4_307")
include (":layer_4:module_4_308")
include (":layer_4:module_4_309")
include (":layer_4:module_4_310")
include (":layer_4:module_4_311")
include (":layer_4:module_4_312")
include (":layer_4:module_4_313")
include (":layer_4:module_4_314")
include (":layer_4:module_4_315")
include (":layer_4:module_4_316")
include (":layer_4:module_4_317")
include (":layer_4:module_4_318")
include (":layer_4:module_4_319")
include (":layer_4:module_4_320")
include (":layer_4:module_4_321")
include (":layer_4:module_4_322")
include (":layer_4:module_4_323")
include (":layer_4:module_4_324")
include (":layer_4:module_4_325")
include (":layer_4:module_4_326")
include (":layer_4:module_4_327")
include (":layer_4:module_4_328")
include (":layer_4:module_4_329")
include (":layer_4:module_4_330")
include (":layer_4:module_4_331")
include (":layer_4:module_4_332")
include (":layer_4:module_4_333")
include (":layer_5:module_5_334")