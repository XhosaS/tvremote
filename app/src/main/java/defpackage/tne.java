package defpackage;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate;
import com.google.android.libraries.elements.interfaces.ValidationResult;
import com.google.common.collect.Sets;
import io.grpc.Status;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tne extends ResourceLoaderDelegate {
    public final agow a;
    public final Set b;
    private final Context c;
    private final tmi d;
    private final ahbt e;
    private final Optional f;

    public tne(Context context, tmi tmiVar, ahbt ahbtVar, agow agowVar, Optional optional) {
        context.getClass();
        tmiVar.getClass();
        ahbtVar.getClass();
        this.c = context;
        this.d = tmiVar;
        this.e = ahbtVar;
        this.a = agowVar;
        this.f = optional;
        Set setF = Sets.f();
        setF.getClass();
        this.b = setF;
    }

    public final void a(tnc tncVar) {
        tncVar.getClass();
        this.b.add(tncVar);
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onAttemptedToCacheResource(String str, ValidationResult validationResult, Status status) {
        str.getClass();
        validationResult.getClass();
        status.getClass();
        validationResult.ordinal();
        status.getCode().ordinal();
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onDiskCacheServingContextUpdated(byte[] bArr) {
        bArr.getClass();
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onMissingCacheDependency(String str) {
        str.getClass();
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onResourceCachePrepared(String str, Status status) {
        str.getClass();
        status.getClass();
        status.getCode().ordinal();
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onResourceProcessed(String str, ValidationResult validationResult, Status status) {
        yrp yrpVar;
        Boolean bool;
        str.getClass();
        validationResult.getClass();
        status.getClass();
        this.d.g("Runtime.ResourceLoaderDelegate.OnResourceProcessed", validationResult.ordinal());
        if (validationResult == ValidationResult.SUCCESS && (afec.e(this.c) || ((yrpVar = (yrp) this.f.orElse(null)) != null && (bool = (Boolean) yrpVar.eV()) != null && bool.booleanValue()))) {
            ahal.d(this.e, null, 0, new tnd(this, null), 3);
        }
        validationResult.ordinal();
        status.getCode().ordinal();
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onServingContextUpdated(byte[] bArr) {
        addj addjVar;
        bArr.getClass();
        int length = bArr.length;
        if (length == 0) {
            addjVar = null;
        } else {
            addj addjVar2 = addj.a;
            addi addiVar = new addi();
            abvo abvoVarU = abvo.u(bArr, 0, length);
            if ((addiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                addiVar.y();
            }
            addj addjVar3 = (addj) addiVar.b;
            addjVar3.c |= 1;
            addjVar3.d = abvoVarU;
            abxd abxdVarV = addiVar.v();
            abxdVarV.getClass();
            addjVar = (addj) abxdVarV;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((tnc) it.next()).a(addjVar);
        }
    }
}
