package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oad extends bv implements nzp {
    public static final WeakHashMap a = new WeakHashMap();
    private final ybo b = new ybo();

    @Override // defpackage.nzp
    public final Activity a() {
        return getActivity();
    }

    @Override // defpackage.nzp
    public final nzo b(String str, Class cls) {
        return this.b.d(str, cls);
    }

    @Override // defpackage.nzp
    public final void c(String str, nzo nzoVar) {
        this.b.e(str, nzoVar);
    }

    @Override // defpackage.bv
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.b.m();
    }

    @Override // defpackage.bv
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.b.f(i, i2, intent);
    }

    @Override // defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b.g(bundle);
    }

    @Override // defpackage.bv
    public final void onDestroy() {
        super.onDestroy();
        this.b.h();
    }

    @Override // defpackage.bv
    public final void onResume() {
        super.onResume();
        this.b.i();
    }

    @Override // defpackage.bv
    public final void onSaveInstanceState(Bundle bundle) {
        this.b.j(bundle);
    }

    @Override // defpackage.bv
    public final void onStart() {
        super.onStart();
        this.b.k();
    }

    @Override // defpackage.bv
    public final void onStop() {
        super.onStop();
        this.b.l();
    }
}
