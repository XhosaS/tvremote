package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jft implements scj {
    public final /* synthetic */ yjv a;
    private final /* synthetic */ int b;

    public /* synthetic */ jft(yjv yjvVar, int i) {
        this.b = i;
        this.a = yjvVar;
    }

    @Override // defpackage.scj
    public final boolean a(Object obj, View view) {
        int i = this.b;
        if (i == 0) {
            this.a.a(view);
            return true;
        }
        if (i == 1) {
            this.a.a(view);
            return false;
        }
        if (i != 2) {
            this.a.a(view);
            return true;
        }
        this.a.a(view);
        return true;
    }
}
