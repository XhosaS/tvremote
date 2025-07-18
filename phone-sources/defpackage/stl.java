package defpackage;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stl {
    final /* synthetic */ FloatingActionButton a;
    public final zft b;

    public stl(FloatingActionButton floatingActionButton, zft zftVar) {
        this.a = floatingActionButton;
        this.b = zftVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof stl) && ((stl) obj).b.equals(this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
