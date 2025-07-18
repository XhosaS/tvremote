package defpackage;

import android.content.ComponentCallbacks2;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wke {
    public volatile czb a;
    public int b;
    private final agow d;
    private final wkf e;
    private final boolean f;
    private final Object g = new Object();
    public final ComponentCallbacks2 c = new wjz(this);

    public wke(agow agowVar, wkf wkfVar, boolean z) {
        this.d = agowVar;
        this.e = wkfVar;
        this.f = z;
    }

    public final czb a() {
        if (this.f) {
            uea.c();
        }
        if (this.a == null) {
            synchronized (this.g) {
                if (this.a == null) {
                    this.a = (czb) this.d.a();
                    this.e.a(this);
                }
            }
        }
        return this.a;
    }
}
