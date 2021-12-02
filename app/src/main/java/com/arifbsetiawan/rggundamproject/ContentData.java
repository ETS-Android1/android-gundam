package com.arifbsetiawan.rggundamproject;

import android.os.Bundle;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContentData {

    private static String[] contentNames = {
            "Nu Gundam",
            "Crossbone Gundam X1",
            "Full Armor Unicorn Gundam",
            "Sazabi",
            "OZ-00MS Tallgeese EW",
            "RX-0 [N] Unicorn Gundam 02 Banshee Norn",
            "MS-06R-2 Johnny Ridden`s Zaku II",
            "RX-0 Unicorn Gundam",
            "Gundam Astray Gold Frame Amatsu Mina",
            "GAT-X105B/FP Build Strike Gundam Full Package",
            "MSN-06S Sinanju",
            "GNT-0000 00 QAN[T]",
            "XXXG-01W Wing Gundam EW",
            "MBF-P02 Gundam Astray Red Frame",
            "GN-0000+GNR-010 00 Raiser"
    };

    private static String[] contentDetails = {
            "The ν Gundam is one of the most advanced mobile suits during the Second Neo Zeon War in U.C. 0093, together with Char Aznable's MSN-04 Sazabi, it is used by Amuro Ray who also came up with its basic design. It was manufactured at Anaheim Electronics' Von Braun plant and completed in a short period of time (about three months) under the supervision of chief engineer October Saran. Its design is based on the average value of specifications of each successive generations of Gundam-type units from the original RX-78-2 Gundam to the MSZ-010 ΖΖ Gundam, and updated with state-of-the-art technologies introduced at the time.",
            "The F97 is specifically designed by the SNRI to be used near Jupiter, where the strong gravitational field creates serious propulsion problems. Units operating on Earth and near Earth's orbit usually achieve high mobility using thrusters distributed across the mobile suit's body. However, under Jupiter's gravitational influence, this would require enlargement of the thrusters, leading to an increase in the mobile suit's size and mass. Larger thrusters would require more powerful reactors, which in turn adds more mass.",
            "The Full Armor Unicorn Gundam was an enhancement plan devised by Takuya Irei while aboard the Nahel Argama and is based on his extensive knowledge of mobile suits. After Banagher's Newtype potential manifests itself, the psycoframe changes color to a vibrant green. Unlike other mobile suits with the Full Armor designation, the FA Unicorn does not have any additional armor for the MS itself (except additional shields). However, it does introduce a large array of weapons, which are added to the legs, backpack and forearms.",
            "After Char Aznable returned as the leader of his own Neo Zeon faction in U.C. 0093, he ordered his engineers to create a new mobile suit which would fit his piloting skills and Newtype powers. The result was the MSN-04 Sazabi, which was later built by the Luna-based contractor Anaheim Electronics. With an overall height of 25.6 meters, the Sazabi is much bigger than most standard mobile suits, but thanks to the use of lightweight armor materials and a great number of thrusters it is much faster and maneuverable than other suits.",
            "Designed by the Gundam Scientists, the Tallgeese was the first armed mobile suit, and is the common ancestor of both the Gundams (specifically their prototype, the XXXG-00W0 Wing Gundam Zero) and the mass-produced military mobile suits (most notably the OZ-06MS Leo and its variants).",
            "The Banshee Norn is an upgraded version of the Banshee with improved performance, assigned to Londo Bell pilot Riddhe Marcenas. The unit itself remains unchanged from the upgrades, with only the Armed Armors BS and VN replaced by two new equipment, the Armed Armor DE and Armed Armor XC. The Banshee Norn's primary ranged weapon is the Beam Magnum but with a new attachment, the Revolving Launcher. In Destroy Mode, the Armed Armor XC opens and rotates up, giving the Banshee Norn a lion-like look.",
            "One of the last machines in the Zaku II High Mobility Type series, the MS-06R-2 Zaku II High Mobility Type was Zeonic Company's entry in the competition for the Principality of Zeon's next generation space-use mainstay MS. It was a replacement for the beam weaponry equipped MS-11 (later the MS-14 Gelgoog) which was facing delays in development. The competition was one of Zeon's responses to the Earth Federation Forces' successful development of their own MS and their counter offenses.",
            "Produced as the final part of the E.F.S.F's reorganization plan, the 'UC Project', the Unicorn Gundam is a revolutionary design meant to be the main symbol of the project's main goal: to destroy any traces of Zeonism in the Earth Sphere. Thus, not only does it feature a Gundam design, but it also incorporates an anti-Newtype system. Two prototype machines were completed at Anaheim Electronics' factory in Granada. However, when the Vist Foundation took control of the project, they installed a special 'La+ Program' OS into the Gundam, turning it into a symbol of possibility by making it the key to finding Laplace's Box: the embodied hope of the Universal Century. Featuring the most advanced mobile suit technology of the time, its performance is unmatched.",
            "Gundam Astray Gold Frame Amatsu Mina is the repaired, upgraded version of the MBF-P01-ReAMATU Gundam Astray Gold Frame Amatsu. Initially the suit's outward appearance did not differ much from its predecessor, it just has two new weapons: a pair of physical 'Totsuka no Tsurugi' sabers stored on the side armors, and a retractable 'Tsumuha no Tachi' triple claw mounted on the left forearm. However, an incident during its operation test led to the suit having additional armor on the legs and new feet.",
            "The GAT-X105B/FP Build Strike Gundam Full Package is a Gunpla built by Sei Iori, and is a combination of the basic GAT-X105B Build Strike Gundam with the Build Booster and new weapons. As indicated by the name, it can be considered as the Build Strike with its complete weapons and equipment. The Build Booster is a support craft that when attached to the Build Strike adds a pair of beam cannons to the suit's standard armaments of four head-mounted vulcan guns and two beam sabers, and also improves its output.[1] The Full Package also gives the Build Strike a Chobham Shield and a handheld beam gun that can transform into a beam rifle, and later into the enhanced beam rifle.",
            "Originally the MSN-06S Sinanju Stein developed by Anaheim Electronics as part of the Earth Federation's 'UC Project', its movable frame is partly made from psycoframe materials. All of the Gundam-like features (except for the vulcan) in the Sinanju Stein have been replaced with a Zeonic-like design and weaponry, making it reminiscent of the Sazabi. The boosters were also replaced with large flexible thrusters mounted in a wing-like arrangement on its back. Sporting multiple vernier thrusters throughout its frame, the unit is capable of achieving precise movements and high speeds. With its overwhelming combat ability, crimson body, and mono-eye sensors, the Sinanju reminds all who see it of the legendary 'Red Comet'.",
            "A fifth Generation Gundam designed and tuned specifically for Celestial Being's first Innovator, Gundam Meister Setsuna F. Seiei, 00 Qan is the latest mobile suit (MS) designed by Celestial Being. Its blueprints originated from an Innovators draft and was sent over from Veda/Tieria (with level 7 clearance) for Celestial Being engineers to analyze and develop. As the successor to GN-0000+GNR-010 00 Raiser, 00 Qan contains an upgraded and improved Twin Drive System and possesses the new Quantum System. Whereas Zabanya and Harute were developed using parts from their predecessors, 00 Qan's was made as a new mobile suit. The development resources and focus used on 00 Qan is that of a higher level than the other two.",
            "Out of the five original Gundams created for Operation Meteor, Wing Gundam is the most well-balanced in terms of abilities and bears the closest resemblance to their common ancestor: the XXXG-00W0 Wing Gundam Zero. It boasts incredible speed and can transform into a high-performance aircraft form known as 'Bird Mode.' Though most of its weapons are relatively standard, its signature buster rifle is an exceptionally powerful ranged beam weapon, but it can only fire three shots in a single battle. In every aspect, Wing is a scaled down version of the Wing Zero. This was done possibly to reduce the strain placed on the pilot by the ZERO System and the superior capabilities of the Wing Zero. Wing's weapons are also considerably less powerful than those found on the Wing Zero, as Wing was designed to be 'strong', but not 'overpowering' like its ancestor.",
            "The MBF-P02 Astray Red Frame was one of five identical prototype combat mobile suits developed by Orb using stolen data from the Earth Alliance's G Project. Its original concept was to be a MS that could be piloted by Natural, and it was eventually loaded with an incomplete Natural-use OS. Most of the technology from the G Project are successfully copied with the exception of Phase Shift armor. In its place, the Astrays' designers made the machines out of a lighter foam metal compound, with minimal armor over the frame. This made the Astray mobile suits lighter and faster than their G Project counterparts. All the five prototype Astrays are also designed with backpack that can be lowered to the back skirt armor, allowing the mounting of additional equipment on the back.",
            "Despite its power, the GN-0000 00 Gundam is a highly experimental unit that suffers from power instability issues and so requires constant maintenance and fine-tuning. The Twin Drive System was also a very new technology, requiring the external stabilizing equipment on 00's main support unit, the GNR-010 0 Raiser, to safely execute Trans-Am and fully synchronize the GN Drives. Some data from GN-XXX+GNR-000 Sefer Rasiel was also exploited in its development. When combining is needed, laser guidance sensors would mutually lock onto each other, with a Haro auto-configuring the docking sequence. 0 Raiser's binders detach from the 0 Raiser body and latch onto 00's GN Drives, and its main body combines with the 00 Gundam's backpack, resulting in an angelic-like form. After successful docking, 00 Gundam's system screen(s) reflect the changes to the frame and the Twin Drive's stabilization. Each of 0 Raiser's binders can be mounted with a GN Shield to increase it's defensive capabilities, this form can remain the same even when docked onto 00 Gundam's GN Drive housing units. Without the GN Shields attached, the binders also act as shields themselves, capable of blocking beam shots from GNZ-003 Gadessa's GN Mega Launcher in Trans-Am mode."
    };

    private static String[] contentPrices = {
            "¥ 3,780",
            "¥ 2,250",
            "¥ 4,860",
            "¥ 4,050",
            "¥ 2,250",
            "¥ 3,600",
            "¥ 2,700",
            "¥ 3,420",
            "¥ 2,700",
            "¥ 2,250",
            "¥ 3,420",
            "¥ 2,250",
            "¥ 2,250",
            "¥ 2,250",
            "¥ 2,700"
    };

    private static String[] contentScales = {
            "1/144",
            "1/144",
            "1/144",
            "1/144",
            "1/144",
            "1/144",
            "1/144",
            "1/144",
            "1/144",
            "1/144",
            "1/144",
            "1/144",
            "1/144",
            "1/144",
            "1/144"
    };

    private static String[] contentReleases = {
            "August, 2019",
            "May, 2019",
            "December, 2018",
            "August, 2018",
            "April, 2018",
            "February, 2018",
            "November, 2017",
            "August, 2017",
            "March, 2017",
            "December, 2016",
            "August, 2016",
            "May, 2016",
            "January, 2016",
            "August, 2015",
            "April, 2015"
    };

    private static String[] contentCode = {
            "2466963",
            "2466960",
            "2435953",
            "2426271",
            "2418250",
            "210603",
            "2353220",
            "2370362",
            "2370360",
            "2340121",
            "2340120",
            "2336380",
            "2302827",
            "2295837",
            "2295835"
    };

    private static int[] contentImages = {
            R.drawable.tb_32,
            R.drawable.tb_31,
            R.drawable.tb_30,
            R.drawable.tb_29,
            R.drawable.tb_28,
            R.drawable.tb_27,
            R.drawable.tb_26,
            R.drawable.tb_25,
            R.drawable.tb_24,
            R.drawable.tb_23,
            R.drawable.tb_22,
            R.drawable.tb_21,
            R.drawable.tb_20,
            R.drawable.tb_19,
            R.drawable.tb_18
    };

    public static ArrayList<Content> getListData() {
        ArrayList<Content> list = new ArrayList<>();
        for (int i = 0; i < contentNames.length; i++) {
            Content content = new Content();
            content.setName(contentNames[i]);
            content.setDetail(contentDetails[i]);
            content.setPrice(contentPrices[i]);
            content.setScale(contentScales[i]);
            content.setRelease(contentReleases[i]);
            content.setCode(contentCode[i]);
            content.setPhoto(contentImages[i]);
            list.add(content);
        }
        return list;
    }


}
