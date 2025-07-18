package defpackage;

import android.app.Service;
import android.os.Binder;
import com.google.android.tv.remote.service.AtvRemoteProviderService;
import com.google.android.tv.remote.service.AtvSearchAssistantService;
import com.google.android.tv.remote.service.RemoteService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bph extends Binder {
    final /* synthetic */ Service a;

    public bph(AtvRemoteProviderService atvRemoteProviderService) {
        this.a = atvRemoteProviderService;
    }

    public bph(AtvSearchAssistantService atvSearchAssistantService) {
        this.a = atvSearchAssistantService;
    }

    public bph(RemoteService remoteService) {
        this.a = remoteService;
    }
}
