package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gep extends RemoteCallbackList {
    final /* synthetic */ MultiInstanceInvalidationService a;

    public gep(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final /* bridge */ /* synthetic */ void onCallbackDied(IInterface iInterface, Object obj) {
        ((gej) iInterface).getClass();
        obj.getClass();
        this.a.b.remove((Integer) obj);
    }
}
