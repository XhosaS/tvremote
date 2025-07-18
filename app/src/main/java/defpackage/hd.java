package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hd {
    final int a;
    int b;
    int c;
    int d;
    ViewGroup e;
    View f;
    View g;
    public jj h;
    jf i;
    Context j;
    boolean k;
    boolean l;
    boolean m;
    boolean n = false;
    boolean o;
    Bundle p;

    public hd(int i) {
        this.a = i;
    }

    final void a(jj jjVar) {
        jf jfVar;
        jj jjVar2 = this.h;
        if (jjVar == jjVar2) {
            return;
        }
        if (jjVar2 != null) {
            jjVar2.k(this.i);
        }
        this.h = jjVar;
        if (jjVar == null || (jfVar = this.i) == null) {
            return;
        }
        jjVar.f(jfVar, jjVar.a);
    }
}
