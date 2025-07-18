package defpackage;

import android.graphics.Picture;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzg {
    public static final /* synthetic */ int e = 0;
    public hyh a = null;
    public final float b = 96.0f;
    public final hwz c = new hwz();
    final Map d = new HashMap();

    static {
        new DecimalFormat("#.0000");
        new jp(10);
    }

    protected hzg() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final hyn c(hyl hylVar, String str) {
        hyn hynVarC;
        hyn hynVar = (hyn) hylVar;
        if (str.equals(hynVar.o)) {
            return hynVar;
        }
        for (Object obj : hylVar.n()) {
            if (obj instanceof hyn) {
                hyn hynVar2 = (hyn) obj;
                if (str.equals(hynVar2.o)) {
                    return hynVar2;
                }
                if ((obj instanceof hyl) && (hynVarC = c((hyl) obj, str)) != null) {
                    return hynVarC;
                }
            }
        }
        return null;
    }

    protected final hyp a(String str) {
        String strSubstring;
        if (str == null || str.length() <= 1 || !str.startsWith("#") || (strSubstring = str.substring(1)) == null || strSubstring.length() == 0) {
            return null;
        }
        if (strSubstring.equals(this.a.o)) {
            return this.a;
        }
        Map map = this.d;
        if (map.containsKey(strSubstring)) {
            return (hyp) map.get(strSubstring);
        }
        hyn hynVarC = c(this.a, strSubstring);
        map.put(strSubstring, hynVarC);
        return hynVarC;
    }

    public final Picture b(int i, int i2) {
        Picture picture = new Picture();
        hzr hzrVar = new hzr(picture.beginRecording(i, i2), new hxf(0.0f, 0.0f, i, i2));
        hzrVar.c = this;
        hyh hyhVar = this.a;
        if (hyhVar == null) {
            hzr.h("Nothing to render. Document is empty.", new Object[0]);
        } else {
            hzrVar.d = new hzn();
            hzrVar.e = new Stack();
            hzrVar.g(hzrVar.d, hyg.a());
            hzn hznVar = hzrVar.d;
            hznVar.f = hzrVar.b;
            hznVar.h = false;
            hznVar.i = false;
            hzrVar.e.push(hznVar.clone());
            new Stack();
            new Stack();
            hzrVar.g = new Stack();
            hzrVar.f = new Stack();
            hzrVar.d(hyhVar);
            hzrVar.f(hyhVar, hyhVar.c, hyhVar.d, hyhVar.w, hyhVar.v);
        }
        picture.endRecording();
        return picture;
    }
}
