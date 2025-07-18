package defpackage;

import android.graphics.Rect;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eme {
    public final eme a;
    public final emh b;
    public final Object c;
    public final Rect d;
    public final int e;
    public final int f;
    public final int g;
    public List h;

    public eme(eme emeVar, emh emhVar, Object obj, Rect rect, int i) {
        this.a = emeVar;
        this.b = emhVar;
        this.c = obj;
        this.d = rect;
        this.e = emeVar != null ? emeVar.e + rect.left : rect.left;
        this.f = emeVar != null ? emeVar.f + rect.top : rect.top;
        this.g = i;
    }

    public final int a() {
        List list = this.h;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void b(Rect rect) {
        int i = this.e;
        rect.left = i;
        int i2 = this.f;
        rect.top = i2;
        Rect rect2 = this.d;
        rect.right = i + rect2.width();
        rect.bottom = i2 + rect2.height();
    }

    public final String c() {
        emh emhVar = this.b;
        String string = ((dwj) emhVar).b.c.getClass().toString();
        eme emeVar = this.a;
        return String.format(Locale.US, "Id=%d; contentType='%s'; indexInTree=%d; posInParent=%d; bounds=%s; absPosition=[%d, %d]; childCount=%d; parentId=%d;", Long.valueOf(((dvu) emhVar).a), string, -1, Integer.valueOf(this.g), this.d.toShortString(), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(a()), Long.valueOf(emeVar != null ? ((dvu) emeVar.b).a : -1L));
    }
}
