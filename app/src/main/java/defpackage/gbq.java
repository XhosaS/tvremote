package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gbq implements agux {
    final /* synthetic */ xga a;

    public gbq(xga xgaVar) {
        this.a = xgaVar;
    }

    @Override // defpackage.agux
    public final /* synthetic */ Object a(Object obj) {
        Cursor cursor = ((vsx) obj).a;
        try {
            xga xgaVar = xga.a;
            xfz xfzVar = new xfz();
            String strA = vsx.a(cursor, 0);
            if ((xfzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xfzVar.y();
            }
            xga xgaVar2 = (xga) xfzVar.b;
            xgaVar2.b |= 1;
            xgaVar2.c = strA;
            int i = cursor.getInt(1);
            int i2 = i != 1 ? i != 2 ? 1 : 3 : 2;
            if ((xfzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xfzVar.y();
            }
            xga xgaVar3 = (xga) xfzVar.b;
            xgaVar3.d = i2 - 1;
            xgaVar3.b |= 2;
            xbg xbgVar = xbg.a;
            xbf xbfVar = new xbf();
            xaq xaqVar = xaq.a;
            xap xapVar = new xap();
            xah.c(vsx.a(cursor, 2), xapVar);
            xaq xaqVarA = xah.a(xapVar);
            if ((xbfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xbfVar.y();
            }
            xbg xbgVar2 = (xbg) xbfVar.b;
            xbgVar2.c = xaqVarA;
            xbgVar2.b = 1;
            xbg xbgVarA = xao.a(xbfVar);
            if ((xfzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xfzVar.y();
            }
            xga xgaVar4 = (xga) xfzVar.b;
            xgaVar4.e = xbgVarA;
            xgaVar4.b |= 4;
            return xlt.a(xfzVar);
        } catch (RuntimeException e) {
            ((zdv) ((zdv) gbv.a.d()).p(e).q("com/google/android/apps/tvsearch/launcher/utils/LauncherLiveTvUtilsKt$getLiveTvProviders$2", "invoke-JfnmSAo", 67, "LauncherLiveTvUtils.kt")).u("Failed to read Live TV provider");
            return this.a;
        }
    }
}
