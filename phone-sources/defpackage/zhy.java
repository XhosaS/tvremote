package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class zhy implements yjz {
    public final /* synthetic */ ylf a;
    public final /* synthetic */ zgm b;
    public final /* synthetic */ ylf c;
    public final /* synthetic */ ylf d;
    private final /* synthetic */ int e;

    public /* synthetic */ zhy(ylf ylfVar, zgm zgmVar, ylf ylfVar2, ylf ylfVar3, int i) {
        this.e = i;
        this.a = ylfVar;
        this.b = zgmVar;
        this.c = ylfVar2;
        this.d = ylfVar3;
    }

    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) throws IOException {
        if (this.e == 0) {
            int iIntValue = ((Integer) obj).intValue();
            long jLongValue = ((Long) obj2).longValue();
            if (iIntValue == 1) {
                ylf ylfVar = this.a;
                if (ylfVar.a != null) {
                    throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                }
                if (jLongValue != 24) {
                    throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                }
                ylf ylfVar2 = this.d;
                ylf ylfVar3 = this.c;
                zgm zgmVar = this.b;
                ylfVar.a = Long.valueOf(zgmVar.l());
                ylfVar3.a = Long.valueOf(zgmVar.l());
                ylfVar2.a = Long.valueOf(zgmVar.l());
            }
            return ygi.a;
        }
        int iIntValue2 = ((Integer) obj).intValue();
        long jLongValue2 = ((Long) obj2).longValue();
        if (iIntValue2 == 21589) {
            if (jLongValue2 < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            zgm zgmVar2 = this.b;
            byte bD = zgmVar2.d();
            boolean z = (bD & 2) == 2;
            boolean z2 = (bD & 4) == 4;
            int i = 1 & bD;
            long j = i != 0 ? 5L : 1L;
            if (z) {
                j += 4;
            }
            if (z2) {
                j += 4;
            }
            if (jLongValue2 < j) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (i != 0) {
                this.a.a = Integer.valueOf(zgmVar2.g());
            }
            if (z) {
                this.c.a = Integer.valueOf(zgmVar2.g());
            }
            if (z2) {
                this.d.a = Integer.valueOf(zgmVar2.g());
            }
        }
        return ygi.a;
    }

    public /* synthetic */ zhy(zgm zgmVar, ylf ylfVar, ylf ylfVar2, ylf ylfVar3, int i) {
        this.e = i;
        this.b = zgmVar;
        this.a = ylfVar;
        this.c = ylfVar2;
        this.d = ylfVar3;
    }
}
