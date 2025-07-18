package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aif implements bii {
    final /* synthetic */ bii a;

    public aif(bii biiVar) {
        this.a = biiVar;
    }

    @Override // defpackage.bii
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        bii biiVar;
        List list = (List) obj;
        int iIntValue = ((Number) list.get(0)).intValue();
        int iIntValue2 = ((Number) list.get(1)).intValue();
        int iIntValue3 = ((Number) list.get(2)).intValue();
        byte[] bArr = null;
        yhp yhpVar = new yhp(bArr);
        int i = 3;
        while (true) {
            biiVar = this.a;
            if (i >= iIntValue2 + 3) {
                break;
            }
            yhpVar.add(biiVar.a(list.get(i)));
            i++;
        }
        List listO = yfm.o(yhpVar);
        yhp yhpVar2 = new yhp(bArr);
        while (i < iIntValue2 + iIntValue3 + 3) {
            yhpVar2.add(biiVar.a(list.get(i)));
            i++;
        }
        return new nou(listO, yfm.o(yhpVar2), iIntValue);
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.bii
    public final /* bridge */ /* synthetic */ Object b(bia biaVar, Object obj) {
        bii biiVar;
        nou nouVar = (nou) obj;
        yhp yhpVar = new yhp((byte[]) null);
        yhpVar.add(Integer.valueOf(nouVar.a));
        yhpVar.add(Integer.valueOf(((bje) nouVar.b).a()));
        yhpVar.add(Integer.valueOf(((bje) nouVar.c).a()));
        ?? r1 = nouVar.b;
        int iA = ((bje) r1).a();
        int i = 0;
        while (true) {
            biiVar = this.a;
            if (i >= iA) {
                break;
            }
            yhpVar.add(biiVar.b(biaVar, r1.get(i)));
            i++;
        }
        ?? r9 = nouVar.c;
        int iA2 = ((bje) r9).a();
        for (int i2 = 0; i2 < iA2; i2++) {
            yhpVar.add(biiVar.b(biaVar, r9.get(i2)));
        }
        return yfm.o(yhpVar);
    }
}
