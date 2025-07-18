package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fkq implements fix {
    private final fkk a;
    private final long[] b;
    private final Map c;
    private final Map d;
    private final Map e;

    public fkq(fkk fkkVar, Map map, Map map2, Map map3) {
        this.a = fkkVar;
        this.d = map2;
        this.e = map3;
        this.c = DesugarCollections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        fkkVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.b = jArr;
    }

    @Override // defpackage.fix
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.fix
    public final int b(long j) {
        long[] jArr = this.b;
        int iAx = edt.ax(jArr, j, false);
        if (iAx < jArr.length) {
            return iAx;
        }
        return -1;
    }

    @Override // defpackage.fix
    public final long c(int i) {
        return this.b[i];
    }

    @Override // defpackage.fix
    public final List e(long j) {
        ArrayList arrayList = new ArrayList();
        fkk fkkVar = this.a;
        String str = fkkVar.h;
        fkkVar.e(j, str, arrayList);
        TreeMap treeMap = new TreeMap();
        fkkVar.g(j, false, str, treeMap);
        Map map = this.c;
        Map map2 = this.d;
        fkkVar.f(j, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Map map3 = this.e;
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                fko fkoVar = (fko) map2.get(pair.first);
                fkoVar.getClass();
                ebz ebzVar = new ebz();
                ebzVar.c(bitmapDecodeByteArray);
                ebzVar.e = fkoVar.b;
                ebzVar.f = 0;
                ebzVar.d(fkoVar.c, 0);
                ebzVar.d = fkoVar.e;
                ebzVar.g = fkoVar.f;
                ebzVar.h = fkoVar.g;
                ebzVar.i = fkoVar.j;
                arrayList2.add(ebzVar.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            fko fkoVar2 = (fko) map2.get(entry.getKey());
            fkoVar2.getClass();
            ebz ebzVar2 = (ebz) entry.getValue();
            CharSequence charSequence = ebzVar2.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (fki fkiVar : (fki[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), fki.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(fkiVar), spannableStringBuilder.getSpanEnd(fkiVar), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            ebzVar2.d(fkoVar2.c, fkoVar2.d);
            ebzVar2.d = fkoVar2.e;
            ebzVar2.e = fkoVar2.b;
            ebzVar2.g = fkoVar2.f;
            ebzVar2.f(fkoVar2.i, fkoVar2.h);
            ebzVar2.i = fkoVar2.j;
            arrayList2.add(ebzVar2.a());
        }
        return arrayList2;
    }
}
