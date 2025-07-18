package defpackage;

import android.content.ContentProviderClient;
import android.os.Trace;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.view.WindowInsets;
import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qk {
    public static long c;
    public static Method d;

    public qk() {
    }

    static WindowInsets h(View view, WindowInsets windowInsets) {
        int i = qy.a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void j(View view) {
        view.requestApplyInsets();
    }

    public static boolean k(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean l(android.text.Editable r6, android.view.KeyEvent r7, boolean r8) {
        /*
            int r7 = r7.getMetaState()
            boolean r7 = android.view.KeyEvent.metaStateHasNoModifiers(r7)
            r0 = 0
            if (r7 != 0) goto Lc
            goto L47
        Lc:
            int r7 = android.text.Selection.getSelectionStart(r6)
            int r1 = android.text.Selection.getSelectionEnd(r6)
            boolean r2 = x(r7, r1)
            if (r2 != 0) goto L47
            java.lang.Class<uf> r2 = defpackage.uf.class
            java.lang.Object[] r1 = r6.getSpans(r7, r1, r2)
            uf[] r1 = (defpackage.uf[]) r1
            if (r1 == 0) goto L47
            int r2 = r1.length
            if (r2 <= 0) goto L47
            r3 = r0
        L28:
            if (r3 >= r2) goto L47
            r4 = r1[r3]
            int r5 = r6.getSpanStart(r4)
            int r4 = r6.getSpanEnd(r4)
            if (r8 == 0) goto L39
            if (r5 == r7) goto L42
            goto L3b
        L39:
            if (r4 == r7) goto L42
        L3b:
            if (r7 <= r5) goto L3f
            if (r7 < r4) goto L42
        L3f:
            int r3 = r3 + 1
            goto L28
        L42:
            r6.delete(r5, r4)
            r6 = 1
            return r6
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qk.l(android.text.Editable, android.view.KeyEvent, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007c, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009c A[EDGE_INSN: B:90:0x009c->B:63:0x009c BREAK  A[LOOP:2: B:44:0x006a->B:54:0x007f], EDGE_INSN: B:91:0x009c->B:63:0x009c BREAK  A[LOOP:2: B:44:0x006a->B:54:0x007f, LOOP_LABEL: LOOP:2: B:44:0x006a->B:54:0x007f]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qk.m(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static void p(String str) {
        String strSubstring = str.length() <= 127 ? str : null;
        if (strSubstring == null) {
            strSubstring = str.substring(0, 127);
            strSubstring.getClass();
        }
        Trace.beginSection(strSubstring);
    }

    public static pl q(pg pgVar) {
        return pgVar.a();
    }

    public static void r(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void s(Object obj) {
        obj.getClass();
    }

    public static Object t(ExecutorService executorService, Callable callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }

    public static ou[] u(List list) {
        return (ou[]) list.get(0);
    }

    public static /* synthetic */ List v(Object obj) {
        Object[] objArr = {obj};
        ArrayList arrayList = new ArrayList(1);
        Object obj2 = objArr[0];
        obj2.getClass();
        arrayList.add(obj2);
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static void w(ContentProviderClient contentProviderClient) throws Exception {
        if (contentProviderClient != null) {
            contentProviderClient.close();
        }
    }

    private static boolean x(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    public View a(MenuItem menuItem) {
        throw null;
    }

    public boolean c() {
        throw null;
    }

    public boolean d() {
        throw null;
    }

    public boolean e() {
        throw null;
    }

    public boolean f() {
        throw null;
    }

    public void g(byj byjVar) {
        throw null;
    }

    public boolean n() {
        return false;
    }

    public boolean o(int[] iArr) {
        return false;
    }

    public qk(byte[] bArr) {
        this();
    }

    public qk(char[] cArr) {
        this((byte[]) null);
    }

    public void b(SubMenu subMenu) {
    }
}
