package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ch {
    final int a;
    int b;
    int c;
    int d;
    ViewGroup e;
    View f;
    View g;
    public du h;
    dq i;
    Context j;
    boolean k;
    boolean l;
    boolean m;
    boolean n = false;
    boolean o;
    Bundle p;

    public ch(int i) {
        this.a = i;
    }

    final void a(du duVar) {
        dq dqVar;
        du duVar2 = this.h;
        if (duVar == duVar2) {
            return;
        }
        if (duVar2 != null) {
            duVar2.m(this.i);
        }
        this.h = duVar;
        if (duVar == null || (dqVar = this.i) == null) {
            return;
        }
        duVar.g(dqVar);
    }
}
