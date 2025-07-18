package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class odj implements odo {
    private final /* synthetic */ int a;

    public odj(int i) {
        this.a = i;
    }

    @Override // defpackage.odo
    public final odn a(Context context, String str, odm odmVar) {
        int iB;
        int i = -1;
        if (this.a != 0) {
            odn odnVar = new odn();
            int iB2 = odmVar.b(context, str, true);
            odnVar.b = iB2;
            if (iB2 != 0) {
                odnVar.c = 1;
                return odnVar;
            }
            int iA = odmVar.a(context, str);
            odnVar.a = iA;
            if (iA != 0) {
                odnVar.c = -1;
            }
            return odnVar;
        }
        odn odnVar2 = new odn();
        int iA2 = odmVar.a(context, str);
        odnVar2.a = iA2;
        int i2 = 0;
        if (iA2 != 0) {
            iB = odmVar.b(context, str, false);
            odnVar2.b = iB;
        } else {
            iB = odmVar.b(context, str, true);
            odnVar2.b = iB;
        }
        int i3 = odnVar2.a;
        if (i3 == 0) {
            if (iB == 0) {
                i = 0;
            }
            odnVar2.c = i;
            return odnVar2;
        }
        i2 = i3;
        if (i2 < iB) {
            i = 1;
        }
        odnVar2.c = i;
        return odnVar2;
    }
}
