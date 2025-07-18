package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khz extends bq implements khb {
    public static final WeakHashMap a = new WeakHashMap();
    private final khe b = new khe();

    @Override // defpackage.bq
    public final void R(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.R(str, fileDescriptor, printWriter, strArr);
        this.b.i();
    }

    @Override // defpackage.bq
    public final void V(int i, int i2, Intent intent) {
        super.V(i, i2, intent);
        this.b.a(i, i2, intent);
    }

    @Override // defpackage.bq
    public final void X() {
        this.P = true;
        this.b.c();
    }

    @Override // defpackage.bq
    public final void Z() {
        this.P = true;
        this.b.d();
    }

    @Override // defpackage.khb
    public final Activity a() {
        return ee();
    }

    @Override // defpackage.khb
    public final void b(kha khaVar) {
        this.b.h(khaVar);
    }

    @Override // defpackage.khb
    public final kha c(Class cls) {
        return this.b.j(cls);
    }

    @Override // defpackage.bq
    public final void ey(Bundle bundle) {
        super.ey(bundle);
        this.b.b(bundle);
    }

    @Override // defpackage.bq
    public final void g(Bundle bundle) {
        this.b.e(bundle);
    }

    @Override // defpackage.bq
    public final void h() {
        this.P = true;
        this.b.f();
    }

    @Override // defpackage.bq
    public final void i() {
        this.P = true;
        this.b.g();
    }
}
