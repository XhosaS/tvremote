package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fhg extends agtu implements agvb {
    final /* synthetic */ fhh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhg(fhh fhhVar, agsw agswVar) {
        super(2, agswVar);
        this.a = fhhVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fhg) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        String[] list;
        agpl.b(obj);
        for (qpi qpiVar : fhh.b) {
            File file = new File(((gxy) this.a.c).a.getFilesDir(), qpiVar.a);
            if (file.isFile() || (file.isDirectory() && (list = file.list()) != null && list.length == 0)) {
                try {
                    ((zdv) fhh.a.b().q("com/google/android/apps/tvsearch/datastore/cleanup/FileCleanerTask$run$2", "invokeSuspend", 58, "FileCleanerTask.kt")).G("Deleted %s [%s]", qpiVar, file.delete());
                } catch (Exception e) {
                    ((zdv) ((zdv) fhh.a.d()).p(e).q("com/google/android/apps/tvsearch/datastore/cleanup/FileCleanerTask$run$2", "invokeSuspend", 63, "FileCleanerTask.kt")).x("Failed to delete %s", qpiVar);
                }
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fhg(this.a, agswVar);
    }
}
