package defpackage;

import android.database.Cursor;
import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gbs implements agux {
    final /* synthetic */ agpi a;

    public gbs(agpi agpiVar) {
        this.a = agpiVar;
    }

    @Override // defpackage.agux
    public final /* synthetic */ Object a(Object obj) {
        Cursor cursor = ((vsx) obj).a;
        try {
            String strA = vsx.a(cursor, 5);
            xfx xfxVar = xfx.a;
            xfw xfwVar = new xfw();
            String strA2 = vsx.a(cursor, 0);
            if ((xfwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xfwVar.y();
            }
            xfx xfxVar2 = (xfx) xfwVar.b;
            xfxVar2.b |= 1;
            xfxVar2.c = strA2;
            String strA3 = vsx.a(cursor, 1);
            if ((xfwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xfwVar.y();
            }
            xfx xfxVar3 = (xfx) xfwVar.b;
            xfxVar3.b |= 2;
            xfxVar3.d = strA3;
            String strA4 = vsx.a(cursor, 2);
            if ((xfwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xfwVar.y();
            }
            xfx xfxVar4 = (xfx) xfwVar.b;
            xfxVar4.b |= 4;
            xfxVar4.e = strA4;
            DesugarCollections.unmodifiableList(xfxVar4.f).getClass();
            String strA5 = vsx.a(cursor, 3);
            if ((xfwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xfwVar.y();
            }
            xfx xfxVar5 = (xfx) xfwVar.b;
            abxs abxsVar = xfxVar5.f;
            if (!abxsVar.c()) {
                int size = abxsVar.size();
                xfxVar5.f = abxsVar.d(size + size);
            }
            xfxVar5.f.add(strA5);
            String strA6 = vsx.a(cursor, 4);
            if ((xfwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xfwVar.y();
            }
            xfx xfxVar6 = (xfx) xfwVar.b;
            xfxVar6.b |= 8;
            xfxVar6.g = strA6;
            if (cursor.getColumnCount() > 6) {
                String strA7 = vsx.a(cursor, 6);
                if ((xfwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    xfwVar.y();
                }
                xfx xfxVar7 = (xfx) xfwVar.b;
                xfxVar7.b |= 16;
                xfxVar7.h = strA7;
            }
            return new agpi(strA, xls.a(xfwVar));
        } catch (RuntimeException e) {
            ((zdv) ((zdv) gbv.a.d()).p(e).q("com/google/android/apps/tvsearch/launcher/utils/LauncherLiveTvUtilsKt$getTvTunerChannels$2$1", "invoke-JfnmSAo", 108, "LauncherLiveTvUtils.kt")).u("Failed to read Live TV tuner channel");
            return this.a;
        }
    }
}
