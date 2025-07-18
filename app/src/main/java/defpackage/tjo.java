package defpackage;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.ResourceEntry;
import com.google.android.libraries.elements.interfaces.ResourceLoader;
import com.google.android.libraries.elements.interfaces.ResourceMetadata;
import com.google.android.libraries.elements.interfaces.ResourcePreloader;
import com.google.android.libraries.elements.interfaces.ResourceType;
import io.grpc.Status;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tjo implements tjl {
    public static final tjn a = new tjn();
    public static final zdy b = zdy.h("com/google/android/libraries/search/rendering/xuikit/elements/ResourceLoaderEmlParcelProcessor");
    private final tnz c;
    private final Context d;
    private final zyg e;
    private final yrx f;
    private final tmi g;
    private final Optional h;
    private final Set i;

    public tjo(tnz tnzVar, Context context, zyg zygVar, yrx yrxVar, tmi tmiVar, Optional optional) {
        tnzVar.getClass();
        context.getClass();
        zygVar.getClass();
        tmiVar.getClass();
        this.c = tnzVar;
        this.d = context;
        this.e = zygVar;
        this.f = yrxVar;
        this.g = tmiVar;
        this.h = optional;
        this.i = new LinkedHashSet();
        tnzVar.b();
    }

    @Override // defpackage.tjl
    public final void a(adax adaxVar) {
        final ResourceLoader resourceLoader;
        yrp yrpVar;
        final TreeSet treeSet;
        Boolean bool;
        adaxVar.getClass();
        zyd zydVarA = this.c.a();
        if (zydVarA.isDone()) {
            Object objO = zxn.o(zydVarA);
            objO.getClass();
            resourceLoader = (ResourceLoader) objO;
        } else {
            yrn yrnVarC = yrn.c(this.f);
            try {
                try {
                    Object obj = zydVarA.get();
                    obj.getClass();
                    resourceLoader = (ResourceLoader) obj;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException("Interrupted while initializing the ResourceLoader.", e);
                }
            } finally {
                tmi tmiVar = this.g;
                yrnVarC.f();
                tmiVar.h("Srs.DiskCache.Initialization.UiRenderingBlockedForUs", yrnVarC.a(TimeUnit.MICROSECONDS));
            }
        }
        Set set = this.i;
        synchronized (set) {
            abxs abxsVar = adaxVar.b;
            abxsVar.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : abxsVar) {
                adaz adazVar = (adaz) obj2;
                int iA = adbb.a(adazVar.g);
                if (iA == 0 || iA != 2) {
                    String str = adazVar.c;
                    str.getClass();
                    if (set.add(str)) {
                        arrayList.add(obj2);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(agqq.i(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                adaz adazVar2 = (adaz) it.next();
                ResourceMetadata resourceMetadata = new ResourceMetadata(adazVar2.c, ResourceType.EKO_TEMPLATE, (adazVar2.b & 4) != 0 ? Long.valueOf(adazVar2.f) : null, new ArrayList(adazVar2.e), null, false);
                abuy abuyVar = adazVar2.d;
                if (abuyVar == null) {
                    abuyVar = abuy.a;
                }
                arrayList2.add(new ResourceEntry(resourceMetadata, abuyVar.c.B()));
            }
            if (!arrayList2.isEmpty()) {
                tjn tjnVar = a;
                Status statusHandleResources = resourceLoader.handleResources(arrayList2);
                statusHandleResources.getClass();
                tjnVar.a(statusHandleResources, "handleResources()");
            }
            if (!afec.e(this.d) && ((yrpVar = (yrp) this.h.orElse(null)) == null || (bool = (Boolean) yrpVar.eV()) == null || !bool.booleanValue())) {
                treeSet = new TreeSet();
            } else {
                synchronized (set) {
                    abxs abxsVar2 = adaxVar.b;
                    abxsVar2.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : abxsVar2) {
                        adaz adazVar3 = (adaz) obj3;
                        int iA2 = adbb.a(adazVar3.g);
                        if (iA2 != 0 && iA2 == 2) {
                            String str2 = adazVar3.c;
                            str2.getClass();
                            if (set.add(str2)) {
                                arrayList3.add(obj3);
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(agqq.i(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((adaz) it2.next()).c);
                    }
                    treeSet = new TreeSet();
                    agqq.H(arrayList4, treeSet);
                }
            }
            if (!arrayList2.isEmpty() || !treeSet.isEmpty()) {
                this.e.execute(wyo.h(new Runnable() { // from class: tjm
                    @Override // java.lang.Runnable
                    public final void run() {
                        ResourceLoader resourceLoader2 = resourceLoader;
                        TreeSet treeSet2 = treeSet;
                        if (!treeSet2.isEmpty()) {
                            tjn tjnVar2 = tjo.a;
                            Status statusHandleOmittedResources = resourceLoader2.handleOmittedResources(treeSet2, false);
                            statusHandleOmittedResources.getClass();
                            tjnVar2.a(statusHandleOmittedResources, "handleOmittedResources()");
                        }
                        tjn tjnVar3 = tjo.a;
                        ResourcePreloader preloader = resourceLoader2.getPreloader();
                        preloader.getClass();
                        Status statusLoadAll = preloader.loadAll();
                        statusLoadAll.getClass();
                        tjnVar3.a(statusLoadAll, "loadAll()");
                    }
                }));
            }
        }
    }
}
