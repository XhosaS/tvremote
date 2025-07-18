package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xmt implements xms {
    public static final ryv a = new ryv(xhf.b, 10);
    public final Context b;

    public xmt(Context context) {
        this.b = context;
    }

    @Override // defpackage.xms
    public final vxj a() {
        return (vxj) a.f(8, "UmpMigrationFeature__tvod_only_countries", new xde(12), "CgJTRwoCUlUKAlRICgJBTQoCQVoKAktICgJGSgoCSEsKAklECgJLWgoCS0cKAkxBCgJNWQoCTlAKAlBHCgJQSAoCTEsKAlRKCgJUTQoCVVoKAlZOCgJBTAoCQU8KAkJICgJCWQoCQkoKAkJBCgJCVwoCQkYKAkNWCgJIUgoCQ1kKAkNaCgJFRwoCRUUKAkdBCgJHUgoCSFUKAklTCgJDSQoCSk8KAktXCgJMVgoCTEIKAkxUCgJMVQoCTUsKAk1MCgJNVAoCTVUKAk1ECgJOQQoCTkUKAk9NCgJQTAoCUFQKAlFBCgJSVwoCU0EKAlNOCgJTSwoCU0kKAlpBCgJUWgoCVEcKAlRSCgJVRwoCVUEKAkFFCgJaTQoCWlcKAkFHCgJBUgoCQVcKAkJaCgJCTwoCQ0wKAkNPCgJDUgoCRE8KAkVDCgJTVgoCR1QKAkhUCgJITgoCSk0KAk5JCgJQQQoCUFkKAlBFCgJUVAoCVVkKAlZF").et(this.b);
    }

    @Override // defpackage.xms
    public final boolean b() {
        return ((Boolean) a.e(6, "UmpMigrationFeature__play_country_interceptor_enabled", false).et(this.b)).booleanValue();
    }
}
