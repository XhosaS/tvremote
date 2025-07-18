package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dvr {
    final int a;
    boolean b;
    String c;

    public dvr(Object obj) {
        this.a = a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    static int a(Object obj) {
        if (!(obj instanceof View)) {
            return 0;
        }
        View view = (View) obj;
        boolean zIsClickable = view.isClickable();
        boolean z = zIsClickable;
        if (view.isLongClickable()) {
            z = (zIsClickable ? 1 : 0) | 2;
        }
        boolean z2 = z;
        if (view.isContextClickable()) {
            z2 = (z ? 1 : 0) | 128;
        }
        boolean z3 = z2;
        if (view.isFocusable()) {
            z3 = (z2 ? 1 : 0) | 4;
        }
        boolean z4 = z3;
        if (view.isEnabled()) {
            z4 = (z3 ? 1 : 0) | '\b';
        }
        ?? r0 = z4;
        if (view.isSelected()) {
            r0 = (z4 ? 1 : 0) | 16;
        }
        int layerType = view.getLayerType();
        if (layerType == 0) {
            return r0;
        }
        if (layerType == 1) {
            return r0 | 32;
        }
        if (layerType == 2) {
            return r0 | 64;
        }
        throw new IllegalArgumentException("Unhandled layer type encountered.");
    }

    static dvr b(elv elvVar) {
        Object obj = elvVar.e;
        if (obj instanceof dvr) {
            return (dvr) obj;
        }
        throw new RuntimeException("MountData should not be null when using Litho's MountState.");
    }
}
