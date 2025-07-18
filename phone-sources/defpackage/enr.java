package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enr implements eum {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final eoi i;
    public final eog j;
    public final Uri k;
    public final env l;
    private final List m;

    public enr(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, env envVar, eoi eoiVar, eog eogVar, Uri uri, List list) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = envVar;
        this.i = eoiVar;
        this.k = uri;
        this.j = eogVar;
        this.m = list == null ? Collections.EMPTY_LIST : list;
    }

    public final int a() {
        return this.m.size();
    }

    public final long b(int i) {
        long j;
        long j2;
        List list = this.m;
        if (i == list.size() - 1) {
            j = this.b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = ((gsf) list.get(i)).a;
        } else {
            j = ((gsf) list.get(i + 1)).a;
            j2 = ((gsf) list.get(i)).a;
        }
        return j - j2;
    }

    public final long c(int i) {
        return edt.y(b(i));
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.eum
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final enr e(List list) {
        int i;
        int i2;
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new eas(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        long j2 = 0;
        while (true) {
            if (i3 >= a()) {
                break;
            }
            if (((eas) linkedList.peek()).d != i3) {
                long jB = b(i3);
                if (jB != -9223372036854775807L) {
                    j2 += jB;
                }
                i2 = i3;
            } else {
                gsf gsfVarF = f(i3);
                ?? r9 = gsfVarF.b;
                eas easVar = (eas) linkedList.poll();
                int i4 = easVar.d;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i5 = easVar.e;
                    enp enpVar = (enp) r9.get(i5);
                    List list2 = enpVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    while (true) {
                        arrayList3.add((enz) list2.get(easVar.f));
                        easVar = (eas) linkedList.poll();
                        i = easVar.d;
                        i2 = i3;
                        if (i != i4 || easVar.e != i5) {
                            break;
                        }
                        i3 = i2;
                    }
                    j = j2;
                    arrayList2.add(new enp(enpVar.a, enpVar.b, arrayList3, enpVar.d, enpVar.e, enpVar.f));
                    if (i != i4) {
                        break;
                    }
                    i3 = i2;
                    j2 = j;
                }
                linkedList.addFirst(easVar);
                arrayList.add(new gsf((String) gsfVarF.e, gsfVarF.a - j, arrayList2, gsfVarF.c, null));
                j2 = j;
            }
            i3 = i2 + 1;
        }
        long j3 = j2;
        long j4 = this.b;
        return new enr(this.a, j4 != -9223372036854775807L ? j4 - j3 : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList);
    }

    public final gsf f(int i) {
        return (gsf) this.m.get(i);
    }
}
