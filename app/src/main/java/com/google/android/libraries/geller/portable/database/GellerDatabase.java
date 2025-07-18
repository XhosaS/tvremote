package com.google.android.libraries.geller.portable.database;

import com.google.protos.assistant.portable.geller.GellerDeleteParams;
import defpackage.acdl;
import defpackage.acgd;
import defpackage.yzq;
import defpackage.zdd;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface GellerDatabase {
    public static final yzq a = new zdd(acgd.HERON.name());
    public static final yzq b = yzq.u(acgd.GDD_AAE_SMART_ACTION_MODELS.name(), acgd.GDD_AGSA_APA_CONTACT.name(), acgd.GDD_AGSA_APA_ROADWAY_RECAP_MODELS.name(), acgd.GDD_AGSA_APA_SUMMARIZE.name(), acgd.GDD_AGSA_APA_TCLIB_PERSON_NAME.name(), acgd.GDD_AGSA_APA_TEST_GROUP.name(), acgd.GDD_AGSA_APA_TEXT_CLASSIFIER.name(), acgd.GDD_AGSA_GROWTH_TRACKING.name(), acgd.GDD_AGSA_UNIFIED_MIC.name(), acgd.GDD_AIP_TOAST_QUALITY.name(), acgd.GDD_ANDROID_AUTOFILL_FIELD_PREDICTIONS.name(), acgd.GDD_ANDROID_AUTOFILL_VCN_MERCHANT_OPT_OUT.name(), acgd.GDD_APA_ARC_POP_NLU_MODELS.name(), acgd.GDD_APA_BISTO.name(), acgd.GDD_APA_BISTO_DEVICE_CUSTOMIZE_INFO.name(), acgd.GDD_APA_CORRECTIONS.name(), acgd.GDD_APA_DICTATION_FORMATTING.name(), acgd.GDD_APA_GENIE_FM.name(), acgd.GDD_APA_HEAD_SUGGEST.name(), acgd.GDD_APA_HOTMATCH.name(), acgd.GDD_APA_HOTWORD_MODEL.name(), acgd.GDD_APA_LIGHTWEIGHT_TOKENS.name(), acgd.GDD_APA_POP.name(), acgd.GDD_APA_RIOD.name(), acgd.GDD_APA_SMART_ACTION_MODELS.name(), acgd.GDD_APA_TELEPORT.name(), acgd.GDD_APA_UCM_TFL.name(), acgd.GDD_APA_WARMACTIONS.name(), acgd.GDD_ASSISTANT_AUTO_EMBEDDED_POP.name(), acgd.GDD_BUGLE_DATA_DOWNLOAD.name(), acgd.GDD_BUGLE_EMOJIFY.name(), acgd.GDD_BUGLE_SMARTS.name(), acgd.GDD_BUGLE_SUMMARIZATION.name(), acgd.GDD_CAMERA_FEATURE_COMBINATION_QUERY_GDD.name(), acgd.GDD_CAST_DEVICECONFIGS.name(), acgd.GDD_CUSTOMIZATIONBUNDLE_THEMEPACK.name(), acgd.GDD_FILES_OCR_ML_MODEL.name(), acgd.GDD_GOOGLE_PLAY_BOOKS_ANDROID_READING_PRACTICE_SOUND_OUT.name(), acgd.GDD_LENS_AVS.name(), acgd.GDD_LENS_EDU.name(), acgd.GDD_LENS_INPAINTING.name(), acgd.GDD_LENS_OFFLINE_TEXT.name(), acgd.GDD_LENS_RAID.name(), acgd.GDD_LENS_SCENE_X.name(), acgd.GDD_LENS_SEGMENTATION.name(), acgd.GDD_LENS_TEXT.name(), acgd.GDD_LENS_TEXT_CLASSIFIER.name(), acgd.GDD_NGA_GENIE_FM.name(), acgd.GDD_ODLH_FA_REGIONS.name(), acgd.GDD_PIXELCARE_AGENT_RESOURCES.name(), acgd.GDD_PIXELMERLIN_MODELS.name(), acgd.GDD_SBG_SPEECH_MODEL_DOWNLOAD.name(), acgd.GDD_SCONE_UE_CAPA_DOWNLOADER.name(), acgd.GDD_SPEECH_DSP_HOTWORD_MODEL.name(), acgd.GDD_TR_DICTIONARY.name(), acgd.GDD_TR_NMT.name(), acgd.GDD_TR_TRANSLITERATION.name(), acgd.GDD_WALLET_ISSUER_LOCATION.name(), acgd.GDD_WALLET_OCR_IMAGE_PASSES.name(), acgd.GDD_WEBREF.name(), acgd.GDD_WEBREF_NGA.name(), acgd.GDD_WELLBEING_INTELLIGENCE.name());

    long a(String str, acdl acdlVar);

    Map b();

    void c();

    long delete(String str);

    long delete(String str, byte[] bArr);

    long deleteMetadata(String str, String str2);

    byte[] getCorpusStats();

    byte[] getCorpusStats(String[] strArr);

    byte[] getSnapshot(String[] strArr, int i, boolean z);

    long markSyncStatus(String str, byte[] bArr);

    byte[][] read(String str, boolean z, boolean z2);

    byte[][] read(String str, byte[] bArr);

    byte[][] readAll(String str);

    String[] readDatabaseInfo(String str);

    byte[][] readElementIds(String str, byte[] bArr);

    String[] readKeys(String str);

    String[] readMetadata(String str, String str2);

    byte[] readMetadataForAllCorpora(String str);

    byte[][] readOutdatedData(String str);

    long setDeletionProcessed(byte[] bArr);

    long softDelete(String str, GellerDeleteParams gellerDeleteParams);

    long softDelete(String str, byte[] bArr);

    boolean write(String str, String[] strArr, long j, boolean z, byte[] bArr);

    byte[] write(byte[] bArr);

    boolean writeMetadata(String str, String str2, String str3);

    byte[] writeWithResult(String str, String[] strArr, long j, boolean z, byte[] bArr);
}
