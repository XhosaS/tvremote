package defpackage;

import android.content.Context;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghc {
    public final Object a;
    public Object b;

    public ghc(ghh ghhVar) {
        this.a = ghhVar;
    }

    public final Bundle a(String str) {
        ghh ghhVar = (ghh) this.a;
        if (!ghhVar.e) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = ghhVar.d;
        if (bundle == null) {
            return null;
        }
        Bundle bundleB = ggz.f(bundle, str) ? ggz.b(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            ghhVar.d = null;
        }
        return bundleB;
    }

    public final void b(String str, ghb ghbVar) {
        ghbVar.getClass();
        Object obj = this.a;
        synchronized (((ghh) obj).g) {
            Map map = ((ghh) obj).b;
            if (map.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            map.put(str, ghbVar);
        }
    }

    public final void c(Class cls) throws NoSuchMethodException, SecurityException {
        if (!((ghh) this.a).f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Object ggxVar = this.b;
        if (ggxVar == null) {
            ggxVar = new ggx(this);
        }
        this.b = ggxVar;
        try {
            cls.getDeclaredConstructor(null);
            Object obj = this.b;
            if (obj != null) {
                String name = cls.getName();
                name.getClass();
                ((ggx) obj).a.add(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public final ghb d() {
        ghb ghbVar;
        Object obj = this.a;
        synchronized (((ghh) obj).g) {
            Iterator it = ((ghh) obj).b.entrySet().iterator();
            do {
                ghbVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                ghb ghbVar2 = (ghb) entry.getValue();
                if (true == yks.e(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    ghbVar = ghbVar2;
                }
            } while (ghbVar == null);
        }
        return ghbVar;
    }

    public final void e(MediaCodec mediaCodec) {
        Object obj = this.b;
        if (obj == null || if$$ExternalSyntheticApiModelOutline7.m(obj).addMediaCodec(mediaCodec)) {
            a.ab(((HashSet) this.a).add(mediaCodec));
        }
    }

    public final void f(MediaCodec mediaCodec) {
        Object obj;
        if (!((HashSet) this.a).remove(mediaCodec) || (obj = this.b) == null) {
            return;
        }
        if$$ExternalSyntheticApiModelOutline7.m(obj).removeMediaCodec(mediaCodec);
    }

    public final void g(int i) {
        Object obj = this.b;
        if (obj != null) {
            if$$ExternalSyntheticApiModelOutline7.m(obj).close();
            this.b = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, ugk.a, new esm());
        this.b = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) this.a).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    public final void h(Exception exc, boolean z) {
        this.b = null;
        ?? r0 = this.a;
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) r0);
        r0.clear();
        UnmodifiableIterator it = immutableListCopyOf.iterator();
        while (it.hasNext()) {
            eoo eooVar = (eoo) it.next();
            int i = 1;
            if (true != z) {
                i = 3;
            }
            eooVar.f(exc, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void i(eoo eooVar) {
        this.a.add(eooVar);
        if (this.b != null) {
            return;
        }
        this.b = eooVar;
        eooVar.h();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yuj] */
    public final void j(gcf gcfVar) {
        this.b = gcfVar;
        this.a.eV(gcfVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public final synchronized Map k() {
        if (this.b == null) {
            this.b = DesugarCollections.unmodifiableMap(new HashMap((Map) this.a));
        }
        return this.b;
    }

    public ghc(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new HashMap();
    }

    public ghc(Context context) {
        this.a = context == null ? null : context.getApplicationContext();
    }

    public ghc(byte[] bArr) {
        this.a = new HashSet();
    }

    public ghc() {
        this.a = new HashSet();
    }

    public ghc(byte[] bArr, byte[] bArr2) {
        this.a = new ArrayList();
    }

    public ghc(char[] cArr) {
        this.a = yuq.e(1, 0, 2, 2);
    }
}
