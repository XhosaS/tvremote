package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zuq implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    public zvl a;
    public final int b;
    public int c;
    public int d;
    public boolean e = false;
    public boolean f = false;

    public zuq(int i) {
        this.b = i;
    }

    final int a() {
        return (!this.e || this.f) ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final zuq clone() {
        zuq zuqVar = new zuq(this.b);
        zuqVar.a = this.a;
        zuqVar.c = this.c;
        zuqVar.d = this.d;
        zuqVar.e = this.e;
        zuqVar.f = this.f;
        return zuqVar;
    }
}
