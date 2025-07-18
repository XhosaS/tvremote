package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mhf {
    public static final /* synthetic */ int a = 0;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    static {
        /*
            int[] r0 = defpackage.acbl.a()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            r4 = 0
            r5 = 84
            if (r2 >= r5) goto L1a
            r5 = r0[r2]
            int r6 = r5 + (-1)
            if (r5 == 0) goto L19
            int r3 = java.lang.Math.max(r3, r6)
            int r2 = r2 + 1
            goto L7
        L19:
            throw r4
        L1a:
            int r3 = r3 + 1
            mhe[] r0 = new defpackage.mhe[r3]
            int[] r2 = defpackage.acbl.a()
        L22:
            if (r1 >= r5) goto L58
            r3 = r2[r1]
            int r6 = r3 + (-1)
            if (r3 == 0) goto L57
            r3 = 17
            if (r6 == r3) goto L47
            r3 = 27
            if (r6 == r3) goto L47
            r3 = 78
            if (r6 == r3) goto L47
            r3 = 82
            if (r6 == r3) goto L47
            switch(r6) {
                case 12: goto L47;
                case 13: goto L47;
                case 14: goto L47;
                case 15: goto L47;
                default: goto L3d;
            }
        L3d:
            switch(r6) {
                case 19: goto L47;
                case 20: goto L47;
                case 21: goto L47;
                default: goto L40;
            }
        L40:
            switch(r6) {
                case 31: goto L47;
                case 32: goto L47;
                case 33: goto L47;
                case 34: goto L47;
                case 35: goto L47;
                case 36: goto L47;
                case 37: goto L47;
                case 38: goto L47;
                case 39: goto L47;
                case 40: goto L47;
                case 41: goto L47;
                case 42: goto L47;
                case 43: goto L47;
                case 44: goto L47;
                case 45: goto L47;
                case 46: goto L47;
                case 47: goto L47;
                case 48: goto L47;
                case 49: goto L47;
                default: goto L43;
            }
        L43:
            switch(r6) {
                case 56: goto L47;
                case 57: goto L47;
                case 58: goto L47;
                case 59: goto L47;
                case 60: goto L47;
                case 61: goto L47;
                case 62: goto L47;
                case 63: goto L47;
                case 64: goto L47;
                case 65: goto L47;
                case 66: goto L47;
                case 67: goto L47;
                case 68: goto L47;
                case 69: goto L47;
                case 70: goto L47;
                case 71: goto L47;
                case 72: goto L47;
                case 73: goto L47;
                default: goto L46;
            }
        L46:
            goto L54
        L47:
            mhe r3 = new mhe
            r3.<init>()
            r0[r6] = r3
            int r6 = defpackage.yyk.e
            yyk r6 = defpackage.zcg.b
            r3.a = r6
        L54:
            int r1 = r1 + 1
            goto L22
        L57:
            throw r4
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhf.<clinit>():void");
    }
}
