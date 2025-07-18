package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvw {
    public final Object a;

    public cvw(View view, byte[] bArr) {
        this.a = Build.VERSION.SDK_INT >= 30 ? new cvz(view) : new cvx(view);
    }

    public static cvw k(float f, float f2, float f3) {
        return new cvw(AccessibilityNodeInfo.RangeInfo.obtain(1, f, f2, f3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cvv, java.lang.Object] */
    public final void a(int i, int i2, int i3, boolean z) {
        this.a.a(i, i2, i3, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cvv, java.lang.Object] */
    public final void b(int i, int i2, int i3, int i4) {
        this.a.b(i, i2, i3, i4);
    }

    public final void c() {
        ((cwk) this.a).a();
    }

    public final int d() {
        return ((AtomicInteger) this.a).get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void e() {
        ?? r0 = this.a;
        for (int iQ = yfm.q(r0); iQ >= 0; iQ--) {
            ((can) ((pku) ((ArrayList) r0).get(iQ)).a).e();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [czl, java.lang.Object] */
    public final ClipDescription f() {
        return this.a.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [czl, java.lang.Object] */
    public final Uri g() {
        return this.a.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [czl, java.lang.Object] */
    public final Uri h() {
        return this.a.c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [czl, java.lang.Object] */
    public final Object i() {
        return this.a.d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [czl, java.lang.Object] */
    public final void j() {
        this.a.e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bcb, java.lang.Object] */
    public final void l(boolean z) {
        this.a.b(Boolean.valueOf(z));
    }

    public final void m() {
        ((HashMap) this.a).clear();
    }

    public final void n(String str) {
        ((ViewStructure) this.a).setClassName(str);
    }

    public final void o(CharSequence charSequence) {
        ((ViewStructure) this.a).setText(charSequence);
    }

    public final void p() {
        ckk ckkVar = (ckk) this.a;
        if (((ckn) ckkVar.a.get()) != null) {
            ckkVar.b.b(ckl.c);
        }
    }

    public final Object q() {
        ClipData primaryClip = ((ClipboardManager) ((cvw) this.a).a).getPrimaryClip();
        if (primaryClip != null) {
            return new cvw(primaryClip, (byte[]) null);
        }
        return null;
    }

    public final Object r(cvw cvwVar) {
        ((ClipboardManager) ((cvw) this.a).a).setPrimaryClip((ClipData) cvwVar.a);
        return ygi.a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yfo] */
    public final jhp s() {
        return new jhp(this.a);
    }

    public cvw(Object obj) {
        this.a = obj;
    }

    public cvw(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public cvw(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = Build.VERSION.SDK_INT >= 25 ? new czj(uri, clipDescription, uri2) : new czk(uri, clipDescription, uri2);
    }

    public cvw(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new cvt(view);
        } else {
            this.a = new cvu();
        }
    }

    public cvw(byte[] bArr, byte[] bArr2) {
        this.a = new HashMap();
    }

    public cvw(byte[] bArr) {
        this.a = new ArrayList();
    }

    public cvw(char[] cArr) {
        this.a = new bci(false, bcz.c);
    }

    public cvw() {
        this.a = new AtomicInteger(0);
    }

    public cvw(iea ieaVar) {
        ieaVar.getClass();
        this.a = ieaVar;
    }

    public cvw(yfo yfoVar, byte[] bArr, char[] cArr, byte[] bArr2) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cvw(yfo yfoVar, short[] sArr, byte[] bArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cvw(yfo yfoVar, byte[] bArr, byte[] bArr2, char[] cArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cvw(yfo yfoVar, char[] cArr, char[] cArr2) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cvw(yfo yfoVar, byte[] bArr, short[] sArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cvw(yfo yfoVar, int[] iArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cvw(yfo yfoVar, char[] cArr, byte[] bArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cvw(yfo yfoVar, byte[] bArr, char[] cArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cvw(yfo yfoVar, short[] sArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cvw(yfo yfoVar, byte[] bArr, byte[] bArr2) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cvw(yfo yfoVar, char[] cArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cvw(yfo yfoVar, byte[] bArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cvw(yfo yfoVar) {
        yfoVar.getClass();
        this.a = yfoVar;
    }
}
