package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fet implements gyi {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/config/ConfigTask");
    private final boolean b;
    private final gyx c = gyx.h;
    private final Set d = hag.a;
    private final Set e = agrf.a;

    public fet(boolean z) {
        this.b = z;
    }

    @Override // defpackage.gzc
    public final int a() {
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.c;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) {
        if (this.b) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/config/ConfigTask", "run", 38, "ConfigTask.kt")).u("This is a PREVIEWER build (see go/atv-previewer).\n.______   .______       ___________    ____  __   ___________    __    ____  _______ .______\n|   _  \\  |   _  \\     |   ____\\   \\  /   / |  | |   ____\\   \\  /  \\  /   / |   ____||   _  \\\n|  |_)  | |  |_)  |    |  |__   \\   \\/   /  |  | |  |__   \\   \\/    \\/   /  |  |__   |  |_)  |\n|   ___/  |      /     |   __|   \\      /   |  | |   __|   \\            /   |   __|  |      /\n|  |      |  |\\  \\----.|  |____   \\    /    |  | |  |____   \\    /\\    /    |  |____ |  |\\  \\----.\n| _|      | _| `._____||_______|   \\__/     |__| |_______|   \\__/  \\__/     |_______|| _| `._____|\n.______    __    __   __   __       _______\n|   _  \\  |  |  |  | |  | |  |     |       \\\n|  |_)  | |  |  |  | |  | |  |     |  .--.  |\n|   _  <  |  |  |  | |  | |  |     |  |  |  |\n|  |_)  | |  `--'  | |  | |  `----.|  '--'  |\n|______/   \\______/  |__| |_______||_______/\n");
        }
        return agpu.a;
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.e;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.d;
    }

    @Override // defpackage.gyi
    public final int f() {
        return 1;
    }
}
