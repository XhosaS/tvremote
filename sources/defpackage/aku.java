package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aku {
    public static final aes a;
    public static final aes b;
    public static final aes c;
    public static final aes d;
    public static final aes e;
    public static final aes f;
    public static final aes g;
    public static final aes h;
    public static final aes i;
    public static final aes[] j;

    static {
        aes aesVar = new aes("commit_to_configuration_v2_api", 1L);
        a = aesVar;
        aes aesVar2 = new aes("get_serving_version_api", 1L);
        b = aesVar2;
        aes aesVar3 = new aes("get_experiment_tokens_api", 1L);
        c = aesVar3;
        aes aesVar4 = new aes("register_flag_update_listener_api", 2L);
        d = aesVar4;
        aes aesVar5 = new aes("sync_after_api", 1L);
        e = aesVar5;
        aes aesVar6 = new aes("sync_after_for_application_api", 1L);
        f = aesVar6;
        aes aesVar7 = new aes("set_app_wide_properties_api", 1L);
        g = aesVar7;
        aes aesVar8 = new aes("set_runtime_properties_api", 1L);
        h = aesVar8;
        aes aesVar9 = new aes("get_storage_info_api", 1L);
        i = aesVar9;
        j = new aes[]{aesVar, aesVar2, aesVar3, aesVar4, aesVar5, aesVar6, aesVar7, aesVar8, aesVar9};
    }
}
