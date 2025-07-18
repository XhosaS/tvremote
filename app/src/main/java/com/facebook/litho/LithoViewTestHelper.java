package com.facebook.litho;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import defpackage.dsu;
import defpackage.dsv;
import defpackage.dsw;
import defpackage.dvz;
import java.util.Deque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LithoViewTestHelper {
    private static void a(dsu dsuVar, StringBuilder sb, boolean z, boolean z2, int i, int i2, int i3, dsv dsvVar) {
        for (int i4 = 0; i4 < i; i4++) {
            sb.append("  ");
        }
        StringBuilder sb2 = sb;
        boolean z3 = z;
        dsw.addViewDescription(dsuVar, sb2, i2, i3, z3, z2, dsvVar);
        sb2.append("\n");
        Rect rectA = dsuVar.a();
        Iterator it = dsuVar.g().iterator();
        while (it.hasNext()) {
            StringBuilder sb3 = sb2;
            boolean z4 = z3;
            a((dsu) it.next(), sb3, z4, z2, i + 1, rectA.left, rectA.top, dsvVar);
            z3 = z4;
            sb2 = sb3;
        }
    }

    public static TestItem findTestItem(dvz dvzVar, String str) {
        Deque dequeFindTestItems = dvzVar.findTestItems(str);
        if (dequeFindTestItems.isEmpty()) {
            return null;
        }
        return (TestItem) dequeFindTestItems.getLast();
    }

    public static Deque findTestItems(dvz dvzVar, String str) {
        return dvzVar.findTestItems(str);
    }

    public static String viewToString(dvz dvzVar) {
        return viewToString(dvzVar, false).trim();
    }

    public static String viewToStringForE2E(View view, int i, boolean z) {
        return viewToStringForE2E(view, i, z, null);
    }

    public static String viewToString(dvz dvzVar, boolean z) {
        int i;
        int i2 = dsu.c;
        dsu dsuVarD = dsu.d(dvzVar.getComponentTree());
        if (dsuVarD == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            i = 3;
            for (ViewParent parent = dvzVar.getParent(); parent != null; parent = parent.getParent()) {
                i++;
            }
        } else {
            i = 0;
        }
        sb.append("\n");
        a(dsuVarD, sb, z, false, i, 0, 0, null);
        return sb.toString();
    }

    public static String viewToStringForE2E(View view, int i, boolean z, dsv dsvVar) {
        if (!(view instanceof dvz)) {
            return "";
        }
        int i2 = dsu.c;
        dsu dsuVarD = dsu.d(((dvz) view).getComponentTree());
        if (dsuVarD == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        a(dsuVarD, sb, true, z, i, 0, 0, dsvVar);
        return sb.toString();
    }
}
