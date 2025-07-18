package defpackage;

import androidx.compose.foundation.gestures.DraggableElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ub {
    public static final yka a = new ua((yih) null, 1, (byte[]) null);
    public static final yka b = new ua(null, 0);

    public static /* synthetic */ bkp a(bkp bkpVar, uf ufVar, uv uvVar, boolean z, kw kwVar, boolean z2, yka ykaVar, boolean z3, int i) {
        int i2 = i & 16;
        int i3 = i & 8;
        return bkpVar.a(new DraggableElement(ufVar, uvVar, z | (!((i & 4) == 0)), i3 != 0 ? null : kwVar, (i2 == 0) & z2, (i & 32) != 0 ? a : null, (i & 64) != 0 ? b : ykaVar, ((i & 128) == 0) & z3));
    }
}
