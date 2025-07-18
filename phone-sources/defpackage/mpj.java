package defpackage;

import java.util.Observable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mpj extends Observable {
    public final String a;
    public String b;
    public String c;

    public mpj(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final void a(String str) {
        if (yks.e(this.b, str)) {
            return;
        }
        this.b = str;
        setChanged();
        notifyObservers();
    }

    public final void b(String str) {
        if (yks.e(this.c, str)) {
            return;
        }
        this.c = str;
        setChanged();
        notifyObservers();
    }

    public final boolean c() {
        return yks.e(this.c, "GRID_VIEW");
    }
}
