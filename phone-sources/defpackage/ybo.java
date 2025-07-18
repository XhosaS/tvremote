package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ybo {
    public final Object a;
    public int b;
    public Object c;

    public /* synthetic */ ybo(cb cbVar) {
        bkr bkrVar = vk.c;
        this.c = cbVar;
        this.a = bkrVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Appendable, java.lang.Object] */
    public final void a(CharSequence charSequence) throws IOException {
        try {
            this.a.append(charSequence);
            this.b += charSequence.length();
        } catch (IOException e) {
            throw new ab(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Appendable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    public final void b(Format format, Object obj) throws IOException {
        if (this.c == null) {
            a(format.format(obj));
            return;
        }
        AttributedCharacterIterator toCharacterIterator = format.formatToCharacterIterator(obj);
        int i = this.b;
        ?? r0 = this.a;
        try {
            int beginIndex = toCharacterIterator.getBeginIndex();
            int endIndex = toCharacterIterator.getEndIndex();
            int i2 = endIndex - beginIndex;
            if (beginIndex < endIndex) {
                r0.append(toCharacterIterator.first());
                while (true) {
                    beginIndex++;
                    if (beginIndex >= endIndex) {
                        break;
                    } else {
                        r0.append(toCharacterIterator.next());
                    }
                }
            }
            this.b = i2 + i;
            toCharacterIterator.first();
            int index = toCharacterIterator.getIndex();
            int endIndex2 = toCharacterIterator.getEndIndex();
            int i3 = i - index;
            while (index < endIndex2) {
                Map<AttributedCharacterIterator.Attribute, Object> attributes = toCharacterIterator.getAttributes();
                int runLimit = toCharacterIterator.getRunLimit();
                if (attributes.size() != 0) {
                    for (Map.Entry<AttributedCharacterIterator.Attribute, Object> entry : attributes.entrySet()) {
                        this.c.add(new g(entry.getKey(), entry.getValue(), i3 + index, i3 + runLimit));
                    }
                }
                toCharacterIterator.setIndex(runLimit);
                index = runLimit;
            }
        } catch (IOException e) {
            throw new ab(e);
        }
    }

    public final void c(Format format, Object obj, String str) throws IOException {
        if (this.c != null || str == null) {
            b(format, obj);
        } else {
            a(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final nzo d(String str, Class cls) {
        return (nzo) cls.cast(this.a.get(str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void e(String str, nzo nzoVar) {
        ?? r0 = this.a;
        if (r0.containsKey(str)) {
            throw new IllegalArgumentException(a.cg(str, "LifecycleCallback with tag ", " already added to this fragment."));
        }
        r0.put(str, nzoVar);
        if (this.b > 0) {
            new ogh(Looper.getMainLooper()).post(new lke(this, nzoVar, str, 12));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void f(int i, int i2, Intent intent) {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((nzo) it.next()).c(i, i2, intent);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void g(Bundle bundle) {
        this.b = 1;
        this.c = bundle;
        for (Map.Entry entry : this.a.entrySet()) {
            ((nzo) entry.getValue()).d(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void h() {
        this.b = 5;
        for (nzo nzoVar : this.a.values()) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void i() {
        this.b = 3;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((nzo) it.next()).h();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((nzo) entry.getValue()).g(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void k() {
        this.b = 2;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((nzo) it.next()).i();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void l() {
        this.b = 4;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((nzo) it.next()).j();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void m() {
        for (nzo nzoVar : this.a.values()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r4v1, types: [cds, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(defpackage.bsr r8) {
        /*
            r7 = this;
            java.util.List r8 = r8.a
            java.lang.Object r0 = r7.c
            r1 = 0
            java.lang.Object r8 = r8.get(r1)
            bsz r8 = (defpackage.bsz) r8
            r1 = 1
            if (r0 == 0) goto L2b
            long r2 = r8.b
            bsz r0 = (defpackage.bsz) r0
            long r4 = r0.b
            long r2 = r2 - r4
            java.lang.Object r4 = r7.a
            long r5 = r4.f()
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L2b
            boolean r0 = defpackage.hw.m(r4, r0, r8)
            if (r0 == 0) goto L2b
            int r0 = r7.b
            int r0 = r0 + r1
            r7.b = r0
            goto L2d
        L2b:
            r7.b = r1
        L2d:
            r7.c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybo.n(bsr):void");
    }

    public final void o(int i, Object obj) {
        if (i < 0) {
            wv.c("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        gb gbVar = new gb(this.b, i, obj);
        this.b += i;
        ((bfz) this.a).o(gbVar);
    }

    public final gb p(int i) {
        if (i < 0 || i >= this.b) {
            wv.e("Index " + i + ", size " + this.b);
        }
        Object obj = this.c;
        if (obj != null) {
            gb gbVar = (gb) obj;
            int i2 = gbVar.a;
            if (i < gbVar.b + i2 && i2 <= i) {
                return gbVar;
            }
        }
        bfz bfzVar = (bfz) this.a;
        gb gbVar2 = (gb) bfzVar.a[d.g(bfzVar, i)];
        this.c = gbVar2;
        return gbVar2;
    }

    public ybo(cds cdsVar) {
        this.a = cdsVar;
    }

    public ybo(Object obj) {
        this.a = obj;
    }

    public ybo(byte[] bArr) {
        this.a = new bfz(new gb[16], 0);
    }

    public ybo() {
        this.a = DesugarCollections.synchronizedMap(new ir());
        this.b = 0;
    }

    public ybo(StringBuffer stringBuffer) {
        this.a = stringBuffer;
        this.b = stringBuffer.length();
        this.c = null;
    }

    public ybo(StringBuilder sb) {
        this.a = sb;
        this.b = sb.length();
        this.c = null;
    }
}
