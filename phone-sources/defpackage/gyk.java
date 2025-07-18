package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyk implements gyh {
    private final yft a;
    private final yft b;

    public gyk(yft yftVar, yft yftVar2) {
        this.a = yftVar;
        this.b = yftVar2;
    }

    @Override // defpackage.gyh
    public final /* bridge */ /* synthetic */ gyi a(Object obj, gzy gzyVar) {
        Uri uri = (Uri) obj;
        if (!yks.e(uri.getScheme(), "http") && !yks.e(uri.getScheme(), "https")) {
            return null;
        }
        String string = uri.toString();
        string.getClass();
        return new gyn(string, gzyVar, this.a, this.b);
    }
}
