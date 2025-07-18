package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class glz {
    public static final glz a;
    public static final glz b;
    public static final glz c;
    public static final glz d;
    public static final glz e;
    public static final glz f;
    public static final glz g;
    public static final glz h;
    public static final glz i;
    public static final glz j;
    private static final /* synthetic */ glz[] l;
    public final qpi k;

    static {
        glz glzVar = new glz("START_SETTINGS_INIT_TO_SEARCH_SETTINGS_SERVICE_BOUND", 0, "start_settings_init_to_search_settings_service_bound");
        a = glzVar;
        glz glzVar2 = new glz("SEARCH_SETTINGS_SERVICE_BOUND_TO_FINISH_MIRRORING", 1, "search_settings_service_bound_to_finish_mirroring");
        b = glzVar2;
        glz glzVar3 = new glz("FINISH_MIRRORING_TO_LIBAS_INIT", 2, "finish_mirroring_to_libas_init");
        c = glzVar3;
        glz glzVar4 = new glz("START_INTERACTOR_INIT_TO_ASSISTANT_READY", 3, "start_interactor_init_to_assistant_ready");
        d = glzVar4;
        glz glzVar5 = new glz("START_INTERACTOR_INIT_TO_ASSISTANT_READY_AFTER_REBOOT", 4, "start_interactor_init_to_assistant_ready_after_reboot");
        e = glzVar5;
        glz glzVar6 = new glz("START_INTERACTOR_INIT_TO_ASSISTANT_READY_WITH_NO_SETUP", 5, "start_interactor_init_to_assistant_ready_with_no_setup");
        f = glzVar6;
        glz glzVar7 = new glz("START_INTERACTOR_INIT_TO_ASSISTANT_READY_WITH_NO_SETUP_AFTER_REBOOT", 6, "start_interactor_init_to_assistant_ready_with_no_setup_after_reboot");
        g = glzVar7;
        glz glzVar8 = new glz("START_INTERACTOR_INIT_TO_START_KVSS_SETUP", 7, "start_interactor_init_to_start_kvss_setup");
        h = glzVar8;
        glz glzVar9 = new glz("START_KVSS_SETUP_TO_FINISH_KVSS_SETUP", 8, "start_kvss_setup_to_finish_kvss_setup");
        i = glzVar9;
        glz glzVar10 = new glz("LIBAS_INIT_TO_LIBAS_RUNNING", 9, "libas_init_to_libas_running");
        j = glzVar10;
        glz[] glzVarArr = {glzVar, glzVar2, glzVar3, glzVar4, glzVar5, glzVar6, glzVar7, glzVar8, glzVar9, glzVar10};
        l = glzVarArr;
        agtw.a(glzVarArr);
    }

    private glz(String str, int i2, String str2) {
        this.k = new qpi(str2);
    }

    public static glz[] values() {
        return (glz[]) l.clone();
    }
}
