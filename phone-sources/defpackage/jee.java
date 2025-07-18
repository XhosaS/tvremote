package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jee {
    public static final jee a;
    public static final jee b;
    public static final jee c;
    public static final jee d;
    public static final jee e;
    public static final jee f;
    public static final jee g;
    public static final jee h;
    public static final jee i;
    public static final jee j;
    public static final /* synthetic */ yja k;
    private static final /* synthetic */ jee[] n;
    public final int l;
    public final String m;

    static {
        jee jeeVar = new jee("PURCHASE_STATUS", 0, 0, "purchase_status");
        a = jeeVar;
        jee jeeVar2 = new jee("RESUME_TIMESTAMP", 1, 1, "resume_timestamp");
        b = jeeVar2;
        jee jeeVar3 = new jee("LAST_WATCHED_TIMESTAMP", 2, 2, "last_watched_timestamp");
        c = jeeVar3;
        jee jeeVar4 = new jee("DOWNLOAD_RELATIVE_FILEPATH", 3, 3, "download_relative_filepath");
        d = jeeVar4;
        jee jeeVar5 = new jee("DOWNLOAD_EXTRA_PROTO", 4, 4, "download_extra_proto");
        e = jeeVar5;
        jee jeeVar6 = new jee("LICENSE_CENC_KEY_SET_ID", 5, 5, "license_cenc_key_set_id");
        f = jeeVar6;
        jee jeeVar7 = new jee("EXPRESSION_IS_PINNED", 6, 6, "(pinned IS NOT NULL AND pinned > 0)");
        g = jeeVar7;
        jee jeeVar8 = new jee("EXTERNAL_STORAGE", 7, 7, "external_storage_index");
        h = jeeVar8;
        jee jeeVar9 = new jee("SHORT_RENTAL_EXPIRATION_DURATION_SECONDS", 8, 8, "rental_short_timer_seconds");
        i = jeeVar9;
        jee jeeVar10 = new jee("LICENSE_EXPIRATION_TIMESTAMP", 9, 9, "license_expiration_timestamp");
        j = jeeVar10;
        jee[] jeeVarArr = {jeeVar, jeeVar2, jeeVar3, jeeVar4, jeeVar5, jeeVar6, jeeVar7, jeeVar8, jeeVar9, jeeVar10};
        n = jeeVarArr;
        k = wcq.P(jeeVarArr);
    }

    private jee(String str, int i2, int i3, String str2) {
        this.l = i3;
        this.m = str2;
    }

    public static jee[] values() {
        return (jee[]) n.clone();
    }
}
