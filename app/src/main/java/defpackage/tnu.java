package defpackage;

import com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate;
import com.google.android.libraries.elements.interfaces.ValidationResult;
import io.grpc.Status;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tnu extends ResourceLoaderDelegate {
    private final WeakReference a;

    public tnu(ResourceLoaderDelegate resourceLoaderDelegate) {
        this.a = new WeakReference(resourceLoaderDelegate);
    }

    private final void a(agux aguxVar) {
        ResourceLoaderDelegate resourceLoaderDelegate = (ResourceLoaderDelegate) this.a.get();
        if (resourceLoaderDelegate != null) {
            aguxVar.a(resourceLoaderDelegate);
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onAttemptedToCacheResource(final String str, final ValidationResult validationResult, final Status status) {
        str.getClass();
        validationResult.getClass();
        status.getClass();
        a(new agux() { // from class: tns
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ResourceLoaderDelegate resourceLoaderDelegate = (ResourceLoaderDelegate) obj;
                resourceLoaderDelegate.getClass();
                resourceLoaderDelegate.onAttemptedToCacheResource(str, validationResult, status);
                return agpu.a;
            }
        });
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onDiskCacheServingContextUpdated(final byte[] bArr) {
        bArr.getClass();
        a(new agux() { // from class: tnr
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ResourceLoaderDelegate resourceLoaderDelegate = (ResourceLoaderDelegate) obj;
                resourceLoaderDelegate.getClass();
                resourceLoaderDelegate.onDiskCacheServingContextUpdated(bArr);
                return agpu.a;
            }
        });
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onMissingCacheDependency(final String str) {
        str.getClass();
        a(new agux() { // from class: tnt
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ResourceLoaderDelegate resourceLoaderDelegate = (ResourceLoaderDelegate) obj;
                resourceLoaderDelegate.getClass();
                resourceLoaderDelegate.onMissingCacheDependency(str);
                return agpu.a;
            }
        });
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onResourceCachePrepared(final String str, final Status status) {
        str.getClass();
        status.getClass();
        a(new agux() { // from class: tnp
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ResourceLoaderDelegate resourceLoaderDelegate = (ResourceLoaderDelegate) obj;
                resourceLoaderDelegate.getClass();
                resourceLoaderDelegate.onResourceCachePrepared(str, status);
                return agpu.a;
            }
        });
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onResourceProcessed(final String str, final ValidationResult validationResult, final Status status) {
        str.getClass();
        validationResult.getClass();
        status.getClass();
        a(new agux() { // from class: tnq
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ResourceLoaderDelegate resourceLoaderDelegate = (ResourceLoaderDelegate) obj;
                resourceLoaderDelegate.getClass();
                resourceLoaderDelegate.onResourceProcessed(str, validationResult, status);
                return agpu.a;
            }
        });
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onServingContextUpdated(final byte[] bArr) {
        bArr.getClass();
        a(new agux() { // from class: tno
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ResourceLoaderDelegate resourceLoaderDelegate = (ResourceLoaderDelegate) obj;
                resourceLoaderDelegate.getClass();
                resourceLoaderDelegate.onServingContextUpdated(bArr);
                return agpu.a;
            }
        });
    }
}
