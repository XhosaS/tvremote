package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cwq {
    static CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    static void b(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    static void c(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    static void d(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    static boolean e(View view) {
        return view.isAccessibilityHeading();
    }

    static boolean f(View view) {
        return view.isScreenReaderFocusable();
    }

    public static File g(Context context, String str) {
        context.getClass();
        str.getClass();
        return cwn.d(context, str.concat(".preferences_pb"));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object h(java.io.File r4, defpackage.yjv r5, defpackage.yih r6) throws java.io.IOException {
        /*
            boolean r0 = r6 instanceof defpackage.dch
            if (r0 == 0) goto L13
            r0 = r6
            dch r0 = (defpackage.dch) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dch r0 = new dch
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.a
            defpackage.ybn.f(r6)     // Catch: java.io.IOException -> L29
            return r6
        L29:
            r5 = move-exception
            goto L42
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r6)
            r0.a = r4     // Catch: java.io.IOException -> L29
            r0.c = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r4 = r5.a(r0)     // Catch: java.io.IOException -> L29
            if (r4 != r1) goto L41
            return r1
        L41:
            return r4
        L42:
            boolean r6 = r5 instanceof defpackage.dav
            if (r6 != 0) goto La8
            r4.getClass()
            java.io.File r4 = (java.io.File) r4
            boolean r6 = r4.exists()
            if (r6 == 0) goto La3
            boolean r6 = r4.isFile()
            if (r6 == 0) goto L7d
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L6d
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L68
            java.io.IOException r4 = defpackage.cwp.h(r4, r5)
            goto La7
        L68:
            java.io.IOException r4 = defpackage.cwp.h(r4, r5)
            goto La7
        L6d:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L78
            java.io.IOException r4 = defpackage.cwp.h(r4, r5)
            goto La7
        L78:
            java.io.IOException r4 = defpackage.cwp.h(r4, r5)
            goto La7
        L7d:
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L93
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L8e
            java.io.IOException r4 = defpackage.cwp.h(r4, r5)
            goto La7
        L8e:
            java.io.IOException r4 = defpackage.cwp.h(r4, r5)
            goto La7
        L93:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L9e
            java.io.IOException r4 = defpackage.cwp.h(r4, r5)
            goto La7
        L9e:
            java.io.IOException r4 = defpackage.cwp.h(r4, r5)
            goto La7
        La3:
            java.io.IOException r4 = defpackage.cwp.h(r4, r5)
        La7:
            throw r4
        La8:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwq.h(java.io.File, yjv, yih):java.lang.Object");
    }

    public static Intent i(ComponentName componentName, String str, int i) {
        return new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", str).putExtra("EXTRA_APPWIDGET_ID", i);
    }

    public static Intent j(dnb dnbVar) {
        if (dnbVar instanceof dne) {
            new Intent();
            throw null;
        }
        if (dnbVar instanceof dnd) {
            throw null;
        }
        if (dnbVar instanceof dnf) {
            return ((dnf) dnbVar).a;
        }
        if (!(dnbVar instanceof dnc)) {
            throw new yfu();
        }
        throw null;
    }

    public static Intent k(dnh dnhVar) {
        if (dnhVar instanceof dnj) {
            new Intent();
            throw null;
        }
        if (dnhVar instanceof dni) {
            throw null;
        }
        if (!(dnhVar instanceof dnk)) {
            throw new yfu();
        }
        throw null;
    }

    public static Intent l(dju djuVar, djs djsVar) {
        if (djuVar instanceof djw) {
            new Intent();
            throw null;
        }
        if (djuVar instanceof djv) {
            throw null;
        }
        if (!(djuVar instanceof dng)) {
            Objects.toString(djuVar);
            throw new IllegalStateException("Action type not defined in app widget package: ".concat(djuVar.toString()));
        }
        Intent intent = ((dng) djuVar).a;
        Map mapA = djsVar.a();
        ArrayList arrayList = new ArrayList(mapA.size());
        for (Map.Entry entry : mapA.entrySet()) {
            djq djqVar = (djq) entry.getKey();
            arrayList.add(new yfw(djqVar.a, entry.getValue()));
        }
        yfw[] yfwVarArr = (yfw[]) arrayList.toArray(new yfw[0]);
        intent.putExtras(cmq.j((yfw[]) Arrays.copyOf(yfwVarArr, yfwVarArr.length)));
        return intent;
    }

    public static /* synthetic */ String m(int i) {
        return i != 2 ? i != 3 ? i != 4 ? "CALLBACK" : "FOREGROUND_SERVICE" : "SERVICE" : "BROADCAST";
    }
}
