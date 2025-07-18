package defpackage;

import android.os.HandlerThread;
import android.os.UserHandle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqr implements cpi {
    private final /* synthetic */ int a;

    public aqr(int i) {
        this.a = i;
    }

    @Override // defpackage.crv, defpackage.cru
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                return new aqp();
            case 1:
                return new sd();
            case 2:
                return new awy();
            case 3:
            case 4:
                return true;
            case 5:
                return Boolean.valueOf(UserHandle.of(UserHandle.myUserId()).isSystem());
            case 6:
                return new bpo();
            case 7:
                HandlerThread handlerThread = new HandlerThread("Background");
                handlerThread.start();
                return handlerThread;
            case 8:
                Boolean bool = false;
                bool.getClass();
                return new bqo();
            case 9:
                return new atg(null);
            default:
                return new cef(1);
        }
    }
}
