package defpackage;

import android.util.Log;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bfd extends bcx {
    public final int j = 54321;
    public final bfk k;
    public bfe l;
    private bcl m;

    public bfd(bfk bfkVar) {
        this.k = bfkVar;
        if (bfkVar.i != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        bfkVar.i = this;
        bfkVar.c = 54321;
    }

    @Override // defpackage.bcw
    protected final void d() {
        if (bfh.b(2)) {
            toString();
            Log.v("LoaderManager", "  Starting: ".concat(toString()));
        }
        bfk bfkVar = this.k;
        bfkVar.e = true;
        bfkVar.g = false;
        bfkVar.f = false;
        bfkVar.f();
    }

    @Override // defpackage.bcw
    protected final void e() {
        if (bfh.b(2)) {
            toString();
            Log.v("LoaderManager", "  Stopping: ".concat(toString()));
        }
        bfk bfkVar = this.k;
        bfkVar.e = false;
        bfkVar.c();
    }

    @Override // defpackage.bcw
    public final void f(bcy bcyVar) {
        super.f(bcyVar);
        this.m = null;
        this.l = null;
    }

    public final void i() {
        bcl bclVar = this.m;
        bfe bfeVar = this.l;
        if (bclVar == null || bfeVar == null) {
            return;
        }
        super.f(bfeVar);
        c(bclVar, bfeVar);
    }

    public final void j() {
        if (bfh.b(3)) {
            toString();
            Log.d("LoaderManager", "  Destroying: ".concat(toString()));
        }
        bfk bfkVar = this.k;
        bfkVar.c();
        bfkVar.f = true;
        bfe bfeVar = this.l;
        if (bfeVar != null) {
            f(bfeVar);
            if (bfeVar.c) {
                if (bfh.b(2)) {
                    bfk bfkVar2 = bfeVar.a;
                    Objects.toString(bfkVar2);
                    Log.v("LoaderManager", "  Resetting: ".concat(String.valueOf(bfkVar2)));
                }
                tqc tqcVar = (tqc) bfeVar.b;
                tqcVar.a.clear();
                tqcVar.a.notifyDataSetChanged();
            }
        }
        bfd bfdVar = bfkVar.i;
        if (bfdVar == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bfdVar != this) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        bfkVar.i = null;
        bfkVar.g = true;
        bfkVar.e = false;
        bfkVar.f = false;
        bfkVar.h = false;
    }

    public final void k(bcl bclVar, bfb bfbVar) {
        bfe bfeVar = new bfe(this.k, bfbVar);
        c(bclVar, bfeVar);
        bcy bcyVar = this.l;
        if (bcyVar != null) {
            f(bcyVar);
        }
        this.m = bclVar;
        this.l = bfeVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.j);
        sb.append(" : ");
        bfk bfkVar = this.k;
        sb.append(bfkVar.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(bfkVar)));
        sb.append("}}");
        return sb.toString();
    }
}
