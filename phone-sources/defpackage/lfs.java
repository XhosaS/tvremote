package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lfs implements lft {
    public final Object a;
    public final Object b;
    private final /* synthetic */ int c;

    public lfs(hfx hfxVar, lfk lfkVar, int i) {
        this.c = i;
        this.b = hfxVar;
        this.a = lfkVar;
    }

    @Override // defpackage.lft
    public final String a() {
        return this.c != 0 ? ((hfx) this.b).k("https://www.googleapis.com/android_video/v1/") : (String) this.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, lfk] */
    @Override // defpackage.lft
    public final String b() {
        if (this.c == 0) {
            return ((String) this.b).concat("GetRobotToken");
        }
        return ((hfx) this.b).k(this.a.d("at_home_robot_token_request_uri", "https://play.google.com/video/license/GetRobotToken"));
    }

    public lfs(String str, String str2, int i) {
        this.c = i;
        this.a = str;
        this.b = str2;
    }
}
